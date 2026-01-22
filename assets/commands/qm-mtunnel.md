# TLDR

Command used by **qmigrate** during data migration

```qm mtunnel```

# SYNOPSIS

**qm mtunnel**

# DESCRIPTION

**qm mtunnel** is used internally by qmigrate for data migration between hosts. It creates a tunnel for transferring VM data during live migration.

This command should not be invoked manually; it is called automatically by the migration process.

# CAVEATS

Internal use only. Manual invocation may interfere with ongoing migrations or cause unexpected behavior.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools. Provides the data transfer mechanism for VM migration.

# SEE ALSO

[qm](/man/qm)(1), [qm-migrate](/man/qm-migrate)(1)
