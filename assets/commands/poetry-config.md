# TAGLINE

Manage Poetry configuration settings

# TLDR

**List configuration**

```poetry config --list```

**Set configuration**

```poetry config [key] [value]```

**Set repository URL**

```poetry config repositories.[name] [https://repo.example.com]```

**Set PyPI token**

```poetry config pypi-token.pypi [token]```

**Unset configuration**

```poetry config --unset [key]```

# SYNOPSIS

**poetry config** [_options_] [_key_] [_value_]

# PARAMETERS

_KEY_
> Configuration key.

_VALUE_
> Configuration value.

**--list**
> Show all configuration.

**--unset**
> Remove configuration.

**--local**
> Project-specific config.

# DESCRIPTION

**poetry config** reads and writes Poetry configuration settings including virtual environment preferences, repository URLs, and authentication tokens. Use **--list** to view all current settings.

Settings are stored globally by default. The **--local** flag creates a **poetry.toml** file in the project directory for project-specific overrides. Common settings include `virtualenvs.in-project`, `repositories`, and `pypi-token`. Use **--unset** to remove a configuration key.

# CAVEATS

Tokens stored in config. Use --local for project settings.

# HISTORY

poetry config provides **configuration management** for Poetry settings.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-publish](/man/poetry-publish)(1)

