# TAGLINE

Manage custom virtual machine images in Azure

# TLDR

**Create a managed image** from a VM

```az image create --name [MyImage] --resource-group [MyResourceGroup] --source [MyVM]```

**Create an image** from a managed disk

```az image create --name [MyImage] --resource-group [MyResourceGroup] --os-disk [disk-id] --os-type [Linux]```

**List all images** in a resource group

```az image list --resource-group [MyResourceGroup]```

**Show details** of an image

```az image show --name [MyImage] --resource-group [MyResourceGroup]```

**Update image tags**

```az image update --name [MyImage] --resource-group [MyResourceGroup] --tags [env=prod]```

**Delete an image**

```az image delete --name [MyImage] --resource-group [MyResourceGroup]```

# SYNOPSIS

**az** **image** _subcommand_ [_options_]

# SUBCOMMANDS

**create**
> Create a custom virtual machine image from managed disks or snapshots.

**delete**
> Delete an image.

**list**
> List images in a resource group or subscription.

**show**
> Get information about an image.

**update**
> Update an image.

# PARAMETERS

**--name** **-n**
> The name of the image.

**--resource-group** **-g**
> Name of resource group.

**--source**
> Source VM, managed disk, or snapshot to create the image from.

**--os-disk**
> Source managed disk for OS disk.

**--os-type**
> Operating system type: Linux or Windows.

**--data-disk-sources**
> Managed disks or snapshots for data disks.

# DESCRIPTION

**az image** manages custom virtual machine images in Azure. Custom images can be created from generalized VMs, managed disks, or snapshots. These images can then be used to create new VMs with your custom configuration.

Custom images are different from marketplace images (managed via **az vm image**) as they contain your specific software and configurations.

# CAVEATS

Requires Azure CLI to be installed and authenticated with **az login**. The source VM must be generalized (sysprep on Windows, waagent -deprovision on Linux) before creating an image. Images can only create VMs in the same region.

# SEE ALSO

[az](/man/az)(1), [az-disk](/man/az-disk)(1), [az-snapshot](/man/az-snapshot)(1)
