# TLDR

**Enter recovery mode**

```ideviceenterrecovery [udid]```

**Enter recovery by name**

```ideviceenterrecovery -n [device-name]```

**Debug mode**

```ideviceenterrecovery -d [udid]```

# SYNOPSIS

**ideviceenterrecovery** [_options_] _udid_

# PARAMETERS

_UDID_
> Device UDID.

**-n** _NAME_
> Target by device name.

**-d**, **--debug**
> Debug output.

**--help**
> Display help information.

# DESCRIPTION

**ideviceenterrecovery** puts an iOS device into recovery mode. Recovery mode is used for firmware restoration and troubleshooting.

The tool sends the command to enter recovery via USB. The device must be paired and trusted.

ideviceenterrecovery triggers iOS recovery.

# CAVEATS

Device must be paired. Recovery mode needs manual exit. Part of libimobiledevice.

# HISTORY

ideviceenterrecovery is part of **libimobiledevice** for iOS device management on Linux.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicepair](/man/idevicepair)(1), [idevicerestore](/man/idevicerestore)(1)
