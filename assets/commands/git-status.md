# TAGLINE

Show the working tree status

# TLDR

**Show working tree status**

```git status```

**Short format output**

```git status -s```

**Show short format with branch info**

```git status -sb```

**Show ignored files**

```git status --ignored```

**Machine-readable output** for scripting

```git status --porcelain```

**Show untracked files**

```git status -u```

**Show verbose diff of staged changes**

```git status -v```

**Show status for a specific path**

```git status [path/to/file_or_directory]```

# SYNOPSIS

**git** **status** [_options_] [_--_] [_paths_...]

# PARAMETERS

**-s**, **--short**
> Short format output with two-column status codes (XY).

**-b**, **--branch**
> Show branch and tracking info in short format.

**--porcelain**[**=v1**|**v2**]
> Machine-readable format. Version 2 includes more detail.

**-u**[_mode_], **--untracked-files**[**=**_mode_]
> Show untracked files. Mode can be: no, normal (default), all.

**--ignored**[**=**_mode_]
> Show ignored files. Mode can be: traditional, no, matching.

**-v**, **--verbose**
> Show staged diff. Use **-vv** to also show unstaged diff.

**--ahead-behind**
> Show ahead/behind counts relative to upstream branch.

**--no-ahead-behind**
> Suppress ahead/behind counts (faster for large repos).

**--long**
> Long format output (default).

**--column**[**=**_options_]
> Display untracked files in columns.

**-z**
> Terminate entries with NUL instead of newline (for scripting).

**--renames**, **--no-renames**
> Enable or disable rename detection.

# DESCRIPTION

**git status** displays the state of the working tree and the staging area. It shows which changes have been staged, which are unstaged, and which files are untracked by Git.

In short format (**-s**), each file is shown with a two-character status code: the first column shows the index (staging area) status and the second shows the working tree status. Common codes include **M** (modified), **A** (added), **D** (deleted), **R** (renamed), **?** (untracked), and **!** (ignored).

The **--porcelain** format provides stable, machine-readable output suitable for scripting, while the default long format is designed for human readability. Use **--porcelain=v2** for richer machine-readable output including rename and copy information.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-add](/man/git-add)(1), [git-commit](/man/git-commit)(1), [git-stash](/man/git-stash)(1)
