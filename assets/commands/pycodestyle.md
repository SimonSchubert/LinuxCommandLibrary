# TLDR

**Check Python file**

```pycodestyle [script.py]```

**Check directory**

```pycodestyle [src/]```

**Show source code**

```pycodestyle --show-source [script.py]```

**Show PEP8 text**

```pycodestyle --show-pep8 [script.py]```

**Ignore specific errors**

```pycodestyle --ignore=[E501,W503] [script.py]```

**Select specific errors only**

```pycodestyle --select=[E1,W1] [script.py]```

**Set max line length**

```pycodestyle --max-line-length=[120] [script.py]```

**Show statistics**

```pycodestyle --statistics [src/]```

# SYNOPSIS

**pycodestyle** [_--ignore codes_] [_--select codes_] [_--max-line-length n_] [_options_] _files_

# PARAMETERS

**--ignore** _CODES_
> Skip error codes.

**--select** _CODES_
> Show only error codes.

**--max-line-length** _N_
> Line length limit (default 79).

**--show-source**
> Show source code.

**--show-pep8**
> Show PEP8 documentation.

**--statistics**
> Show error statistics.

**--count**
> Print total errors.

**--config** _FILE_
> Configuration file.

**--first**
> Show first error only.

**-q**, **--quiet**
> Quiet mode.

**--benchmark**
> Time the run.

# ERROR CODES

**E1xx**
> Indentation errors.

**E2xx**
> Whitespace errors.

**E3xx**
> Blank line errors.

**E4xx**
> Import errors.

**E5xx**
> Line length errors.

**E7xx**
> Statement errors.

**W xxx**
> Warnings.

# DESCRIPTION

**pycodestyle** (formerly pep8) checks Python code against PEP 8 style guidelines. It identifies formatting issues without modifying code.

PEP 8 defines Python's official style: indentation, spacing, naming, and line length conventions. Consistent style improves readability.

Error codes group related issues. E5 codes relate to line length. W503/W504 handle line breaks in expressions. Specific codes can be ignored.

Configuration files (setup.cfg, tox.ini, .pycodestyle) define project-wide settings. These override command-line defaults.

The tool doesn't fix issues automatically. Use autopep8 or black for automatic formatting.

Integration with editors shows issues in real-time. CI pipelines catch style violations before merge.

# CAVEATS

Style checking only - no logical errors. Some rules are debatable (W503 vs W504). Strict line length may not suit all projects.

# HISTORY

**pycodestyle** was originally named **pep8**, created by **Johann C. Rocholl** around **2006**. It was renamed in **2016** per PEP 8's own advice that Guido's naming conventions are guidelines, not rules.

# SEE ALSO

[flake8](/man/flake8)(1), [pylint](/man/pylint)(1), [black](/man/black)(1), [autopep8](/man/autopep8)(1)
