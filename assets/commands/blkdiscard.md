# TAGLINE

Discard sectors on a storage device

# TLDR

**Discard** all sectors

```blkdiscard /dev/device```

**Secure** discard

```blkdiscard -s /dev/device```

Discard first **100 MiB**

```blkdiscard -l 100M /dev/device```

Discard in **512 MiB** steps (avoids long uninterruptible operations)

```blkdiscard -p 512M /dev/device```

# SYNOPSIS

**blkdiscard** [_OPTIONS_] _device_

# DESCRIPTION

**blkdiscard** sends TRIM/DISCARD commands to a block device to mark sectors as unused. Unlike **fstrim**(8), it operates directly on the block device rather than a mounted filesystem. This is particularly useful for SSDs and thinly-provisioned storage. All data in the discarded region will be lost.

# PARAMETERS

**-o, --offset** _offset_
> Byte offset into the device to start discarding. Must be aligned to the device sector size. Default is 0.

**-l, --length** _size_
> Number of bytes to discard from the offset. Must be aligned to the device sector size.

**-p, --step** _size_
> Discard this many bytes per iteration instead of all at once. Useful for avoiding long uninterruptible operations on large devices.

**-s, --secure**
> Perform a secure discard. This tells the device to also erase any copies of the discarded data (e.g. in garbage collection). Requires device support.

**-z, --zeroout**
> Zero-fill the specified region rather than discarding it.

**-f, --force**
> Disable exclusive-open check, allowing operation on mounted devices. Use with caution.

**-q, --quiet**
> Suppress warning messages.

**-v, --verbose**
> Print aligned offset and length values and progress information.

# CAVEATS

This operation destroys data and is irreversible. All data in the discarded region is lost. Not all devices support discard operations; on unsupported devices, blkdiscard exits with status 2 (since util-linux 2.39). Secure discard requires explicit hardware support and may not provide stronger guarantees than regular discard on all devices.

# HISTORY

**blkdiscard** is part of the **util-linux** package, providing SSD optimization and secure erase functionality.

# SEE ALSO

[fstrim](/man/fstrim)(8), [hdparm](/man/hdparm)(8), [wipefs](/man/wipefs)(8), [blkid](/man/blkid)(8)
