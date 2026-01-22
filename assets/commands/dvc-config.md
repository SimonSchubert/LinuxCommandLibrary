# TLDR

**Set configuration** value

```dvc config [core.remote] [myremote]```

**Get configuration** value

```dvc config [core.remote]```

**Set global config**

```dvc config --global [core.autostage] true```

**List all config**

```dvc config --list```

**Unset config value**

```dvc config --unset [core.remote]```

# SYNOPSIS

**dvc config** [_options_] [_name_] [_value_]

# PARAMETERS

_NAME_
> Configuration key.

_VALUE_
> Configuration value.

**--global**
> Use global configuration.

**--system**
> Use system configuration.

**--local**
> Use repository configuration.

**--list**, **-l**
> List all configuration.

**--unset**
> Remove configuration entry.

**--help**
> Display help information.

# DESCRIPTION

**dvc config** manages DVC configuration at local, global, and system levels. Configuration controls behavior including default remote, caching, and automation settings.

Local configuration applies to the current repository, global to the current user, and system to all users. Local settings override global, which override system.

Common configurations include setting the default remote storage and enabling auto-staging of .dvc files with Git.

# CAVEATS

Some options need repository context. Invalid keys may be accepted. Requires appropriate permissions for system config.

# HISTORY

dvc config follows conventions from **Git config**, providing familiar configuration management for DVC settings.

# SEE ALSO

[dvc](/man/dvc)(1), [git-config](/man/git-config)(1)
