# TAGLINE

manage DVC configuration settings

# TLDR

**Set a configuration value**

```dvc config [core.remote] [myremote]```

**Get a configuration value**

```dvc config [core.remote]```

**Set a global configuration value**

```dvc config --global [core.autostage] true```

**Set a project-level (local) configuration value**

```dvc config --local [core.remote] [myremote]```

**List all configuration entries**

```dvc config --list```

**Unset a configuration value**

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
> Use project-level configuration (.dvc/config.local, Git-ignored).

**--project**
> Use project-level configuration (.dvc/config, tracked by Git).

**--list**, **-l**
> List all configuration entries.

**--unset**
> Remove a configuration entry.

**-h**, **--help**
> Display help information.

# CONFIGURATION

**.dvc/config**
> Repository-level DVC configuration file.

**~/.config/dvc/config**
> Global user configuration file.

# DESCRIPTION

**dvc config** manages DVC configuration at project, local, global, and system levels. Configuration controls behavior including default remote storage, caching, and automation settings.

Configuration precedence from highest to lowest: local (Git-ignored), project (Git-tracked), global (user), system. Common configuration sections include `core` (remote, autostage), `cache` (type, dir), and `remote` (url, credentials).

Setting `core.autostage` to true automatically stages .dvc file changes with Git, reducing manual steps. The default remote is set with `core.remote`.

# CAVEATS

Some options need repository context. Invalid keys may be accepted. Requires appropriate permissions for system config.

# HISTORY

dvc config follows conventions from **Git config**, providing familiar configuration management for DVC settings.

# SEE ALSO

[dvc](/man/dvc)(1), [dvc-init](/man/dvc-init)(1), [git-config](/man/git-config)(1)
