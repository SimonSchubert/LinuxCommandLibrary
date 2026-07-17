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

**git write-tree** creates a tree object from the current index contents and prints the resulting tree object's SHA to standard output. It is a low-level plumbing command used internally by `git commit` to snapshot the staged file structure into a tree object in the Git object database.

The index must be in a fully merged state before running this command; typically `git update-index` is used first to sync the index with the working directory.

# SEE ALSO

[git-commit-tree](/man/git-commit-tree)(1), [git-read-tree](/man/git-read-tree)(1), [git-update-index](/man/git-update-index)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-write-tree)```

<!-- verified: 2026-07-17 -->
