# TAGLINE

version 1

# TLDR

**Load Windows driver**

```loadndisdriver-1.9 [driver.inf] [driver.sys]```

**Install driver**

```loadndisdriver-1.9 -i [driver.inf]```

**Load with device ID**

```loadndisdriver-1.9 [driver.sys] [device_id]```

**List loaded drivers**

```loadndisdriver-1.9 -l```

# SYNOPSIS

**loadndisdriver-1.9** [_options_] _driver_

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

**loadndisdriver-1.9** is version 1.9 of the NDIS driver loader. It loads Windows wireless drivers in Linux.

This version-specific binary may be used when compatibility with older ndiswrapper is needed.

# CAVEATS

Version-specific tool. Deprecated approach. Native drivers preferred.

# HISTORY

loadndisdriver-1.9 is a versioned component of **ndiswrapper** for loading Windows wireless drivers.

# SEE ALSO

[loadndisdriver](/man/loadndisdriver)(8), [ndiswrapper-1.9](/man/ndiswrapper-1.9)(8)

