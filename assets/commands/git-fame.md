# TAGLINE

Generate contribution statistics by author

# TLDR

**Show line statistics**

```git fame```

**Sort by number of commits**

```git fame --sort=commits```

**Exclude paths (comma-separated or regex)**

```git fame --excl=[vendor/]```

**Show specific directory**

```git fame [src/]```

**Show emails instead of names**

```git fame --show-email```

**Detect moved/copied lines for more accurate attribution**

```git fame -M -C```

# SYNOPSIS

**git fame** [_options_] [_gitdir_...]

# PARAMETERS

_GITDIR_
> Git directory to analyze (default: current directory). May be repeated.

**--branch** _BRANCH_
> Branch or tag to analyze (default: HEAD).

**--sort** _KEY_
> Sort by loc (default), commits, files, hours, or months.

**--excl** _PATTERN_
> Excluded files, comma-separated or regex.

**--incl** _PATTERN_
> Included files (default: all).

**--loc** _TYPE_
> Count surviving, insertions, or deletions.

**--since** _DATE_, **--until** _DATE_
> Restrict to commits in a date range.

**--cost** _METHOD_
> Estimate cost via months, cocomo, hours, or commits.

**-e**, **--show-email**
> Show author emails instead of names.

**-w**, **--ignore-whitespace**
> Ignore whitespace-only changes when attributing blame.

**-M**
> Detect intra-file line moves and copies.

**-C**
> Detect inter-file line moves and copies.

**-R**, **--recurse**
> Recursively find repositories and submodules.

**-t**, **--bytype**
> Break down stats per file extension.

**--format** _FORMAT_
> Output format: pipe, md, yaml, json, csv, tsv, or tabulate.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**git fame** generates contribution statistics showing lines of code, commits, and files per author. It provides a comprehensive view of who contributed what to the codebase, using blame analysis to count current lines attributed to each author.

Output includes percentages for relative contribution comparison, and can optionally estimate development cost using the COCOMO model or elapsed commit time. The tool is useful for understanding code ownership patterns and team contribution distribution.

# CAVEATS

Blame-based counting can be slow on large histories. Binary files are skipped by default (**--warn-binary** to be notified). Only the current tree's last modifier gets credit unless **-M**/**-C** are used to trace moved or copied lines back to their original author.

# HISTORY

git fame is a Python rewrite by **Casper da Costa-Luis**, distinct from the earlier **git-fame-rb** Ruby gem by Linus Oleander that inspired the name.

# SEE ALSO

[git-effort](/man/git-effort)(1), [git-authors](/man/git-authors)(1), [git-shortlog](/man/git-shortlog)(1), [git-blame](/man/git-blame)(1)

# RESOURCES

```[Source code](https://github.com/casperdcl/git-fame)```

```[Homepage](https://pypi.org/project/git-fame/)```

<!-- verified: 2026-07-17 -->
