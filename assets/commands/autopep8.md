# TAGLINE

Automatically format Python code to PEP 8 style

# TLDR

**Format a Python file in place**

```autopep8 --in-place [file.py]```

**Format with aggressive fixes (repeat -a for more aggression)**

```autopep8 --in-place --aggressive --aggressive [file.py]```

**Show diff instead of modifying the file**

```autopep8 --diff [file.py]```

**Format all Python files in a directory recursively**

```autopep8 --in-place --recursive [directory/]```

**Fix only specific error codes**

```autopep8 --select E501,W293 --in-place [file.py]```

**Format using multiple parallel jobs**

```autopep8 --in-place --recursive --jobs 4 [directory/]```

**Set a custom maximum line length**

```autopep8 --max-line-length 120 --in-place [file.py]```

# SYNOPSIS

**autopep8** [_--in-place_] [_--aggressive_] [_options_] _files_

# DESCRIPTION

**autopep8** automatically formats Python code to conform to the PEP 8 style guide. It fixes issues like whitespace, indentation, and line length while preserving code semantics.

The tool integrates with editors and CI pipelines to enforce consistent Python style. It uses pycodestyle to detect style violations and applies fixes accordingly.

# PARAMETERS

**-i**, **--in-place**
> Modify files in place.

**-d**, **--diff**
> Print the unified diff of changes instead of modifying the file.

**-r**, **--recursive**
> Process directories recursively. Requires `--in-place` or `--diff`.

**-a**, **--aggressive**
> Enable more aggressive fixes beyond whitespace. Repeatable for increasing aggressiveness (e.g., -aa).

**-j** _n_, **--jobs** _n_
> Number of parallel jobs. Values less than 1 use all available CPUs.

**--select** _errors_
> Fix only the specified error codes (e.g., E501,W293).

**--ignore** _errors_
> Ignore the specified error codes (default: E226,E24,W50,W690).

**--max-line-length** _n_
> Maximum allowed line length (default: 79).

**--range** _start_ _end_
> Only fix errors on lines within the specified range.

**--exclude** _patterns_
> Exclude files and directories matching the specified comma-separated glob patterns.

**--experimental**
> Enable experimental code-shortening features.

**--list-fixes**
> List available error codes that can be used with `--select` and `--ignore`.

**-v**, **--verbose**
> Print verbose messages. Can be repeated for more verbosity.

**-p** _n_, **--pep8-passes** _n_
> Maximum number of additional formatting passes (default: infinite until no more changes).

**--hang-closing**
> Hang the closing bracket instead of matching indentation of the opening line.

**--exit-code**
> Return exit code 2 when changes were made with `--diff` or `--in-place`.

**--global-config** _filename_
> Specify a custom global configuration file for pycodestyle rules.

**--ignore-local-config**
> Skip reading local configuration files.

**--version**
> Show version number and exit.

**--help**
> Display help information.

# ERROR CODES

Based on PEP 8:
- **E**: Errors (e.g., E501 line too long, E302 expected blank lines)
- **W**: Warnings (e.g., W291 trailing whitespace, W293 whitespace before a comment)

# CONFIGURATION

**setup.cfg**
> Project-level configuration under `[pycodestyle]` section.

**pyproject.toml**
> Project-level configuration under `[tool.autopep8]` section.

**~/.config/pycodestyle**
> User-level default configuration for pycodestyle rules.

# CAVEATS

May conflict with other formatters like **black**. Aggressive mode can change code logic in rare cases; review changes before committing. For opinionated formatting, **black** is now more widely adopted.

# HISTORY

**autopep8** was created by Hideo Hattori to provide automatic PEP 8 compliance, released around **2010**.

# SEE ALSO

[black](/man/black)(1), [isort](/man/isort)(1), [flake8](/man/flake8)(1), [yapf](/man/yapf)(1), [pycodestyle](/man/pycodestyle)(1), [pylint](/man/pylint)(1)
