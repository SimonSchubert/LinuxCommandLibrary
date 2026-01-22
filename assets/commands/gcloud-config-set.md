# TLDR

**Set default project**

```gcloud config set project [project-id]```

**Set default region**

```gcloud config set compute/region [us-central1]```

**Set default zone**

```gcloud config set compute/zone [us-central1-a]```

**Set account**

```gcloud config set account [email@example.com]```

**Disable usage reporting**

```gcloud config set disable_usage_reporting true```

# SYNOPSIS

**gcloud config set** _property_ _value_

# PARAMETERS

_PROPERTY_
> Configuration property name.

_VALUE_
> Value to set.

**project**
> Default project ID.

**compute/region**
> Default Compute region.

**compute/zone**
> Default Compute zone.

**account**
> Active account.

**--help**
> Display help information.

# DESCRIPTION

**gcloud config set** sets persistent configuration properties for the gcloud CLI. These defaults are used when options aren't specified on the command line.

Common properties include project, region, zone, and account. Properties are namespaced (like compute/region) for service-specific settings.

Setting defaults reduces command verbosity for frequently used values.

# CAVEATS

Command-line options override settings. Invalid values may cause errors later. Settings are per-configuration.

# HISTORY

gcloud config set is the property setter for the **Google Cloud SDK** configuration system, enabling default values for CLI operations.

# SEE ALSO

[gcloud-config](/man/gcloud-config)(1), [gcloud](/man/gcloud)(1)
