# TAGLINE

Reboot a Proxmox virtual machine

# TLDR

**Reboot a virtual machine**

```qm reboot [vmid]```

**Reboot with a graceful shutdown timeout**

```qm reboot [vmid] --timeout [seconds]```

# SYNOPSIS

**qm reboot** _vmid_ [_options_]

# PARAMETERS

**--timeout** _seconds_
> Wait at most _seconds_ for the guest to shut down gracefully before forcing a restart. Integer, 0 or greater.

# DESCRIPTION

**qm reboot** reboots a virtual machine by shutting it down gracefully and then starting it again. Any pending configuration changes are applied during the restart cycle.

The _vmid_ is the unique integer identifier of the VM (100–999999999). The graceful shutdown relies on ACPI support in the guest OS. If the guest does not respond within the timeout period, the VM is forcefully stopped and restarted.

# CAVEATS

Requires ACPI support in the guest OS for a graceful shutdown. Without ACPI, the shutdown signal may be ignored. Use `qm reset` for a hard reset that does not rely on ACPI.

# HISTORY

Part of the **Proxmox VE** QEMU/KVM management toolset for virtual machine administration on the Proxmox hypervisor platform.

# SEE ALSO

[qm](/man/qm)(1), [qm-reset](/man/qm-reset)(1), [qm-shutdown](/man/qm-shutdown)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1)
