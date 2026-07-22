# TAGLINE

List files locked with git lock

# TLDR

**Show locked files**

```git locked```

# SYNOPSIS

**git locked**

# DESCRIPTION

**git locked**, a git-extras command, lists files in the current repository that have been marked with the skip-worktree bit via `git lock`. Internally it runs `git ls-files -v` and filters for entries flagged **S**, Git's indicator for a skip-worktree file.

This gives quick visibility into which locally-tracked files have local-only edits protected from being picked up by `git status`/`git add`, such as machine-specific config files.

# CAVEATS

Part of git-extras package, not core Git. Only shows the local, per-clone skip-worktree state, not any lock shared with teammates or a remote.

# HISTORY

git locked is part of **git-extras**, complementing git lock and git unlock.

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

[git-lock](/man/git-lock)(1), [git-unlock](/man/git-unlock)(1), [git-ls-files](/man/git-ls-files)(1)

# RESOURCES

```[Source code](https://github.com/tj/git-extras)```

```[Documentation](https://github.com/tj/git-extras/blob/master/Commands.md)```

<!-- verified: 2026-07-17 -->
