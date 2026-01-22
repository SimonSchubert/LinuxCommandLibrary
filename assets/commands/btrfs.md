# TLDR

**Create** subvolume

```sudo btrfs subvolume create path/to/subvolume```

**List** subvolumes

```sudo btrfs subvolume list path/to/mount```

Show **space usage**

```sudo btrfs filesystem df path/to/mount```

Enable **quota**

```sudo btrfs quota enable path/to/subvolume```

Show **quota**

```sudo btrfs qgroup show path/to/subvolume```

# SYNOPSIS

**btrfs** _command_ [_OPTIONS_] [_path_]

# DESCRIPTION

**btrfs** is the primary management tool for btrfs filesystems. Btrfs is a modern copy-on-write (COW) filesystem for Linux featuring snapshots, subvolumes, checksums, and built-in RAID support.

# PARAMETERS

**subvolume** (su)
> Manage subvolumes and snapshots

**filesystem** (fi)
> Manage filesystem properties

**device** (dev)
> Manage devices in the filesystem

**balance** (bal)
> Balance data across devices

**scrub** (sc)
> Verify data integrity

**quota** (qu)
> Enable/disable quota support

**qgroup** (qg)
> Manage quota groups

# CAVEATS

Btrfs is under active development. Some features like RAID5/6 may have stability concerns. Regular scrubs are recommended for data integrity verification. Snapshots share space with their source until modified.

# HISTORY

**btrfs** is the management tool for the **B-tree file system**, a modern Linux filesystem featuring advanced storage capabilities.

# SEE ALSO

[btrfs-subvolume](/man/btrfs-subvolume)(8), [btrfs-filesystem](/man/btrfs-filesystem)(8), [mkfs.btrfs](/man/mkfs.btrfs)(8)
