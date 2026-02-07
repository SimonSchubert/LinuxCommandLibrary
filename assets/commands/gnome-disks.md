# TAGLINE

graphical disk management utility

# TLDR

**Start GNOME Disks**

```gnome-disks```

**Restore disk image**

```gnome-disks --restore-disk-image [image.img]```

# SYNOPSIS

**gnome-disks** [_options_]

# PARAMETERS

**--restore-disk-image** _FILE_
> Restore disk image.

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

[udisksctl](/man/udisksctl)(1), [gparted](/man/gparted)(1), [fdisk](/man/fdisk)(1)
