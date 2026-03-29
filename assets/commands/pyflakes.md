# TAGLINE

Fast static error checker for Python

# TLDR

**Check a Python file** for errors

```pyflakes [file.py]```

**Check multiple files**

```pyflakes [file1.py] [file2.py]```

**Check from stdin**

```cat [file.py] | pyflakes```

**Check a directory** recursively

```pyflakes [path/to/directory]```

# SYNOPSIS

**pyflakes** [_options_] [_files_or_directories_]

# PARAMETERS

_FILES_
> Python files or directories to check

**--version**
> Show program version and exit

**-h**, **--help**
> Show help message and exit

# DESCRIPTION

**pyflakes** is a fast, lightweight static analysis tool that checks Python source files for common errors without executing them. It detects issues like undefined names, unused imports, redefined variables, and other logical mistakes that would cause runtime failures.

Unlike **pylint** or **flake8**, pyflakes focuses exclusively on error detection and does not check code style or formatting. This narrow scope makes it significantly faster and produces no false positives for stylistic choices, making it well-suited for integration into editors and pre-commit hooks where speed matters.

# CAVEATS

Only checks for logical errors, not code style or formatting. Does not support configuration files for rule customization. Often used as a component within **flake8** rather than standalone.

# HISTORY

Pyflakes was created by Divmod for **fast static** analysis of Python code. It is now maintained by the PyCQA (Python Code Quality Authority) organization.

# SEE ALSO

[pylint](/man/pylint)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1), [ruff](/man/ruff)(1)

