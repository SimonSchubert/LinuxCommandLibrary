# TLDR

**Show all configuration**

```conda config --show```

**Show specific setting**

```conda config --show [channels]```

**Add a channel**

```conda config --add channels [conda-forge]```

**Remove a channel**

```conda config --remove channels [channel_name]```

**Set a configuration value**

```conda config --set [auto_activate_base] [false]```

**Show configuration sources**

```conda config --show-sources```

# SYNOPSIS

**conda** **config** [_options_]

# PARAMETERS

**--show** [_key_]
> Show configuration values.

**--add** _key_ _value_
> Add a value to a list setting.

**--remove** _key_ _value_
> Remove a value from a list setting.

**--set** _key_ _value_
> Set a boolean or string setting.

**--show-sources**
> Show all configuration file sources.

**--env**
> Apply to environment-specific config.

# DESCRIPTION

**conda config** manages conda configuration including channels, proxy settings, and behavior options. Configuration is stored in .condarc files at user or system level.

# SEE ALSO

[conda](/man/conda)(1), [conda-info](/man/conda-info)(1)
