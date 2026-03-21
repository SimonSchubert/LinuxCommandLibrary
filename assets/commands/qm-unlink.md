# TAGLINE

Unlink disks from a Proxmox VM

# TLDR

**Unlink a disk from a virtual machine**

```qm unlink [vmid] --idlist [unused0]```

**Unlink a disk and force-remove it from the config**

```qm unlink [vmid] --idlist [scsi0] --force```

**Unlink multiple disks at once**

```qm unlink [vmid] --idlist [scsi0;scsi1]```

# SYNOPSIS

**qm unlink** _vmid_ **--idlist** _string_ [**--force** _boolean_]

# PARAMETERS

_vmid_
> The unique numeric ID of the virtual machine (100-999999999).

**--idlist** _string_
> A semicolon-separated list of disk IDs to unlink (e.g., `unused0`, `scsi0`, `virtio1`).

**--force** _boolean_
> Force removal. Allows removing disks that are still referenced in the VM config even if they are not marked as unused. Default: `0`.

# DESCRIPTION

**qm unlink** is an alias for **qm disk unlink** that removes a disk from a virtual machine's configuration without deleting the underlying storage volume. The disk becomes unused but remains available in the storage for reattachment to the same or another VM.

This is useful for safely detaching disks before moving them between VMs or when cleaning up a VM configuration without losing data.

# SEE ALSO

[qm](/man/qm)(1), [qm-disk](/man/qm-disk)(1)
