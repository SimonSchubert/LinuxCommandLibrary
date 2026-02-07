# TAGLINE

Query Advanced Power Management status and battery info.

# TLDR

**Show** APM status (power/battery)

```apm```

Show **verbose** status

```apm -v```

**Minutes** of battery remaining

```apm -m```

Show battery **percentage**

```apm -l```

**Suspend** the system

```sudo apm -s```

# SYNOPSIS

**apm** [_-vVmsSlba_]

# DESCRIPTION

**apm** queries Advanced Power Management (APM) status on Linux systems. It reports battery charge level, AC adapter status, and power management capabilities.

APM has largely been superseded by ACPI on modern systems, but the command may still work for compatibility or on older hardware.

# PARAMETERS

**-v**, **--verbose**
> Verbose output

**-V**, **--version**
> Print version

**-m**, **--minutes**
> Show minutes of battery remaining

**-s**, **--suspend**
> Suspend the system

**-S**, **--standby**
> Enter standby mode

**-l**, **--life**
> Show battery percentage

**-b**, **--brief**
> Brief output

**-a**, **--ac**
> Show AC power status

# CAVEATS

APM is deprecated in favor of ACPI on modern systems. Functionality may be limited or unavailable on ACPI-only systems. Use **acpi** command on modern hardware.

# HISTORY

**apm** was the standard power management interface for Linux until ACPI (Advanced Configuration and Power Interface) became dominant in the mid-**2000s**. The command remains for legacy compatibility.

# SEE ALSO

[acpi](/man/acpi)(1), [upower](/man/upower)(1), [powertop](/man/powertop)(8)
