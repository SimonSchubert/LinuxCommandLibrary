# TAGLINE

Show the working tree status

# TLDR

**Show working tree status**

```git status```

**Short format**

```git status -s```

**Show branch info**

```git status -b```

**Show ignored files**

```git status --ignored```

**Porcelain format**

```git status --porcelain```

**Show untracked files**

```git status -u```

# SYNOPSIS

**git** **status** [_options_] [_paths_...]

# PARAMETERS

**-s**, **--short**
> Short format output.

**-b**, **--branch**
> Show branch info.

**--porcelain**
> Machine-readable format.

**-u**, **--untracked-files** [_mode_]
> Show untracked files.

**--ignored**
> Show ignored files.

**-v**, **--verbose**
> Show staged diff.

**--ahead-behind**
> Show ahead/behind counts.

# DESCRIPTION

**git status** displays the state of the working tree and the staging area. It shows which changes have been staged, which are unstaged, and which files are untracked by Git.

The `--porcelain` format provides stable, machine-readable output suitable for scripting, while the default format is designed for human readability.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-add](/man/git-add)(1)
