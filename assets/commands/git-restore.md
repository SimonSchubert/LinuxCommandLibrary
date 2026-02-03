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

**git restore** restores working tree files. Added in Git 2.23 to separate the file restoration function from git checkout.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-reset](/man/git-reset)(1)

