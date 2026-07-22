# TAGLINE

Exclude a tracked file from further local changes

# TLDR

**Lock a file so Git ignores local edits to it**

```git lock [config/database.yml]```

# SYNOPSIS

**git lock** _filename_

# PARAMETERS

_FILENAME_
> Tracked file to lock.

# DESCRIPTION

**git lock**, a git-extras command, marks a single tracked file with Git's skip-worktree bit via `git update-index --skip-worktree`. Once locked, Git stops reporting local modifications to that file in `git status`/`git diff`, so edits you make won't accidentally get staged or committed.

This is meant for files that need machine-specific local changes, such as `config/database.yml`, not for coordinating edits between teammates: it has no effect on the remote or on other clones, and it does not stop anyone else from committing changes to the same file. Use `git locked` to list currently locked files and `git unlock` to restore normal tracking.

# CAVEATS

Part of git-extras (a thin wrapper around `git update-index --skip-worktree`), not core Git. This is a local, per-clone setting, not a shared or enforced lock. For real cross-team file locking, see `git lfs lock`.

# HISTORY

git lock is part of **git-extras**, a community collection of Git utility scripts. It predates and is unrelated to Git LFS's server-enforced file locking.

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

[git-locked](/man/git-locked)(1), [git-unlock](/man/git-unlock)(1), [git-lfs](/man/git-lfs)(1), [git-update-index](/man/git-update-index)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md)```

<!-- verified: 2026-07-17 -->
