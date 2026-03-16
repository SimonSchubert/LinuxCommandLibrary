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
> Write metrics report in plain text format to the specified file.

**--ci**
> CI mode. Suppresses the overall report and only reports metric violations.

**--ignore-justifications-with-tickets**
> Ignore any justifications in code that mention a ticket reference.

**--help**
> Display help information.

# DESCRIPTION

**mh_metric** computes code metrics for MATLAB and Octave files and reports violations when metrics exceed acceptable levels. It measures cyclomatic complexity, number of lines, function length, nesting depth, and other code quality indicators.

The tool is part of the **MISS_HIT** suite. If no files or directories are specified, it analyzes the entire working directory and all subdirectories. Configuration can be provided via **miss_hit.cfg** files in the project tree.

# CAVEATS

Part of the MISS_HIT suite, installed via pip (`pip install miss_hit`). Only analyzes MATLAB (.m) and Octave files. Requires Python 3.6 or later.

# HISTORY

mh_metric is part of **MISS_HIT** (MATLAB Independent, Small & Safe, High Integrity Tools), created by **Florian Schanda** for measuring MATLAB and Simulink code quality metrics.

# SEE ALSO

[mh_lint](/man/mh_lint)(1)

