# TAGLINE

extend a partition to fill available space

# TLDR

**Extend** partition n to fill empty space until end of disk

```growpart /dev/sdX [n]```

Show what modifications would be made (**dry run**)

```growpart -N /path/to/disk.img [n]```

# SYNOPSIS

**growpart** [_options_] _disk_ _partition-number_

# PARAMETERS

**-N**, **--dry-run**
> Show what would be done without making changes

**-u**, **--update** _TYPE_
> Update type: auto, growfs, off

**-v**, **--verbose**
> Enable verbose output

**-h**, **--help**
> Display help message

# DESCRIPTION

**growpart** extends a partition to fill available free space following it on a disk. It is commonly used after enlarging a virtual disk or cloud volume to make the added space available to the partition.

The tool works with both physical disks (like /dev/sda) and disk image files. It automatically handles partition table updates for both MBR and GPT partition schemes.

After growing a partition, you typically need to resize the filesystem within it using tools like **resize2fs** (ext4), **xfs_growfs** (XFS), or **btrfs filesystem resize** (Btrfs).

# CAVEATS

Only grows partitions into immediately following free space. Cannot grow partitions that have other partitions after them without first moving those partitions. Requires unmounting or using a live system for root partition resizing.

# HISTORY

growpart is part of the cloud-utils package, developed by Canonical for Ubuntu and widely used in cloud environments. It was created to simplify the common task of expanding partitions when virtual disks are resized.

# SEE ALSO

[fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [resize2fs](/man/resize2fs)(8), [xfs_growfs](/man/xfs_growfs)(8)
