# TLDR

**Restore container from backup**

```pct restore [VMID] [/path/to/backup.tar.zst]```

**Restore with specific storage**

```pct restore [VMID] [backup.tar.zst] --storage [local-lvm]```

**Restore without starting**

```pct restore [VMID] [backup.tar.zst] --start 0```

**Restore with new hostname**

```pct restore [VMID] [backup.tar.zst] --hostname [newname]```

**Restore unprivileged**

```pct restore [VMID] [backup.tar.zst] --unprivileged 1```

# SYNOPSIS

**pct restore** _vmid_ _backup_ [_options_]

# PARAMETERS

**vmid**
> New container ID.

**backup**
> Backup file path.

**--storage** _name_
> Target storage.

**--hostname** _name_
> Set hostname.

**--start** _bool_
> Start after restore.

**--unprivileged** _bool_
> Unprivileged container.

**--rootfs** _spec_
> Root filesystem spec.

# DESCRIPTION

**pct restore** restores an LXC container from a Proxmox backup file. It can restore to a new VMID, different storage, or with modified settings.

Backup files are typically created by vzdump.

# EXAMPLE

```bash
# Restore to container 200
pct restore 200 /var/lib/vz/dump/vzdump-lxc-100.tar.zst

# Restore with 20GB disk
pct restore 200 backup.tar.zst --rootfs local-lvm:20
```

# CAVEATS

VMID must not exist. Storage must have space. Network config may need adjustment.

# HISTORY

pct restore is part of **Proxmox VE**'s backup and restore infrastructure, working with vzdump backups.

# SEE ALSO

[pct](/man/pct)(1), [vzdump](/man/vzdump)(1), [qmrestore](/man/qmrestore)(1)
