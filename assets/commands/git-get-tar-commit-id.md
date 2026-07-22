# TAGLINE

Extract commit ID from tar archive

# TLDR

**Extract commit ID from archive**

```git get-tar-commit-id < [archive.tar]```

# SYNOPSIS

**git** **get-tar-commit-id** < _archive_

# DESCRIPTION

**git get-tar-commit-id** extracts the commit ID from a tar archive created by git archive. The commit ID is stored in the archive's pax extended header when the archive was generated.

This command reads from stdin and outputs the 40-character SHA-1 hash if found. It is particularly useful for build systems that distribute archives and need to verify source versions. The command only works with archives created by git archive, as standard tar archives do not contain git metadata.

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

[git-archive](/man/git-archive)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-get-tar-commit-id)```

<!-- verified: 2026-07-17 -->
