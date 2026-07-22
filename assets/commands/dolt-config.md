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

```dolt config --local --set [key] [value]```

**Unset config value**

```dolt config --global --unset [key]```

# SYNOPSIS

**dolt config** [**--global**|**--local**] **--list**

**dolt config** [**--global**|**--local**] **--add**|**--set** _name_ _value_

**dolt config** [**--global**|**--local**] **--get** _name_

**dolt config** [**--global**|**--local**] **--unset** _name_...

# PARAMETERS

**--global**
> Operate on the global config, shared by every repository for this user.

**--local**
> Operate on the repository-local config.

**--set** _name_ _value_
> Set the value of one or more config parameters.

**--add** _name_ _value_
> Set the value of one or more config parameters (a synonym for **--set**).

**--get** _name_
> Print the value of one or more config parameters.

**--unset** _name_...
> Remove one or more config parameters.

**--list**
> List the values of all config parameters.

# DESCRIPTION

**dolt config** manages Dolt configuration settings at global and repository-local levels. Essential settings include user identity (name and email) used in commit authorship.

Global configuration applies to all repositories for the user, while local configuration is repository-specific. Local settings override global ones when both exist.

Configuration mirrors Git's config system, including its precedence rules, but the values are stored as JSON rather than INI. Beyond `user.name` and `user.email`, common keys include `init.defaultbranch`, `sqlserver.global.*` for server defaults, and `metrics.disabled` to opt out of usage reporting.

# CONFIGURATION

**~/.dolt/config_global.json**
> Global configuration for all Dolt repositories belonging to the current user.

**.dolt/config.json**
> Repository-local configuration, which overrides the global settings.

# CAVEATS

An identity (`user.name` and `user.email`) must be set before the first commit; Dolt will refuse to commit without one. Unknown keys are accepted silently, so a typo in a key name fails quietly rather than erroring. **--local** only works inside a Dolt database directory. Server-related settings under `sqlserver.global.*` are read at startup, so `dolt sql-server` must be restarted for changes to take effect.

# HISTORY

dolt config follows the **git config** conventions closely, deliberately so: Dolt's whole interface is designed to be guessable by anyone who already knows Git, and configuration was one of the first commands ported when Dolt was released in 2019.

# INSTALL

```pacman: sudo pacman -S dolt```

```brew: brew install dolt```

```nix: nix profile install nixpkgs#dolt```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dolt](/man/dolt)(1), [dolt-commit](/man/dolt-commit)(1), [git-config](/man/git-config)(1)

# RESOURCES

```[Source code](https://github.com/dolthub/dolt)```

```[Documentation](https://www.dolthub.com/docs/cli-reference/cli/)```

<!-- verified: 2026-07-14 -->

