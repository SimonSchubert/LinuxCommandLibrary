# TAGLINE

system information script that provides detailed information about hardware

# TLDR

Print **basic** system summary

```inxi```

Print **full** system description with sensitive info filtered

```inxi -ez```

Print **CPU** information

```inxi -C```

Print **graphics** information

```inxi -G```

Print **memory/RAM** information

```inxi -m```

Print **audio** system information

```inxi -A```

Print **sensor** data (temperatures, fans)

```inxi -s```

Print **repository** information

```inxi -r```

# SYNOPSIS

**inxi** [_options_]

# PARAMETERS

**-C**, **--cpu**
> CPU information

**-G**, **--graphics**
> Graphics card and display information

**-m**, **--memory**
> RAM memory information

**-A**, **--audio**
> Audio/sound card information

**-s**, **--sensors**
> Sensor data (temperature, fans, voltages)

**-r**, **--repos**
> Distribution repository information

**-e**, **--expanded**
> Show extra details

**-z**, **--filter**
> Filter out sensitive information (IPs, MACs, etc.)

**-F**, **--full**
> Full system information output

# DESCRIPTION

**inxi** is a system information script that provides detailed information about hardware and software configuration. It's designed to be a quick debugging and support tool, producing clean, human-readable output.

The tool aggregates information from various system sources including /proc, /sys, and utility commands, presenting it in a consistent format suitable for sharing in forums or support tickets.

# CAVEATS

Some information requires root privileges. Accuracy depends on available system utilities and kernel interfaces. Output format may vary between versions.

# HISTORY

inxi was created as a fork of infobash by locsmif and is maintained by the inxi project team. It has become a standard tool in many Linux distributions for quickly gathering system information for debugging.

# SEE ALSO

[lshw](/man/lshw)(1), [hwinfo](/man/hwinfo)(8), [lscpu](/man/lscpu)(1)
