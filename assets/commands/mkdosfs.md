# TAGLINE

creates MS-DOS FAT filesystems

# TLDR

**Create FAT filesystem**

```mkdosfs [/dev/sdb1]```

**Create FAT32**

```mkdosfs -F [32] [/dev/sdb1]```

**Create FAT16**

```mkdosfs -F [16] [/dev/sdb1]```

**Set volume label**

```mkdosfs -n "[LABEL]" [/dev/sdb1]```

**Verbose output**

```mkdosfs -v [/dev/sdb1]```

**Create a FAT filesystem in an image file**

```mkdosfs -C [disk.img] [size_in_blocks]```

**Check for bad blocks**

```mkdosfs -c [/dev/sdb1]```

# SYNOPSIS

**mkdosfs** [_options_] _device_

# PARAMETERS

_DEVICE_
> Block device or image file.

**-F** _SIZE_
> FAT size (12, 16, or 32).

**-n** _LABEL_
> Volume label.

**-c**
> Check for bad blocks before creating filesystem.

**-C**
> Create the file given as DEVICE and write the filesystem to it (for image files).

**-I**
> Allow formatting the entire disk device without a partition table (superfloppy format).

**-s** _SECTORS_
> Number of disk sectors per cluster (must be a power of 2).

**-S** _SIZE_
> Number of bytes per logical sector (512, 1024, 2048, etc.).

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**mkdosfs** creates MS-DOS FAT filesystems. It formats devices with FAT12, FAT16, or FAT32.

The tool is also known as mkfs.fat. Used for USB drives and compatibility.

# CAVEATS

Destroys existing data. Choose correct FAT type. Root required.

# HISTORY

mkdosfs is part of **dosfstools**, providing FAT filesystem creation on Linux.

# SEE ALSO

[mkfs.fat](/man/mkfs.fat)(8), [mkfs](/man/mkfs)(8), [dosfslabel](/man/dosfslabel)(8), [fatlabel](/man/fatlabel)(8)

