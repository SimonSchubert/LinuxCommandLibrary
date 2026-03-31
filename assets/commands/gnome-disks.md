# TAGLINE

graphical disk management utility

# TLDR

**Start GNOME Disks**

```gnome-disks```

**Open a specific block device**

```gnome-disks --block-device [/dev/sda]```

**Restore disk image**

```gnome-disks --restore-disk-image [image.img]```

# SYNOPSIS

**gnome-disks** [_options_]

# PARAMETERS

**--block-device** _DEVICE_
> Open the specified block device (e.g. /dev/sda).

**--restore-disk-image** _FILE_
> Restore disk image.

**--format-device**
> Open the format dialog for the specified block device (used with --block-device).

**--xid** _XID_
> Parent window XID for the dialog.

**--help**
> Display help information.

# DESCRIPTION

**gnome-disks** is a graphical disk management utility for the GNOME desktop. It manages disks, partitions, filesystems, and RAID arrays through a user-friendly GTK interface.

The tool handles formatting, mounting, imaging, and benchmarking. It integrates with udisks2 for privileged operations and supports encrypted volumes.

# CAVEATS

GTK application requires graphical environment. Some operations need root. Part of GNOME utilities.

# HISTORY

GNOME Disks was developed as part of the **GNOME** project, replacing older disk management tools with a modern, integrated utility.

# SEE ALSO

[udisksctl](/man/udisksctl)(1), [fdisk](/man/fdisk)(1), [parted](/man/parted)(1), [lsblk](/man/lsblk)(1)
