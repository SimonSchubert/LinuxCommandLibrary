# TAGLINE

Force stop a Proxmox virtual machine

# TLDR

**Stop a VM** immediately

```qm stop [vm_id]```

**Stop with a timeout** (wait up to N seconds)

```qm stop [vm_id] --timeout [30]```

**Skip lock check** (root only)

```qm stop [vm_id] --skiplock true```

**Keep storage volumes active** after stopping

```qm stop [vm_id] --keepActive true```

**Override a pending shutdown** and stop immediately

```qm stop [vm_id] --overrule-shutdown true```

# SYNOPSIS

**qm stop** [_OPTIONS_] _vmid_

# DESCRIPTION

**qm stop** immediately stops a running QEMU/KVM virtual machine in Proxmox VE. This performs a hard shutdown, equivalent to pulling the power cord, which may result in data loss if the guest OS is not properly shut down first.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine.

**--timeout** _seconds_
> Wait for the VM to stop for the specified number of seconds.

**--skiplock** _boolean_
> Skip the lock check (only root can use this option).

**--keepActive** _boolean_
> Do not deactivate storage volumes after stopping.

**--overrule-shutdown** _boolean_
> Override a still-running shutdown task to force an immediate stop.

# CAVEATS

This is a forceful stop that does not cleanly shut down the guest operating system. Use **qm shutdown** for a graceful shutdown via ACPI. Data loss may occur if unsaved data exists in the guest.

# SEE ALSO

[qm](/man/qm)(1), [qm-start](/man/qm-start)(1), [qm-shutdown](/man/qm-shutdown)(1)
