# TLDR

Show **battery** information

```acpi```

Show **thermal** information

```acpi -t```

Show **cooling device** information

```acpi -c```

Show thermal information in **Fahrenheit**

```acpi -t -f```

Show **all** information

```acpi -V```

Extract information from **/proc** instead of /sys

```acpi -p```

# SYNOPSIS

**acpi** [_-b_] [_-a_] [_-t_] [_-c_] [_-V_] [_-f_] [_-k_] [_-p_] [_-i_]

# DESCRIPTION

**acpi** shows information from the /proc or /sys filesystem, such as battery status, AC adapter status, thermal information, and cooling device status. This is useful for monitoring laptop battery levels and system temperatures.

# PARAMETERS

**-b, --battery**
> Display battery status information

**-a, --ac-adapter**
> Display AC adapter status

**-t, --thermal**
> Display thermal/temperature information

**-c, --cooling**
> Display cooling device details

**-V, --everything**
> Show all devices (overrides other options)

**-r, --remaining-time**
> Display remaining (dis)charge time

**-e, --end-time**
> Display when (dis)charge will complete

**-i, --details**
> Provide battery capacity and temperature trip points

**-f, --fahrenheit**
> Use Fahrenheit instead of Celsius

**-k, --kelvin**
> Use Kelvin instead of Celsius

**-p, --proc**
> Use legacy /proc interface (/sys is default)

**-s, --show-empty**
> Include non-operational devices in output

**-d, --directory dir**
> Specify custom ACPI info path

# CAVEATS

Some options may not work on all systems depending on ACPI support and kernel configuration. Legacy /proc interface may not be available on newer kernels.

# HISTORY

Created to provide a simple command-line interface to ACPI information on Linux laptops and desktops.

# SEE ALSO

[acpi_listen](/man/acpi_listen)(1), [acpid](/man/acpid)(8)
