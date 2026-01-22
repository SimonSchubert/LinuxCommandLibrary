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

**ledctl** [_options_] _pattern=device_list_

# PARAMETERS

**locate**=_DEVICES_
> Turn on Locate LED (blue blinking)

**locate_off**=_DEVICES_
> Turn off Locate LED

**off**=_DEVICES_
> Turn off Status and Failure LEDs

**normal**=_DEVICES_
> Turn off all LEDs, return to normal state

**rebuild**=_DEVICES_
> Set rebuild pattern (used during RAID rebuild)

**failure**=_DEVICES_
> Set failure pattern (solid red)

# DESCRIPTION

**ledctl** controls enclosure LEDs for Intel RAID controllers and storage systems. It allows physical identification of disks by blinking the Locate LED, and manages status indicators for disk states.

This is particularly useful in data centers with many disks, allowing administrators to physically locate specific drives that need attention, replacement, or are part of a rebuild operation.

# CAVEATS

Requires Intel hardware with LED support (AHCI, ISCI, VMD enclosures). Needs root privileges. Not all enclosures support all LED patterns.

# HISTORY

ledctl is part of the ledmon package, developed by Intel for managing storage enclosure LEDs on their RAID and storage hardware platforms.

# SEE ALSO

[ledmon](/man/ledmon)(8), [mdadm](/man/mdadm)(8), [smartctl](/man/smartctl)(8)
