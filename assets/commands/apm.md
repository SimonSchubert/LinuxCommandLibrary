# TAGLINE

Query Advanced Power Management status and battery info.

# TLDR

**Show** APM status (power/battery)

```apm```

Show **verbose** status

```apm -v```

**Minutes** of battery remaining

```apm -m```

**Continuously monitor** and update status

```apm -M```

**Suspend** the system

```sudo apm -s```

# SYNOPSIS

**apm** [_-VvmMsSdin_]

# DESCRIPTION

**apm** queries Advanced Power Management (APM) status on Linux systems. It reports battery charge level, AC adapter status, and power management capabilities.

APM has largely been superseded by ACPI on modern systems, but the command may still work for compatibility or on older hardware.

# PARAMETERS

**-V**, **--version**
> Print the version of the program and exit.

**-v**, **--verbose**
> Also print version information for the APM subsystem.

**-m**, **--minutes**
> Print the time remaining as a number of minutes instead of hh:mm.

**-M**, **--monitor**
> Continuously monitor and update the status information.

**-s**, **--suspend**
> Request that the machine be put into the APM suspend state.

**-S**, **--standby**
> Request that the machine be put into the APM standby state.

**-d**, **--debug**
> Print APM status information in a format more useful for debugging.

# CAVEATS

APM is deprecated in favor of ACPI on modern systems. Functionality may be limited or unavailable on ACPI-only systems. Use **acpi** command on modern hardware.

# HISTORY

**apm** was the standard power management interface for Linux until ACPI (Advanced Configuration and Power Interface) became dominant in the mid-**2000s**. The command remains for legacy compatibility.

# SEE ALSO

[acpi](/man/acpi)(1), [upower](/man/upower)(1), [powertop](/man/powertop)(8)
