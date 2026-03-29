# TAGLINE

Permanently remove a Proxmox virtual machine

# TLDR

**Destroy** a specific virtual machine

```qm destroy 100```

Destroy and remove all **unreferenced disks** from enabled storages

```qm destroy 100 --destroy-unreferenced-disks```

Destroy and **purge** from backup, replication jobs, and HA configuration

```qm destroy 100 --purge```

Destroy with **purge** and remove unreferenced disks

```qm destroy 100 --purge --destroy-unreferenced-disks```

**Force** destroy ignoring locks (root only)

```sudo qm destroy 100 --skiplock```

# SYNOPSIS

**qm destroy** _vmid_ [_OPTIONS_]

# PARAMETERS

**--destroy-unreferenced-disks** _boolean_
> If set, additionally destroy all disks not referenced in the config but with a matching VMID from all enabled storages. Default: 0.

**--purge** _boolean_
> Remove VMID from configurations, like backup and replication jobs and HA.

**--skiplock** _boolean_
> Ignore locks. Only root is allowed to use this option.

# DESCRIPTION

**qm destroy** permanently removes a virtual machine and all associated volumes from Proxmox VE. The operation also removes any VM-specific permissions and firewall rules.

The **--purge** option removes the VMID from backup jobs, replication jobs, and high availability configuration. The **--destroy-unreferenced-disks** option removes disks that are not referenced in the VM configuration but have a matching VMID across all enabled storages. The **--skiplock** option bypasses safety locks but requires root privileges.

# CAVEATS

Destruction is permanent and cannot be undone. Ensure backups exist before destroying important VMs. The VMID must be in the range 100-999999999.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-create](/man/qm-create)(1), [qm-clone](/man/qm-clone)(1), [qm-stop](/man/qm-stop)(1), [qm-shutdown](/man/qm-shutdown)(1)
