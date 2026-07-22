#!/usr/bin/env python3
"""
Resolve package-manager install names for LinuxCommandLibrary man pages.

Downloads distro/package indexes into a local cache, maps command names (and
binaries) to packages, and emits JSONL for the /add-package-installs skill to
review and write into assets/commands/*.md.

Does NOT edit man pages (skill owns writes).

Usage:
  python3 scripts/fetch-package-installs.py --build-cache
  python3 scripts/fetch-package-installs.py --resolve --batch 50
  python3 scripts/fetch-package-installs.py --resolve jq rg htop
  python3 scripts/fetch-package-installs.py --show rg
  python3 scripts/fetch-package-installs.py --report

Requires: python3, curl (optional; urllib used by default). Optional: brotli CLI
for nixpkgs packages.json.br.
"""

from __future__ import annotations

import argparse
import gzip
import io
import json
import re
import ssl
import subprocess
import sys
import tarfile
import time
import urllib.error
import urllib.parse
import urllib.request
from datetime import datetime, timezone
from pathlib import Path
from typing import Any, Iterable

# ---------------------------------------------------------------------------
# Paths & constants
# ---------------------------------------------------------------------------

REPO_ROOT = Path(__file__).resolve().parent.parent
COMMANDS_DIR = REPO_ROOT / "assets" / "commands"
DEFAULT_CACHE = REPO_ROOT / ".cache" / "package-installs"
NONE_FILE = REPO_ROOT / "commands_packages_none.txt"

USER_AGENT = (
    "LinuxCommandLibrary/1.0 "
    "(+https://github.com/SimonSchubert/LinuxCommandLibrary; package-index)"
)

CACHE_MAX_AGE_DAYS = 14

MANAGERS = ("apt", "dnf", "pacman", "aur", "apk", "zypper", "brew", "nix")

INSTALL_TEMPLATES = {
    "apt": "sudo apt install {pkg}",
    "dnf": "sudo dnf install {pkg}",
    "pacman": "sudo pacman -S {pkg}",
    "aur": "yay -S {pkg}",
    "apk": "sudo apk add {pkg}",
    "zypper": "sudo zypper install {pkg}",
    "brew": "brew install {pkg}",
    "nix": "nix profile install nixpkgs#{pkg}",
}

# Prefer these path prefixes when mapping binaries (order = priority).
BIN_PREFIXES = (
    "usr/bin/",
    "bin/",
    "usr/sbin/",
    "sbin/",
    "usr/local/bin/",
)

# Debian section/package → drop low-value package name suffixes when choosing.
SKIP_PKG_SUFFIXES = (
    "-doc",
    "-docs",
    "-dbg",
    "-dbgsym",
    "-debuginfo",
    "-debugsource",
    "-dev",
    "-devel",
    "-static",
    "-common",
    "-data",
    "-examples",
)

SSL_CTX = ssl.create_default_context()


# ---------------------------------------------------------------------------
# HTTP helpers
# ---------------------------------------------------------------------------


def log(msg: str) -> None:
    print(msg, file=sys.stderr, flush=True)


def http_get(url: str, dest: Path | None = None, timeout: int = 120) -> bytes:
    """GET url; optionally write to dest. Returns body bytes."""
    req = urllib.request.Request(url, headers={"User-Agent": USER_AGENT})
    try:
        with urllib.request.urlopen(req, timeout=timeout, context=SSL_CTX) as resp:
            data = resp.read()
    except urllib.error.HTTPError as e:
        raise RuntimeError(f"HTTP {e.code} for {url}") from e
    except urllib.error.URLError as e:
        raise RuntimeError(f"URL error for {url}: {e}") from e
    if dest is not None:
        dest.parent.mkdir(parents=True, exist_ok=True)
        dest.write_bytes(data)
    return data


def http_get_json(url: str, timeout: int = 60) -> Any:
    data = http_get(url, timeout=timeout)
    return json.loads(data.decode("utf-8"))


def cache_fresh(path: Path, max_age_days: int = CACHE_MAX_AGE_DAYS) -> bool:
    if not path.exists():
        return False
    age = time.time() - path.stat().st_mtime
    return age < max_age_days * 86400


def write_json(path: Path, obj: Any) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(obj, indent=2, sort_keys=True) + "\n", encoding="utf-8")


def read_json(path: Path) -> Any:
    return json.loads(path.read_text(encoding="utf-8"))


def write_jsonl(path: Path, rows: Iterable[dict[str, Any]]) -> int:
    path.parent.mkdir(parents=True, exist_ok=True)
    n = 0
    with path.open("w", encoding="utf-8") as f:
        for row in rows:
            f.write(json.dumps(row, ensure_ascii=False) + "\n")
            n += 1
    return n


# ---------------------------------------------------------------------------
# Index builders
# ---------------------------------------------------------------------------


def _prefer_pkg(candidates: list[str]) -> str | None:
    """Pick best package name from a list of section/pkg or pkg strings."""
    if not candidates:
        return None
    pkgs: list[str] = []
    for c in candidates:
        # Debian Contents: "utils/ripgrep" or "ripgrep"
        pkg = c.split("/")[-1].strip()
        if pkg:
            pkgs.append(pkg)
    if not pkgs:
        return None
    # Prefer names without documentation/debug suffixes.
    ranked = sorted(
        pkgs,
        key=lambda p: (
            any(p.endswith(s) for s in SKIP_PKG_SUFFIXES),
            len(p),
            p,
        ),
    )
    return ranked[0]


def build_debian_bin_map(cache_dir: Path, force: bool = False) -> dict[str, str]:
    out = cache_dir / "debian_bin.json"
    raw = cache_dir / "Contents-amd64.gz"
    if not force and cache_fresh(out):
        log(f"debian: using cached {out.name}")
        return read_json(out)

    url = "http://ftp.debian.org/debian/dists/stable/main/Contents-amd64.gz"
    log(f"debian: downloading Contents-amd64.gz …")
    if force or not cache_fresh(raw, max_age_days=CACHE_MAX_AGE_DAYS):
        http_get(url, dest=raw, timeout=300)

    # cmd -> list of packages
    hits: dict[str, list[str]] = {}
    log("debian: parsing Contents (usr/bin, bin, sbin) …")
    with gzip.open(raw, "rt", encoding="utf-8", errors="replace") as f:
        for line in f:
            line = line.rstrip("\n")
            if not line or line.startswith(" "):
                continue
            # path<spaces>section/package[,section/package...]
            # Split on last run of whitespace is fragile; Contents uses spaces.
            parts = line.split()
            if len(parts) < 2:
                continue
            path = parts[0]
            packages_field = parts[-1]
            cmd: str | None = None
            for pref in BIN_PREFIXES:
                if path.startswith(pref) and path.count("/") == pref.count("/"):
                    # e.g. usr/bin/rg  (no deeper path)
                    name = path[len(pref) :]
                    if name and "/" not in name and name not in (".", ".."):
                        cmd = name
                    break
            if not cmd:
                continue
            for pkg_entry in packages_field.split(","):
                hits.setdefault(cmd, []).append(pkg_entry)

    result = {cmd: pkg for cmd, pkgs in hits.items() if (pkg := _prefer_pkg(pkgs))}
    write_json(out, result)
    log(f"debian: {len(result)} binaries mapped → {out}")
    return result


def build_alpine_cmd_map(cache_dir: Path, force: bool = False) -> dict[str, str]:
    out = cache_dir / "alpine_cmd.json"
    if not force and cache_fresh(out):
        log(f"alpine: using cached {out.name}")
        return read_json(out)

    result: dict[str, str] = {}
    branches = (
        "https://dl-cdn.alpinelinux.org/alpine/latest-stable/main/x86_64/APKINDEX.tar.gz",
        "https://dl-cdn.alpinelinux.org/alpine/latest-stable/community/x86_64/APKINDEX.tar.gz",
    )
    for url in branches:
        log(f"alpine: downloading {url.rsplit('/', 2)[-2]} APKINDEX …")
        data = http_get(url, timeout=120)
        with tarfile.open(fileobj=io.BytesIO(data), mode="r:gz") as tf:
            member = tf.extractfile("APKINDEX")
            if member is None:
                continue
            text = member.read().decode("utf-8", errors="replace")
        # Records separated by blank lines. P:pkg  p: provides including cmd:name=
        for block in text.split("\n\n"):
            pkg = None
            provides: list[str] = []
            for line in block.splitlines():
                if line.startswith("P:"):
                    pkg = line[2:].strip()
                elif line.startswith("p:"):
                    provides.extend(line[2:].strip().split())
            if not pkg:
                continue
            for prov in provides:
                # cmd:jq=1.8.1-r0  or cmd:jq
                if not prov.startswith("cmd:"):
                    continue
                rest = prov[4:]
                cmd = rest.split("=", 1)[0]
                if cmd and cmd not in result:
                    result[cmd] = pkg
            # Also map package name itself as a command candidate when equal
            if pkg not in result:
                # only if something provides cmd:pkg — skip; name equality handled at resolve
                pass

    write_json(out, result)
    log(f"alpine: {len(result)} cmd: provides → {out}")
    return result


def _parse_arch_db(data: bytes) -> set[str]:
    names: set[str] = set()
    with tarfile.open(fileobj=io.BytesIO(data), mode="r:gz") as tf:
        for member in tf.getmembers():
            if not member.name.endswith("/desc") and member.name != "desc":
                # package dirs contain desc
                if not member.isfile() or not member.name.endswith("desc"):
                    continue
            f = tf.extractfile(member)
            if f is None:
                continue
            text = f.read().decode("utf-8", errors="replace")
            lines = text.splitlines()
            for i, line in enumerate(lines):
                if line.strip() == "%NAME%" and i + 1 < len(lines):
                    names.add(lines[i + 1].strip())
                    break
    return names


def build_arch_pkg_set(cache_dir: Path, force: bool = False) -> set[str]:
    out = cache_dir / "arch_pkgs.json"
    if not force and cache_fresh(out):
        log(f"arch: using cached {out.name}")
        return set(read_json(out))

    names: set[str] = set()
    repos = ("core", "extra")
    mirror = "https://geo.mirror.pkgbuild.com"
    for repo in repos:
        url = f"{mirror}/{repo}/os/x86_64/{repo}.db.tar.gz"
        log(f"arch: downloading {repo}.db.tar.gz …")
        data = http_get(url, timeout=180)
        repo_names = _parse_arch_db(data)
        log(f"arch: {repo}: {len(repo_names)} packages")
        names |= repo_names

    write_json(out, sorted(names))
    log(f"arch: {len(names)} total packages → {out}")
    return names


def build_brew_set(cache_dir: Path, force: bool = False) -> set[str]:
    out = cache_dir / "brew_formulae.json"
    raw = cache_dir / "brew_formula.json"
    if not force and cache_fresh(out):
        log(f"brew: using cached {out.name}")
        return set(read_json(out))

    url = "https://formulae.brew.sh/api/formula.json"
    log("brew: downloading formula.json (large) …")
    if force or not cache_fresh(raw):
        http_get(url, dest=raw, timeout=300)

    log("brew: parsing formula names + aliases …")
    formulae = json.loads(raw.read_text(encoding="utf-8"))
    names: set[str] = set()
    for f in formulae:
        name = f.get("name")
        if name:
            names.add(name)
        for a in f.get("aliases") or []:
            if a:
                names.add(a)
        # token that users brew install
        old = f.get("oldname")
        if old:
            names.add(old)
        for t in f.get("oldnames") or []:
            if t:
                names.add(t)
    write_json(out, sorted(names))
    log(f"brew: {len(names)} formula names/aliases → {out}")
    return names


def _decompress_brotli(data: bytes) -> bytes:
    """Decompress brotli using stdlib, brotli module, or brotli CLI."""
    try:
        import brotli  # type: ignore

        return brotli.decompress(data)
    except Exception:
        pass
    # CLI fallback
    try:
        proc = subprocess.run(
            ["brotli", "-d", "-c"],
            input=data,
            capture_output=True,
            check=True,
        )
        return proc.stdout
    except (FileNotFoundError, subprocess.CalledProcessError) as e:
        raise RuntimeError(
            "Cannot decompress nix packages.json.br — install brotli "
            "(brew install brotli) or the Python brotli package"
        ) from e


def build_nix_set(cache_dir: Path, force: bool = False) -> set[str]:
    out = cache_dir / "nix_attrs.json"
    raw = cache_dir / "packages.json.br"
    if not force and cache_fresh(out):
        log(f"nix: using cached {out.name}")
        return set(read_json(out))

    url = "https://channels.nixos.org/nixos-unstable/packages.json.br"
    log("nix: downloading packages.json.br …")
    if force or not cache_fresh(raw):
        # Follow redirects
        http_get(url, dest=raw, timeout=300)

    log("nix: decompressing + extracting attribute names …")
    try:
        plain = _decompress_brotli(raw.read_bytes())
    except RuntimeError as e:
        log(f"nix: SKIP — {e}")
        write_json(out, [])
        return set()

    obj = json.loads(plain)
    packages = obj.get("packages", obj) if isinstance(obj, dict) else {}
    names: set[str] = set()
    if isinstance(packages, dict):
        for attr in packages:
            # top-level attrs only (skip nested if any)
            names.add(attr)
            # also last component for python3Packages.foo style? keep full attr
    write_json(out, sorted(names))
    log(f"nix: {len(names)} attributes → {out}")
    return names


def _decompress_maybe(data: bytes, href: str = "") -> bytes:
    """Decompress gzip or zstd based on magic bytes / URL suffix."""
    if data[:2] == b"\x1f\x8b":
        return gzip.decompress(data)
    # zstd magic (or .zst href when magic already consumed / multi-frame)
    if data[:4] == b"\x28\xb5\x2f\xfd" or href.endswith(".zst") or href.endswith(".zstd"):
        # Prefer CLI: handles large primary.xml without max_output_size issues
        try:
            proc = subprocess.run(
                ["zstd", "-d", "-c"],
                input=data,
                capture_output=True,
                check=True,
            )
            return proc.stdout
        except FileNotFoundError:
            pass
        except subprocess.CalledProcessError as e:
            err = (e.stderr or b"")[:200]
            raise RuntimeError(f"zstd decompress failed: {err!r}") from e
        try:
            import zstandard  # type: ignore

            dctx = zstandard.ZstdDecompressor()
            # Large repos need a high limit or stream_reader
            with dctx.stream_reader(io.BytesIO(data)) as reader:
                return reader.read()
        except Exception as e:
            raise RuntimeError(
                "Cannot decompress zstd metadata — install zstd (brew install zstd) "
                "or the Python zstandard package"
            ) from e
    # plain xml?
    if data.lstrip().startswith(b"<?xml") or data.lstrip().startswith(b"<"):
        return data
    raise RuntimeError(f"Unknown compression for primary metadata (magic={data[:4]!r})")


def _parse_rpm_primary_names(primary_bytes: bytes, href: str = "") -> set[str]:
    """Extract package names from yum/dnf primary.xml (.gz / .zst / plain)."""
    text = _decompress_maybe(primary_bytes, href=href).decode("utf-8", errors="replace")
    # Package names live in <name>…</name> under each <package type="rpm">.
    # Filelists use different tags; primary is safe enough with this regex.
    names = set(re.findall(r"<name>([^<]+)</name>", text))
    return {n for n in names if n and not n.startswith("/") and "/" not in n}


def _repomd_primary_href(repomd_xml: bytes, base_url: str) -> str | None:
    text = repomd_xml.decode("utf-8", errors="replace")
    # Find primary data location href
    m = re.search(
        r'type="primary".*?<location[^>]+href="([^"]+)"',
        text,
        re.DOTALL,
    )
    if not m:
        # alternate order
        m = re.search(
            r'<location[^>]+href="([^"]+)"[^>]*>.*?type="primary"',
            text,
            re.DOTALL,
        )
    if not m:
        return None
    href = m.group(1)
    if href.startswith("http"):
        return href
    return base_url.rstrip("/") + "/" + href.lstrip("/")


def build_fedora_pkg_set(cache_dir: Path, force: bool = False) -> set[str]:
    out = cache_dir / "fedora_pkgs.json"
    if not force and cache_fresh(out):
        log(f"fedora: using cached {out.name}")
        return set(read_json(out))

    # Use rawhide Everything repodata (broad package set)
    base = (
        "https://dl.fedoraproject.org/pub/fedora/linux/development/"
        "rawhide/Everything/x86_64/os"
    )
    repomd_url = f"{base}/repodata/repomd.xml"
    log("fedora: fetching repomd.xml …")
    try:
        repomd = http_get(repomd_url, timeout=60)
    except RuntimeError as e:
        log(f"fedora: SKIP — {e}")
        write_json(out, [])
        return set()

    primary_url = _repomd_primary_href(repomd, base)
    if not primary_url:
        log("fedora: SKIP — could not find primary href in repomd")
        write_json(out, [])
        return set()

    log(f"fedora: downloading primary metadata …")
    try:
        primary = http_get(primary_url, timeout=300)
        names = _parse_rpm_primary_names(primary, href=primary_url)
    except Exception as e:
        log(f"fedora: SKIP — {e}")
        write_json(out, [])
        return set()

    write_json(out, sorted(names))
    log(f"fedora: {len(names)} packages → {out}")
    return names


def build_opensuse_pkg_set(cache_dir: Path, force: bool = False) -> set[str]:
    out = cache_dir / "opensuse_pkgs.json"
    if not force and cache_fresh(out):
        log(f"opensuse: using cached {out.name}")
        return set(read_json(out))

    base = "https://download.opensuse.org/tumbleweed/repo/oss"
    repomd_url = f"{base}/repodata/repomd.xml"
    log("opensuse: fetching repomd.xml …")
    try:
        repomd = http_get(repomd_url, timeout=60)
    except RuntimeError as e:
        log(f"opensuse: SKIP — {e}")
        write_json(out, [])
        return set()

    primary_url = _repomd_primary_href(repomd, base)
    if not primary_url:
        log("opensuse: SKIP — could not find primary href")
        write_json(out, [])
        return set()

    log("opensuse: downloading primary metadata …")
    try:
        primary = http_get(primary_url, timeout=300)
        names = _parse_rpm_primary_names(primary, href=primary_url)
    except Exception as e:
        log(f"opensuse: SKIP — {e}")
        write_json(out, [])
        return set()

    write_json(out, sorted(names))
    log(f"opensuse: {len(names)} packages → {out}")
    return names


def aur_info_batch(names: list[str], sleep_s: float = 0.3) -> dict[str, dict]:
    """Batch AUR RPC info. Returns name -> result dict for found packages."""
    found: dict[str, dict] = {}
    if not names:
        return found
    # AUR allows multiple arg[]
    batch_size = 100
    for i in range(0, len(names), batch_size):
        chunk = names[i : i + batch_size]
        qs = "&".join("arg[]=" + urllib.parse.quote(n) for n in chunk)
        url = f"https://aur.archlinux.org/rpc/v5/info?{qs}"
        try:
            data = http_get_json(url, timeout=60)
        except RuntimeError as e:
            log(f"aur: batch error: {e}")
            time.sleep(1.0)
            continue
        for r in data.get("results") or []:
            n = r.get("Name")
            if n:
                found[n] = r
        if i + batch_size < len(names):
            time.sleep(sleep_s)
    return found


# ---------------------------------------------------------------------------
# Cache orchestration
# ---------------------------------------------------------------------------


def build_cache(cache_dir: Path, force: bool = False, skip: set[str] | None = None) -> dict[str, Any]:
    skip = skip or set()
    cache_dir.mkdir(parents=True, exist_ok=True)
    meta_path = cache_dir / "meta.json"
    indexes: dict[str, Any] = {}

    if "debian" not in skip:
        indexes["debian_bin"] = build_debian_bin_map(cache_dir, force=force)
    if "alpine" not in skip:
        indexes["alpine_cmd"] = build_alpine_cmd_map(cache_dir, force=force)
    if "arch" not in skip:
        indexes["arch_pkgs"] = build_arch_pkg_set(cache_dir, force=force)
    if "fedora" not in skip:
        indexes["fedora_pkgs"] = build_fedora_pkg_set(cache_dir, force=force)
    if "opensuse" not in skip:
        indexes["opensuse_pkgs"] = build_opensuse_pkg_set(cache_dir, force=force)
    if "brew" not in skip:
        indexes["brew"] = build_brew_set(cache_dir, force=force)
    if "nix" not in skip:
        indexes["nix"] = build_nix_set(cache_dir, force=force)

    # Always summarize whatever is on disk so partial --skip rebuilds don't
    # wipe counts for other indexes from meta.json.
    disk_counts: dict[str, int | None] = {}
    for name, path in (
        ("debian_bin", cache_dir / "debian_bin.json"),
        ("alpine_cmd", cache_dir / "alpine_cmd.json"),
        ("arch_pkgs", cache_dir / "arch_pkgs.json"),
        ("fedora_pkgs", cache_dir / "fedora_pkgs.json"),
        ("opensuse_pkgs", cache_dir / "opensuse_pkgs.json"),
        ("brew", cache_dir / "brew_formulae.json"),
        ("nix", cache_dir / "nix_attrs.json"),
    ):
        if path.exists():
            data = read_json(path)
            disk_counts[name] = len(data) if hasattr(data, "__len__") else None
        else:
            disk_counts[name] = None
    meta = {
        "built_at": datetime.now(timezone.utc).isoformat(),
        "indexes": disk_counts,
    }
    write_json(meta_path, meta)
    log(f"cache ready: {cache_dir}")
    return indexes


def load_indexes(cache_dir: Path) -> dict[str, Any]:
    """Load all index files; raise if core ones missing."""
    required = {
        "debian_bin": cache_dir / "debian_bin.json",
        "alpine_cmd": cache_dir / "alpine_cmd.json",
        "arch_pkgs": cache_dir / "arch_pkgs.json",
    }
    for key, path in required.items():
        if not path.exists():
            raise SystemExit(
                f"Missing cache file {path}. Run: "
                f"python3 scripts/fetch-package-installs.py --build-cache"
            )

    def load_set(name: str) -> set[str]:
        p = cache_dir / name
        if not p.exists():
            return set()
        data = read_json(p)
        return set(data) if isinstance(data, list) else set(data.keys())

    return {
        "debian_bin": read_json(cache_dir / "debian_bin.json"),
        "alpine_cmd": read_json(cache_dir / "alpine_cmd.json"),
        "arch_pkgs": load_set("arch_pkgs.json"),
        "fedora_pkgs": load_set("fedora_pkgs.json"),
        "opensuse_pkgs": load_set("opensuse_pkgs.json"),
        "brew": load_set("brew_formulae.json"),
        "nix": load_set("nix_attrs.json"),
    }


# ---------------------------------------------------------------------------
# Resolve
# ---------------------------------------------------------------------------


def list_command_names() -> list[str]:
    if not COMMANDS_DIR.is_dir():
        return []
    return sorted(p.stem for p in COMMANDS_DIR.glob("*.md"))


def command_has_install(name: str) -> bool:
    path = COMMANDS_DIR / f"{name}.md"
    if not path.exists():
        return False
    # Fast scan for section header
    try:
        text = path.read_text(encoding="utf-8", errors="replace")
    except OSError:
        return False
    return bool(re.search(r"(?m)^# INSTALL\s*$", text))


def load_none_set() -> set[str]:
    if not NONE_FILE.exists():
        return set()
    return {
        line.strip()
        for line in NONE_FILE.read_text(encoding="utf-8").splitlines()
        if line.strip() and not line.startswith("#")
    }


def candidates_for(
    cmd: str, debian_bin: dict[str, str], alpine_cmd: dict[str, str]
) -> list[str]:
    """Ordered unique package name candidates for a command.

    Prefer distro binary→package maps (e.g. rg→ripgrep) before the bare
    command name so brew/nix/dnf pick the real package name when both exist.
    """
    ordered: list[str] = []
    seen: set[str] = set()

    def add(x: str | None) -> None:
        if not x or x in seen:
            return
        seen.add(x)
        ordered.append(x)

    add(debian_bin.get(cmd))
    add(alpine_cmd.get(cmd))
    add(cmd)
    return ordered


def pick_from_set(cands: list[str], pkg_set: set[str]) -> str | None:
    for c in cands:
        if c in pkg_set:
            return c
    return None


def confidence_for(
    cmd: str,
    installs: dict[str, str],
    debian_bin: dict[str, str],
    alpine_cmd: dict[str, str],
) -> str:
    if not installs:
        return "none"
    mapped = debian_bin.get(cmd) or alpine_cmd.get(cmd)
    if mapped and any(v == mapped for v in installs.values()):
        return "high"
    if any(v == cmd for v in installs.values()):
        return "medium"
    return "low"


def resolve_one(
    cmd: str,
    indexes: dict[str, Any],
    aur_hits: dict[str, dict] | None = None,
) -> dict[str, Any]:
    debian_bin: dict[str, str] = indexes["debian_bin"]
    alpine_cmd: dict[str, str] = indexes["alpine_cmd"]
    arch: set[str] = indexes["arch_pkgs"]
    fedora: set[str] = indexes["fedora_pkgs"]
    opensuse: set[str] = indexes["opensuse_pkgs"]
    brew: set[str] = indexes["brew"]
    nix: set[str] = indexes["nix"]

    cands = candidates_for(cmd, debian_bin, alpine_cmd)
    installs: dict[str, str] = {}
    notes: list[str] = []
    sources: dict[str, str] = {}

    # apt: prefer Contents binary map
    if cmd in debian_bin:
        installs["apt"] = debian_bin[cmd]
        sources["apt"] = "debian-contents"
        if debian_bin[cmd] != cmd:
            notes.append(f"apt: binary map {cmd} → {debian_bin[cmd]}")
    else:
        # exact package name only if path equal — without Contents we don't guess
        pass

    # apk: prefer cmd: provides
    if cmd in alpine_cmd:
        installs["apk"] = alpine_cmd[cmd]
        sources["apk"] = "alpine-cmd"
        if alpine_cmd[cmd] != cmd:
            notes.append(f"apk: cmd map {cmd} → {alpine_cmd[cmd]}")

    # pacman official
    pac = pick_from_set(cands, arch)
    if pac:
        installs["pacman"] = pac
        sources["pacman"] = "arch-db"
        if pac != cmd:
            notes.append(f"pacman: candidate {pac}")

    # aur only if not official
    if pac is None and aur_hits is not None:
        for c in cands:
            if c in aur_hits:
                installs["aur"] = c
                sources["aur"] = "aur-rpc"
                notes.append("aur: not in official Arch")
                break

    # dnf / zypper / brew / nix: name match on candidates
    dnf_pkg = pick_from_set(cands, fedora)
    if dnf_pkg:
        installs["dnf"] = dnf_pkg
        sources["dnf"] = "fedora-repodata"

    zyp = pick_from_set(cands, opensuse)
    if zyp:
        installs["zypper"] = zyp
        sources["zypper"] = "opensuse-repodata"

    brew_pkg = pick_from_set(cands, brew)
    if brew_pkg:
        installs["brew"] = brew_pkg
        sources["brew"] = "homebrew-formula"

    nix_pkg = pick_from_set(cands, nix)
    if nix_pkg:
        installs["nix"] = nix_pkg
        sources["nix"] = "nixpkgs-attrs"

    conf = confidence_for(cmd, installs, debian_bin, alpine_cmd)
    install_cmds = {
        mgr: INSTALL_TEMPLATES[mgr].format(pkg=pkg) for mgr, pkg in installs.items()
    }

    return {
        "cmd": cmd,
        "candidates": cands,
        "installs": installs,
        "install_cmds": install_cmds,
        "sources": sources,
        "confidence": conf,
        "notes": notes,
    }


def resolve_batch(
    names: list[str],
    indexes: dict[str, Any],
    do_aur: bool = True,
) -> list[dict[str, Any]]:
    """Resolve many commands; batch AUR lookups for candidates not in Arch."""
    arch: set[str] = indexes["arch_pkgs"]
    debian_bin = indexes["debian_bin"]
    alpine_cmd = indexes["alpine_cmd"]

    aur_need: list[str] = []
    if do_aur:
        for cmd in names:
            cands = candidates_for(cmd, debian_bin, alpine_cmd)
            if pick_from_set(cands, arch) is None:
                aur_need.extend(cands)
        # unique preserve order
        seen: set[str] = set()
        uniq: list[str] = []
        for n in aur_need:
            if n not in seen:
                seen.add(n)
                uniq.append(n)
        aur_need = uniq
        if aur_need:
            log(f"aur: querying {len(aur_need)} candidate names …")
            aur_hits = aur_info_batch(aur_need)
            log(f"aur: {len(aur_hits)} hits")
        else:
            aur_hits = {}
    else:
        aur_hits = {}

    return [resolve_one(cmd, indexes, aur_hits=aur_hits) for cmd in names]


def queue_missing(limit: int | None, skip_none: bool = True) -> list[str]:
    none = load_none_set() if skip_none else set()
    out: list[str] = []
    for name in list_command_names():
        if skip_none and name in none:
            continue
        if command_has_install(name):
            continue
        out.append(name)
        if limit is not None and len(out) >= limit:
            break
    return out


# ---------------------------------------------------------------------------
# Reporting / section helper (for skill; no file writes)
# ---------------------------------------------------------------------------


def format_install_section(row: dict[str, Any], date: str | None = None) -> str:
    """Render # INSTALL markdown for a resolve row (skill may paste this)."""
    installs: dict[str, str] = row.get("installs") or {}
    if not installs:
        return ""
    date = date or datetime.now(timezone.utc).strftime("%Y-%m-%d")
    # Stable manager order
    lines = ["# INSTALL", ""]
    for mgr in MANAGERS:
        if mgr not in installs:
            continue
        pkg = installs[mgr]
        cmd = INSTALL_TEMPLATES[mgr].format(pkg=pkg)
        lines.append(f"```{mgr}: {cmd}```")
        lines.append("")
    lines.append(f"<!-- packages: {date} -->")
    return "\n".join(lines).rstrip() + "\n"


def print_show(row: dict[str, Any]) -> None:
    print(json.dumps(row, indent=2))
    section = format_install_section(row)
    if section:
        print("\n--- markdown ---\n" + section)


# ---------------------------------------------------------------------------
# CLI
# ---------------------------------------------------------------------------


def cmd_build_cache(args: argparse.Namespace) -> int:
    skip = set(args.skip.split(",")) if args.skip else set()
    build_cache(Path(args.cache_dir), force=args.force, skip=skip)
    return 0


def cmd_resolve(args: argparse.Namespace) -> int:
    cache_dir = Path(args.cache_dir)
    indexes = load_indexes(cache_dir)

    if args.names:
        names = list(args.names)
    elif args.batch is not None:
        names = queue_missing(args.batch, skip_none=not args.include_none)
    else:
        names = queue_missing(None, skip_none=not args.include_none)

    if not names:
        log("nothing to resolve")
        return 0

    log(f"resolving {len(names)} commands …")
    rows = resolve_batch(names, indexes, do_aur=not args.no_aur)

    out_path = Path(args.output) if args.output else cache_dir / "results.jsonl"
    n = write_jsonl(out_path, rows)
    log(f"wrote {n} rows → {out_path}")

    # Summary to stderr
    with_hits = sum(1 for r in rows if r["installs"])
    none = sum(1 for r in rows if not r["installs"])
    high = sum(1 for r in rows if r["confidence"] == "high")
    log(f"summary: hits={with_hits} none={none} high_confidence={high}")

    if args.print:
        for r in rows:
            print(json.dumps(r, ensure_ascii=False))

    return 0


def cmd_show(args: argparse.Namespace) -> int:
    indexes = load_indexes(Path(args.cache_dir))
    rows = resolve_batch(list(args.names), indexes, do_aur=not args.no_aur)
    for r in rows:
        print_show(r)
    return 0


def cmd_report(args: argparse.Namespace) -> int:
    cache_dir = Path(args.cache_dir)
    total = len(list_command_names())
    with_install = sum(1 for n in list_command_names() if command_has_install(n))
    none = load_none_set()
    print(f"commands:           {total}")
    print(f"with # INSTALL:     {with_install}")
    print(f"missing # INSTALL:  {total - with_install}")
    print(f"none-list entries:  {len(none)}")
    meta = cache_dir / "meta.json"
    if meta.exists():
        print(f"cache meta:         {json.dumps(read_json(meta), indent=2)}")
    else:
        print("cache meta:         (missing — run --build-cache)")
    results = cache_dir / "results.jsonl"
    if results.exists():
        lines = results.read_text(encoding="utf-8").splitlines()
        print(f"results.jsonl rows: {len(lines)}")
    return 0


def cmd_section(args: argparse.Namespace) -> int:
    """Print INSTALL markdown for commands from latest results or live resolve."""
    cache_dir = Path(args.cache_dir)
    if args.from_results:
        results_path = Path(args.from_results)
        by_cmd = {}
        for line in results_path.read_text(encoding="utf-8").splitlines():
            if not line.strip():
                continue
            row = json.loads(line)
            by_cmd[row["cmd"]] = row
        for name in args.names:
            row = by_cmd.get(name)
            if not row:
                log(f"not in results: {name}")
                continue
            sec = format_install_section(row)
            if sec:
                print(f"===== {name} =====")
                print(sec)
    else:
        indexes = load_indexes(cache_dir)
        rows = resolve_batch(list(args.names), indexes, do_aur=not args.no_aur)
        for r in rows:
            sec = format_install_section(r)
            if sec:
                print(f"===== {r['cmd']} =====")
                print(sec)
            else:
                log(f"{r['cmd']}: no installs")
    return 0


def build_parser() -> argparse.ArgumentParser:
    p = argparse.ArgumentParser(
        description="Resolve package manager installs for command man pages"
    )
    p.add_argument(
        "--cache-dir",
        default=str(DEFAULT_CACHE),
        help=f"cache directory (default: {DEFAULT_CACHE})",
    )
    p.add_argument("--force", action="store_true", help="rebuild even if cache fresh")
    p.add_argument("--no-aur", action="store_true", help="skip AUR RPC queries")
    p.add_argument("--build-cache", action="store_true", help="download/parse indexes")
    p.add_argument(
        "--resolve",
        nargs="*",
        metavar="CMD",
        help="resolve CMD(s) to JSONL; with no CMDs resolve missing queue "
        "(use --batch N to limit)",
    )
    p.add_argument("--show", nargs="+", metavar="CMD", help="show resolve for CMD(s)")
    p.add_argument("--report", action="store_true", help="coverage / cache report")
    p.add_argument("--section", nargs="+", metavar="CMD", help="print INSTALL markdown")
    p.add_argument("--batch", type=int, default=None, help="with --resolve: next N missing")
    p.add_argument("--output", "-o", default=None, help="results JSONL path")
    p.add_argument("--print", action="store_true", help="print JSONL rows to stdout")
    p.add_argument("--include-none", action="store_true", help="include none-list cmds")
    p.add_argument(
        "--skip",
        default="",
        help="comma-separated indexes to skip when building "
        "(debian,alpine,arch,fedora,opensuse,brew,nix)",
    )
    p.add_argument(
        "--from-results",
        default=None,
        help="with --section: read rows from this JSONL",
    )
    return p


def main(argv: list[str] | None = None) -> int:
    args = build_parser().parse_args(argv)

    if args.build_cache:
        return cmd_build_cache(args)
    if args.resolve is not None:
        # nargs='*' → [] means "use queue"; non-empty means explicit names
        args.names = list(args.resolve)
        return cmd_resolve(args)
    if args.show:
        args.names = args.show
        return cmd_show(args)
    if args.report:
        return cmd_report(args)
    if args.section:
        args.names = args.section
        return cmd_section(args)

    build_parser().print_help()
    return 1


if __name__ == "__main__":
    raise SystemExit(main())
