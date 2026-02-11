# TAGLINE

Erase filesystem signatures from devices

# TLDR

**Display** signatures

```sudo wipefs /dev/sda```

**Wipe** all signatures

```sudo wipefs -a /dev/sda```

Wipe device and **partitions**

```sudo wipefs -a /dev/sda*```

**Dry run**

```sudo wipefs -a -n /dev/sda```

**Force** wipe mounted device

```sudo wipefs -a -f /dev/sda```

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
> Suppress output

# CAVEATS

This command removes filesystem identification signatures but does not securely erase data. For complete data destruction, use **blkdiscard** or overwrite with **dd**. Wiping a mounted filesystem can cause data loss.

# HISTORY

**wipefs** is part of the **util-linux** package, providing signature management for block devices.

# SEE ALSO

[blkid](/man/blkid)(8), [lsblk](/man/lsblk)(8), [blkdiscard](/man/blkdiscard)(8)
