# TAGLINE

Unmount removable devices without root

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

**-l**, **--lazy**
> Lazy unmount (detach filesystem now, clean up when no longer busy). Use with caution as it may cause data loss.

**--luks-force**
> Force LUKS close even if pmount did not open the device.

**-d**, **--debug**
> Enable verbose debug messages.

**--version**
> Print version number and exit.

# DESCRIPTION

**pumount** is the counterpart to pmount for unmounting removable devices without root privileges. It is a wrapper around the standard umount that permits normal users to unmount removable devices without a matching /etc/fstab entry. It handles encrypted dm-crypt/LUKS volumes and ensures proper cleanup. It also supports unmounting devices that have been brutally removed.

# CAVEATS

Only works with pmount-mounted devices. Doesn't handle fstab mounts. May need --lazy for busy devices.

# HISTORY

pumount is part of **pmount** by **Martin Pitt**, providing non-root unmounting for removable media.

# SEE ALSO

[pmount](/man/pmount)(1), [umount](/man/umount)(8), [udisksctl](/man/udisksctl)(1)
