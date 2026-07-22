# TAGLINE

lists connected iOS device identifiers

# TLDR

**List connected devices**

```idevice_id -l```

**Show device UDID**

```idevice_id```

**List in simple mode**

```idevice_id -l -n```

**Debug output**

```idevice_id -d -l```

# SYNOPSIS

**idevice_id** [_options_]

# PARAMETERS

**-l**, **--list**
> List device UDIDs.

**-n**, **--network**
> Include network devices.

**-d**, **--debug**
> Debug output.

**-u** _UDID_
> Target device.

**--help**
> Display help information.

# DESCRIPTION

**idevice_id** lists connected iOS device identifiers. It detects iPhones, iPads, and iPods via USB or network.

The tool provides UDIDs needed for other libimobiledevice commands. It's the first step in iOS device management.

# CAVEATS

Part of libimobiledevice. Requires USB access. May need pairing.

# HISTORY

idevice_id is part of **libimobiledevice**, the open-source iOS device communication library.

# INSTALL

```apt: sudo apt install libimobiledevice-utils```

```dnf: sudo dnf install libimobiledevice-utils```

```apk: sudo apk add libimobiledevice-progs```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[idevicepair](/man/idevicepair)(1), [ideviceinfo](/man/ideviceinfo)(1), [idevicename](/man/idevicename)(1)
