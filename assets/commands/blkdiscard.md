# TLDR

**Discard** all sectors

```blkdiscard /dev/device```

**Secure** discard

```blkdiscard -s /dev/device```

Discard first **100 MB**

```blkdiscard -l 100MB /dev/device```

# SYNOPSIS

**blkdiscard** [_OPTIONS_] _device_

# DESCRIPTION

**blkdiscard** sends TRIM/DISCARD commands to a storage device to mark sectors as unused. This is particularly useful for SSDs as it allows the drive to optimize its internal storage and improve write performance.

# PARAMETERS

**-l, --length** _size_
> Number of bytes to discard from the offset

**-o, --offset** _offset_
> Byte offset into the device to start discarding

**-s, --secure**
> Perform a secure discard (hardware must support this)

**-z, --zeroout**
> Zero-fill rather than discard

**-f, --force**
> Disable all checking

**-v, --verbose**
> Print aligned offset and length

# CAVEATS

This operation destroys data and is irreversible. Not all devices support discard operations. Secure discard requires hardware support and may not be more secure than regular discard on all devices. The device must not be mounted.

# HISTORY

**blkdiscard** is part of the **util-linux** package, providing SSD optimization and secure erase functionality.

# SEE ALSO

[fstrim](/man/fstrim)(8), [hdparm](/man/hdparm)(8), [blkid](/man/blkid)(8)
