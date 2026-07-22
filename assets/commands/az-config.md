# TAGLINE

Manage Azure CLI configuration settings

# TLDR

**Get all configurations**

```az config get```

**Get a specific configuration** section

```az config get [core]```

**Get a specific configuration** key

```az config get [core.no_color]```

**Disable color output**

```az config set core.no_color=true```

**Set default resource group** and location

```az config set defaults.group=[MyResourceGroup] defaults.location=[westus2]```

**Enable logging** to file

```az config set logging.enable_log_file=true```

**Unset a configuration**

```az config unset [core.no_color]```

**Set local configuration** for current directory

```az config set defaults.group=[myRG] --local```

# SYNOPSIS

**az** **config** _subcommand_ [_options_]

# SUBCOMMANDS

**get**
> Get a configuration value.

**set**
> Set a configuration value.

**unset**
> Unset a configuration value.

**param-persist**
> Manage parameter persistence.

**param-persist on**
> Enable parameter persistence.

**param-persist off**
> Disable parameter persistence.

**param-persist show**
> Show parameter persistence data.

**param-persist delete**
> Delete parameter persistence data.

# PARAMETERS

**--local**
> Apply configuration to local scope (working directory) instead of global.

# DESCRIPTION

**az config** manages Azure CLI configuration settings. It allows customizing CLI behavior including output formatting, default values, telemetry, logging, and error display. Configuration can be set globally or locally per directory.

The default configuration file is stored at ~/.azure/config.

# CONFIGURATION

**~/.azure/config**
> Global Azure CLI configuration file with INI-format sections for core, defaults, logging, and other settings.

**.azure/config**
> Local directory-scoped configuration file, created with the --local flag, overriding global settings for the current project.

# CAVEATS

This command group is marked **experimental** and under development (not deprecated); behavior and options may change. It has been available since Azure CLI 2.10.0. Local configurations are stored in the current working directory and take precedence over the global config.

# INSTALL

```dnf: sudo dnf install azure-cli```

```pacman: sudo pacman -S azure-cli```

```zypper: sudo zypper install azure-cli```

```brew: brew install azure-cli```

```nix: nix profile install nixpkgs#azure-cli```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[az](/man/az)(1), [az-appconfig](/man/az-appconfig)(1)

# RESOURCES

```[Source code](https://github.com/Azure/azure-cli)```

```[Documentation](https://learn.microsoft.com/en-us/cli/azure/config)```

<!-- verified: 2026-06-18 -->
