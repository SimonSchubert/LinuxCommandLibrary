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
> Install driver from INF.

**-l**
> List installed drivers.

**-r** _NAME_
> Remove driver.

**-m**
> Write modprobe config.

**-v**
> Verbose/hardware info.

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

