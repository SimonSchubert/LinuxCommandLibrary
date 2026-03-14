# TAGLINE

gcloud CLI configuration management

# TLDR

**Set the default project**

```gcloud config set project [project-id]```

**Set the default Compute Engine region and zone**

```gcloud config set compute/region [us-central1] && gcloud config set compute/zone [us-central1-a]```

**Get the value of a property**

```gcloud config get-value [project]```

**Unset a property**

```gcloud config unset [compute/zone]```

**List all properties in the active configuration**

```gcloud config list```

**Create a new named configuration**

```gcloud config configurations create [name]```

**Activate a named configuration**

```gcloud config configurations activate [name]```

**List all configurations**

```gcloud config configurations list```

# SYNOPSIS

**gcloud config** _command_ [_options_]

# PARAMETERS

**set** _SECTION/PROPERTY_ _VALUE_
> Set a configuration property to a given value.

**get-value** _SECTION/PROPERTY_
> Print the value of a property.

**unset** _SECTION/PROPERTY_
> Remove a property from the active configuration.

**list**
> List all properties in the active configuration.

**configurations create** _NAME_
> Create a new named configuration.

**configurations activate** _NAME_
> Switch to a named configuration.

**configurations delete** _NAME_
> Delete a named configuration. Cannot delete the active configuration.

**configurations describe** _NAME_
> Display details of a named configuration.

**configurations list**
> List all available configurations.

**--help**
> Display help information.

# DESCRIPTION

**gcloud config** manages persistent configuration properties for the gcloud command-line tool. Properties set through this command become defaults used by all gcloud commands unless explicitly overridden with command-line flags.

Common properties include the default project, Compute Engine region and zone, and active account. These eliminate the need to specify frequently-used values on every command, significantly reducing command verbosity for regular workflows.

Named configurations enable managing multiple independent sets of properties, making it easy to switch between different projects, accounts, or environments. Each configuration is a complete set of property values that can be activated with a single command. This is essential for developers working across multiple GCP projects or organizations, as it prevents accidentally running commands in the wrong project context.

# CAVEATS

Per-command options override config. Configuration is user-specific. Some properties require valid values. The active configuration cannot be deleted.

# HISTORY

gcloud config is part of the **Google Cloud SDK** configuration system, providing persistent settings management for the CLI.

# SEE ALSO

[gcloud](/man/gcloud)(1), [gcloud-auth](/man/gcloud-auth)(1), [gcloud-init](/man/gcloud-init)(1), [gcloud-components](/man/gcloud-components)(1)
