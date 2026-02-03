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

**-u** _udid_
> Target specific device.

**-n**
> Connect over network.

**--**
> Separator before coordinates (required for negative values).

# DESCRIPTION

**idevicesetlocation** sets or resets simulated GPS location on iOS devices. Part of the libimobiledevice suite. Requires Developer Disk Image to be mounted. Use **reset** to return to actual GPS location. Use -- before coordinates when longitude is negative.

# CAVEATS

Requires Developer Disk Image mounted via ideviceimagemounter.

# SEE ALSO

[ideviceimagemounter](/man/ideviceimagemounter)(1), [ideviceinfo](/man/ideviceinfo)(1)

