# TAGLINE

Manage multiple working trees for a repository

# TLDR

**Add worktree**

```git worktree add [../feature-branch] [branch-name]```

**Add worktree for new branch**

```git worktree add -b [new-branch] [path]```

**List worktrees**

```git worktree list```

**Lock a worktree** (e.g. on removable media)

```git worktree lock [path] --reason "[reason]"```

**Move a worktree**

```git worktree move [path] [new-path]```

**Remove worktree**

```git worktree remove [path]```

**Prune stale worktrees**

```git worktree prune```

# SYNOPSIS

**git worktree** _command_ [_options_]

# PARAMETERS

**add** _PATH_ [_COMMIT-ISH_]
> Add a new worktree. Creates a new branch named after the final path component if no commit-ish is given.

**list**
> List worktrees, one per line.

**lock** _WORKTREE_
> Prevent a worktree from being pruned, moved, or deleted.

**unlock** _WORKTREE_
> Unlock a worktree.

**move** _WORKTREE_ _NEW-PATH_
> Move a worktree to a new location.

**remove** _WORKTREE_
> Remove a worktree, provided it is clean (no untracked or modified files).

**prune**
> Remove worktree administrative files for working trees that no longer exist.

**repair** [_PATH_...]
> Repair worktree administrative files after a worktree or the main repository was moved manually.

**-b** _BRANCH_, **-B** _BRANCH_
> Create (or reset, with **-B**) a new branch when adding a worktree.

**-d**, **--detach**
> Detach HEAD in the new worktree instead of checking out a branch.

**--lock**
> Keep the new worktree locked immediately after `add`.

**--reason** _STRING_
> Explanation recorded with **lock**.

**-f**, **--force**
> Override safety checks (e.g. allow **remove** of a worktree with untracked files, or **add** with an already-checked-out branch).

**-n**, **--dry-run**
> Report what **prune** would remove, without removing it.

**--help**
> Display help information.

# DESCRIPTION

**git worktree** manages multiple working trees attached to one repository. Each worktree can have a different branch checked out, enabling parallel work without stashing or switching branches.

Worktrees share the same repository data but have separate working directories. This is useful for working on a bug fix while a feature branch is mid-development, or for running tests on one branch while editing another.

# CAVEATS

Same branch can't be checked out in two worktrees at once. Worktrees share most refs (branches, tags), but `HEAD` and a few others are per-worktree. Removing a worktree doesn't delete its branch. If a worktree directory is deleted manually instead of via `remove`, run `git worktree prune` (or `repair`, if the main worktree or repository itself moved) to clean up stale metadata.

# HISTORY

git worktree was added in **Git 2.5** (2015) to enable multiple working directories from a single repository clone. The **move**, **lock**, and **repair** subcommands were added in later releases to improve support for worktrees on removable or network storage.

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

[git-checkout](/man/git-checkout)(1), [git-branch](/man/git-branch)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-worktree)```

<!-- verified: 2026-07-17 -->
