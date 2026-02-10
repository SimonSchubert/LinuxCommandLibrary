# TAGLINE

creates MS-DOS FAT filesystems on devices or image files

# TLDR

Create a **FAT filesystem** inside partition Y on device X

```sudo mkfs.fat [/dev/sdXY]```

Create a FAT filesystem with a **volume name**

```sudo mkfs.fat -n [volume_name] [/dev/sdXY]```

Create a FAT filesystem with a specific **volume ID**

```sudo mkfs.fat -i [volume_id] [/dev/sdXY]```

Specify the **FAT type** (12, 16, or 32 bit)

```sudo mkfs.fat -F [12|16|32] [/dev/sdXY]```

Use **4 file allocation tables** instead of the default 2

```sudo mkfs.fat -f 4 [/dev/sdXY]```

**Check device** for bad blocks before creating filesystem

```sudo mkfs.fat -c [/dev/sdXY]```

# SYNOPSIS

**mkfs.fat** [**-a**] [**-A**] [**-c**] [**-C**] [**-f** _number-of-fats_] [**-F** _fat-size_] [**-i** _volume-id_] [**-l** _bad-block-file_] [**-n** _volume-name_] [**-r** _root-entries_] [**-R** _reserved-sectors_] [**-s** _sectors-per-cluster_] [**-S** _sector-size_] [**-v**] _device_ [_block-count_]

# PARAMETERS

**-F _fat-size_**
> Specify FAT type: 12, 16, or 32 bit; auto-selected based on size if omitted

**-n _volume-name_**
> Set volume label; maximum 11 characters

**-i _volume-id_**
> Set 32-bit hexadecimal volume ID

**-f _number_**
> Number of file allocation tables; default is 2

**-s _sectors_**
> Sectors per cluster; must be a power of 2

**-S _size_**
> Logical sector size in bytes (512, 1024, 2048, 4096, 8192, 16384, or 32768)

**-c**
> Check device for bad blocks before creating filesystem

**-l _filename_**
> Read bad blocks list from file

**-r _entries_**
> Number of root directory entries; default 112-512 depending on FAT type

**-R _sectors_**
> Number of reserved sectors; default 1 for FAT12/16, 32 for FAT32

**-a**
> Disable alignment of data structures

**-A**
> Toggle Atari filesystem variant

**-C**
> Create image file instead of using device; requires block-count

**-v**
> Verbose output mode

**-b _sector_**
> Location of backup boot sector for FAT32

**-D _number_**
> BIOS drive number; 0x80+ for hard disks, 0x00-0x7F for floppies

**-I**
> Ignore safety checks; required for superfloppy format disks

# DESCRIPTION

**mkfs.fat** creates MS-DOS FAT filesystems on devices or image files. It supports FAT12, FAT16, and FAT32 variants used by DOS, Windows, and most consumer electronics.

The block-count parameter specifies filesystem size in 1024-byte blocks. When omitted, the tool fills available device space. FAT type is automatically selected based on filesystem size unless explicitly specified with -F.

FAT filesystems use a file allocation table to track cluster allocation. Multiple copies of this table (default 2) provide redundancy. The filesystem remains widely used for USB drives, SD cards, and EFI system partitions due to its universal compatibility.

# CAVEATS

Volume names are limited to 11 characters. The tool does not create bootable filesystems. It refuses to format partitioned devices by default; use -I to override this safety check for superfloppy format disks. FAT32 cannot store files larger than 4GB.

# HISTORY

The FAT filesystem was developed by **Microsoft** starting in **1977** for standalone Disk BASIC. FAT12 appeared with MS-DOS 1.0 in 1981, FAT16 with MS-DOS 3.0 in 1984, and FAT32 with Windows 95 OSR2 in 1996. The mkfs.fat utility is part of the **dosfstools** package maintained for Linux.

# SEE ALSO

[mkfs](/man/mkfs)(8), [fsck.fat](/man/fsck.fat)(8), [fatlabel](/man/fatlabel)(8)
