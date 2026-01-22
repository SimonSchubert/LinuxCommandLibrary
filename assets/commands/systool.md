# TLDR

List **bus** device attributes

```systool -b [pci|usb|...] -v```

List **class** device attributes

```systool -c [drm|block|...] -v```

Show **drivers** for a bus

```systool -b [bus] -D```

# SYNOPSIS

**systool** [_OPTIONS_]

# PARAMETERS

**-b** _BUS_
> Show devices on specified bus (pci, usb, etc.)

**-c** _CLASS_
> Show devices of specified class (block, drm, etc.)

**-v**
> Show all attributes verbosely

**-D**
> Show only device drivers

**-d** _DEVICE_
> Show specific device

**-p** _PATH_
> Show device at sysfs path

# DESCRIPTION

**systool** displays system device information from sysfs by bus and class. It provides a convenient interface to browse `/sys/bus/` and `/sys/class/` hierarchies.

Available buses can be found in `/sys/bus/` and classes in `/sys/class/`. Common buses include pci, usb, and scsi; common classes include block, net, and drm.

# CAVEATS

Requires the sysfsutils package. Information comes from the kernel's sysfs interface. Some attributes may require root to read.

# HISTORY

**systool** is part of the **sysfsutils** package, providing user-friendly access to the Linux sysfs virtual filesystem that exports kernel device information.

# SEE ALSO

[lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8), [udevadm](/man/udevadm)(8)
