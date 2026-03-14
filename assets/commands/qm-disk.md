# TAGLINE

Manage Proxmox VM disk images

# TLDR

Add **10 gigabytes** to a virtual disk

```qm disk resize [100] scsi0 +10G```

**Move** a virtual disk to different storage

```qm disk move [100] scsi0 [local-lvm]```

Move and **delete** the original copy

```qm disk move [100] scsi0 [local-lvm] --delete```

**Import** a disk image with specific format

```qm disk import [100] [/path/to/disk.vmdk] [local-lvm] --format qcow2```

**Rescan** all storages and update disk sizes

```qm disk rescan```

Perform a **dry-run** rescan

```qm disk rescan --dryrun```

Rescan for a **specific VM**

```qm disk rescan --vmid [100]```

# SYNOPSIS

**qm disk** _command_ [_options_]

# PARAMETERS

**resize** _vmid_ _disk_ _size_
> Resize a disk (use +nG to add space). Shrinking is not supported.

**move** _vmid_ _disk_ _storage_
> Move disk to different storage or different VM.

**import** _vmid_ _source_ _storage_
> Import external disk image as unused disk.

**rescan** [_options_]
> Rescan storages for disk changes.

**--format** _format_
> Target disk image format (qcow2, raw, vmdk).

**--delete**
> Delete source after move.

**--dryrun**
> Preview changes without applying.

**--vmid** _id_
> Target specific VM for rescan.

**--disk** _disk_id_
> Assign specific disk ID (e.g. scsi0, sata1) on import.

# DESCRIPTION

**qm disk** manages disk images for Proxmox VE virtual machines. It handles resizing, moving between storage backends, importing external disk images, and rescanning storage for changes.

This is essential for storage management and migration tasks.

# CAVEATS

Resize operations cannot shrink disks. Import and move operations may take time for large disks. Ensure sufficient space on destination storage.

# HISTORY

Part of **Proxmox VE** QEMU/KVM management tools for virtual machine administration.

# SEE ALSO

[qm](/man/qm)(1), [qm-create](/man/qm-create)(1), [pvesm](/man/pvesm)(1)
