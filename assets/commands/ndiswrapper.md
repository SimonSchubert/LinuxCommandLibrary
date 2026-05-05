# TAGLINE

allows Windows WiFi drivers on Linux

# TLDR

**Install Windows driver**

```ndiswrapper -i [driver.inf]```

**List installed drivers**

```ndiswrapper -l```

**Remove driver**

```ndiswrapper -r [drivername]```

**Write modprobe config**

```ndiswrapper -m```

**Show hardware**

```ndiswrapper -v```

**Load module**

```modprobe ndiswrapper```

# SYNOPSIS

**ndiswrapper** [_options_]

# PARAMETERS

**-i** _INF_
> Install driver from given .inf file (also copies referenced .sys/.bin into /etc/ndiswrapper).

**-l**
> List installed drivers and the matching hardware/PCI ID.

**-r** _NAME_
> Remove an installed driver.

**-m**
> Write a modprobe alias for the wireless interface (writes to /etc/modprobe.d).

**-ma**
> Write module alias configuration.

**-mi**
> Write module install configuration.

**-v**
> Show driver and hardware (device ID) information.

**-d** _DEVID_:_DRIVER_
> Use DRIVER for the device with the given PCI/USB id.

**-e** _DRIVER_
> Remove a driver from the system.

**--help**
> Display help information.

# DESCRIPTION

**ndiswrapper** allows Windows WiFi drivers on Linux. It wraps NDIS drivers for Linux use.

The tool enables unsupported WiFi cards. Loads Windows .sys and .inf files.

# CAVEATS

Legacy tool. Most cards now have native drivers. Requires Windows driver files.

# HISTORY

ndiswrapper was created to use **Windows network drivers** on Linux when native drivers weren't available.

# SEE ALSO

[iwconfig](/man/iwconfig)(1), [modprobe](/man/modprobe)(1), [lspci](/man/lspci)(1)

