# TAGLINE

restores an LXC container from a Proxmox backup file

# TLDR

**Restore container from backup**

```pct restore [VMID] [/path/to/backup.tar.zst]```

**Restore with specific storage**

```pct restore [VMID] [backup.tar.zst] --storage [local-lvm]```

**Restore and start the container**

```pct restore [VMID] [backup.tar.zst] --start 1```

**Restore with new hostname**

```pct restore [VMID] [backup.tar.zst] --hostname [newname]```

**Restore unprivileged**

```pct restore [VMID] [backup.tar.zst] --unprivileged 1```

**Overwrite an existing container**

```pct restore [VMID] [backup.tar.zst] --force 1```

**Limit restore bandwidth** (KiB/s)

```pct restore [VMID] [backup.tar.zst] --bwlimit [10240]```

# SYNOPSIS

**pct restore** _vmid_ _backup_ [_options_]

# PARAMETERS

**vmid**
> Container ID to restore to.

**backup**
> Backup archive path or storage volume ID (upstream calls this parameter _ostemplate_).

**--storage** _name_
> Default target storage (default: local).

**--hostname** _name_
> Set hostname.

**--start** _bool_
> Start the container after the restore finishes (default: 0).

**--unprivileged** _bool_
> Run the container as unprivileged. Defaults to the value stored in the backup.

**--rootfs** _spec_
> Root filesystem spec (e.g., local-lvm:20 for 20GB).

**--memory** _MB_
> Set container memory limit.

**--pool** _name_
> Add the container to the specified resource pool.

**--force** _bool_
> Allow overwriting an existing container.

**--ignore-unpack-errors** _bool_
> Ignore errors during backup unpacking.

**--bwlimit** _KiB/s_
> Override the I/O bandwidth limit from the datacenter or storage configuration.

**--unique** _bool_
> Assign a unique random ethernet address.

**--mp**_N_ _spec_
> Set a mount point. **STORAGE_ID:SIZE_IN_GiB** allocates a new volume.

**--net**_N_ _spec_
> Set a network interface.

# DESCRIPTION

**pct restore** restores an LXC container from a Proxmox backup file. It can restore to a new VMID, different storage, or with modified settings.

# EXAMPLE

```bash
# Restore to container 200
pct restore 200 /var/lib/vz/dump/vzdump-lxc-100.tar.zst

# Restore with 20GB disk
pct restore 200 backup.tar.zst --rootfs local-lvm:20
```

# CAVEATS

VMID must not exist unless **--force** is used, which replaces that container. Storage must have space. Network config may need adjustment.

# HISTORY

pct restore is part of **Proxmox VE**'s backup and restore infrastructure, working with vzdump backups.

# SEE ALSO

[pct](/man/pct)(1), [pct-enter](/man/pct-enter)(1), [vzdump](/man/vzdump)(1), [pct-create](/man/pct-create)(1), [qmrestore](/man/qmrestore)(1)

# RESOURCES

```[Source code](https://git.proxmox.com/?p=pve-container.git)```

```[Documentation](https://pve.proxmox.com/pve-docs/pct.1.html)```

<!-- verified: 2026-11-09 -->
