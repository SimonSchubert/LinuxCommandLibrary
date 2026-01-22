# TLDR

**Sort imports in file**

```isort [file.py]```

**Sort imports in place**

```isort [file.py]```

**Check without modifying**

```isort --check-only [file.py]```

**Show diff**

```isort --diff [file.py]```

**Sort all Python files**

```isort .```

**Use Black-compatible profile**

```isort --profile black [file.py]```

# SYNOPSIS

**isort** [_options_] [_path_...]

# PARAMETERS

**--check-only**
> Check without modifying.

**--diff**
> Show changes as diff.

**--profile** _NAME_
> Use predefined profile (black, django, pycharm).

**-l** _LENGTH_
> Line length limit.

**--force-single-line**
> One import per line.

**--skip** _GLOB_
> Skip files matching pattern.

**--help**
> Display help information.

# DESCRIPTION

**isort** sorts Python imports alphabetically and separates them into sections. It follows PEP 8 guidelines for import organization.

The tool groups imports by standard library, third-party, and local. It integrates with editors and CI pipelines.

isort sorts Python imports.

# CAVEATS

Python-specific. May conflict with other formatters. Use profiles for compatibility.

# HISTORY

isort was created by **Timothy Crosley** to automatically sort and organize Python imports following best practices.

# SEE ALSO

[black](/man/black)(1), [flake8](/man/flake8)(1), [autopep8](/man/autopep8)(1), [pylint](/man/pylint)(1)
