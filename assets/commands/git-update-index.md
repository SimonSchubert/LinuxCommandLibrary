# TAGLINE

Modify index entries for tracked files

# TLDR

**Mark file as unchanged**

```git update-index --assume-unchanged [file]```

**Mark file as changed**

```git update-index --no-assume-unchanged [file]```

**Skip worktree**

```git update-index --skip-worktree [file]```

**Refresh index**

```git update-index --refresh```

**Add file to index**

```git update-index --add [file]```

**Remove file from index**

```git update-index --remove [file]```

# SYNOPSIS

**git** **update-index** [_options_] [_files_...]

# PARAMETERS

**--assume-unchanged**
> Ignore changes to file.

**--no-assume-unchanged**
> Track changes again.

**--skip-worktree**
> Skip worktree bit.

**--no-skip-worktree**
> Clear skip-worktree.

**--add**
> Add file to index.

**--remove**
> Remove file from index.

**--refresh**
> Refresh stat info.

**--chmod** _mode_
> Set executable bit.

# DESCRIPTION

**git update-index** registers file contents in the working tree to the index. It is a low-level plumbing command used internally by `git add`.

The most common use is the `--assume-unchanged` flag, which tells Git to temporarily ignore changes to a tracked file. The `--skip-worktree` flag serves a similar purpose but is intended for files managed by sparse checkout.

# SEE ALSO

[git-add](/man/git-add)(1), [git-rm](/man/git-rm)(1)
