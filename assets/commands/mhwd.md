# TAGLINE

utility for automatic hardware detection and driver management on Manjaro Linux

# TLDR

List **available** drivers

```mhwd --list```

List **installed** drivers

```mhwd --listinstalled```

**Install** a driver

```sudo mhwd --install pci [driver_name]```

**Remove** a driver

```sudo mhwd --remove pci [driver_name]```

Show **detailed** hardware info

```mhwd --list --detail```

**Auto-install** best open-source graphics driver

```sudo mhwd --auto pci free 0300```

**Auto-install** best proprietary graphics driver

```sudo mhwd --auto pci nonfree 0300```

Show **hardware** information

```mhwd --listhardware```

# SYNOPSIS

**mhwd** [_options_] [_configs_]

# DESCRIPTION

**mhwd** (Manjaro Hardware Detection) is a utility for automatic hardware detection and driver management on Manjaro Linux. It simplifies installing proprietary and open-source drivers.

# PARAMETERS

**-l, --list**
> List available driver configs for detected devices

**-la, --listall**
> List all driver configs

**-lh, --listhardware**
> List hardware information

**--pci**, **--usb**
> List only PCI or USB devices and driver configs

**-li, --listinstalled**
> List installed drivers

**-i, --install pci|usb DRIVER**
> Install a driver

**-ic, --installcustom pci|usb PATH**
> Install a custom driver config

**-r, --remove pci|usb DRIVER**
> Remove a driver

**-a, --auto pci|usb free|nonfree HWCLASS**
> Auto-install best driver (0300 for graphics)

**-d, --detail**
> Show detailed information for **-l**, **-li**, and **-lh**

**-f, --force**
> Force reinstall of a driver

**-h, --help**
> Show help message

**-v, --version**
> Show version

**--pmcachedir PATH**, **--pmconfig PATH**, **--pmroot PATH**
> Set the package manager cache path, config, or root

# CAVEATS

Specific to Manjaro Linux. Graphics class is 0300. Choose 'free' for open-source or 'nonfree' for proprietary drivers.

# SEE ALSO

[mhwd-kernel](/man/mhwd-kernel)(8), [pacman](/man/pacman)(8)

# RESOURCES

```[Source code](https://gitlab.manjaro.org/applications/mhwd)```

```[Documentation](https://wiki.manjaro.org/index.php?title=Manjaro_Hardware_Detection_Overview)```

<!-- verified: 2026-11-09 -->
