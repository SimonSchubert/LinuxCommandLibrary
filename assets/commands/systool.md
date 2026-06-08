# TAGLINE

Sysfs device information viewer

# TLDR

List all buses, classes, and **root devices**

```systool```

List **bus** devices with all attribute values

```systool -b [pci] -v```

List **class** devices with all attribute values

```systool -c [net] -v```

Show only the **drivers** on a bus

```systool -b [bus] -D```

Show attributes of a specific **module**

```systool -m [module_name] -v```

Show a single named **attribute** for a device

```systool -A [attribute] -b [bus] [device]```

# SYNOPSIS

**systool** [_options_ [_device_]]

# PARAMETERS

**-b** _bus_
> Show information for a specific bus (pci, usb, etc.).

**-c** _class_
> Show information for a specific class (block, net, drm, etc.).

**-m** _module_
> Show information for a specific module.

**-a**
> Show attributes of the requested resource.

**-v**
> Show all attributes with values.

**-A** _attribute_
> Show the value of a single named attribute for the requested resource.

**-d**
> Show only devices.

**-D**
> Show only drivers.

**-P**
> Show the device's parent.

**-p**
> Show the absolute sysfs path to the resource.

**-h**
> Show usage.

# DESCRIPTION

**systool** displays system device information from sysfs by bus, class, and topology. It provides a convenient interface to browse the `/sys/bus/`, `/sys/class/`, and `/sys/module/` hierarchies.

Run without parameters, **systool** lists all available bus types, device classes, and root devices. Passing a _device_ name after the options limits output to that single device. Available buses can be found in `/sys/bus/` and classes in `/sys/class/`; common buses include pci, usb, and scsi, and common classes include block, net, and drm.

# CAVEATS

Requires the sysfsutils package. Information comes from the kernel's sysfs interface. Some attributes may require root to read.

# HISTORY

**systool** is part of the **sysfsutils** package, providing user-friendly access to the Linux sysfs virtual filesystem that exports kernel device information.

# SEE ALSO

[lspci](/man/lspci)(8), [lsusb](/man/lsusb)(8), [lsmod](/man/lsmod)(8), [udevadm](/man/udevadm)(8)
