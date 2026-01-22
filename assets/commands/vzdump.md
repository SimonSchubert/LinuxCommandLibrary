# TLDR

**Dump** single VM

```vzdump [vm_id]```

Backup **multiple** VMs

```vzdump [101] [102] [103]```

Dump with **mode**

```vzdump [vm_id] --mode [suspend|snapshot]```

Backup **all** with notification

```vzdump --all --mode suspend --mailto [root] --mailto [admin]```

Use **snapshot** mode to directory

```vzdump [vm_id] --dumpdir [path/to/directory] --mode snapshot```

Backup all **excluding** specific VMs

```vzdump --mode suspend --exclude [101,102]```

# SYNOPSIS

**vzdump** [_OPTIONS_] _VMID_...

# PARAMETERS

**--mode** _MODE_
> Backup mode: suspend or snapshot

**--dumpdir** _DIR_
> Custom dump directory

**--mailto** _EMAIL_
> Send notification to address

**--all**
> Backup all VMs

**--exclude** _VMIDS_
> Exclude specified VM IDs

**--compress** _TYPE_
> Compression type (lzo, gzip, zstd)

# DESCRIPTION

**vzdump** is a backup utility for Proxmox VE virtual machines and containers. It creates backups that can be restored later, supporting both suspend and snapshot modes.

Snapshot mode requires no downtime. Suspend mode briefly pauses the VM for consistency. Backups are stored in /var/lib/vz/dump/ by default.

# CAVEATS

Proxmox VE specific. Large VMs require significant backup storage. Snapshot mode requires filesystem support. Email notifications require configured mail system.

# SEE ALSO

[qmrestore](/man/qmrestore)(1), [pct](/man/pct)(1), [qm](/man/qm)(1)
