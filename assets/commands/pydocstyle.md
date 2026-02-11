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
> File pattern.

**--config** _FILE_
> Config file.

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

# HISTORY

**pydocstyle** started as **pep257** before expanding to support multiple conventions. It helps Python projects maintain consistent documentation.

# SEE ALSO

[pylint](/man/pylint)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1)
