# TLDR

**Unstage files**

```git reset [file]```

**Soft reset (keep changes staged)**

```git reset --soft [commit]```

**Mixed reset (unstage changes)**

```git reset [commit]```

**Hard reset (discard changes)**

```git reset --hard [commit]```

**Reset to upstream**

```git reset --hard @{u}```

**Unstage all files**

```git reset HEAD```

**Reset single file to commit**

```git reset [commit] -- [file]```

# SYNOPSIS

**git** **reset** [_options_] [_commit_] [_--_] [_files_...]

# PARAMETERS

**--soft**
> Keep changes staged.

**--mixed**
> Unstage changes (default).

**--hard**
> Discard all changes.

**--keep**
> Reset but keep local changes.

**--merge**
> Reset to merge state.

**-p**, **--patch**
> Interactive reset.

# DESCRIPTION

**git reset** resets current HEAD to specified state. Can be used to unstage files, undo commits, or completely discard changes.

# CAVEATS

Hard reset discards changes permanently. Be careful with --hard on uncommitted work.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-revert](/man/git-revert)(1)

