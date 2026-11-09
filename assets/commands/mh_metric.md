# TAGLINE

calculates MATLAB code metrics

# TLDR

**Calculate metrics** for a single file

```mh_metric [file.m]```

**Analyze** an entire **directory** recursively

```mh_metric [src/]```

**Output** metrics as **JSON** report

```mh_metric --json=[metrics.json] [file.m]```

**Output** metrics as **HTML** report

```mh_metric --html=[metrics.html] [file.m]```

**Output** metrics as **text** report

```mh_metric --text=[metrics.txt] [file.m]```

Run in **CI mode**, reporting only violations

```mh_metric --ci [src/]```

# SYNOPSIS

**mh_metric** [_options_] [_files or directories_]

# PARAMETERS

_FILES_
> MATLAB files or directories to analyze. If not given, analyzes the entire working directory recursively.

**--json**=_FILE_
> Write metrics report in JSON format to the specified file.

**--html**=_FILE_
> Write metrics report in HTML format to the specified file.

**--text**=_FILE_
> Write metrics report in plain text format to the specified file (default: standard output).

**--portable-html**
> Use assets and stylesheets from the web instead of the local MISS_HIT install in HTML reports.

**--worst-offenders** _N_
> Size of the worst offenders table for each metric (default: 10, 0 disables it).

**--ci**
> CI mode. Suppresses the overall report and only reports metric violations.

**--ignore-justifications-with-tickets**
> Ignore any justifications in code that mention a ticket reference.

**--ignore-pragmas**
> Disable special treatment of MISS_HIT pragmas (comments starting with `% mh:`).

**--ignore-config**
> Ignore all MISS_HIT configuration files.

**--octave** [_VERSION_], **--matlab** [_VERSION_]
> Parse the given language version, e.g. 4.4 for Octave or 2021a for MATLAB.

**--input-encoding** _ENCODING_
> Encoding used to read .m files (default: cp1252).

**--single**
> Do not use multi-threaded analysis.

**--brief**
> Do not show line context on messages.

**-v**, **--version**
> Show the MISS_HIT version and exit.

**--help**
> Display help information.

# DESCRIPTION

**mh_metric** computes code metrics for MATLAB and Octave code and reports violations when metrics exceed acceptable levels. It measures cyclomatic complexity, number of lines, function length, nesting depth, and other code quality indicators.

The tool is part of the **MISS_HIT** suite. If no files or directories are specified, it analyzes the entire working directory and all subdirectories. Configuration can be provided via **miss_hit.cfg** files in the project tree.

# CAVEATS

Part of the MISS_HIT suite, installed via pip (`pip install miss_hit`). Analyzes MATLAB and Octave code, including MATLAB embedded in Simulink models. Requires Python 3.7 or later.

# HISTORY

mh_metric is part of **MISS_HIT** (MATLAB Independent, Small & Safe, High Integrity Tools), created by **Florian Schanda** for measuring MATLAB and Simulink code quality metrics.

# SEE ALSO

[mh_lint](/man/mh_lint)(1)

# RESOURCES

```[Source code](https://github.com/florianschanda/miss_hit)```

```[Homepage](https://misshit.org/)```

```[Documentation](https://florianschanda.github.io/miss_hit/)```

<!-- verified: 2026-11-09 -->
