# TAGLINE

Pair with an Android device for wireless debugging

# TLDR

**Pair** with a device using pairing code

```adb pair [192.168.1.100]:[port]```

# SYNOPSIS

**adb pair** _host_:_port_ [_pairing_code_]

# DESCRIPTION

**adb pair** establishes a secure wireless debugging connection with an Android 11+ device using a pairing code. This eliminates the need for initial USB connection to enable wireless debugging.

To use this feature, enable "Wireless debugging" in Developer Options on the device, then tap "Pair device with pairing code" to get the pairing port and code. After pairing, use **adb connect** with the connection port shown in Wireless debugging settings.

# PARAMETERS

**host**
> IP address of the Android device

**port**
> Pairing port shown on the device (different from connection port)

**pairing_code**
> Six-digit code shown on device (prompted if not provided)

# CAVEATS

Only available on Android 11 (API 30) and later. The pairing port is different from the connection port used with **adb connect**. Pairing codes expire quickly. Both devices must be on the same network.

# HISTORY

Wireless debugging with pairing was introduced in Android 11, released in **2020**. This feature was designed to improve the developer experience by removing the requirement for initial USB connection.

# SEE ALSO

[adb](/man/adb)(1), [adb-connect](/man/adb-connect)(1), [adb-disconnect](/man/adb-disconnect)(1)
