# TAGLINE

creates and restores partition images while skipping empty blocks, resulting

# TLDR

**Clone** partition to image file

```sudo partclone.ext4 -c -s /dev/sdXY -o [path/to/backup.img]```

**Restore** partition from image

```sudo partclone.ext4 -r -s [path/to/backup.img] -o /dev/sdXY```

Clone **btrfs** partition

```sudo partclone.btrfs -c -s /dev/sdXY -o [path/to/backup.img]```

Display **help**

```partclone.ext4 -h```

# SYNOPSIS

**partclone.**_fstype_ [**-c**|**-r**|**-b**] [**-s** _source_] [**-o** _output_] [_options_]

# COMMANDS

**partclone.ext4**
> Clone ext4 filesystems

**partclone.btrfs**
> Clone btrfs filesystems

**partclone.ntfs**
> Clone NTFS filesystems

**partclone.fat32**
> Clone FAT32 filesystems

**partclone.xfs**
> Clone XFS filesystems

**partclone.dd**
> Raw block copy (any filesystem)

# PARAMETERS

**-c, --clone**
> Clone partition to image file

**-r, --restore**
> Restore partition from image file

**-b, --dev-to-dev**
> Device to device clone

**-s, --source _source_**
> Source device or image file

**-o, --output _output_**
> Output device or image file

**-L, --logfile _file_**
> Write log to file

**-C, --no-check**
> Skip filesystem check before clone

# DESCRIPTION

**partclone** creates and restores partition images while skipping empty blocks, resulting in smaller backup files and faster operations compared to raw disk imaging. Each filesystem type has its own binary that understands the filesystem structure.

The tool reads only used blocks from the source filesystem, making backups significantly smaller than the partition size. This is especially beneficial for partially filled partitions.

# CAVEATS

Source partition should be unmounted during cloning. Filesystem-specific binary must match the partition type. Restored partitions may need fsck. Image files are not directly mountable.

# HISTORY

**partclone** was developed as an efficient alternative to **dd** for partition backup. By understanding filesystem metadata, it achieves compression without needing external tools, making it popular for system backup and deployment scenarios.

# SEE ALSO

[dd](/man/dd)(1), [clonezilla](/man/clonezilla)(1), [fsarchiver](/man/fsarchiver)(1)
