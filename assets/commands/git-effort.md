# TAGLINE

Display commit activity and development effort per file

# TLDR

**Show effort for all files**

```git effort```

**Show effort for path**

```git effort [src/]```

**Limit by commits**

```git effort --above [50]```

# SYNOPSIS

**git effort** [_options_] [_path_]

# PARAMETERS

_PATH_
> Path to analyze.

**--above** _N_
> Only show files with N+ commits.

**--help**
> Display help information.

# DESCRIPTION

**git effort** displays commit activity for files over time, showing which files receive the most attention through commit frequency and active days. The output ranks files by commit count and active days, helping identify hotspots and understand maintenance patterns in the codebase.

Part of the git-extras suite, it reveals which areas of the codebase receive ongoing development effort, useful for planning code reviews and understanding project dynamics.

# CAVEATS

Part of git-extras package. Can be slow on large repos. Measures commits, not lines changed.

# HISTORY

git effort is part of **git-extras**, created by **TJ Holowaychuk** to visualize development effort distribution.

# SEE ALSO

[git-fame](/man/git-fame)(1), [git-summary](/man/git-summary)(1)
