# TLDR

**Check Python file**

```flake8 [file.py]```

**Check directory**

```flake8 [src/]```

**Show specific errors**

```flake8 --select=[E,W] [file.py]```

**Ignore specific errors**

```flake8 --ignore=[E501] [file.py]```

**Set max line** length

```flake8 --max-line-length=[120] [file.py]```

# SYNOPSIS

**flake8** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Python files or directories to check.

**--select** _ERRORS_
> Check only specific error codes.

**--ignore** _ERRORS_
> Ignore specific error codes.

**--max-line-length** _N_
> Maximum line length (default 79).

**--exclude** _PATTERNS_
> Exclude matching files/directories.

**--config** _FILE_
> Configuration file.

**--format** _FORMAT_
> Output format.

**--help**
> Display help information.

# DESCRIPTION

**flake8** is a Python linting tool combining PyFlakes, pycodestyle, and McCabe complexity checker. It finds programming errors, style issues, and overly complex code.

The tool enforces PEP 8 style guidelines and catches common errors like undefined variables, unused imports, and syntax problems. Plugins extend checking for additional frameworks and patterns.

flake8 integrates with editors, CI pipelines, and pre-commit hooks for automated code quality enforcement.

# CAVEATS

Strict defaults may require customization. Some checks overlap with other tools. Plugin ecosystem varies in quality.

# HISTORY

flake8 was created by **Tarek Ziadé** to unify Python linting tools. It wraps multiple checkers under a single interface with consistent configuration and output.

# SEE ALSO

[pylint](/man/pylint)(1), [black](/man/black)(1), [ruff](/man/ruff)(1)
