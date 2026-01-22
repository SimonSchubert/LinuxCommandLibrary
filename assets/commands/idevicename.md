# TLDR

**Get device name**

```idevicename```

**Set device name**

```idevicename "New Name"```

**Target specific device**

```idevicename -u [udid]```

**Debug output**

```idevicename -d```

# SYNOPSIS

**idevicename** [_options_] [_name_]

# PARAMETERS

_NAME_
> New device name to set.

**-u** _UDID_
> Target device by UDID.

**-n**
> Use network connection.

**-d**, **--debug**
> Debug output.

**--help**
> Display help information.

# DESCRIPTION

**idevicename** gets or sets the name of an iOS device. Without argument it displays the current name.

The tool changes the device name visible in iTunes and Finder. It requires the device to be paired and trusted.

idevicename manages iOS device name.

# CAVEATS

Part of libimobiledevice. Device must be paired. Name syncs after change.

# HISTORY

idevicename is part of **libimobiledevice** for iOS device property management.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [ideviceinfo](/man/ideviceinfo)(1), [idevicepair](/man/idevicepair)(1)
