# TAGLINE

Delete Proxmox VM snapshots

# TLDR

**Delete** a snapshot

```qm delsnapshot 100 snapshot_name```

**Force** delete from configuration (even if disk removal fails)

```qm delsnapshot 100 snapshot_name --force 1```

# SYNOPSIS

**qm delsnapshot** _vmid_ _snapname_ [_options_]

# PARAMETERS

**--force** _1|0_
> Force deletion from config even if disk snapshot removal fails

# DESCRIPTION

**qm delsnapshot** deletes virtual machine snapshots in Proxmox VE. Snapshots capture the VM state at a point in time and can be removed when no longer needed to reclaim storage space.

The force option allows removing snapshot references from configuration even if the underlying disk snapshot cannot be deleted.

# CAVEATS

Deleting snapshots is irreversible. Ensure the snapshot is no longer needed before deletion. Force deletion may leave orphaned disk data.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-snapshot](/man/qm-snapshot)(1), [qm-rollback](/man/qm-rollback)(1)
