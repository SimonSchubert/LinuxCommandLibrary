# TAGLINE

Manage btrfs copy-on-write filesystems

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

**btrfs** is the primary management tool for Btrfs (B-tree filesystem), a modern copy-on-write Linux filesystem with built-in support for snapshots, subvolumes, transparent compression, online resizing, multi-device pools, checksumming, and RAID0/1/10/5/6. The command dispatches to subcommand groups (**subvolume**, **filesystem**, **device**, **balance**, **scrub**, **send**, **receive**, **quota**, **qgroup**, **inspect-internal**, ...) that map directly to filesystem operations.

Most subcommands operate on a mounted Btrfs path. The kernel does the heavy lifting; the **btrfs** binary issues IOCTLs to invoke balance, scrub, snapshot, defrag, and other operations. The **send** / **receive** pair enables efficient incremental replication of snapshots to remote hosts or backup volumes.

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
