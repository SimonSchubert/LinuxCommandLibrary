# TLDR

**List** all connected devices

```adb devices```

List devices with **extended info**

```adb devices -l```

# SYNOPSIS

**adb devices** [_-l_]

# DESCRIPTION

**adb devices** lists all Android devices currently connected to the computer, whether via USB or wireless connection. The output shows device serial numbers and their connection states.

Device states include: **device** (connected and ready), **offline** (not responding), **unauthorized** (USB debugging not authorized), **no permissions** (Linux udev rules issue), and **bootloader** (in fastboot mode).

# PARAMETERS

**-l**
> Long output format showing additional device information (product, model, device, transport_id)

# OUTPUT FORMAT

```
List of devices attached
[serial]    [state]
```

With -l flag:
```
[serial]    [state] product:[name] model:[name] device:[name] transport_id:[id]
```

# CAVEATS

Devices showing "unauthorized" require you to accept the RSA key prompt on the device. "No permissions" errors on Linux usually require udev rules for your device. Emulators appear as emulator-5554 or similar.

# HISTORY

The **adb devices** command has been part of adb since its initial release with the Android SDK in **2008**. The -l flag for extended information was added later to help distinguish between multiple devices of the same model.

# SEE ALSO

[adb](/man/adb)(1), [adb-connect](/man/adb-connect)(1), [fastboot](/man/fastboot)(1)
