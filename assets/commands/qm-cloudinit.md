# TAGLINE

Manage Cloud-Init settings for Proxmox VMs

# TLDR

Generate a **cloudinit file** for a specific configuration type

```qm cloudinit dump 100 user```

Generate **network** configuration

```qm cloudinit dump 100 network```

Generate **meta** configuration

```qm cloudinit dump 100 meta```

# SYNOPSIS

**qm cloudinit** dump _vmid_ _type_

# PARAMETERS

**dump** _vmid_ _type_
> Generate cloudinit file for specified type (meta, network, user)

# DESCRIPTION

**qm cloudinit** manages Cloud-Init settings for Proxmox VE virtual machines. Cloud-Init provides initial configuration for VMs including network setup, user accounts, and custom scripts.

The dump subcommand generates Cloud-Init configuration files for inspection and debugging.

# CAVEATS

Requires Cloud-Init to be installed and configured in the VM image. Configuration types must be properly defined in the VM settings.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. Cloud-Init integration allows automated VM provisioning similar to cloud environments.

# SEE ALSO

[qm](/man/qm)(1), [qm-create](/man/qm-create)(1), [cloud-init](/man/cloud-init)(1)
