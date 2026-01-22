# TLDR

**Show line statistics**

```git fame```

**Include all file types**

```git fame --everything```

**Sort by commits**

```git fame --sort=commits```

**Exclude paths**

```git fame --exclude=[vendor/]```

**Show specific directory**

```git fame [src/]```

# SYNOPSIS

**git fame** [_options_] [_path_]

# PARAMETERS

_PATH_
> Path to analyze.

**--sort** _FIELD_
> Sort by loc, commits, or files.

**--exclude** _PATTERN_
> Exclude paths.

**--everything**
> Include all file types.

**--branch** _BRANCH_
> Analyze specific branch.

**--help**
> Display help information.

# DESCRIPTION

**git fame** generates contribution statistics showing lines of code, commits, and files per author. It provides a comprehensive view of who contributed what to the codebase.

The tool counts current lines (not historical) attributed to each author via blame analysis. Output includes percentages for relative contribution comparison.

git fame provides detailed attribution statistics.

# CAVEATS

Blame-based counting can be slow. Binary files excluded. Last modifier gets credit.

# HISTORY

git fame provides contribution analysis similar to tools like **git-fame-rb** and other repository statistics generators.

# SEE ALSO

[git-effort](/man/git-effort)(1), [git-authors](/man/git-authors)(1), [git-shortlog](/man/git-shortlog)(1)
