# TAGLINE

Display a decorated graph of commits across all branches

# TLDR

**Show branch tree**

```git show-tree```

# SYNOPSIS

**git show-tree**

# DESCRIPTION

**git show-tree** is a git-extras shortcut for `git log --all --graph --decorate --oneline --simplify-by-decoration`. It draws an ASCII commit graph across every branch, showing only the commits that are branch/tag tips or merge points, which makes overall repository topology easy to see at a glance.

# CAVEATS

Part of git-extras package. Only shows commits relevant to the graph shape (tips, merges, tags); use `git log --graph` directly if you need every commit.

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

[git-log](/man/git-log)(1), [git-branch](/man/git-branch)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-show-tree)```

<!-- verified: 2026-07-17 -->
