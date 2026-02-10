# TAGLINE

tells the Linux kernel about the presence and numbering of on-disk partitions

# TLDR

**List** the partitions on a block device or disk image

```sudo partx -l [path/to/device_or_disk_image]```

**Add** all partitions found in a block device to the kernel

```sudo partx -a -v [path/to/device_or_disk_image]```

**Delete** all partitions from the kernel (does not alter partitions on disk)

```sudo partx -d [path/to/device_or_disk_image]```

# SYNOPSIS

**partx** [**-a** | **-d** | **-s** | **-u**] [**-t** _type_] [**-n** _M_:_N_] [**-**] _disk_

**partx** [**-a** | **-d** | **-s** | **-u**] [**-t** _type_] _partition_ [_disk_]

# PARAMETERS

**-a**, **--add**
> Add specified partitions to the kernel

**-d**, **--delete**
> Delete specified partitions from the kernel

**-s**, **--show**
> List partitions (default if no action specified)

**-l**, **--list**
> Same as **--show** (list partitions)

**-u**, **--update**
> Update specified partitions

**-n**, **--nr** _M_:_N_
> Specify range of partitions (M to N)

**-t**, **--type** _type_
> Specify partition table type (dos, gpt, etc.)

**-o**, **--output** _list_
> Define which columns to show

**-g**, **--noheadings**
> Do not print headings

**-b**, **--bytes**
> Print sizes in bytes

**-r**, **--raw**
> Use raw output format

**-v**, **--verbose**
> Verbose mode

# DESCRIPTION

**partx** tells the Linux kernel about the presence and numbering of on-disk partitions. It parses a partition table and updates the kernel's in-memory representation without modifying the disk. This is useful when partitions have been added or removed while the disk was in use.

The tool can read partition tables from both block devices and disk image files. It supports multiple partition table formats including DOS/MBR, GPT, BSD, and others.

# CAVEATS

Requires root privileges. Modifying kernel partition state for mounted filesystems can be dangerous. The **-d** option only removes partition entries from the kernel; it does not modify the actual partition table on disk. Use **partprobe** as an alternative for simpler use cases.

# HISTORY

Part of **util-linux**, the standard Linux utility collection. Provides lower-level control over kernel partition awareness compared to **partprobe**, which is typically sufficient for most use cases.

# SEE ALSO

[partprobe](/man/partprobe)(8), [fdisk](/man/fdisk)(8), [parted](/man/parted)(8), [blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8)
