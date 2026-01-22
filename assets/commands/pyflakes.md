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

**pyflakes** analyzes Python code for errors. Static analysis tool.

The tool finds undefined names and imports. Fast and simple checker.

pyflakes finds Python errors.

# CAVEATS

Only checks for errors, not style. Faster than pylint.

# HISTORY

Pyflakes was created for **fast static** analysis of Python code.

# SEE ALSO

[pylint](/man/pylint)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1)

