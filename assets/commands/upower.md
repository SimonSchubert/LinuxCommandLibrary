# TLDR

# TAGLINE

Query system power and battery information

# TLDR

Display **power** information

```upower -d```

**List** power devices

```upower -e```

**Monitor** power changes

```upower -m```

Monitor with **detail**

```upower --monitor-detail```

Display **version**

```upower -v```

# SYNOPSIS

**upower** [_OPTIONS_]

# PARAMETERS

**-d, --dump**
> Display all power and battery information

**-e, --enumerate**
> List all power devices

**-m, --monitor**
> Watch for power status changes

**--monitor-detail**
> Watch with detailed output

**-i** _DEVICE_
> Show information about specific device

**-v, --version**
> Display version information

# DESCRIPTION

**upower** is a system utility that provides power and battery information and statistics. It interfaces with the UPower daemon to report battery levels, power source status, and other power-related information.

The tool is commonly used to monitor laptop battery status and power management events.

# CAVEATS

Requires UPower daemon running. Available information depends on hardware support. Some features require DBus.

# SEE ALSO

[acpi](/man/acpi)(1), [tlp-stat](/man/tlp-stat)(1)
