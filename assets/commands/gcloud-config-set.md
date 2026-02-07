# TAGLINE

set persistent gcloud configuration properties

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

**gcloud config set** assigns values to gcloud configuration properties, establishing defaults that apply to all subsequent gcloud commands. This eliminates repetitive specification of common parameters like project ID, region, and zone.

Properties follow a hierarchical naming scheme, with some scoped to specific services (like compute/region for Compute Engine operations) and others applying globally (like project). The command validates property names but may not immediately validate values, which could lead to errors in future commands if invalid.

Command-line flags always take precedence over configured properties, allowing temporary overrides without changing stored configuration. Properties are saved to the active configuration, so switching configurations changes the effective property values. This property-based system is central to efficient gcloud usage, particularly for users managing resources across multiple zones or projects.

# CAVEATS

Command-line options override settings. Invalid values may cause errors later. Settings are per-configuration.

# HISTORY

gcloud config set is the property setter for the **Google Cloud SDK** configuration system, enabling default values for CLI operations.

# SEE ALSO

[gcloud-config](/man/gcloud-config)(1), [gcloud](/man/gcloud)(1)
