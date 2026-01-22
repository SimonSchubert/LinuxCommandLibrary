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

**poetry config** manages Poetry configuration. Sets global and local settings.

The tool configures repositories. Manages authentication tokens.

poetry config sets options.

# CAVEATS

Tokens stored in config. Use --local for project settings.

# HISTORY

poetry config provides **configuration management** for Poetry settings.

# SEE ALSO

[poetry](/man/poetry)(1), [poetry-publish](/man/poetry-publish)(1)

