# TAGLINE

Cleanup and optimize repository storage

# TLDR

**Run garbage collection**

```git gc```

**Aggressive cleanup**

```git gc --aggressive```

**Prune immediately**

```git gc --prune=now```

**Auto gc if needed**

```git gc --auto```

**Quiet mode**

```git gc --quiet```

# SYNOPSIS

**git gc** [_options_]

# PARAMETERS

**--aggressive**
> More thorough optimization (slow).

**--prune** _DATE_
> Prune objects older than date.

**--auto**
> Only run if needed.

**--quiet**
> Suppress output.

**--force**
> Force gc even if another running.

**--help**
> Display help information.

# DESCRIPTION

**git gc** (garbage collection) cleans up unnecessary files and optimizes the repository. It packs loose objects, removes unreachable objects, and compresses the repository for better performance.

Git runs gc automatically after certain operations. Manual gc is useful after history rewrites or large imports. Aggressive mode performs deeper optimization but takes significantly longer.

# CAVEATS

Aggressive is slow. Running gc removes dangling objects. Let gc complete before other operations.

# HISTORY

git gc is a core **Git** command for repository maintenance, automating cleanup tasks that were originally separate commands.

# SEE ALSO

[git-prune](/man/git-prune)(1), [git-repack](/man/git-repack)(1), [git-count-objects](/man/git-count-objects)(1)
