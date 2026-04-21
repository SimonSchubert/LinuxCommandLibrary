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

**Show source**

```pydocstyle --source [module.py]```

**Count errors only**

```pydocstyle --count [module.py]```

# SYNOPSIS

**pydocstyle** [_--convention name_] [_--ignore codes_] [_--select codes_] [_options_] _files_

# PARAMETERS

**--convention** _NAME_
> Convention (pep257, numpy, google).

**--ignore** _CODES_
> Errors to ignore.

**--select** _CODES_
> Errors to check.

**--source**
> Show source code.

**--explain**
> Explain errors.

**--count**
> Count only.

**--match** _PATTERN_
> Only check files whose names match the regular expression _PATTERN_ (default: `(?!test_).*\.py`).

**--match-dir** _PATTERN_
> Only recurse into directories whose names match the regular expression _PATTERN_ (default: `[^\.].*`).

**--add-ignore** _CODES_
> Add codes to the existing ignore list (does not replace).

**--add-select** _CODES_
> Add codes to the existing select list (does not replace).

**--config** _FILE_
> Use the specified configuration file instead of auto-discovery.

**-d**, **--debug**
> Print debug information.

**-v**, **--verbose**
> Print status information during run.

# CONVENTIONS

**pep257** - PEP 257 conventions
**numpy** - NumPy docstring style
**google** - Google Python style

# DESCRIPTION

**pydocstyle** checks Python docstring conventions. It enforces consistent documentation style.

Conventions define expected format. PEP 257, NumPy, and Google styles are supported.

Error codes identify specific issues. D100 series for modules, D200 for formatting, etc.

Source display shows problematic code. Helps identify and fix issues quickly.

Configuration files set project defaults. pyproject.toml and setup.cfg supported.

# CONFIGURATION

**pyproject.toml**
> Project configuration with a `[tool.pydocstyle]` section for convention, match patterns, and ignore/select rules.

**setup.cfg**
> Alternative project configuration with a `[pydocstyle]` section supporting the same options.

**.pydocstyle**
> Standalone configuration file for pydocstyle settings.

# CAVEATS

Style preferences vary. May need tuning for project needs. Not all edge cases covered.

**Deprecated:** as of late 2023 pydocstyle is no longer actively maintained; its checks were reimplemented in **Ruff** under the `D` prefix, which is the recommended replacement.

# HISTORY

**pydocstyle** started as **pep257** before expanding to support multiple conventions (PEP 257, NumPy, Google). Development slowed with the rise of **Ruff**, which provides a faster, drop-in implementation of pydocstyle's rules. The PyCQA project announced deprecation in November 2023, recommending migration to Ruff.

# SEE ALSO

[ruff](/man/ruff)(1), [pylint](/man/pylint)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1), [black](/man/black)(1)
