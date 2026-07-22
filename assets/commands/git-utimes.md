# TAGLINE

Restore file timestamps from commit history

# TLDR

**Restore file timestamps**

```git utimes```

# SYNOPSIS

**git utimes**

# DESCRIPTION

**git utimes** sets each tracked file's mtime to the timestamp of the last commit that modified it. Git intentionally stores no timestamps in the index — every checkout writes files with the time of the operation — and this command reverses that for tooling that depends on file dates (Make, find, sitemap generators, archive tools).

The command walks all tracked paths in the working tree and runs **touch -t** with the matching commit time, so subsequent **make**-style "modified since" comparisons match the commit history rather than the moment the repo was cloned.

# CAVEATS

Part of **git-extras**. Affects only tracked files; ignored and untracked paths keep their current mtime. **Will invalidate any incremental build cache** that fingerprints by mtime — re-run after each rebuild rather than once per workday. Submodule contents are not touched.

# HISTORY

git utimes is part of **git-extras**, addressing the common issue that git doesn't preserve file modification times.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[touch](/man/touch)(1), [git-log](/man/git-log)(1)
