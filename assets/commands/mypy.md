# TAGLINE

static type checker for Python

# TLDR

**Type check file**

```mypy [script.py]```

**Type check directory**

```mypy [src/]```

**Strict mode**

```mypy --strict [script.py]```

**Ignore missing imports**

```mypy --ignore-missing-imports [script.py]```

**Show error codes**

```mypy --show-error-codes [script.py]```

**Check specific Python version**

```mypy --python-version [3.10] [script.py]```

**Generate HTML report**

```mypy --html-report [report/] [script.py]```

# SYNOPSIS

**mypy** [_options_] _files_

# PARAMETERS

_FILES_
> Python files to check.

**--strict**
> Enable all optional error-checking flags (strict mode).

**--ignore-missing-imports**
> Silence errors about imports that cannot be resolved.

**--show-error-codes**
> Display error codes in messages (default in recent versions).

**--python-version** _X.Y_
> Type check code as if running on the specified Python version.

**--disallow-untyped-defs**
> Disallow defining functions without type annotations.

**--follow-imports** _MODE_
> How to handle imports (normal, silent, skip, error).

**--html-report** _DIR_
> Generate HTML type-check coverage report (requires lxml).

**--install-types**
> Install missing third-party type stubs automatically.

**--namespace-packages**
> Support PEP 420 namespace packages.

**--config-file** _FILE_
> Use specific mypy configuration file.

**--help**
> Display help information.

# DESCRIPTION

**mypy** is a static type checker for Python. It validates type annotations.

The tool catches type errors before runtime. Supports gradual typing adoption.

# CAVEATS

Requires type annotations. Third-party stubs may be needed. Optional strict mode.

# HISTORY

mypy was created by **Jukka Lehtosalo** and is developed at Dropbox as the premier Python type checker.

# SEE ALSO

[python](/man/python)(1), [pyright](/man/pyright)(1), [pylint](/man/pylint)(1), [ruff](/man/ruff)(1), [black](/man/black)(1), [flake8](/man/flake8)(1)

