# TAGLINE

Static analysis tool for GitHub Actions security

# TLDR

**Audit all GitHub Actions in current directory**

```zizmor .```

**Output in SARIF format**

```zizmor --format sarif [.github/workflows/]```

**Run fully offline**

```zizmor --offline .```

# SYNOPSIS

**zizmor** [_options_] [_path_]

# DESCRIPTION

**zizmor** audits GitHub Actions YAML files for security issues including template injection vulnerabilities, mutable tag pinning, and known advisory usage. It has approximately 24 audit rules, generates SARIF output for GitHub code scanning integration, and supports offline mode by default.

# HISTORY

**zizmor** was created by **William Woodruff** (Trail of Bits) and is written in **Rust**.

# INSTALL

```pacman: sudo pacman -S zizmor```

```apk: sudo apk add zizmor```

```zypper: sudo zypper install zizmor```

```brew: brew install zizmor```

```nix: nix profile install nixpkgs#zizmor```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[semgrep](/man/semgrep)(1)
