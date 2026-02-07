# TAGLINE

wireless Android device connector

# TLDR

**Connect** to a device over Wi-Fi

```adb connect [192.168.1.100]:5555```

Connect using **default port** (5555)

```adb connect [192.168.1.100]```

Connect to **emulator**

```adb connect [localhost]:5554```

# SYNOPSIS

**adb connect** _host_[:_port_]

# DESCRIPTION

**adb connect** establishes a TCP/IP connection to an Android device for wireless debugging. Once connected, you can use all adb commands over the network instead of USB.

Before connecting wirelessly, the device typically needs to be configured via USB first using **adb tcpip 5555** to enable TCP/IP mode. Android 11+ supports direct wireless pairing without initial USB connection.

# PARAMETERS

**host**
> IP address or hostname of the Android device

**port**
> TCP port number (default: 5555)

# CAVEATS

Both computer and device must be on the same network. The device reverts to USB mode after reboot, requiring reconfiguration. Wireless connections are less secure than USB; use only on trusted networks. Connection may be slow compared to USB.

# HISTORY

Wireless ADB debugging has been available since early Android versions but required initial USB setup. Android 11 (released **2020**) introduced wireless debugging with pairing codes, eliminating the USB requirement.

# SEE ALSO

[adb](/man/adb)(1), [adb-disconnect](/man/adb-disconnect)(1), [adb-pair](/man/adb-pair)(1), [adb-devices](/man/adb-devices)(1)
