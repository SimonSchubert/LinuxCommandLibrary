# TAGLINE

partition table manipulator

# TLDR

**List** partitions

```sudo fdisk -l```

Start the **interactive** partition manipulator

```sudo fdisk [/dev/sdX]```

# SYNOPSIS

**fdisk** [_-l_] [_-u_] [_-s partition_] [_device_]

# DESCRIPTION

**fdisk** is a dialog-driven program for managing partition tables and partitions on storage drives. It supports MBR, GPT, SGI, and Sun partition tables.

# PARAMETERS

**-l, --list**
> List partition tables for all devices or specified device

**-u, --units**
> Display units in sectors (default) or cylinders

**-s, --getsz partition**
> Print size of partition in 512-byte sectors

**-b, --sector-size size**
> Specify physical and logical sector size

**-c, --compatibility mode**
> Specify compatibility mode (dos or nondos)

**-L, --color**
> Colorize output

**-t, --type type**
> Specify disk label type (dos, gpt, sgi, sun)

# INTERACTIVE COMMANDS

**m**: Display help menu
**p**: Print partition table
**n**: Create new partition
**d**: Delete partition
**t**: Change partition type
**l**: List known partition types
**w**: Write changes and exit
**q**: Quit without saving changes
**g**: Create new GPT partition table
**o**: Create new DOS partition table

# CAVEATS

**Dangerous**: Changes are written when you press 'w'. Double-check before writing. Modern fdisk supports GPT natively. MBR partition tables (not fdisk) are limited to 2TB; use GPT for larger disks.

# HISTORY

Part of **util-linux** package. Based on the original fdisk from **Minix** and early Linux. One of the oldest Linux disk partitioning tools.

# SEE ALSO

[parted](/man/parted)(8), [cfdisk](/man/cfdisk)(8), [gdisk](/man/gdisk)(8), [sfdisk](/man/sfdisk)(8), [partprobe](/man/partprobe)(8)
