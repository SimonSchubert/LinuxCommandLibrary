# TAGLINE

device-mapper event monitoring control

# TLDR

**List registered events**

```dmevent_tool -l```

**Register device** for monitoring

```dmevent_tool -R [device_name]```

**Unregister device** from monitoring

```dmevent_tool -U [device_name]```

**Check monitor status**

```dmevent_tool -s [device_name]```

# SYNOPSIS

**dmevent_tool** [_options_] [_device_]

# PARAMETERS

_DEVICE_
> Device mapper device name.

**-l**, **--list**
> List registered devices.

**-R**, **--register**
> Register device for monitoring.

**-U**, **--unregister**
> Unregister device from monitoring.

**-s**, **--status**
> Show device monitoring status.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**dmevent_tool** is a utility for interacting with the device-mapper event daemon (dmeventd). It allows registering and unregistering device mapper devices for event monitoring and querying their status.

The device-mapper event daemon monitors DM devices for events like failures, threshold crossings, or configuration changes. When events occur, dmeventd can trigger configured responses such as alerting or automatic repair.

This tool is typically used with LVM thin provisioning, RAID, and other device-mapper-based storage configurations that benefit from event-driven monitoring.

# CAVEATS

Requires dmeventd running. Root privileges needed. Only works with device-mapper devices. Event handling depends on configured plugins.

# HISTORY

dmevent_tool is part of the **LVM2** device-mapper tools developed by **Red Hat**. The device-mapper event monitoring infrastructure provides reactive storage management for enterprise Linux deployments.

# SEE ALSO

[dmeventd](/man/dmeventd)(8), [dmsetup](/man/dmsetup)(8), [lvm](/man/lvm)(8)
