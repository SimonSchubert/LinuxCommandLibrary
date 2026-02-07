# TAGLINE

manage conda configuration settings

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

# CONFIGURATION

**~/.condarc**
> User-level configuration file.

**.condarc**
> Project or environment-specific configuration.

# DESCRIPTION

**conda config** provides command-line access to conda's configuration system, which controls package channels, proxy settings, SSL verification, default behaviors, and numerous other options affecting how conda operates. Configuration is stored in .condarc files (YAML format) which can exist at system, user, or project levels, with user-level typically at ~/.condarc.

The configuration system uses a hierarchical override mechanism where more specific configurations take precedence over general ones. Common configuration tasks include managing the channel priority list (determining which repositories are searched for packages and in what order), setting up proxy servers for corporate environments, disabling SSL verification for internal repositories, and controlling automatic environment activation.

Channels are particularly important in conda's configuration as they determine where packages are sourced. The defaults channel points to Anaconda's official repository, while conda-forge is a community-driven channel with a broader package selection. Channel priority affects which package version is selected when the same package exists in multiple channels. The --show-sources option reveals which .condarc files are currently in effect and how configuration values are being inherited or overridden.

# SEE ALSO

[conda](/man/conda)(1), [conda-info](/man/conda-info)(1)
