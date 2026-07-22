# TAGLINE

List branches merged into the current branch

# TLDR

**Show merged branches**

```git show-merged-branches```

# SYNOPSIS

**git** **show-merged-branches**

# DESCRIPTION

**git show-merged-branches** lists local branches that have been fully merged into HEAD. Part of git-extras, it runs `git branch --merged` and filters out the current branch and the repository's default branch (e.g. `main`/`master`), leaving only the branches that are genuine candidates for deletion.

# CAVEATS

Part of git-extras package; only inspects local branches. See `git-show-unmerged-branches` for the inverse view.

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

[git-branch](/man/git-branch)(1), [git-delete-merged-branches](/man/git-delete-merged-branches)(1), [git-extras](/man/git-extras)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md#git-show-merged-branches)```

<!-- verified: 2026-07-17 -->
