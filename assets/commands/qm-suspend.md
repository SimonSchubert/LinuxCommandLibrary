# TLDR

**Suspend** a virtual machine by ID

```qm suspend 100```

Suspend **skipping lock** check

```qm suspend 100 --skiplock```

Suspend skipping **storage lock** check

```qm suspend 100 --skiplockstorage```

# SYNOPSIS

**qm suspend** _vmid_ [_options_]

# PARAMETERS

**--skiplock**
> Skip the lock check when suspending

**--skiplockstorage**
> Skip the storage lock check when suspending

# DESCRIPTION

**qm suspend** suspends a running virtual machine in Proxmox VE. The VM's state is preserved in memory, allowing it to be resumed later with qm resume.

Suspension pauses VM execution without shutting down the guest OS.

# CAVEATS

Use --skiplock and --skiplockstorage with caution as they may lead to data corruption in certain situations. Suspended VMs still consume memory resources.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-resume](/man/qm-resume)(1), [qm-shutdown](/man/qm-shutdown)(1)
