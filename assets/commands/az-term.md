# TLDR

**Accept marketplace terms** for a VM image

```az term accept --publisher [publisher] --product [product] --plan [plan]```

**Show marketplace terms**

```az term show --publisher [publisher] --product [product] --plan [plan]```

**Accept terms** for a specific image URN

```az vm image terms accept --urn [publisher:offer:sku:version]```

**Show terms** for a specific image

```az vm image terms show --urn [publisher:offer:sku:version]```

# SYNOPSIS

**az** **term** _subcommand_ [_options_]

# SUBCOMMANDS

**accept**
> Accept marketplace terms for a plan.

**show**
> Show marketplace terms for a plan.

# PARAMETERS

**--publisher**
> Publisher ID of the marketplace image.

**--product**
> Product ID of the marketplace image.

**--plan**
> Plan ID of the marketplace image.

# DESCRIPTION

**az term** manages Azure Marketplace terms acceptance. Many third-party marketplace images require accepting terms and conditions before they can be deployed. This command allows accepting these terms programmatically.

This is also accessible via **az vm image terms** for VM-specific images.

# CAVEATS

Requires Azure CLI to be installed and authenticated. Terms must be accepted per subscription. Some images require terms acceptance before the first deployment.

# SEE ALSO

[az](/man/az)(1), [az-vm](/man/az-vm)(1), [az-image](/man/az-image)(1)
