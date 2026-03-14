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

**git undo** removes the last commit(s) while keeping changes in the working directory (unstaged). It is a convenient wrapper around `git reset` that defaults to a mixed reset, preserving all work.

Without arguments, it undoes the most recent commit. Pass a number to undo multiple commits. Use **--soft** to keep changes staged, or **--hard** to discard them entirely.

# CAVEATS

Part of the **git-extras** package and must be installed separately. Only affects local commits that have not been pushed. **--hard** discards changes permanently and cannot be easily recovered.

# SEE ALSO

[git-reset](/man/git-reset)(1), [git-revert](/man/git-revert)(1), [git-extras](/man/git-extras)(1)
