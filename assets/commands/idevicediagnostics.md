# TAGLINE

Interact with the diagnostics interface of an iOS device

# TLDR

**Restart device**

```idevicediagnostics restart```

**Shutdown device**

```idevicediagnostics shutdown```

**Put device to sleep**

```idevicediagnostics sleep```

**Get diagnostics info**

```idevicediagnostics diagnostics```

**Get battery info**

```idevicediagnostics diagnostics GasGauge```

**Target a specific device** by UDID

```idevicediagnostics -u [UDID] restart```

**Print IORegistry** for a specific plane

```idevicediagnostics ioregistry IODeviceTree```

# SYNOPSIS

**idevicediagnostics** [_options_] _command_

# SUBCOMMANDS

**diagnostics** [_type_]
> Print diagnostics information, optionally by type: All (default), WiFi, GasGauge, or NAND.

**mobilegestalt** _key_ [_key_ ...]
> Print values of MobileGestalt keys.

**ioregistry** [_plane_]
> Print IORegistry of device, optionally by plane (IODeviceTree, IOPower, IOService). iOS 5+ only.

**restart**
> Restart the device.

**shutdown**
> Shut down the device.

**sleep**
> Put device to sleep.

# PARAMETERS

**-u**, **--udid** _UDID_
> Target specific device by its UDID.

**-n**, **--network**
> Connect to network device.

**-d**, **--debug**
> Enable communication debugging.

**-h**, **--help**
> Print usage information.

**-v**, **--version**
> Print version information.

# DESCRIPTION

**idevicediagnostics** interacts with the diagnostics interface of an iOS device to retrieve diagnostics data, MobileGestalt data, and IORegistry information, as well as perform actions like restart, shutdown, and sleep. Part of the **libimobiledevice** suite. Available for iOS 4 and later; IORegistry access requires iOS 5 or later.

# SEE ALSO

[ideviceinfo](/man/ideviceinfo)(1), [idevicecrashreport](/man/idevicecrashreport)(1), [idevicepair](/man/idevicepair)(1), [idevicebackup2](/man/idevicebackup2)(1), [idevicesyslog](/man/idevicesyslog)(1), [idevicescreenshot](/man/idevicescreenshot)(1)

