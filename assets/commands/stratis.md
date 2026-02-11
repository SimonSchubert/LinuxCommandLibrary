# TAGLINE

Managed pool-based Linux storage

# TLDR

**Create** a storage pool

```sudo stratis pool create [pool_name] [/dev/sdX] [/dev/sdY]```

**Create** a filesystem in a pool

```sudo stratis filesystem create [pool_name] [volume_name]```

**List** all filesystems

```sudo stratis filesystem list```

**Add** a device to existing pool

```sudo stratis pool add-data [pool_name] [/dev/sdZ]```

**Create** a snapshot

```sudo stratis filesystem snapshot [pool_name] [source_fs] [snapshot_name]```

**Destroy** a filesystem

```sudo stratis filesystem destroy [pool_name] [volume_name]```

**List** pools

```sudo stratis pool list```

# SYNOPSIS

**stratis** _command_ [_subcommand_] [_arguments_]

# COMMANDS

**pool create** _name_ _devices_...
> Create storage pool from block devices

**pool list**
> List existing pools

**pool add-data** _pool_ _device_
> Add device to pool

**pool destroy** _pool_
> Remove a pool (requires no filesystems)

**pool rename** _old_ _new_
> Rename a pool

**pool init-cache** _pool_ _devices_
> Initialize SSD cache tier

**filesystem create** _pool_ _name_
> Create thin filesystem from pool

**filesystem list**
> List filesystems

**filesystem snapshot** _pool_ _source_ _name_
> Create filesystem snapshot

**filesystem destroy** _pool_ _name_
> Remove filesystem

**filesystem rename** _pool_ _old_ _new_
> Rename filesystem

**blockdev list**
> List block devices in pools

**daemon version**
> Show stratisd version

# DESCRIPTION

**stratis** is a local storage management tool providing ZFS/Btrfs-like features using Linux devicemapper and XFS. It simplifies storage management by abstracting pools of block devices that can be dynamically allocated to thin-provisioned XFS filesystems.

The stratisd daemon must be running before using stratis commands. Filesystems appear at **/dev/stratis/pool_name/filesystem_name** and support features like snapshots, thin provisioning, and pool expansion.

# MOUNTING

Mount manually:

```
mount /dev/stratis/pool_name/fs_name /mnt/target
```

Add to /etc/fstab:

```
/dev/stratis/pool/fs /mnt xfs defaults,x-systemd.requires=stratisd.service 0 0
```

# CAVEATS

Requires stratisd service running. Uses XFS exclusively; other filesystems not supported. Pool devices should be dedicated; partitions with existing data will be overwritten. Snapshots share space with source until modified.

# HISTORY

**Stratis** was developed by **Red Hat** starting around **2017** to provide easy-to-use storage management for Linux. It was designed to deliver modern storage features without the complexity of LVM or the kernel integration requirements of Btrfs/ZFS. Stratis became available in Fedora 28 and RHEL 8.

# SEE ALSO

[lvm](/man/lvm)(8), [btrfs](/man/btrfs)(8), [xfs](/man/xfs)(5), [systemctl](/man/systemctl)(1)
