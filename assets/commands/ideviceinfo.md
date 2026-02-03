# TLDR

**Show all device information**

```ideviceinfo```

**Show specific domain**

```ideviceinfo -q [com.apple.disk_usage]```

**Output as XML**

```ideviceinfo -x```

**Connect to specific device**

```ideviceinfo -u [device-udid]```

**Show simple key-value output**

```ideviceinfo -s```

**Connect over network**

```ideviceinfo -n```

# SYNOPSIS

**ideviceinfo** [_options_]

# PARAMETERS

**-u** _udid_
> Target specific device by UDID.

**-q** _domain_
> Query specific domain.

**-k** _key_
> Show only specific key.

**-x**
> Output as XML plist.

**-s**
> Simple key-value output.

**-n**
> Connect over network.

**-d**
> Enable debug output.

# DESCRIPTION

**ideviceinfo** displays detailed information about connected iOS devices. Part of the libimobiledevice suite. Shows over 100 parameters including ProductVersion, DeviceName, HardwareModel, WiFiAddress, and more. Requires the device to be trusted (unlocked and paired).

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicebackup2](/man/idevicebackup2)(1)

