# TAGLINE

Compute and report repository size metrics

# TLDR

**Analyze repository size**

```git-sizer```

**Verbose output** showing all statistics

```git-sizer -v```

**JSON output** for machine processing

```git-sizer --json```

**Show only critical** statistics

```git-sizer --critical```

# SYNOPSIS

**git-sizer** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Report all statistics, equivalent to --threshold=0

**--json**
> JSON output format

**--json-version** _n_
> JSON format version (1 or 2)

**--threshold** _n_
> Minimum concern level to report (0=all, 1=default, 30=critical only)

**--critical**
> Only report critical statistics (equivalent to --threshold=30)

**--names** _mode_
> Display names of large objects (none, hash, or full)

**--no-progress**
> Suppress progress output

**--show-refs**
> List the references being processed

**--version**
> Display version information

# DESCRIPTION

**git-sizer** computes various size metrics for a Git repository, identifying potential performance problems such as oversized files, deep histories, or wide directory trees.

The tool reports metrics with concern levels shown as asterisks (*), helping maintainers understand whether their repository structure may cause issues with cloning, fetching, or general Git operations. It must be run from within a Git repository.

# SEE ALSO

[git-filter-repo](/man/git-filter-repo)(1), [git-gc](/man/git-gc)(1)
