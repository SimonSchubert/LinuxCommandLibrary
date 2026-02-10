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
> Enable strict checking.

**--ignore-missing-imports**
> Skip untyped modules.

**--show-error-codes**
> Display error codes.

**--python-version** _VER_
> Target Python version.

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

[python](/man/python)(1), [pyright](/man/pyright)(1), [pylint](/man/pylint)(1)

