# TAGLINE

Proxmox VE virtual machine backup tool

# TLDR

**Backup** a single VM

```vzdump [vm_id]```

Backup **multiple** VMs

```vzdump [101] [102] [103]```

Backup with a specific **mode** (snapshot, stop, or suspend)

```vzdump [vm_id] --mode [snapshot|stop|suspend]```

Backup **all** VMs with email notification

```vzdump --all --mode snapshot --mailto [root@example.com]```

Backup with **zstd compression** to a specific directory

```vzdump [vm_id] --dumpdir [/mnt/backup] --mode snapshot --compress zstd```

Backup all VMs **excluding** specific ones

```vzdump --all --exclude [101,102]```

Backup with **retention policy**

```vzdump [vm_id] --mode snapshot --prune-backups keep-last=5,keep-daily=7```

# SYNOPSIS

**vzdump** [_OPTIONS_] _VMID_...

# PARAMETERS

**--mode** _MODE_
> Backup mode: snapshot (default, minimal downtime), stop (highest consistency, VM stops), or suspend (compatibility).

**--dumpdir** _DIR_
> Store resulting backup files in DIR instead of the default location.

**--storage** _STORAGE_ID_
> Store resulting backup files to the specified Proxmox storage.

**--mailto** _EMAIL_
> Send notification email to address. Deprecated in favor of notification system.

**--all**
> Backup all known guest systems on the host.

**--exclude** _VMIDS_
> Exclude specified VM IDs (assumes --all).

**--pool** _POOL_
> Backup all guest systems in the specified pool.

**--compress** _TYPE_
> Compression type: 0 (none, default), gzip, lzo, or zstd.

**--zstd** _N_
> Zstandard thread count (default: 1). 0 uses half of available cores.

**--pigz** _N_
> Use parallel gzip. N=1 uses half of available cores; N>1 uses N threads.

**--prune-backups** _RETENTION_
> Retention policy (e.g., keep-last=N,keep-daily=N,keep-weekly=N,keep-monthly=N,keep-yearly=N). Default: keep-all=1.

**--maxfiles** _N_
> Deprecated. Maximum number of backup files per VM. Use --prune-backups instead.

**--protected**
> Mark backup as protected to prevent automatic removal.

**--bwlimit** _KiB/s_
> Limit I/O bandwidth in KiB/s (default: 0, unlimited).

**--ionice** _N_
> Set IO priority (0-8) when using the BFQ scheduler (default: 7).

**--tmpdir** _DIR_
> Store temporary files in DIR.

**--lockwait** _MIN_
> Maximum minutes to wait for the global lock (default: 180).

**--stopwait** _MIN_
> Maximum minutes to wait until the guest system stops (default: 10).

**--script** _FILE_
> Execute hook script during backup.

**--notes-template** _TEMPLATE_
> Template for backup notes. Variables: {{vmid}}, {{guestname}}, {{node}}, {{cluster}}.

**--quiet**
> Suppress verbose output.

**--stdexcludes**
> Exclude temporary files and logs (default: enabled).

# DESCRIPTION

**vzdump** is a backup utility for Proxmox VE virtual machines (KVM) and containers (LXC). It creates consistent backups that can be restored later using **qmrestore** (VMs) or **pct restore** (containers).

Three backup modes are available: **snapshot** (default, minimal downtime using LVM/ZFS/QEMU snapshots), **stop** (highest consistency, stops the guest during backup), and **suspend** (legacy compatibility mode). Backups are stored in /var/lib/vz/dump/ by default, or to a configured Proxmox storage.

# CAVEATS

Proxmox VE specific. Large VMs require significant backup storage. Snapshot mode requires LVM, ZFS, or QEMU snapshot support. The --maxfiles option is deprecated in favor of --prune-backups. Global configuration can be set in /etc/vzdump.conf.

# SEE ALSO

[qmrestore](/man/qmrestore)(1), [pct](/man/pct)(1), [qm](/man/qm)(1), [pvesm](/man/pvesm)(1)
