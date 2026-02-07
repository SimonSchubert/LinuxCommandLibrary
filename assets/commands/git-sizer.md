# TAGLINE

Compute and report repository size metrics

# TLDR

**Analyze repository size**

```git-sizer```

**Verbose output**

```git-sizer -v```

**JSON output**

```git-sizer --json```

**Show thresholds**

```git-sizer --threshold=[1]```

# SYNOPSIS

**git-sizer** [_options_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**--json**
> JSON output format.

**--threshold** _n_
> Minimum concern level (0-30).

**--names**
> Show example names.

# DESCRIPTION

**git-sizer** computes various size metrics for a Git repository, identifying potential performance problems such as oversized files, deep histories, or wide directory trees.

The tool reports metrics with concern levels, helping maintainers understand whether their repository structure may cause issues with cloning, fetching, or general Git operations.

# SEE ALSO

[git-filter-repo](/man/git-filter-repo)(1), [git-gc](/man/git-gc)(1)
