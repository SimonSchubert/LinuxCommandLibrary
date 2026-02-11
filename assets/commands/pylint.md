# TAGLINE

Analyze Python code for errors and style

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

**pylint** is a comprehensive static analysis tool that checks Python code for programming errors, coding standard violations, and code smells. It inspects modules without running them, reporting issues organized by category: conventions (C), refactoring suggestions (R), warnings (W), errors (E), and fatal problems (F), each with a numeric code for precise filtering.

The tool is highly configurable through **.pylintrc** files or **pyproject.toml** sections, allowing teams to enable, disable, or customize individual checks to match project standards. It also produces an overall code quality score out of 10, making it useful for tracking code health over time in CI pipelines. Plugins extend its analysis to frameworks like Django and SQLAlchemy.

# CONFIGURATION

**.pylintrc**
> Project-level configuration file for enabling/disabling checks, setting thresholds, and defining coding standards.

**pyproject.toml**
> Project configuration with a `[tool.pylint]` section supporting the same options as .pylintrc.

**setup.cfg**
> Alternative configuration file with a `[pylint]` section for check settings.

**~/.pylintrc**
> User-level default configuration applied when no project config is found.

# CAVEATS

Can be slow on large codebases. Highly configurable.

# HISTORY

Pylint was created as a **comprehensive Python** code analysis tool.

# SEE ALSO

[pyflakes](/man/pyflakes)(1), [flake8](/man/flake8)(1), [mypy](/man/mypy)(1), [ruff](/man/ruff)(1)

