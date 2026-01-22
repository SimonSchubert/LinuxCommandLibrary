# TLDR

**Rollback** VM to snapshot

```qm rollback vm_id snap_name```

# SYNOPSIS

**qm rollback** _vmid_ _snapname_

# DESCRIPTION

**qm rollback** reverts a QEMU/KVM virtual machine in Proxmox VE to a previous snapshot state. All changes made after the snapshot was taken will be discarded.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**snapname**
> The name of the snapshot to rollback to

# CAVEATS

The VM must be stopped before rollback. All data and configuration changes made after the snapshot was created will be lost. This operation cannot be undone.

# HISTORY

**qm rollback** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machine snapshots.

# SEE ALSO

[qm](/man/qm)(1), [qm-snapshot](/man/qm-snapshot)(1), [qm-delsnapshot](/man/qm-delsnapshot)(1)
