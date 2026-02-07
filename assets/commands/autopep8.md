# TAGLINE

Automatically format Python code to PEP 8 style

# TLDR

**Format** Python file

```autopep8 --in-place [file.py]```

Format with **aggressive** fixes

```autopep8 --in-place --aggressive --aggressive [file.py]```

Show **diff** instead of modifying

```autopep8 --diff [file.py]```

Format **recursively**

```autopep8 --in-place --recursive [directory/]```

Select **specific fixes**

```autopep8 --select=[E501,W293] --in-place [file.py]```

# SYNOPSIS

**autopep8** [_--in-place_] [_--aggressive_] [_options_] _files_

# DESCRIPTION

**autopep8** automatically formats Python code to conform to PEP 8 style guide. It fixes issues like whitespace, indentation, and line length while preserving code semantics.

The tool integrates with editors and CI pipelines to enforce consistent Python style.

# PARAMETERS

**-i**, **--in-place**
> Modify files in place

**-d**, **--diff**
> Print diff instead of modifying

**-r**, **--recursive**
> Process directories recursively

**-a**, **--aggressive**
> More aggressive fixes (repeatable for more aggression)

**--select=**_errors_
> Fix only specified errors

**--ignore=**_errors_
> Ignore specified errors

**--max-line-length=**_n_
> Maximum line length (default: 79)

**--range** _start_ _end_
> Only fix lines in range

**--exclude** _patterns_
> Exclude file patterns

# ERROR CODES

Based on PEP 8:
- **E**: Errors
- **W**: Warnings
- Examples: E501 (line too long), W291 (trailing whitespace)

# CONFIGURATION

**setup.cfg**
> Project-level configuration under `[pycodestyle]` section.

**pyproject.toml**
> Project-level configuration under `[tool.autopep8]` section.

**~/.config/pycodestyle**
> User-level default configuration for pycodestyle rules.

# CAVEATS

May conflict with other formatters like black. Aggressive mode can change code logic in rare cases. Review changes before committing. Black is now more popular for opinionated formatting.

# HISTORY

**autopep8** was created by Hideo Hattori to provide automatic PEP 8 compliance, released around **2010**.

# SEE ALSO

[black](/man/black)(1), [isort](/man/isort)(1), [flake8](/man/flake8)(1)
