# TLDR

**Create** snapshot

```qm snapshot vm_id snapshot_name```

Snapshot with **description**

```qm snapshot vm_id snapshot_name --description "description"```

Include **vmstate**

```qm snapshot vm_id snapshot_name --vmstate 1```

**List** snapshots

```qm listsnapshot 100```

**Rollback** to snapshot

```qm rollback vm_id snap_name```

# SYNOPSIS

**qm snapshot** [_OPTIONS_] _vmid_ _snapname_

# DESCRIPTION

**qm snapshot** creates a point-in-time snapshot of a QEMU/KVM virtual machine in Proxmox VE. Snapshots capture the disk state and optionally the VM memory state, allowing rollback to that point later.

# PARAMETERS

**vmid**
> The numeric ID of the virtual machine

**snapname**
> Name for the snapshot (must start with a letter)

**--description** _text_
> Description text for the snapshot

**--vmstate** _boolean_
> Include the VM memory state in the snapshot

# CAVEATS

Snapshot names must start with a letter. Including vmstate allows restoring the running state but requires more storage. Snapshots use copy-on-write, so disk space usage grows as changes accumulate.

# HISTORY

**qm snapshot** is part of the **Proxmox VE** virtualization platform for managing QEMU/KVM virtual machine snapshots.

# SEE ALSO

[qm](/man/qm)(1), [qm-rollback](/man/qm-rollback)(1), [qm-delsnapshot](/man/qm-delsnapshot)(1)
