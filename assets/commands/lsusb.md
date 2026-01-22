# TLDR

List all **USB devices**

```lsusb```

List USB hierarchy as **tree**

```lsusb -t```

List **verbose** information

```sudo lsusb -v```

Show details for **specific device**

```sudo lsusb -v -s 001:002```

Filter by **vendor:product** ID

```lsusb -d 1234:5678```

# SYNOPSIS

**lsusb** [_options_]

# DESCRIPTION

**lsusb** displays information about USB buses in the system and devices connected to them. It uses udev's hardware database to provide human-readable vendor and product names.

# PARAMETERS

**-v, --verbose**
> Display detailed device information including configuration and class descriptors

**-s [[bus]:][devnum]**
> Show only devices on specified bus and/or device number (decimal)

**-d [vendor]:[product]**
> Show only devices with specified vendor/product ID (hexadecimal)

**-D device**
> Display information about specific device file (requires root)

**-t, --tree**
> Display USB device hierarchy as tree

**-V, --version**
> Display version information

# CAVEATS

Verbose output (**-v**) and some device details require root privileges. Device numbers are in decimal format, while vendor/product IDs are in hexadecimal.

# HISTORY

**lsusb** is part of the **usbutils** package, providing command-line USB device information since the early days of USB support in Linux.

# SEE ALSO

[lspci](/man/lspci)(8), [usb-devices](/man/usb-devices)(1), [udevadm](/man/udevadm)(8)
