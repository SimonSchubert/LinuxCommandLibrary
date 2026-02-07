# TAGLINE

Remove unreachable objects

# TLDR

**Prune unreachable objects**

```git prune```

**Dry run**

```git prune -n```

**Prune verbose**

```git prune -v```

**Prune older than date**

```git prune --expire [2.weeks.ago]```

# SYNOPSIS

**git prune** [_options_]

# PARAMETERS

**-n**, **--dry-run**
> Show what would be removed.

**-v**, **--verbose**
> Report removed objects.

**--expire** _DATE_
> Only prune older than date.

**--progress**
> Show progress.

**--help**
> Display help information.

# DESCRIPTION

**git prune** removes unreachable objects from the object database. Objects become unreachable when their referencing commits are deleted, rebased away, or otherwise orphaned.

The command is typically run as part of `git gc` rather than directly. The `--expire` option prevents pruning recent objects that might still be needed by concurrent operations, providing a safety margin.

# CAVEATS

Usually run by git gc. Can delete objects needed by concurrent operations. Use expire time for safety.

# HISTORY

git prune is a core **Git** maintenance command for removing unreachable objects, typically invoked through git gc.

# SEE ALSO

[git-gc](/man/git-gc)(1), [git-fsck](/man/git-fsck)(1), [git-reflog](/man/git-reflog)(1)
