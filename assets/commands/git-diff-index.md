# TAGLINE

Compare tree to working tree or index

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

**git diff-index** compares a tree object to the working tree or index, operating as a low-level plumbing command used internally by git diff for commit comparisons. It accepts a tree-ish (commit, branch, tag, or tree object) and compares it against either the index (with --cached) or the working tree.

The tool is particularly useful in automation scenarios that need to detect whether files have changed since a specific commit, such as CI/CD pipelines checking for uncommitted modifications or scripts validating clean working directories. Its --quiet flag enables simple boolean checks for changes without processing full diff output.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-diff-tree](/man/git-diff-tree)(1)
