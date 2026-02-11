# TAGLINE

Manage Pixi package manager configuration

# TLDR

**Show configuration**

```pixi config list```

**Set configuration value**

```pixi config set [key] [value]```

**Get configuration value**

```pixi config get [key]```

**Edit config file**

```pixi config edit```

# SYNOPSIS

**pixi** **config** _command_ [_options_]

# PARAMETERS

**list**
> Show current configuration.

**get** _key_
> Get specific config value.

**set** _key_ _value_
> Set configuration value.

**edit**
> Open config file in editor.

**--global**
> Use global configuration.

**--local**
> Use project configuration.

# DESCRIPTION

**pixi config** manages Pixi package manager configuration at global and project levels. It provides a command-line interface for reading, writing, and editing settings without manually editing TOML files.

Configuration controls default channels, authentication tokens, cache directories, and other Pixi behaviors. Global settings apply to all projects while local settings in pixi.toml override them per project.

# CONFIGURATION

**~/.pixi/config.toml**
> Global configuration file for all Pixi operations.

**pixi.toml**
> Project-level configuration in the project root directory.

# SEE ALSO

[pixi](/man/pixi)(1), [conda](/man/conda)(1)

