# TAGLINE

Fast static error checker for Python

# TLDR

**Check Python file for errors**

```pyflakes [file.py]```

**Check multiple files**

```pyflakes [file1.py] [file2.py]```

**Check from stdin**

```cat [file.py] | pyflakes```

# SYNOPSIS

**pyflakes** [_files_]

# PARAMETERS

_FILES_
> Python files to check.

# DESCRIPTION

**pyflakes** is a fast, lightweight static analysis tool that checks Python source files for common errors without executing them. It detects issues like undefined names, unused imports, redefined variables, and other logical mistakes that would cause runtime failures.

Unlike **pylint** or **flake8**, pyflakes focuses exclusively on error detection and does not check code style or formatting. This narrow scope makes it significantly faster and produces no false positives for stylistic choices, making it well-suited for integration into editors and pre-commit hooks where speed matters.

# CAVEATS

Only checks for errors, not style. Faster than pylint.

# HISTORY

Pyflakes was created for **fast static** analysis of Python code.

# SEE ALSO

[pylint](/man/pylint)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1)

