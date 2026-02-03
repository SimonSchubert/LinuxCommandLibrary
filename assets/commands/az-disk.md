# TLDR

**Create a managed disk**

```az disk create --name [MyDisk] --resource-group [MyResourceGroup] --size-gb [128]```

**Create a disk from a snapshot**

```az disk create --name [MyDisk] --resource-group [MyResourceGroup] --source [snapshot-id]```

**List all managed disks** in a resource group

```az disk list --resource-group [MyResourceGroup]```

**Show details** of a managed disk

```az disk show --name [MyDisk] --resource-group [MyResourceGroup]```

**Update disk size**

```az disk update --name [MyDisk] --resource-group [MyResourceGroup] --size-gb [256]```

**Grant access** to a managed disk for export

```az disk grant-access --name [MyDisk] --resource-group [MyResourceGroup] --duration-in-seconds [3600] --access-level [Read]```

**Delete a managed disk**

```az disk delete --name [MyDisk] --resource-group [MyResourceGroup] --yes```

# SYNOPSIS

**az** **disk** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a managed disk.

**delete**
> Delete a managed disk.

**list**
> List managed disks.

**show**
> Get information about a managed disk.

**update**
> Update a managed disk.

**grant-access**
> Grant read or read-write access to a disk.

**revoke-access**
> Revoke access to a disk.

**wait**
> Wait for a disk to reach a specific state.

# PARAMETERS

**--name** **-n**
> The name of the managed disk.

**--resource-group** **-g**
> Name of resource group.

**--size-gb** **-z**
> Size in GB of the managed disk.

**--source**
> Source disk, snapshot, or URI to create the disk from.

**--sku**
> Storage type: Standard_LRS, Premium_LRS, StandardSSD_LRS, UltraSSD_LRS, Premium_ZRS, StandardSSD_ZRS.

**--location** **-l**
> Location of the disk.

# DESCRIPTION

**az disk** manages Azure managed disks. Managed disks are block-level storage volumes managed by Azure and used with Azure Virtual Machines. They simplify disk management by handling storage account management automatically.

Supported storage types include Standard HDD (Standard_LRS), Standard SSD (StandardSSD_LRS), Premium SSD (Premium_LRS), Premium SSD v2 (PremiumV2_LRS), and Ultra Disk (UltraSSD_LRS).

# CAVEATS

Requires Azure CLI to be installed and authenticated with **az login**. Disks can only be attached to VMs in the same region. Resizing a disk requires the VM to be deallocated or the disk to be unattached.

# SEE ALSO

[az](/man/az)(1), [az-image](/man/az-image)(1), [az-snapshot](/man/az-snapshot)(1)
