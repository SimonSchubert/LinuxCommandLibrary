# TLDR

List **available** drivers

```mhwd --list```

List **installed** drivers

```mhwd --listinstalled```

**Install** a driver

```mhwd --install pci [driver_name]```

**Remove** a driver

```mhwd --remove pci [driver_name]```

Show **detailed** hardware info

```mhwd --list --detail```

**Auto-install** best graphics driver

```mhwd --auto pci free 0300```

# SYNOPSIS

**mhwd** [_options_]

# DESCRIPTION

**mhwd** (Manjaro Hardware Detection) is a utility for automatic hardware detection and driver management on Manjaro Linux. It simplifies installing proprietary and open-source drivers.

# PARAMETERS

**-l, --list**
> List available drivers

**-li, --listinstalled**
> List installed drivers

**-i, --install pci|usb DRIVER**
> Install a driver

**-r, --remove pci|usb DRIVER**
> Remove a driver

**-a, --auto pci|usb free|nonfree HWCLASS**
> Auto-install best driver (0300 for graphics)

**-d, --detail**
> Show detailed information

# CAVEATS

Specific to Manjaro Linux. Graphics class is 0300. Choose 'free' for open-source or 'nonfree' for proprietary drivers.

# SEE ALSO

[mhwd-kernel](/man/mhwd-kernel)(8), [pacman](/man/pacman)(8)
