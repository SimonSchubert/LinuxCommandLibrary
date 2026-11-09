# TAGLINE

Proxmox VE virtual machine backup tool

# TLDR

**Backup** a single VM

```vzdump [vm_id]```

Backup **multiple** VMs

```vzdump [101] [102] [103]```

Backup with a specific **mode** (snapshot, stop, or suspend)

```vzdump [vm_id] --mode [snapshot|stop|suspend]```

Backup **all** guests to a specific **storage**

```vzdump --all --mode snapshot --storage [storage_id]```

Backup with **zstd compression** to a specific directory

```vzdump [vm_id] --dumpdir [/mnt/backup] --mode snapshot --compress zstd```

Backup all VMs **excluding** specific ones

```vzdump --all --exclude [101,102]```

Backup with **retention policy**

```vzdump [vm_id] --mode snapshot --prune-backups keep-last=5,keep-daily=7```

Stream a container backup to **stdout** and restore it elsewhere

```vzdump [vm_id] --stdout | pct restore --rootfs [4] [new_id] -```

# SYNOPSIS

**vzdump** {_VMID_} [_OPTIONS_]

**vzdump** **help**

# PARAMETERS

**--mode** _MODE_
> Backup mode: snapshot (default, minimal downtime), stop (highest consistency, VM stops), or suspend (compatibility).

**--dumpdir** _DIR_
> Store resulting backup files in DIR instead of the default location.

**--storage** _STORAGE_ID_
> Store resulting backup files to the specified Proxmox storage.

**--mailto** _EMAIL_
> Deprecated: use notification targets and matchers instead. Comma-separated list of addresses or users to notify.

**--notification-mode** _auto|legacy-sendmail|notification-system_
> Select the notification mechanism (default: auto).

**--all**
> Backup all known guest systems on the host.

**--exclude** _VMIDS_
> Exclude specified VM IDs (assumes --all).

**--pool** _POOL_
> Backup all guest systems in the specified pool.

**--compress** _TYPE_
> Compression type: 0 (none, default), 1, gzip, lzo, or zstd.

**--zstd** _N_
> Zstandard thread count (default: 1). 0 uses half of available cores.

**--pigz** _N_
> Use pigz instead of gzip when N>0. N=1 uses half of available cores; N>1 uses N threads.

**--prune-backups** _RETENTION_
> Retention policy (e.g., keep-last=N,keep-daily=N,keep-weekly=N,keep-monthly=N,keep-yearly=N). Default: keep-all=1.

**--remove** _BOOLEAN_
> Prune older backups according to --prune-backups (default: 1).

**--protected**
> Mark backup as protected to prevent automatic removal. Requires --storage.

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

**--exclude-path** _PATH_
> Exclude files or directories (shell globs). Paths starting with / are anchored to the container's root. Repeatable.

**--fleecing** _enabled=1,storage=ID_
> Use backup fleecing (VM only) to reduce the impact of a slow backup target on guest I/O.

**--performance** _max-workers=N,pbs-entries-max=N_
> Other performance-related settings.

**--pbs-change-detection-mode** _data|legacy|metadata_
> Change detection mode for container backups to Proxmox Backup Server.

**--stdout**
> Write tar to standard output instead of a file.

**--stop**
> Stop running backup jobs on this host.

**--node** _NODE_
> Only run if executed on this node.

**--notes-template** _TEMPLATE_
> Template for backup notes. Variables: {{vmid}}, {{guestname}}, {{node}}, {{cluster}}. Requires --storage.

**--quiet**
> Suppress verbose output.

**--stdexcludes**
> Exclude temporary files and logs (default: enabled).

# DESCRIPTION

**vzdump** is a backup utility for Proxmox VE virtual machines (KVM) and containers (LXC). It creates consistent backups that can be restored later using **qmrestore** (VMs) or **pct restore** (containers).

Three backup modes are available: **snapshot** (default, lowest downtime), **stop** (highest consistency, the guest is shut down for the start of the backup), and **suspend** (compatibility mode for VMs; for containers it uses rsync to keep downtime small). Proxmox VE backups are always full backups containing the guest configuration and all data. Backups are stored in the default dump directory (usually /var/lib/vz/dump/) or on a configured Proxmox storage, such as a Proxmox Backup Server.

# CAVEATS

Proxmox VE specific. Large VMs require significant backup storage. VM snapshot mode uses QEMU live backup and works on any storage type, while container snapshot mode requires all backed up volumes to be on a storage that supports snapshots. Stop mode can mean a long downtime for containers. Global configuration can be set in /etc/vzdump.conf.

# SEE ALSO

[qmrestore](/man/qmrestore)(1), [pct](/man/pct)(1), [qm](/man/qm)(1), [pvesm](/man/pvesm)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-manager.git)```

```[Documentation](https://pve.proxmox.com/pve-docs/vzdump.1.html)```

<!-- verified: 2026-11-09 -->
