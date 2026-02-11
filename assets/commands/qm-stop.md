# TAGLINE

Force stop a Proxmox virtual machine

# TLDR

**Stop** VM immediately

```qm stop vm_id```

Stop with **timeout**

```qm stop --timeout 10 vm_id```

**Skip lock** (root only)

```qm stop --skiplock true vm_id```

**Keep** storage volumes active

```qm stop --keepActive true vm_id```

# SYNOPSIS

**qm stop** [_OPTIONS_] _vmid_

# DESCRIPTION

**qm stop** immediately stops a running QEMU/KVM virtual machine in Proxmox VE. This performs a hard shutdown, equivalent to pulling the power cord, which may result in data loss if the guest OS is not properly shut down first.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**--timeout** _seconds_
> Wait for the VM to stop for the specified number of seconds

**--skiplock** _boolean_
> Skip the lock check (only root can use this option)

**--keepActive** _boolean_
> Do not deactivate storage volumes after stopping

**--migratedfrom** _node_
> Used internally for migration cleanup

# CAVEATS

This is a forceful stop that does not cleanly shut down the guest operating system. Use **qm shutdown** for a graceful shutdown via ACPI. Data loss may occur if unsaved data exists in the guest.

# HISTORY

**qm stop** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machines.

# SEE ALSO

[qm](/man/qm)(1), [qm-start](/man/qm-start)(1), [qm-shutdown](/man/qm-shutdown)(1)
