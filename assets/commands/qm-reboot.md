# TLDR

**Reboot** a virtual machine

```qm reboot 100```

Reboot with **timeout** of 10 seconds

```qm reboot --timeout 10 100```

# SYNOPSIS

**qm reboot** [_options_] _vmid_

# PARAMETERS

**--timeout** _seconds_
> Maximum time to wait for shutdown before forcing restart

# DESCRIPTION

**qm reboot** reboots a virtual machine by shutting it down gracefully and starting it again. Pending configuration changes are applied during the restart.

The timeout option limits how long to wait for the graceful shutdown before forcing a restart.

# CAVEATS

Requires ACPI support in the guest OS for graceful shutdown. If guest doesn't respond within timeout, the VM may be forcefully stopped.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-reset](/man/qm-reset)(1), [qm-shutdown](/man/qm-shutdown)(1)
