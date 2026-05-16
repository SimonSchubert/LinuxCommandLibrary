# TAGLINE

Manage Azure Marketplace terms acceptance

# TLDR

**Accept marketplace terms** for a plan

```az term accept --publisher [publisher] --product [product] --plan [plan]```

**Show marketplace terms** for a plan

```az term show --publisher [publisher] --product [product] --plan [plan]```

**Accept terms** for a specific image URN

```az vm image terms accept --urn [publisher:offer:sku:version]```

**Show terms** for a specific image URN

```az vm image terms show --urn [publisher:offer:sku:version]```

**Scope to a subscription**

```az term accept --publisher [pub] --product [prod] --plan [plan] --subscription [sub_id]```

# SYNOPSIS

**az** **term** _subcommand_ [_options_]

# SUBCOMMANDS

**accept**
> Accept marketplace terms for a plan.

**show**
> Show marketplace terms for a plan.

# PARAMETERS

**--publisher**
> Publisher identifier string of the image being deployed (required).

**--product**
> Offer identifier string of the image being deployed (required).

**--plan**
> Plan identifier string of the image being deployed (required).

**--subscription**
> Name or ID of the subscription to use.

**--output**, **-o**
> Output format: json, jsonc, none, table, tsv, yaml, yamlc.

**--query**
> JMESPath query string.

**--debug**
> Increase logging verbosity to show all debug logs.

# DESCRIPTION

**az term** manages Azure Marketplace agreement acceptance via the **marketplaceordering** provider. Many third-party Marketplace images require accepting terms and conditions before they can be deployed. This command lets you accept and inspect those terms programmatically.

The equivalent **az vm image terms** subcommand accepts a single **--urn** in the form _publisher:offer:sku:version_ instead of three separate identifiers.

This command group is marked **experimental** by Microsoft and may change.

# CAVEATS

Requires Azure CLI to be installed and authenticated. Terms must be accepted per subscription. Some images require terms acceptance before the first deployment.

# SEE ALSO

[az](/man/az)(1), [az-vm](/man/az-vm)(1), [az-image](/man/az-image)(1)
