# TLDR

**Calculate metrics**

```mh_metric [file.m]```

**Analyze directory**

```mh_metric [src/]```

**Output JSON**

```mh_metric --json [file.m]```

**Show all metrics**

```mh_metric --all [file.m]```

**Set threshold**

```mh_metric --limit-complexity [10] [file.m]```

# SYNOPSIS

**mh_metric** [_options_] _files_

# PARAMETERS

_FILES_
> MATLAB files to analyze.

**--json**
> Output as JSON.

**--all**
> Show all metrics.

**--limit-complexity** _N_
> Complexity threshold.

**--help**
> Display help information.

# DESCRIPTION

**mh_metric** calculates MATLAB code metrics. It measures complexity, lines, and other quality indicators.

The tool is part of MISS_HIT. It provides cyclomatic complexity and function metrics.

mh_metric measures MATLAB metrics.

# CAVEATS

Part of MISS_HIT. MATLAB specific. Python-based.

# HISTORY

mh_metric is part of **MISS_HIT** for measuring MATLAB/Simulink code quality metrics.

# SEE ALSO

[mh_lint](/man/mh_lint)(1), [mh_style](/man/mh_style)(1)

