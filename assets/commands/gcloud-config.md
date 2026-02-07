# TAGLINE

gcloud CLI configuration management

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

**gcloud config** manages persistent configuration properties for the gcloud command-line tool. Properties set through this command become defaults used by all gcloud commands unless explicitly overridden with command-line flags.

Common properties include the default project, Compute Engine region and zone, and active account. These eliminate the need to specify frequently-used values on every command, significantly reducing command verbosity for regular workflows.

Named configurations enable managing multiple independent sets of properties, making it easy to switch between different projects, accounts, or environments. Each configuration is a complete set of property values that can be activated with a single command. This is essential for developers working across multiple GCP projects or organizations, as it prevents accidentally running commands in the wrong project context.

# CAVEATS

Per-command options override config. Configuration is user-specific. Some properties require valid values.

# HISTORY

gcloud config is part of the **Google Cloud SDK** configuration system, providing persistent settings management for the CLI.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1)
