# TLDR

**Show unstaged changes**

```git diff-files```

**Show for specific file**

```git diff-files [file]```

**Raw output**

```git diff-files --raw```

**Check for changes**

```git diff-files --quiet```

# SYNOPSIS

**git** **diff-files** [_options_] [_files_...]

# PARAMETERS

**--raw**
> Raw diff format.

**--quiet**
> Exit with 1 if differences.

**-p**, **--patch**
> Generate patch.

**--stat**
> Show diffstat.

**--name-only**
> Show changed file names.

# DESCRIPTION

**git diff-files** compares the working tree with the index. A low-level command showing unstaged changes. Used internally by git diff.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-diff-index](/man/git-diff-index)(1)

