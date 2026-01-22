# TLDR

List **all partitions**

```sudo blkid```

List all partitions in a **table** including mountpoints

```sudo blkid -o list```

Get the **UUID** of a specific partition

```sudo blkid -s UUID -o value [/dev/sdXY]```

Get the **filesystem type** of a partition

```sudo blkid -s TYPE -o value [/dev/sdXY]```

# SYNOPSIS

**blkid** [_-o format_] [_-s tag_] [_device_...]

# DESCRIPTION

**blkid** lists all recognized partitions and their attributes including Universally Unique Identifier (UUID), filesystem type, and label. It uses the libblkid library to locate and identify block devices.

# PARAMETERS

**-o, --output format**
> Output format: full, value, list, device, udev, export

**-s, --match-tag tag**
> Show only the specified tag (UUID, TYPE, LABEL, etc.)

**-c, --cache-file file**
> Read from specified cache file instead of default

**-g, --garbage-collect**
> Perform garbage collection on the blkid cache

**-l, --list-one**
> Look up only one device matching parameters

**-L, --label label**
> Look up device by filesystem label

**-U, --uuid uuid**
> Look up device by filesystem UUID

**-p, --probe**
> Low-level superblock probing mode (bypass cache)

**-i, --info**
> Print I/O limits (sector size, etc.)

# CAVEATS

Output format varies by option. Running without arguments shows all block devices. Results may be cached; use **-p** for live probing.

# HISTORY

Part of **util-linux** package. Developed to provide a unified interface for identifying block device attributes.

# SEE ALSO

[lsblk](/man/lsblk)(8), [findfs](/man/findfs)(8), [mount](/man/mount)(8), [fdisk](/man/fdisk)(8)
