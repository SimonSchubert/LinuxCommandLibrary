# TLDR

**Destroy** a specific virtual machine

```qm destroy 100```

Destroy all **unreferenced disks**

```qm destroy 100 --destroy-unreferenced-disks```

Destroy and **purge** from all locations

```qm destroy 100 --purge```

**Force** destroy ignoring locks

```sudo qm destroy 100 --skiplock```

# SYNOPSIS

**qm destroy** _vmid_ [_options_]

# PARAMETERS

**--destroy-unreferenced-disks**
> Remove disks not referenced in VM configuration

**--purge**
> Remove from all locations (inventory, backups, HA, etc.)

**--skiplock**
> Ignore locks and force destruction

# DESCRIPTION

**qm destroy** permanently removes a virtual machine from Proxmox VE. It can optionally remove associated disks and purge the VM from all system locations including backup jobs and high availability configuration.

The skiplock option bypasses safety locks but requires root privileges.

# CAVEATS

Destruction is permanent and cannot be undone. Ensure backups exist before destroying important VMs. Purge option removes all traces including scheduled backups.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-create](/man/qm-create)(1), [qm-clone](/man/qm-clone)(1)
