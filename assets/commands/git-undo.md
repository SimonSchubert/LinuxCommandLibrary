# TAGLINE

Undo recent commits while preserving changes

# TLDR

**Undo last commit**

```git undo```

**Undo N commits**

```git undo [3]```

**Undo and keep changes staged**

```git undo --soft```

**Undo and discard changes**

```git undo --hard```

# SYNOPSIS

**git undo** [_count_] [_options_]

# PARAMETERS

_COUNT_
> Number of commits to undo (default: 1).

**--soft**
> Keep changes staged.

**--hard**
> Discard all changes.

**--help**
> Display help information.

# DESCRIPTION

**git undo** removes the last commit(s) while keeping changes in the working directory. It is a safer alternative to `git reset` that defaults to preserving work.

The command makes it easy to fix mistakes, amend commits, or restructure recent history. Different modes control whether changes remain staged or unstaged.

# CAVEATS

Part of git-extras package. Only affects local commits. --hard discards changes permanently.

# HISTORY

git undo is part of **git-extras**, providing a friendlier interface to the common reset operation.

# SEE ALSO

[git-reset](/man/git-reset)(1), [git-revert](/man/git-revert)(1)
