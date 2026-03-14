# TAGLINE

Cleanup unnecessary files and optimize the local repository

# TLDR

**Run garbage collection**

```git gc```

**Aggressive cleanup** (recomputes deltas, slow)

```git gc --aggressive```

**Prune all unreachable objects immediately**

```git gc --prune=now```

**Only run gc if housekeeping is needed**

```git gc --auto```

**Force gc even if another instance may be running**

```git gc --force```

**Run without progress output**

```git gc --quiet```

# SYNOPSIS

**git gc** [_options_]

# PARAMETERS

**--aggressive**
> Recompute deltas for more thorough optimization. Significantly slower.

**--prune=**_date_
> Prune loose objects older than date (default: 2 weeks ago, configurable via gc.pruneExpire).

**--no-prune**
> Do not prune any loose objects.

**--auto**
> Only run if housekeeping is needed based on gc.auto thresholds.

**--cruft**
> Pack unreachable objects into a cruft pack instead of leaving them loose (default: on).

**--no-cruft**
> Leave unreachable objects as loose objects instead of packing into cruft packs.

**--quiet**
> Suppress all progress reports.

**--force**
> Force gc to run even if another git gc instance may be running on this repository.

**--keep-largest-pack**
> Consolidate all packs except the largest non-cruft pack and .keep packs into a single pack.

# DESCRIPTION

**git gc** (garbage collection) cleans up unnecessary files and optimizes the local repository. It packs loose objects, removes unreachable objects, and compresses file revisions for better performance and reduced disk usage.

Git runs gc automatically after certain operations (e.g., merge, rebase). Manual gc is useful after history rewrites, large imports, or when disk usage is high. The **--aggressive** mode recomputes all deltas from scratch for deeper optimization but takes significantly longer. The default **--prune** grace period of 2 weeks protects objects that may be referenced by concurrent operations.

# CAVEATS

Aggressive gc is very slow on large repositories. Running gc removes dangling objects after the prune grace period. Let gc complete before other repository operations. Concurrent gc instances are prevented by a lock file.

# HISTORY

git gc is a core **Git** command for repository maintenance, automating cleanup tasks that were originally separate commands like git-prune and git-repack.

# SEE ALSO

[git-prune](/man/git-prune)(1), [git-repack](/man/git-repack)(1), [git-reflog](/man/git-reflog)(1), [git-fsck](/man/git-fsck)(1), [git-count-objects](/man/git-count-objects)(1)
