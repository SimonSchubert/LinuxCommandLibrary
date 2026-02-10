# TAGLINE

builds a Linux filesystem on a device, usually a hard disk partition

# TLDR

Build **ext2** filesystem (default)

```sudo mkfs /dev/sdXY```

Build filesystem of **specific type**

```sudo mkfs -t ext4 /dev/sdXY```

Build filesystem and **check for bad blocks**

```sudo mkfs -c -t ext4 /dev/sdXY```

Build **XFS** filesystem

```sudo mkfs -t xfs /dev/sdXY```

Show **verbose** output

```sudo mkfs -V -t ext4 /dev/sdXY```

# SYNOPSIS

**mkfs** [_options_] [_-t type_] [_fs-options_] _device_ [_size_]

# DESCRIPTION

**mkfs** builds a Linux filesystem on a device, usually a hard disk partition. It is a front-end wrapper that calls filesystem-specific utilities like mkfs.ext4 or mkfs.xfs. The device can be a block device or a regular file.

# PARAMETERS

**-t, --type TYPE**
> Specify filesystem type (ext2, ext3, ext4, xfs, btrfs, etc.); defaults to ext2

**-c**
> Check the device for bad blocks before building

**-V, --verbose**
> Produce verbose output including executed commands

**-h, --help**
> Display help text

**-V, --version**
> Display version information

# COMMON FILESYSTEM TYPES

**ext2**: Legacy Linux filesystem
**ext3**: ext2 with journaling
**ext4**: Modern Linux filesystem (recommended)
**xfs**: High-performance filesystem
**btrfs**: Copy-on-write filesystem
**vfat**: FAT32 for compatibility
**ntfs**: Windows NTFS filesystem

# CAVEATS

This command is deprecated in favor of filesystem-specific mkfs utilities (mkfs.ext4, mkfs.xfs, etc.). All data on the target device will be destroyed. Always double-check the device path before running.

# HISTORY

**mkfs** is part of **util-linux**. It serves as a wrapper that delegates to the appropriate filesystem-specific mkfs.* utility based on the specified type.

# SEE ALSO

[mkfs.ext4](/man/mkfs.ext4)(8), [mkfs.xfs](/man/mkfs.xfs)(8), [mkfs.btrfs](/man/mkfs.btrfs)(8), [fsck](/man/fsck)(8), [mount](/man/mount)(8)
