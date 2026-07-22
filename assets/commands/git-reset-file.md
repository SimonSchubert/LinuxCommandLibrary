# TAGLINE

Reset a single file to a specific revision

# TLDR

**Reset file to HEAD**

```git reset-file [file]```

**Reset file to a specific commit**

```git reset-file [file] [commit]```

# SYNOPSIS

**git** **reset-file** _file_ [_commit_]

# DESCRIPTION

**git reset-file** resets a single tracked file to its state at HEAD, or at a given commit if one is provided. Part of git-extras, it unstages the file and checks out its content from that revision, without touching the rest of the working tree or index.

# CAVEATS

The file argument comes first, followed by the optional commit; passing them in the wrong order silently fails since the second argument is treated as a commit-ish. The file must currently exist in the working tree.

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

[git-reset](/man/git-reset)(1), [git-checkout](/man/git-checkout)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-reset-file)```

<!-- verified: 2026-07-17 -->
