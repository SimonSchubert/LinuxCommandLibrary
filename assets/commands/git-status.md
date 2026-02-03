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

**git status** shows the working tree status. Displays staged changes, unstaged modifications, and untracked files.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git-add](/man/git-add)(1)

