# TAGLINE

Stop embedded NBD server for a Proxmox VM

# TLDR

**Stop the embedded NBD server for VM 100**

```qm nbdstop [100]```

# SYNOPSIS

**qm nbdstop** _vmid_

# PARAMETERS

**_vmid_**
> The unique ID of the VM (integer, 100 to 999999999).

# DESCRIPTION

**qm nbdstop** stops the embedded NBD (Network Block Device) server for a virtual machine. The NBD server is used internally during disk operations such as backup and live migration to export VM disk images over the network.

This command terminates any active NBD export for the specified VM.

# CAVEATS

Stopping the NBD server during active transfers may cause data corruption or incomplete backups. Ensure no operations are using the NBD connection before stopping. Requires root privileges on the Proxmox VE host.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration. The NBD stop command was added to support advanced storage management and live migration workflows.

# SEE ALSO

[qm](/man/qm)(1), [qm-migrate](/man/qm-migrate)(1), [qm-start](/man/qm-start)(1), [qm-stop](/man/qm-stop)(1), [qm-monitor](/man/qm-monitor)(1)
