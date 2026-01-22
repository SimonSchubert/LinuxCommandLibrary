# TLDR

**List configurations**

```gcloud config configurations list```

**Create configuration**

```gcloud config configurations create [name]```

**Set property**

```gcloud config set [project] [project-id]```

**Get property**

```gcloud config get-value [project]```

**List all properties**

```gcloud config list```

# SYNOPSIS

**gcloud config** _command_ [_options_]

# PARAMETERS

_COMMAND_
> Operation: set, get-value, list, configurations.

**set** _PROPERTY_ _VALUE_
> Set configuration property.

**get-value** _PROPERTY_
> Get property value.

**list**
> List all properties.

**configurations** _SUBCMD_
> Manage named configurations.

**unset** _PROPERTY_
> Remove property setting.

**--help**
> Display help information.

# DESCRIPTION

**gcloud config** manages gcloud CLI configuration. It sets default project, region, zone, and account settings used when not specified on command line.

Named configurations allow switching between different setups for multiple projects or accounts. Properties affect all subsequent gcloud commands.

gcloud config centralizes settings to avoid repetitive command-line options.

# CAVEATS

Per-command options override config. Configuration is user-specific. Some properties require valid values.

# HISTORY

gcloud config is part of the **Google Cloud SDK** configuration system, providing persistent settings management for the CLI.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1)
