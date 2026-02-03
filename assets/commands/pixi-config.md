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

**pixi config** manages Pixi package manager configuration. Configure default channels, cache locations, and other settings. Pixi is a fast Conda-compatible package manager written in Rust.

# SEE ALSO

[pixi](/man/pixi)(1), [conda](/man/conda)(1)

