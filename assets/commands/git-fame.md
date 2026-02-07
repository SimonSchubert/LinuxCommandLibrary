# TAGLINE

Generate contribution statistics by author

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

**git fame** generates contribution statistics showing lines of code, commits, and files per author. It provides a comprehensive view of who contributed what to the codebase, using blame analysis to count current lines attributed to each author.

Output includes percentages for relative contribution comparison. The tool is useful for understanding code ownership patterns and team contribution distribution.

# CAVEATS

Blame-based counting can be slow. Binary files excluded. Last modifier gets credit.

# HISTORY

git fame provides contribution analysis similar to tools like **git-fame-rb** and other repository statistics generators.

# SEE ALSO

[git-effort](/man/git-effort)(1), [git-authors](/man/git-authors)(1), [git-shortlog](/man/git-shortlog)(1)
