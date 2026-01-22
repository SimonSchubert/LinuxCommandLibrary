# TLDR

**List all pools**

```zpool list```

**Show pool status**

```zpool status [pool]```

**Create a mirrored pool**

```sudo zpool create [pool] mirror [/dev/sda] [/dev/sdb]```

**Create a RAID-Z pool**

```sudo zpool create [pool] raidz [/dev/sda] [/dev/sdb] [/dev/sdc]```

**Add devices to pool**

```sudo zpool add [pool] [/dev/sdc]```

**Start a scrub**

```sudo zpool scrub [pool]```

**Import a pool**

```sudo zpool import [pool]```

**Export a pool**

```sudo zpool export [pool]```

# SYNOPSIS

**zpool** _command_ [_options_] [_arguments_]

# SUBCOMMANDS

**create** _pool_ _vdev_...
> Create new storage pool

**destroy** _pool_
> Destroy pool and all data

**add** _pool_ _vdev_...
> Add devices to pool

**remove** _pool_ _device_
> Remove device from pool

**list** [_pool_]
> List pools and properties

**status** [_pool_]
> Show detailed status

**iostat** [_pool_] [_interval_]
> Display I/O statistics

**scrub** _pool_
> Verify data integrity

**import** [_pool_]
> Import pool(s)

**export** _pool_
> Export pool for transport

**upgrade** _pool_
> Upgrade pool version

**history** _pool_
> Show pool command history

**attach** _pool_ _device_ _new_device_
> Attach mirror to device

**detach** _pool_ _device_
> Detach mirror device

**replace** _pool_ _old_ _new_
> Replace disk in pool

**online/offline** _pool_ _device_
> Bring device online/offline

# DESCRIPTION

**zpool** manages ZFS storage pools. A pool is composed of virtual devices (vdevs) which can be single disks, mirrors, or RAID-Z configurations. Pools provide the underlying storage that ZFS datasets use.

Vdev types:
- **mirror** - Data mirrored across 2+ disks
- **raidz**, **raidz2**, **raidz3** - RAID-Z with 1/2/3 parity disks
- **spare** - Hot spare disk
- **cache** - L2ARC read cache (SSD)
- **log** - ZIL write log (SSD)

Scrubbing verifies all data checksums and repairs errors using redundant copies. Regular scrubs are essential for data integrity.

# CAVEATS

Most operations require root privileges.

Pool destruction is permanent. **zpool destroy** deletes all data.

RAID-Z cannot be expanded by adding disks to an existing vdev (as of OpenZFS 2.2, expansion is possible on some platforms).

Regular scrubs are critical. ZFS detects but cannot repair single-disk pool errors.

# SEE ALSO

[zfs](/man/zfs)(8), [zdb](/man/zdb)(8), [zpool-status](/man/zpool-status)(8)
