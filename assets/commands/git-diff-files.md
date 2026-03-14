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
> Raw diff format (default).

**--quiet**
> Exit with 1 if there are differences, 0 otherwise. Disables output.

**-p**, **--patch**
> Generate patch output.

**--stat**
> Show diffstat summary.

**--name-only**
> Show only names of changed files.

**--name-status**
> Show names and status (added, modified, deleted) of changed files.

**-0**
> Omit diff output for unmerged entries, just show "Unmerged".

# DESCRIPTION

**git diff-files** compares the working tree with the index (staging area), operating as a low-level plumbing command that shows unstaged changes. It is used internally by git diff when invoked without arguments and provides the foundation for higher-level diff operations.

This command is part of Git's plumbing layer, designed for scripting and automation rather than daily interactive use. It can produce various output formats including raw diff data, patch format, or simple file lists, making it suitable for integration into build tools, pre-commit hooks, or custom Git workflows.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-diff-index](/man/git-diff-index)(1), [git-diff-tree](/man/git-diff-tree)(1)
