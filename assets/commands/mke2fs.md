# TAGLINE

creates ext2, ext3, or ext4 filesystems on a device or partition

# TLDR

Create an **ext2 filesystem** on a partition

```sudo mke2fs -t ext2 [/dev/sdXY]```

Create an **ext3 filesystem** on a partition

```sudo mke2fs -t ext3 [/dev/sdXY]```

Create an **ext4 filesystem** on a partition

```sudo mke2fs -t ext4 [/dev/sdXY]```

# SYNOPSIS

**mke2fs** [_options_] _device_

# PARAMETERS

**-t _type_**
> Filesystem type: ext2, ext3, or ext4

**-L _label_**
> Set the volume label

**-U _uuid_**
> Set the filesystem UUID

**-b _size_**
> Block size in bytes (1024, 2048, or 4096)

**-i _bytes-per-inode_**
> Bytes per inode ratio (affects number of inodes created)

**-N _number_**
> Create exactly this many inodes

**-m _percentage_**
> Reserved blocks percentage for root (default 5%)

**-O _features_**
> Enable/disable filesystem features

**-c**
> Check device for bad blocks before creating filesystem

# DESCRIPTION

**mke2fs** creates ext2, ext3, or ext4 filesystems on a device or partition. It initializes the superblock, block groups, inode tables, and other filesystem structures.

The ext4 filesystem is the current standard for Linux, offering journaling, extents, and improved performance over ext2/ext3. The **-t** option selects the filesystem type and automatically enables appropriate features.

Commonly invoked as **mkfs.ext2**, **mkfs.ext3**, or **mkfs.ext4**, which are symlinks to mke2fs with preset filesystem types.

# CAVEATS

**Destroys all data** on the target device. Always verify the correct device path before running. The reserved block percentage (default 5%) can be reduced for non-root partitions using **-m 0** or later with **tune2fs**. Creating a filesystem on a mounted partition will corrupt it.

# SEE ALSO

[mkfs](/man/mkfs)(8), [mkfs.ext4](/man/mkfs.ext4)(8), [tune2fs](/man/tune2fs)(8), [e2fsck](/man/e2fsck)(8), [dumpe2fs](/man/dumpe2fs)(8)
