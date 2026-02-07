# TAGLINE

Restore working tree files or unstage changes

# TLDR

**Restore working tree file**

```git restore [file]```

**Restore from specific commit**

```git restore --source=[commit] [file]```

**Unstage file**

```git restore --staged [file]```

**Restore all files**

```git restore .```

**Restore both staged and working tree**

```git restore --staged --worktree [file]```

**Interactive restore**

```git restore -p [file]```

# SYNOPSIS

**git** **restore** [_options_] [_files_...]

# PARAMETERS

**--source** _tree_
> Restore from tree.

**-s** _tree_
> Short for --source.

**--staged**
> Restore index (unstage).

**--worktree**
> Restore working tree.

**-S**
> Short for --staged.

**-W**
> Short for --worktree.

**-p**, **--patch**
> Interactive mode.

# DESCRIPTION

**git restore** restores working tree files or unstages changes from the index. Introduced in Git 2.23 to provide a clearer alternative to the file-restoration aspects of `git checkout`.

Use `--staged` to unstage files, `--worktree` (the default) to discard working tree changes, or both together to restore a file completely to a previous state.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-reset](/man/git-reset)(1)
