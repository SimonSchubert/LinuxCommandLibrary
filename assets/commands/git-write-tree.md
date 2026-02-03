# TLDR

**Write tree from index**

```git write-tree```

**Write with prefix**

```git write-tree --prefix=[subdir/]```

**Missing OK**

```git write-tree --missing-ok```

# SYNOPSIS

**git** **write-tree** [_options_]

# PARAMETERS

**--prefix** _prefix_
> Write subtree.

**--missing-ok**
> Allow missing objects.

# DESCRIPTION

**git write-tree** creates a tree object from the current index. A low-level command used internally by git commit.

# SEE ALSO

[git-commit-tree](/man/git-commit-tree)(1), [git-read-tree](/man/git-read-tree)(1)

