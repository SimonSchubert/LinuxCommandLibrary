# TLDR

**Check Python file**

```pylint [file.py]```

**Check with specific config**

```pylint --rcfile=[.pylintrc] [file.py]```

**Disable specific warnings**

```pylint --disable=[C0114] [file.py]```

**Generate config file**

```pylint --generate-rcfile > [.pylintrc]```

**Output as JSON**

```pylint --output-format=json [file.py]```

# SYNOPSIS

**pylint** [_options_] _modules_

# PARAMETERS

_MODULES_
> Python modules to check.

**--rcfile** _FILE_
> Configuration file.

**--disable** _IDS_
> Disable checks.

**--enable** _IDS_
> Enable checks.

**--output-format** _FORMAT_
> Output format.

**--generate-rcfile**
> Generate config.

# DESCRIPTION

**pylint** analyzes Python code for errors and style. Comprehensive linter.

The tool checks code quality. Reports violations and suggestions.

pylint lints Python.

# CAVEATS

Can be slow on large codebases. Highly configurable.

# HISTORY

Pylint was created as a **comprehensive Python** code analysis tool.

# SEE ALSO

[pyflakes](/man/pyflakes)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1), [ruff](/man/ruff)(1)

