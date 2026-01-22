# TLDR

**Create tree from ls-tree output**

```git ls-tree HEAD | git mktree```

**Create tree from file**

```git mktree < [tree-listing.txt]```

**Allow missing objects**

```git mktree --missing```

# SYNOPSIS

**git mktree** [_options_]

# PARAMETERS

**--missing**
> Allow missing objects.

**-z**
> NUL-terminated input.

**--batch**
> Process multiple trees.

**--help**
> Display help information.

# DESCRIPTION

**git mktree** creates a tree object from ls-tree formatted input. It reads file modes, object types, hashes, and names, creating a new tree object containing those entries.

The command is a plumbing tool for programmatic tree creation. It's the inverse of git ls-tree, enabling tree manipulation in scripts.

git mktree provides low-level tree object creation.

# CAVEATS

Plumbing command. Input must be properly formatted. Objects must exist unless --missing.

# HISTORY

git mktree is a core **Git** plumbing command for tree object creation, enabling programmatic manipulation of git's tree structure.

# SEE ALSO

[git-ls-tree](/man/git-ls-tree)(1), [git-write-tree](/man/git-write-tree)(1)
