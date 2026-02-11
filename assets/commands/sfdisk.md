# TAGLINE

Scriptable partition table manipulator

# TLDR

**Back up** the partition layout to a file

```sudo sfdisk -d [/dev/sdX] > [path/to/file.dump]```

**Restore** a partition layout from a backup

```sudo sfdisk [/dev/sdX] < [path/to/file.dump]```

**Set** the type of a partition

```sudo sfdisk --part-type [/dev/sdX] [partition_number] [swap]```

**Delete** a partition

```sudo sfdisk --delete [/dev/sdX] [partition_number]```

# SYNOPSIS

**sfdisk** [_options_] _device_

# PARAMETERS

**-d, --dump**
> Dump partition table in sfdisk-compatible format

**-l, --list**
> List partitions on a device

**--delete**
> Delete a partition

**--part-type**
> Set or change partition type

**-n, --no-act**
> Dry run; don't write changes

**-b, --backup**
> Backup partition table sectors before changes

**-f, --force**
> Disable all consistency checks

**--verify**
> Check partition table consistency

**-J, --json**
> Output in JSON format

# DESCRIPTION

**sfdisk** is a scriptable partition table manipulator. Unlike interactive tools like **fdisk**, sfdisk is designed for non-interactive use, making it ideal for backup/restore operations and automated partitioning scripts.

The dump format is human-readable and can be edited before restoring. This makes it useful for cloning partition layouts between identical disks.

# CAVEATS

Requires root privileges. Modifying partition tables can cause data loss; always backup important data first. The partition layout must be compatible with the target disk's geometry. Part of the util-linux package.

# SEE ALSO

[fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [gdisk](/man/gdisk)(8), [partprobe](/man/partprobe)(8)
