# TAGLINE

Prune unreachable objects from the object database

# TLDR

**Prune unreachable** loose objects

```git prune```

**Dry run** to see what would be removed

```git prune -n```

**Verbose** output

```git prune -v```

**Only prune objects** older than a given age

```git prune --expire=2.weeks.ago```

**Prune everything** reachable-only right now (no grace period)

```git prune --expire=now```

**Keep objects reachable** from an extra head

```git prune -- [refs/heads/topic]```

# SYNOPSIS

**git prune** [**-n**] [**-v**] [**--progress**] [**--expire** _time_] [**--**] [_heads_...]

# PARAMETERS

**-n**, **--dry-run**
> Do not remove anything, just report what would be removed.

**-v**, **--verbose**
> Report all removed objects.

**--progress**
> Show progress while pruning.

**--expire** _time_
> Only prune loose objects older than _time_ (e.g. `now`, `2.weeks.ago`).

**--**
> Treat the remaining arguments as heads rather than options.

_heads_
> Additional refs whose reachable objects should be kept, in addition to all packed refs.

# DESCRIPTION

**git prune** removes loose objects from `.git/objects` that are not reachable from any reference. Objects become unreachable when commits are amended, rebased away, branches deleted, or stashes dropped, leaving dangling content in the object database.

The command is normally invoked indirectly through **git gc**, which sets an appropriate **--expire** time (the `gc.pruneExpire` config, defaulting to `2.weeks.ago`) so that very recent objects are kept around for safety. The expiry window protects concurrent operations and recently created objects that the reflog has not yet started referencing.

Note that **git prune** only touches loose objects. Unreachable objects already inside a packfile are removed by **git repack -A**.

# CAVEATS

Aggressive expiry (`--expire=now`) can delete objects that are still useful for recovery via the reflog or that another git process is currently writing. Do not run prune manually while other git commands are running in the same repository. To prune stale worktree metadata under `.git/worktrees`, use **git worktree prune** instead.

# HISTORY

**git prune** is one of the original plumbing commands shipped with Git. Its day-to-day role has shifted toward being an internal step of **git gc**, but it remains useful for explicit cleanup after large rewrite operations.

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

[git-gc](/man/git-gc)(1), [git-fsck](/man/git-fsck)(1), [git-reflog](/man/git-reflog)(1)
