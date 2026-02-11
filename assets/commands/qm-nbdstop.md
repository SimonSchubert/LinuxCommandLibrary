# TAGLINE

Stop embedded NBD server for a Proxmox VM

# TLDR

**Stop** embedded NBD server

```qm nbdstop 100```

# SYNOPSIS

**qm nbdstop** _vmid_

# DESCRIPTION

**qm nbdstop** stops the embedded NBD (Network Block Device) server for a virtual machine. The NBD server is used for disk operations like backup and migration.

This command terminates any active NBD connections for the specified VM.

# CAVEATS

Stopping the NBD server during active transfers may cause data corruption or incomplete backups. Ensure no operations are using the NBD connection before stopping.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-migrate](/man/qm-migrate)(1)
