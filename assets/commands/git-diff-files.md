# TAGLINE

Compare working tree files to index

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

**git diff-files** compares the working tree with the index (staging area), operating as a low-level plumbing command that shows unstaged changes. It is used internally by git diff when invoked without arguments and provides the foundation for higher-level diff operations.

This command is part of Git's plumbing layer, designed for scripting and automation rather than daily interactive use. It can produce various output formats including raw diff data, patch format, or simple file lists, making it suitable for integration into build tools, pre-commit hooks, or custom Git workflows.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-diff-index](/man/git-diff-index)(1)
