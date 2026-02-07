# TAGLINE

Next-generation copy-on-write filesystem tools

# TLDR

**Format** a partition with bcachefs

```sudo bcachefs format [path/to/partition]```

**Mount** a bcachefs filesystem

```sudo bcachefs mount [path/to/partition] [path/to/mountpoint]```

Create a **RAID with SSD cache** and HDD storage

```sudo bcachefs format -l ssd.ssd1 [path/to/ssd] -l hdd.hdd1 [path/to/hdd] --replicas 1 --foreground_target ssd --promote_target ssd --background_target hdd```

Mount a **multidevice filesystem**

```sudo bcachefs mount [path/to/partition1]:[path/to/partition2] [path/to/mountpoint]```

Display **disk usage**

```bcachefs fs usage -h [path/to/mountpoint]```

Set **replicas** after formatting

```sudo bcachefs set-fs-option --metadata_replicas [2] --data_replicas [2] [path/to/partition]```

Force **rereplicate** all files

```sudo bcachefs data rereplicate [path/to/mountpoint]```

Create a **snapshot** of a directory

```bcachefs subvolume snapshot [path/to/directory] [path/to/snapshot]```

# SYNOPSIS

**bcachefs** _command_ [_options_] [_arguments_]

# DESCRIPTION

**bcachefs** is a next-generation copy-on-write filesystem for Linux that combines features of btrfs and ZFS with the performance characteristics of bcache. It provides checksumming, compression, encryption, snapshots, and multi-device support.

The filesystem supports tiered storage with automatic data movement between fast (SSD) and slow (HDD) devices, making it suitable for hybrid storage configurations.

# SUBCOMMANDS

**format**
> Create a new bcachefs filesystem

**mount**
> Mount a bcachefs filesystem

**fs usage**
> Display filesystem disk usage

**device**
> Manage devices in a filesystem

**subvolume**
> Manage subvolumes and snapshots

**data rereplicate**
> Ensure all data meets replication requirements

**set-fs-option**
> Change filesystem options

# CAVEATS

bcachefs was merged into the Linux kernel in version **6.7**. Older kernels require external module compilation. The filesystem is still under active development; keep backups of important data.

# HISTORY

bcachefs was developed by Kent Overstreet, who also created bcache. Development began around **2015** as an evolution of bcache into a full-fledged filesystem. It was merged into mainline Linux in **2023**.

# SEE ALSO

[bcachefs-device](/man/bcachefs-device)(8), [mount](/man/mount)(8), [btrfs](/man/btrfs)(8)
