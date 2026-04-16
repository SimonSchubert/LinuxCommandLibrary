# TAGLINE

specific version of ndiswrapper

# TLDR

**Install Windows driver**

```ndiswrapper-1.9 -i [driver.inf]```

**List installed drivers**

```ndiswrapper-1.9 -l```

**Remove driver**

```ndiswrapper-1.9 -r [drivername]```

**Write modprobe config**

```ndiswrapper-1.9 -m```

# SYNOPSIS

**ndiswrapper-1.9** [_options_]

# PARAMETERS

**-i** _INF_
> Install driver from INF.

**-l**
> List installed drivers.

**-r** _NAME_
> Remove driver.

**-m**
> Write module alias configuration for modprobe.

**-ma**
> Write module configuration for all cards present.

**-mi**
> Write module install configuration.

**-e** _NAME_
> Remove a driver (alias for -r).

**-da** _DEVICE_:_DRIVER_
> Assign device (PCI/USB ID) to driver.

**-v**
> Verbose output.

**--help**
> Display help information.

# DESCRIPTION

**ndiswrapper-1.9** is a specific version of ndiswrapper. It uses Windows WiFi drivers on Linux.

The tool wraps NDIS network drivers. This version maintained for compatibility.

# CAVEATS

Version-specific binary. Legacy tool. Use latest ndiswrapper if possible.

# HISTORY

ndiswrapper-1.9 is a specific version of **ndiswrapper** maintained for compatibility with certain drivers.

# SEE ALSO

[ndiswrapper](/man/ndiswrapper)(1), [iwconfig](/man/iwconfig)(1), [modprobe](/man/modprobe)(1)

