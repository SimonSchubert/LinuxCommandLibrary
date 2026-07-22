# TAGLINE

sets or resets simulated GPS location on iOS devices

# TLDR

**Set device location**

```idevicesetlocation -- [latitude] [longitude]```

**Reset to actual location**

```idevicesetlocation reset```

**Target specific device**

```idevicesetlocation -u [device-udid] -- [37.7749] [-122.4194]```

# SYNOPSIS

**idevicesetlocation** [_options_] [**--** _lat_ _lon_ | **reset**]

# PARAMETERS

**-u** _udid_, **--udid** _udid_
> Target a specific device by its UDID.

**-n**, **--network**
> Connect to the device over the network instead of USB.

**-d**, **--debug**
> Enable verbose debug output.

**-h**, **--help**
> Display help information.

**--**
> Separator before positional coordinates (required when longitude is negative so the leading minus is not parsed as an option).

# DESCRIPTION

**idevicesetlocation** sets or resets the simulated GPS location reported by an iOS device, useful for testing location-aware apps. It is part of the **libimobiledevice** suite and communicates with the device's developer services.

Pass `reset` instead of coordinates to clear the simulated location and resume real GPS reporting. Coordinates are decimal degrees: positive for north/east, negative for south/west.

# CAVEATS

Requires the Developer Disk Image (or, on iOS 17+, a Developer Mode tunnel) to be mounted on the target device — typically via **ideviceimagemounter**. The simulated location persists until the device is rebooted or reset is invoked.

# INSTALL

```apt: sudo apt install libimobiledevice-utils```

```dnf: sudo dnf install libimobiledevice-utils```

```apk: sudo apk add libimobiledevice-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ideviceimagemounter](/man/ideviceimagemounter)(1), [ideviceinfo](/man/ideviceinfo)(1)

