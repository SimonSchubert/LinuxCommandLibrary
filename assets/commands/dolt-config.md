# TAGLINE

manage repository and global settings

# TLDR

**Set global user** name

```dolt config --global --add user.name "[Your Name]"```

**Set global email**

```dolt config --global --add user.email "[email@example.com]"```

**List all config**

```dolt config --list```

**Get specific value**

```dolt config --get user.name```

**Set local config**

```dolt config --local --add [key] [value]```

**Unset config value**

```dolt config --unset [key]```

# SYNOPSIS

**dolt config** [_options_] [_name_] [_value_]

# PARAMETERS

_NAME_
> Configuration key name.

_VALUE_
> Value to set.

**--global**
> Use global configuration.

**--local**
> Use repository-local configuration.

**--add** _KEY_ _VALUE_
> Add configuration entry.

**--get** _KEY_
> Get configuration value.

**--unset** _KEY_
> Remove configuration entry.

**--list**
> List all configuration.

**--help**
> Display help information.

# DESCRIPTION

**dolt config** manages Dolt configuration settings at global and repository-local levels. Essential settings include user identity (name and email) used in commit authorship.

Global configuration applies to all repositories for the user, while local configuration is repository-specific. Local settings override global ones when both exist.

Configuration is stored in files similar to Git's config system, with the same precedence rules for local vs. global settings.

# CONFIGURATION

**~/.dolt/config_global.json**
> Global configuration for all Dolt repositories for the current user.

**.dolt/config.json**
> Repository-local configuration that overrides global settings.

# CAVEATS

User identity required before committing. Invalid keys may be accepted without warning. Some settings require repository restart to take effect.

# HISTORY

dolt config follows **git config** conventions, providing familiar configuration management for Dolt users coming from Git-based workflows.

# SEE ALSO

[dolt](/man/dolt)(1), [git-config](/man/git-config)(1)
