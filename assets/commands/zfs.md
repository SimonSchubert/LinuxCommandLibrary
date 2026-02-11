# TAGLINE

Manage ZFS filesystems and snapshots

# TLDR

**List all datasets**

```zfs list```

**Create a new filesystem**

```sudo zfs create [pool/dataset]```

**Create a snapshot**

```sudo zfs snapshot [pool/dataset@snapshot_name]```

**List snapshots**

```zfs list -t snapshot```

**Rollback to snapshot**

```sudo zfs rollback [pool/dataset@snapshot_name]```

**Set a property**

```sudo zfs set [compression=lz4] [pool/dataset]```

**Get property value**

```zfs get [compression] [pool/dataset]```

**Destroy a dataset**

```sudo zfs destroy [pool/dataset]```

# SYNOPSIS

**zfs** _command_ [_options_] [_arguments_]

# SUBCOMMANDS

**list** [**-t** _type_] [**-o** _properties_] [_dataset_]
> List datasets and properties

**create** [**-p**] _dataset_
> Create filesystem or volume (-p creates parents)

**destroy** [**-r**] _dataset_
> Destroy dataset (-r recursive)

**snapshot** _dataset@name_
> Create snapshot

**rollback** _dataset@snapshot_
> Rollback to snapshot

**clone** _snapshot_ _dataset_
> Create clone from snapshot

**send** _snapshot_
> Generate stream for replication

**receive** _dataset_
> Receive stream into dataset

**set** _property=value_ _dataset_
> Set property

**get** _property_ _dataset_
> Get property value

**mount** _dataset_
> Mount filesystem

**unmount** _dataset_
> Unmount filesystem

# DESCRIPTION

**zfs** manages ZFS filesystems, snapshots, clones, and volumes. ZFS is a combined filesystem and volume manager with advanced features like copy-on-write, snapshots, checksums, and built-in compression.

Key concepts:
- **Datasets** are filesystems or volumes within a pool
- **Snapshots** are read-only point-in-time copies
- **Clones** are writable copies created from snapshots
- **Properties** control behavior (compression, quota, mountpoint)

ZFS uses hierarchical datasets: **pool/parent/child** inherits properties from parent. Properties can be set locally to override inheritance.

Common properties include **compression**, **quota**, **reservation**, **recordsize**, **atime**, and **mountpoint**.

# CAVEATS

Most operations require root privileges.

**zfs destroy** is irreversible. Snapshots protect against accidental deletion but must be created proactively.

ZFS can consume significant memory for caching (ARC). Tune **zfs_arc_max** on memory-constrained systems.

Snapshots are cheap but not free. Many snapshots with high data churn can consume significant space.

# SEE ALSO

[zpool](/man/zpool)(8), [zdb](/man/zdb)(8), [zfs-send](/man/zfs-send)(8), [zfs-receive](/man/zfs-receive)(8)
