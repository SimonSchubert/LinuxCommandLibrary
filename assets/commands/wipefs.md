# TAGLINE

Erase filesystem, RAID, or partition-table signatures from devices

# TLDR

**Display** signatures

```sudo wipefs /dev/sda```

**Wipe** all signatures

```sudo wipefs -a /dev/sda```

Wipe device and **partitions**

```sudo wipefs -a /dev/sda*```

**Dry run** to show what would be done

```sudo wipefs -a -n /dev/sda```

**Wipe** signatures and create a backup

```sudo wipefs -a -b /dev/sda```

**Force** wipe mounted device

```sudo wipefs -a -f /dev/sda```

**Output** signatures in JSON format

```sudo wipefs -J /dev/sda```

# SYNOPSIS

**wipefs** [_OPTIONS_] _device_...

# DESCRIPTION

**wipefs** erases filesystem, RAID, or partition-table signatures from a device. It removes the magic strings that identify the device type without destroying the actual data, allowing the device to be repurposed.

# PARAMETERS

**-a, --all**
> Wipe all available signatures

**-n, --no-act**
> Dry run - show what would be done

**-f, --force**
> Force wiping even if device is in use

**-o, --offset** _offset_
> Wipe signature at specific offset

**-b, --backup**
> Create backup files of erased signatures

**-t, --types** _list_
> Wipe only specified signature types

**-q, --quiet**
> Suppress output messages after successful signature wipe

**-p, --parsable**
> Print out in parsable format instead of printable

**-J, --json**
> Use JSON output format

**-O, --output** _list_
> Specify which output columns to print

# CAVEATS

This command removes filesystem identification signatures but does not erase the filesystem itself or any other data from the device. For complete data destruction, use **blkdiscard** or overwrite with **dd**. Wiping a mounted filesystem can cause data loss. The **--force** flag is required to erase nested partition tables on non-whole disk devices.

# HISTORY

**wipefs** is part of the **util-linux** package, providing signature management for block devices.

# SEE ALSO

[blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8), [blkdiscard](/man/blkdiscard)(8), [dd](/man/dd)(1), [fdisk](/man/fdisk)(8)
