# TAGLINE

controls enclosure LEDs for Intel RAID controllers and storage systems

# TLDR

Turn on **Locate** LED for devices

```sudo ledctl locate=[/dev/sda,/dev/sdb]```

Turn **off** Locate LED

```sudo ledctl locate_off=[/dev/sda,/dev/sdb]```

Turn off **Status** and **Failure** LEDs

```sudo ledctl off=[/dev/sda,/dev/sdb]```

Turn off **all** LEDs (normal state)

```sudo ledctl normal=[/dev/sda,/dev/sdb]```

# SYNOPSIS

**ledctl** [_options_] _pattern_=_device_list_ ...

# PATTERNS

**locate**=_DEVICES_
> Turn on the Locate LED (blue blinking)

**locate_off**=_DEVICES_
> Turn off the Locate LED

**off**=_DEVICES_
> Turn off Status and Failure LEDs

**normal**=_DEVICES_
> Turn off all LEDs, return to normal state

**rebuild**=_DEVICES_
> Set rebuild pattern (used during RAID rebuild)

**failure**=_DEVICES_, **disk_failed**=_DEVICES_
> Set failure pattern (solid red)

**ica**=_DEVICES_, **degraded**=_DEVICES_
> In a critical array.

**ifa**=_DEVICES_, **failed_array**=_DEVICES_
> In a failed array.

**hotspare**=_DEVICES_
> Mark as hot spare.

**pfa**=_DEVICES_
> Predicted failure analysis.

Devices may be given either comma-separated (e.g. **locate=/dev/sda,/dev/sdb**) or in braces (e.g. **locate={ /dev/sda /dev/sdb }**).

# OPTIONS

**-L**, **--list-controllers**
> List detected controllers and their type.

**-x**, **--listed-only**
> Apply changes only to the listed devices; leave others unchanged.

**-l** _FILE_, **--log**=_FILE_
> Write log output to the given file.

**--quiet**, **--error**, **--warning**, **--info**, **--debug**, **--all**
> Set logging verbosity.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version.

# DESCRIPTION

**ledctl** controls enclosure LEDs for Intel RAID controllers and storage systems. It allows physical identification of disks by blinking the Locate LED, and manages status indicators for disk states.

This is particularly useful in data centers with many disks, allowing administrators to physically locate specific drives that need attention, replacement, or are part of a rebuild operation.

# CAVEATS

Requires Intel hardware with LED support (AHCI, ISCI, VMD enclosures). Needs root privileges. Not all enclosures support all LED patterns.

# HISTORY

ledctl is part of the ledmon package, developed by Intel for managing storage enclosure LEDs on their RAID and storage hardware platforms.

# SEE ALSO

[mdadm](/man/mdadm)(8), [smartctl](/man/smartctl)(8)
