# TAGLINE

Check Python docstring conventions

# TLDR

**Check docstrings**

```pydocstyle [module.py]```

**Check directory**

```pydocstyle [src/]```

**Select conventions**

```pydocstyle --convention [google] [module.py]```

**Ignore specific errors**

```pydocstyle --ignore [D100,D101] [module.py]```

**Select specific errors**

```pydocstyle --select [D200,D201] [module.py]```

**Show source and an explanation** for each error

```pydocstyle --source --explain [module.py]```

**Use a convention but also skip specific checks**

```pydocstyle --convention [numpy] --add-ignore [D105,D107] [src/]```

**Print the total number of errors** after the report

```pydocstyle --count [src/]```

# SYNOPSIS

**pydocstyle** [_options_] [_path_ ...]

# PARAMETERS

**--convention** _NAME_
> Check the errors of a predefined convention: pep257 (default), numpy, or google.

**--ignore** _CODES_
> Check all errors except the comma-separated _CODES_ (prefixes like `D2` allowed).

**--select** _CODES_
> Check only the comma-separated _CODES_.

**-s**, **--source**
> Show the source code for each error.

**-e**, **--explain**
> Show an explanation of each error.

**--count**
> Print the total number of errors to stdout after the report.

**--match** _PATTERN_
> Only check files whose names match the regular expression _PATTERN_ (default: `(?!test_).*\.py`).

**--match-dir** _PATTERN_
> Only recurse into directories whose names match the regular expression _PATTERN_ (default: `[^\.].*`).

**--add-ignore** _CODES_
> Add codes to the existing ignore list (does not replace).

**--add-select** _CODES_
> Add codes to the existing select list (does not replace).

**--ignore-decorators** _REGEX_
> Ignore functions and methods decorated with a decorator matching _REGEX_.

**--property-decorators** _NAMES_
> Comma-separated decorator names that mark a method as a property (default: property, cached_property, functools.cached_property).

**--ignore-self-only-init**
> Ignore `__init__` methods whose only parameter is `self`.

**--config** _FILE_
> Use the specified configuration file instead of auto-discovery.

**-d**, **--debug**
> Print debug information.

**-v**, **--verbose**
> Print status information during run.

# CONVENTIONS

**pep257**
> PEP 257 conventions (the default).

**numpy**
> NumPy docstring style.

**google**
> Google Python style.

# DESCRIPTION

**pydocstyle** checks Python docstring conventions. It enforces consistent documentation style.

Conventions define expected format. PEP 257, NumPy, and Google styles are supported.

Error codes identify specific issues: D1xx for missing docstrings, D2xx for whitespace, D3xx for quotes, and D4xx for docstring content.

Source display shows problematic code. Helps identify and fix issues quickly.

Configuration files set project defaults. pyproject.toml and setup.cfg supported.

# CONFIGURATION

**pyproject.toml**
> Project configuration with a `[tool.pydocstyle]` section for convention, match patterns, and ignore/select rules.

**setup.cfg**
> Alternative project configuration with a `[pydocstyle]` section supporting the same options.

**.pydocstyle**, **.pydocstyle.ini**, **.pydocstylerc**, **tox.ini**
> Other discovered configuration files, searched from the checked file upward.

# CAVEATS

**--select**, **--ignore**, and **--convention** are mutually exclusive; use **--add-select** and **--add-ignore** to adjust one of them. Files named `test_*.py` are skipped by default because of the **--match** pattern.

**Deprecated:** the project was officially deprecated and its repository archived in November 2023; its checks were reimplemented in **Ruff** under the `D` prefix, which is the recommended replacement.

# HISTORY

**pydocstyle** started as **pep257** before expanding to support multiple conventions (PEP 257, NumPy, Google). Development slowed with the rise of **Ruff**, which provides a faster, drop-in implementation of pydocstyle's rules. The PyCQA project announced deprecation in November 2023, recommending migration to Ruff.

# SEE ALSO

[ruff](/man/ruff)(1), [pylint](/man/pylint)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1), [black](/man/black)(1)

# RESOURCES

```[Source code](https://github.com/PyCQA/pydocstyle)```

```[Documentation](https://www.pydocstyle.org/)```

<!-- verified: 2026-11-23 -->
