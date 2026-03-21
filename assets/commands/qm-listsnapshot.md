# TAGLINE

List snapshots of a Proxmox VM

# TLDR

**List all snapshots** of a virtual machine with VMID 100

```qm listsnapshot [100]```

# SYNOPSIS

**qm listsnapshot** _vmid_

# PARAMETERS

_vmid_
> The numeric ID of the virtual machine (100 or higher).

# DESCRIPTION

**qm listsnapshot** lists all snapshots for a specific virtual machine in Proxmox VE. It displays a tree of snapshot names, creation times, and descriptions, showing the parent-child relationship between snapshots.

The output indicates the current snapshot with an arrow marker. This helps identify available restore points and manage snapshot storage before performing rollbacks or deletions.

# SEE ALSO

[qm](/man/qm)(1), [qm-snapshot](/man/qm-snapshot)(1), [qm-delsnapshot](/man/qm-delsnapshot)(1), [qm-rollback](/man/qm-rollback)(1), [qm-clone](/man/qm-clone)(1)
