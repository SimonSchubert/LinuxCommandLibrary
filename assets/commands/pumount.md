# TLDR

**Unmount device**

```pumount [/dev/sdb1]```

**Unmount by mount point**

```pumount [/media/usb]```

**Unmount by label**

```pumount [LABEL]```

**Lazy unmount**

```pumount --lazy [/dev/sdb1]```

# SYNOPSIS

**pumount** [_options_] _device_|_directory_

# PARAMETERS

**--lazy**, **-l**
> Lazy unmount (detach now, cleanup later).

**--luks-force**
> Force LUKS close.

**--debug**, **-d**
> Debug output.

# DESCRIPTION

**pumount** is the counterpart to pmount for unmounting removable devices without root privileges. It handles encrypted volumes and ensures proper cleanup.

Part of the pmount package for user-mountable removable media.

# EXAMPLES

```bash
# Unmount by device
pumount /dev/sdb1

# Unmount by mount point
pumount /media/usb

# Lazy unmount (busy device)
pumount --lazy /dev/sdb1

# Unmount encrypted drive
pumount /dev/mapper/sdb1

# Debug mode
pumount -d /dev/sdc1
```

# COMMON ERRORS

```bash
# Device busy
pumount --lazy /dev/sdb1

# Or find what's using it
lsof +D /media/usb
fuser -m /media/usb
```

# CAVEATS

Only works with pmount-mounted devices. Doesn't handle fstab mounts. May need --lazy for busy devices.

# HISTORY

pumount is part of **pmount** by **Martin Pitt**, providing non-root unmounting for removable media.

# SEE ALSO

[pmount](/man/pmount)(1), [umount](/man/umount)(8), [udisksctl](/man/udisksctl)(1)
