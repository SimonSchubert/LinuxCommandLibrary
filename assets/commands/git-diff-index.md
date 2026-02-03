# TLDR

**Compare index to commit**

```git diff-index HEAD```

**Compare working tree to commit**

```git diff-index [commit]```

**Check for differences**

```git diff-index --quiet HEAD```

**Raw output format**

```git diff-index --raw HEAD```

# SYNOPSIS

**git** **diff-index** [_options_] _tree-ish_ [_files_...]

# PARAMETERS

**--cached**
> Compare tree to index only.

**--raw**
> Raw diff output.

**--quiet**
> Exit with 1 if differences.

**--name-only**
> Show file names only.

**--name-status**
> Show file names and status.

# DESCRIPTION

**git diff-index** compares a tree to the working tree or index. A low-level command used by git diff for comparing commits.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-diff-tree](/man/git-diff-tree)(1)

