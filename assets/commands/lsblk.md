# TLDR

List all storage devices in a **tree-like format**

```lsblk```

Also list **empty devices**

```lsblk -a```

Print the SIZE column in **bytes**

```lsblk -b```

Output info about **filesystems**

```lsblk -f```

Output info about **block-device topology**

```lsblk -t```

Use **ASCII characters** for tree formatting

```lsblk -i```

Add extra columns to output

```lsblk -o NAME,SIZE,FSTYPE,MOUNTPOINT,MODEL```

# SYNOPSIS

**lsblk** [_-a_] [_-b_] [_-f_] [_-t_] [_-o columns_] [_device_...]

# DESCRIPTION

**lsblk** lists information about all available or specified block devices. It reads the sysfs filesystem and udev database to gather information and displays it in a tree-like format showing the relationship between devices and partitions.

# PARAMETERS

**-a, --all**
> Also list empty devices

**-b, --bytes**
> Print SIZE column in bytes

**-f, --fs**
> Output info about filesystems (FSTYPE, LABEL, UUID, MOUNTPOINT)

**-t, --topology**
> Output block device topology information

**-i, --ascii**
> Use ASCII characters for tree formatting

**-l, --list**
> Produce output in list format

**-o, --output columns**
> Specify which columns to output

**-e, --exclude list**
> Exclude devices by major device numbers

**-n, --noheadings**
> Don't print column headings

**-p, --paths**
> Print full device paths

**-J, --json**
> Output in JSON format

# AVAILABLE COLUMNS

NAME, KNAME, MAJ:MIN, FSTYPE, MOUNTPOINT, LABEL, UUID, SIZE, MODEL, SERIAL, TYPE, TRAN, RO, RM, HOTPLUG, ROTA

# CAVEATS

Some information may require root privileges. Mounted filesystems show mount points; unmounted show blank.

# HISTORY

Part of **util-linux** package. Provides a more readable alternative to /proc/partitions and fdisk -l.

# SEE ALSO

[blkid](/man/blkid)(8), [fdisk](/man/fdisk)(8), [findmnt](/man/findmnt)(8), [df](/man/df)(1)
