# TLDR

Start **interactive mode** with the specified disk selected

```sudo parted /dev/sdX```

Show **partition information** in interactive mode

```print```

**Select** a disk in interactive mode

```select /dev/sdX```

Create a **16 GB partition** with filesystem (GPT partition table)

```mkpart partition_name ext4 0% 16G```

Create a partition with filesystem (**MBR** partition table)

```mkpart primary ext4 0% 16G```

**Resize** a partition in interactive mode

```resizepart /dev/sdX1 end_position```

**Remove** a partition in interactive mode

```rm /dev/sdX1```

Display **help**

```?```

# SYNOPSIS

**parted** [_options_] [_device_]

# PARAMETERS

**print**
> Display partition table information

**select** _device_
> Select a disk to work with

**mkpart** _name_ _fs-type_ _start_ _end_
> Create a new partition

**resizepart** _partition_ _end_
> Resize a partition

**rm** _partition_
> Remove a partition

**?**
> Display help for interactive commands

# DESCRIPTION

**parted** is a partition manipulation program that supports both MBR and GPT partition tables. In interactive mode, it provides a command-line interface for viewing and modifying disk partitions.

The interactive mode allows real-time partition management with immediate feedback on changes. It supports various filesystem types including ext2, ext3, ext4, btrfs, fat16, fat32, ntfs, and xfs.

# CAVEATS

Partition changes can result in data loss. Always backup important data before modifying partitions. Some operations require the partition to be unmounted first.

# HISTORY

Part of **GNU Parted**, developed as a free partition editor supporting multiple partition table types and filesystems.

# SEE ALSO

[parted](/man/parted)(8), [partprobe](/man/partprobe)(8), [fdisk](/man/fdisk)(8), [gdisk](/man/gdisk)(8)
