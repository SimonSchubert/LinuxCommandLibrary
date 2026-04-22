# TAGLINE

display information from a connected iOS device (libimobiledevice)

# TLDR

**Show every available property** of the first connected device

```ideviceinfo```

**Target a specific device by UDID**

```ideviceinfo -u [device-udid]```

**Query a specific key only**

```ideviceinfo -k [ProductVersion]```

**Query a specific Lockdown domain**

```ideviceinfo -q [com.apple.disk_usage]```

**Output as an XML property list**

```ideviceinfo -x```

**Connect to a device over the network** (Wi-Fi pairing)

```ideviceinfo -n```

**Simple/unpaired connection** (skip auto-pairing)

```ideviceinfo -s```

# SYNOPSIS

**ideviceinfo** [_options_]

# PARAMETERS

**-u**, **--udid** _UDID_
> Target a specific device by its UDID. Required when more than one device is connected.

**-q**, **--domain** _NAME_
> Restrict the query to the given Lockdown domain (e.g. `com.apple.disk_usage`, `com.apple.mobile.battery`, `com.apple.mobile.wireless_lockdown`).

**-k**, **--key** _NAME_
> Only print the value of the given key. Prints the raw value with no key header.

**-x**, **--xml**
> Emit output as an Apple XML plist instead of `key: value` lines. Useful for scripting.

**-s**, **--simple**
> Use a simple Lockdown connection that does not pair with the device. A smaller subset of keys is available.

**-n**, **--network**
> Connect to a device paired over Wi-Fi instead of USB.

**-d**, **--debug**
> Verbose debugging output from libimobiledevice.

**-h**, **--help**
> Show help.

**-v**, **--version**
> Show version information.

# DESCRIPTION

**ideviceinfo** queries the Lockdown service on a connected iOS (iPhone, iPad, iPod, Apple TV) device and prints its properties. Without a key or domain, it dumps the public root-level keys — `DeviceName`, `ProductType`, `ProductVersion`, `BuildVersion`, `SerialNumber`, `UniqueDeviceID`, `WiFiAddress`, `BluetoothAddress`, and so on.

Per-domain queries (`-q`) unlock protected namespaces like `com.apple.disk_usage` (storage stats) or `com.apple.mobile.battery` (battery info). Most domains require the device to be paired and unlocked.

# CAVEATS

Part of **libimobiledevice**. The device must be **trusted** on the host — i.e. plugged in once while unlocked and the "Trust this computer?" prompt accepted. On macOS, Apple's own `usbmuxd` replaces libimobiledevice's; mixing the two can cause pairing conflicts. Over-the-network (`-n`) only works after Wi-Fi sync is enabled in iTunes/Finder.

# HISTORY

**ideviceinfo** ships with the **libimobiledevice** project — a cross-platform reimplementation of Apple's iTunes/Finder device protocols. Created around **2008** by **Jonathan Beck**, it is now maintained by **Nikias Bassen** and contributors.

# SEE ALSO

[idevice_id](/man/idevice_id)(1), [idevicebackup2](/man/idevicebackup2)(1), [idevicepair](/man/idevicepair)(1), [idevicesyslog](/man/idevicesyslog)(1)
