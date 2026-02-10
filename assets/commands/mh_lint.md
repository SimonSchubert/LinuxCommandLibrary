# TAGLINE

checks MATLAB code for issues

# TLDR

**Check MATLAB code**

```mh_lint [file.m]```

**Check directory**

```mh_lint [src/]```

**Output to file**

```mh_lint [file.m] > [report.txt]```

**Enable all checks**

```mh_lint --all [file.m]```

**Show available checks**

```mh_lint --list```

# SYNOPSIS

**mh_lint** [_options_] _files_

# PARAMETERS

_FILES_
> MATLAB files to check.

**--all**
> Enable all checks.

**--list**
> List available checks.

**--fix**
> Auto-fix issues.

**--help**
> Display help information.

# DESCRIPTION

**mh_lint** checks MATLAB code for issues. It identifies style violations and potential bugs.

The tool is part of MISS_HIT. It enforces coding standards for MATLAB/Simulink projects.

# CAVEATS

Part of MISS_HIT. MATLAB specific. Python-based tool.

# HISTORY

mh_lint is part of **MISS_HIT**, a MATLAB/Simulink code quality tool suite.

# SEE ALSO

[mh_metric](/man/mh_metric)(1), [mh_style](/man/mh_style)(1), [mlint](/man/mlint)(1)

