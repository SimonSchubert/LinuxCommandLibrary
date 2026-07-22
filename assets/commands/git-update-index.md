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

**Read paths to update from stdin**

```find . -name "*.txt" | git update-index --add --stdin```

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
> Refresh stat info; errors on paths that need updating unless **-q** is given.

**-q**
> Used with **--refresh**: continue quietly even if paths need updating, instead of erroring out.

**--really-refresh**
> Like **--refresh**, but check stat information unconditionally, ignoring the assume-unchanged bit.

**--chmod=(+|-)x**
> Set or unset the executable bit for updated paths.

**--stdin**
> Read list of paths from standard input instead of the command line, one per line (or NUL-separated with **-z**).

**--index-info**
> Read index entries (mode, object, path) from standard input to add, replace, or remove entries directly.

**--cacheinfo** _mode_,_object_,_path_
> Directly insert an entry into the index without needing a corresponding file in the working tree.

**-z**
> Use NUL as the line terminator with **--stdin** or **--index-info**.

**--ignore-submodules**
> Skip submodule checks when used with **--refresh**.

**--split-index**, **--no-split-index**
> Enable or disable the split-index feature for large repositories.

**--untracked-cache**, **--no-untracked-cache**
> Enable or disable caching of untracked file information to speed up **git status**.

# DESCRIPTION

**git update-index** registers file contents in the working tree to the index. It is a low-level plumbing command used internally by `git add`.

The most common use is the `--assume-unchanged` flag, which tells Git to temporarily ignore changes to a tracked file. The `--skip-worktree` flag serves a similar purpose but is intended for files managed by sparse checkout.

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-add](/man/git-add)(1), [git-rm](/man/git-rm)(1), [git-ls-files](/man/git-ls-files)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-update-index)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-07-17 -->
