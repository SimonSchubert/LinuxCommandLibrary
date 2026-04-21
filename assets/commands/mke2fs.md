# TAGLINE

creates ext2, ext3, or ext4 filesystems on a device or partition

# TLDR

Create an **ext2 filesystem** on a partition

```sudo mke2fs -t ext2 [/dev/sdXY]```

Create an **ext3 filesystem** on a partition

```sudo mke2fs -t ext3 [/dev/sdXY]```

Create an **ext4 filesystem** on a partition

```sudo mke2fs -t ext4 [/dev/sdXY]```

Create ext4 with a **volume label**

```sudo mke2fs -t ext4 -L [my_label] [/dev/sdXY]```

**Dry-run** to preview parameters without writing

```sudo mke2fs -n -t ext4 [/dev/sdXY]```

Create ext4 with **no reserved blocks** for root

```sudo mke2fs -t ext4 -m 0 [/dev/sdXY]```

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
> Check device for bad blocks before creating filesystem (use **-cc** for a read-write test).

**-j**
> Create the filesystem with an ext3 journal.

**-E** _extended-options_
> Set extended options (comma-separated), e.g. `discard`, `lazy_itable_init`, `stride`, `stripe_width`.

**-T** _usage-type_
> Usage type (default, small, big, huge, news, largefile, largefile4) to tune defaults.

**-n**
> Dry run: show what would be done without actually creating the filesystem (useful to locate backup superblocks).

**-F**
> Force creation even if the target doesn't look like a partition or is in use. Specify twice to override all safety checks.

**-q**
> Quiet mode (suppress informational output, useful in scripts).

**-v**
> Verbose output.

# DESCRIPTION

**mke2fs** creates ext2, ext3, or ext4 filesystems on a device or partition. It initializes the superblock, block groups, inode tables, and other filesystem structures.

The ext4 filesystem is the current standard for Linux, offering journaling, extents, and improved performance over ext2/ext3. The **-t** option selects the filesystem type and automatically enables appropriate features.

Commonly invoked as **mkfs.ext2**, **mkfs.ext3**, or **mkfs.ext4**, which are symlinks to mke2fs with preset filesystem types. Defaults are read from **/etc/mke2fs.conf**.

# CAVEATS

**Destroys all data** on the target device. Always verify the correct device path before running. The reserved block percentage (default 5%) can be reduced for non-root partitions using **-m 0** or later with **tune2fs**. Creating a filesystem on a mounted partition will corrupt it.

# HISTORY

**mke2fs** was originally written by **Remy Card** as part of the **e2fsprogs** suite for the ext2 filesystem introduced in Linux **1.0 (1993)**. It was later extended to support ext3 (journaling, **2001**) and ext4 (extents, large volumes, **2008**). Current maintenance is led by **Theodore Ts'o**.

# SEE ALSO

[mkfs](/man/mkfs)(8), [mkfs.ext4](/man/mkfs.ext4)(8), [tune2fs](/man/tune2fs)(8), [e2fsck](/man/e2fsck)(8), [dumpe2fs](/man/dumpe2fs)(8)
