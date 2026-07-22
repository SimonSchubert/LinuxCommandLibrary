# TAGLINE

Safely unmount removable devices

# TLDR

**Unmount** a device

```udiskie-umount [path/to/mount]```

Unmount and **power down** USB

```udiskie-umount --detach [path/to/mount]```

**Eject** optical drive

```udiskie-umount --eject [path/to/mount]```

# SYNOPSIS

**udiskie-umount** [_OPTIONS_] _PATH_...

# PARAMETERS

**--detach**
> Unmount and power down the device

**--eject**
> Eject optical media

**--help**
> Display help information

# DESCRIPTION

**udiskie-umount** manually unmounts devices using udiskie and udisks2. It safely unmounts removable media and can optionally power down USB devices or eject optical drives.

The path can be either the device path (like /dev/sdb1) or the mount point.

# CAVEATS

Device must not be in use by any process. Detaching USB devices powers them down completely. Ejecting is only applicable to optical drives.

# INSTALL

```dnf: sudo dnf install udiskie```

```pacman: sudo pacman -S udiskie```

```apk: sudo apk add udiskie```

```zypper: sudo zypper install udiskie```

```nix: nix profile install nixpkgs#udiskie```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[udiskie](/man/udiskie)(1), [udiskie-mount](/man/udiskie-mount)(1), [udisksctl](/man/udisksctl)(1)
