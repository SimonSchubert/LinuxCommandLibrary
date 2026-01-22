# TLDR

**Load Windows driver**

```loadndisdriver [driver.inf] [driver.sys]```

**Install driver**

```loadndisdriver -i [driver.inf]```

**Load with device ID**

```loadndisdriver [driver.sys] [device_id]```

**List loaded drivers**

```loadndisdriver -l```

# SYNOPSIS

**loadndisdriver** [_options_] _driver_

# PARAMETERS

_DRIVER_
> Windows driver file (.sys).

**-i** _INF_
> Install from INF file.

**-l**
> List loaded drivers.

**-d**
> Debug mode.

**--help**
> Display help information.

# DESCRIPTION

**loadndisdriver** loads Windows NDIS drivers in Linux. It enables Windows wireless drivers through ndiswrapper.

The tool is used when Linux native drivers are unavailable. It translates Windows driver calls.

loadndisdriver loads NDIS drivers.

# CAVEATS

Deprecated approach. Native drivers preferred. 32/64-bit matching required. Part of ndiswrapper.

# HISTORY

loadndisdriver was created as part of **ndiswrapper** to enable Windows wireless drivers on Linux systems.

# SEE ALSO

[ndiswrapper](/man/ndiswrapper)(8), [modprobe](/man/modprobe)(8)

