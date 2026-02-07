# TAGLINE

Create a tree object from the current index

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

**git write-tree** creates a tree object from the current index contents. It is a low-level plumbing command used internally by `git commit` to snapshot the staged file structure into a tree object in the Git object database.

# SEE ALSO

[git-commit-tree](/man/git-commit-tree)(1), [git-read-tree](/man/git-read-tree)(1)
