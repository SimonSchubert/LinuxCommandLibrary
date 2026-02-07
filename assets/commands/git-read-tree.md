# TAGLINE

Read tree information into index

# TLDR

**Read tree into index**

```git read-tree [tree-ish]```

**Merge trees**

```git read-tree -m [base] [ours] [theirs]```

**Read with prefix**

```git read-tree --prefix=[dir/] [tree-ish]```

**Reset index**

```git read-tree --reset HEAD```

# SYNOPSIS

**git read-tree** [_options_] _tree-ish_

# PARAMETERS

_TREE-ISH_
> Tree to read.

**-m**
> Merge mode.

**-u**
> Update working tree.

**--reset**
> Same as -m, discard unmerged.

**--prefix** _DIR_
> Read into subdirectory.

**-i**
> Only update index.

**--help**
> Display help information.

# DESCRIPTION

**git read-tree** reads tree information into the index. It is a plumbing command used internally by porcelain commands like `git checkout` and `git merge` to manipulate the staging area.

The command can read a single tree or perform three-way merges of trees. It updates the index without touching the working tree unless the `-u` flag is specified to synchronize the working directory.

# CAVEATS

Plumbing command. Usually invoked by other commands. Can overwrite index state.

# HISTORY

git read-tree is a core **Git** plumbing command implementing index manipulation, used internally by checkout, merge, and other commands.

# SEE ALSO

[git-write-tree](/man/git-write-tree)(1), [git-ls-tree](/man/git-ls-tree)(1), [git-checkout](/man/git-checkout)(1)
