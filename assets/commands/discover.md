# TLDR

**Run hardware discovery**

```discover```

**Discover specific** device types

```discover [video]```

**List all hardware** classes

```discover --list```

**Show detailed information**

```discover -v [device_type]```

**Format output** as data

```discover --data-version [2.0] [network]```

# SYNOPSIS

**discover** [_options_] [_type_...]

# PARAMETERS

_TYPE_
> Device type to discover: video, network, audio, etc.

**--list**
> List available device types.

**-v**, **--verbose**
> Verbose output.

**--data-version** _VERSION_
> Output data format version.

**--format** _FORMAT_
> Output format (human, data, etc.).

**--help**
> Display help information.

# DESCRIPTION

**discover** is a hardware identification system for Linux that identifies hardware devices and maps them to kernel modules, X drivers, or other software components. It queries system buses to detect attached hardware.

The tool is used in installation and configuration systems to automatically detect hardware and load appropriate drivers. It maintains a database mapping device IDs to driver names and configuration data.

discover can identify devices across various buses including PCI, USB, and others, providing information needed for automatic hardware configuration.

# CAVEATS

Database may not include newest hardware. Some devices require manufacturer-specific detection. Results depend on kernel support and permissions. May miss devices on non-standard buses.

# HISTORY

discover was developed for the **Progeny** and **Debian** distributions as part of automatic hardware detection and configuration systems. It emerged in the early 2000s when automatic hardware detection became important for user-friendly Linux installations.

# SEE ALSO

[lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8), [hwinfo](/man/hwinfo)(8), [udevadm](/man/udevadm)(8)
