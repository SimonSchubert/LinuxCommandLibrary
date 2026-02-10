# TAGLINE

informs the operating system kernel of partition table changes

# TLDR

**Notify** kernel of partition changes

```sudo partprobe```

Show **summary** of changes

```sudo partprobe -s```

**Dry run** with summary

```sudo partprobe -s -d```

# SYNOPSIS

**partprobe** [_OPTIONS_] [_device_...]

# DESCRIPTION

**partprobe** informs the operating system kernel of partition table changes. After modifying partitions using fdisk, parted, or similar tools, partprobe updates the kernel's partition table without requiring a reboot.

# PARAMETERS

**-d, --dry-run**
> Don't actually inform the kernel, just print what would be done

**-s, --summary**
> Show a summary of devices and their partitions

# CAVEATS

Cannot update partitions that are in use or mounted. The kernel may refuse to update the partition table if any partition on the device is busy. In such cases, a reboot may be required.

# HISTORY

**partprobe** is part of the **parted** package, providing partition table synchronization with the kernel.

# SEE ALSO

[parted](/man/parted)(8), [fdisk](/man/fdisk)(8), [lsblk](/man/lsblk)(8)
