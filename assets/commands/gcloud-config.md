# TAGLINE

gcloud CLI configuration management

# TLDR

**Set the default project**

```gcloud config set project [project-id]```

**Set the default Compute Engine region and zone**

```gcloud config set compute/region [us-central1] && gcloud config set compute/zone [us-central1-a]```

**Get the value of a property**

```gcloud config get [project]```

**Unset a property**

```gcloud config unset [compute/zone]```

**List all properties in the active configuration**

```gcloud config list```

**List all properties, including unset ones**

```gcloud config list --all```

**Create a new named configuration**

```gcloud config configurations create [name]```

**Activate a named configuration**

```gcloud config configurations activate [name]```

**List all configurations**

```gcloud config configurations list```

**Rename a configuration**

```gcloud config configurations rename [name] --new-name=[new_name]```

# SYNOPSIS

**gcloud config** _command_ [_options_]

# PARAMETERS

**set** _SECTION/PROPERTY_ _VALUE_ [**--installation**]
> Set a property. The **core/** section prefix is optional. With **--installation**, the value applies to the whole gcloud installation instead of the active configuration.

**get** _SECTION/PROPERTY_
> Print the value of a property from the active configuration.

**unset** _SECTION/PROPERTY_ [**--installation**]
> Clear a property.

**list** [_SECTION/PROPERTY_] [**--all**]
> Show properties of the active configuration. **--all** includes unset properties.

**configurations create** _NAME_ [**--no-activate**]
> Create a new named configuration and activate it, unless **--no-activate** is given.

**configurations activate** _NAME_
> Switch to a named configuration.

**configurations delete** _NAME_
> Delete a named configuration. Cannot delete the active configuration.

**configurations describe** _NAME_
> Display details of a named configuration.

**configurations list**
> List all available configurations.

**configurations rename** _NAME_ **--new-name**=_NEW_NAME_
> Rename a named configuration.

**--help**
> Display help information.

# DESCRIPTION

**gcloud config** manages persistent configuration properties for the gcloud command-line tool. Properties set through this command become defaults used by all gcloud commands unless explicitly overridden with command-line flags.

Common properties include the default project, Compute Engine region and zone, and active account. These eliminate the need to specify frequently-used values on every command, significantly reducing command verbosity for regular workflows.

Named configurations enable managing multiple independent sets of properties, making it easy to switch between different projects, accounts, or environments. Each configuration is a complete set of property values that can be activated with a single command. This is essential for developers working across multiple GCP projects or organizations, as it prevents accidentally running commands in the wrong project context.

# CAVEATS

Per-command flags such as **--project** override config. The active configuration can be selected for one command with **--configuration** or through the **CLOUDSDK_ACTIVE_CONFIG_NAME** environment variable. Configuration is user-specific. Some properties require valid values. The active configuration cannot be deleted, even when overridden with **--configuration**. The older **get-value** form is no longer listed in the reference; **get** is the documented command.

# HISTORY

gcloud config is part of the **Google Cloud SDK** configuration system, providing persistent settings management for the CLI.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1), [gcloud-init](/man/gcloud-init)(1), [gcloud-components](/man/gcloud-components)(1)

# RESOURCES

```[Homepage](https://cloud.google.com/sdk)```

```[Documentation](https://docs.cloud.google.com/sdk/gcloud/reference/config)```

<!-- verified: 2026-11-09 -->
