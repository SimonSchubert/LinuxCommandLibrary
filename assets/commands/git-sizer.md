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

**git-sizer** computes various size metrics for a Git repository. Identifies potential problems like large files, deep histories, or wide trees that could cause performance issues.

# SEE ALSO

[git-filter-repo](/man/git-filter-repo)(1), [git-gc](/man/git-gc)(1)

