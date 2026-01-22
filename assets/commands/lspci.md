# TLDR

Show **brief list** of devices

```lspci```

Display **verbose** information

```lspci -v```

Display **kernel drivers** and modules

```lspci -k```

Select **specific device**

```lspci -s 00:18.3```

Machine **readable** output

```lspci -vm```

Show vendor/device as **numbers and names**

```lspci -nn```

Display as **tree**

```lspci -t```

# SYNOPSIS

**lspci** [_options_]

# DESCRIPTION

**lspci** displays information about PCI buses in the system and devices connected to them. It provides details about hardware, drivers, and capabilities of PCI devices.

# PARAMETERS

**-v**
> Verbose output with device details

**-vv**
> Very verbose output

**-vvv**
> Maximum verbosity

**-k**
> Show kernel drivers and available modules

**-n**
> Show vendor/device codes as numbers only

**-nn**
> Show both numbers and names

**-m**
> Machine-readable output format

**-mm**
> Machine-readable format for scripts

**-t**
> Show as tree diagram

**-s SLOT**
> Show only device in specified slot

**-d VENDOR:DEVICE**
> Show only devices with specified IDs

**-x**
> Hexadecimal dump of configuration space

**-xxx**
> Full PCI configuration space (root only)

**-D**
> Always show PCI domain numbers

**-P**
> Show devices by bridge path

**-q**
> Query central database for unknown devices

**-i FILE**
> Use alternate PCI ID file

# CAVEATS

Some information requires root privileges. The **-xxx** option shows full configuration space but needs root access.

# HISTORY

**lspci** is part of **pciutils**, providing PCI device information and configuration utilities for Linux systems.

# SEE ALSO

[setpci](/man/setpci)(8), [lsusb](/man/lsusb)(8), [update-pciids](/man/update-pciids)(8)
