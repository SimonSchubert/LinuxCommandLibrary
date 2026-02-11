# TAGLINE

Prepare VM images for cloning

# TLDR

**List** available operations

```virt-sysprep --list-operations```

Remove **sensitive** data

```sudo virt-sysprep -a [path/to/image.qcow2]```

**Dry run** by domain name

```sudo virt-sysprep -d [vm_name] -n```

Run specific **operations**

```sudo virt-sysprep -d [vm_name] --operations [operation1,operation2]```

Set **hostname** and machine-id

```sudo virt-sysprep -d [vm_name] --enable customizations --hostname [host_name] --operation machine-id```

# SYNOPSIS

**virt-sysprep** [_OPTIONS_]

# PARAMETERS

**-a, --add** _IMAGE_
> Add disk image

**-d, --domain** _VM_
> Specify VM by name

**-n, --dry-run**
> Show what would be done without making changes

**--operations** _OPS_
> Run only specified operations

**--list-operations**
> List all supported operations

**--hostname** _NAME_
> Set hostname

**--enable** _FEATURE_
> Enable specific feature

# DESCRIPTION

**virt-sysprep** resets, unconfigures, or customizes a virtual machine image for cloning or deployment. It removes machine-specific data like SSH keys, logs, and persistent device names.

This prepares VM images for use as templates by removing identity information that should be unique per machine.

# CAVEATS

VM must be shut down. Root privileges typically required. Some operations may break the VM if used incorrectly. Always backup images before processing.

# SEE ALSO

[virt-clone](/man/virt-clone)(1), [virt-customize](/man/virt-customize)(1)
