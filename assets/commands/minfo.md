# TAGLINE

Print the parameters of an MS-DOS filesystem

# TLDR

**Show filesystem info** for a configured mtools drive

```minfo [a:]```

**Show verbose info** including a hexdump of the boot sector

```minfo -v [a:]```

**Show info** for a disk image file

```minfo -i [path/to/image.img] ::```

# SYNOPSIS

**minfo** [**-v**] _drive_

**minfo** **-i** _imagefile_ **::**

# PARAMETERS

**-v**
> Verbose mode: also print a hexdump of the boot sector.

**-i** _imagefile_
> Read from the specified image file instead of a configured drive.

# DESCRIPTION

**minfo** prints the parameters of an MS-DOS filesystem, such as number of sectors, heads, and cylinders. It also prints an **mformat** command line that can be used to create a similar MS-DOS filesystem on another device.

**minfo** is part of the **mtools** suite of utilities for accessing MS-DOS disks from Unix without mounting them. It supports FAT12, FAT16, and FAT32 filesystems.

# CAVEATS

Does not support 2m or XDF media formats, or MS-DOS 1.0 filesystems. Requires mtools to be configured for the target drive, or an image file supplied with **-i**.

# HISTORY

**minfo** is part of **mtools**, a collection of utilities originally written by Emmet P. Gray for accessing MS-DOS disks on Unix systems, later maintained by Alain Knaff.

# SEE ALSO

[mcopy](/man/mcopy)(1)

