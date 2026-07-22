# TAGLINE

wireless Android device disconnector

# TLDR

**Disconnect** from a specific device

```adb disconnect [192.168.1.100]:5555```

Disconnect from **all** wireless devices

```adb disconnect```

# SYNOPSIS

**adb disconnect** [_host_[:_port_]]

# DESCRIPTION

**adb disconnect** terminates wireless adb connections. When called without arguments, it disconnects all connected TCP/IP devices. With a specific host and port, it disconnects only that device.

This command only affects wireless connections; USB-connected devices remain connected until physically unplugged.

# PARAMETERS

**host**
> IP address or hostname of the device to disconnect

**port**
> TCP port number (default: 5555)

# CAVEATS

Does not affect USB connections. The device remains in TCP/IP mode after disconnection; you can reconnect using **adb connect** without reconfiguration.

# HISTORY

**adb disconnect** has been available since wireless debugging was introduced in the Android SDK. It provides a clean way to terminate network connections without killing the entire adb server.

# INSTALL

```apt: sudo apt install adb```

```dnf: sudo dnf install android-tools```

```pacman: sudo pacman -S android-tools```

```apk: sudo apk add android-tools-adb```

```zypper: sudo zypper install android-tools```

```nix: nix profile install nixpkgs#android-tools```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[adb](/man/adb)(1), [adb-connect](/man/adb-connect)(1), [adb-pair](/man/adb-pair)(1), [adb-kill-server](/man/adb-kill-server)(1)

# RESOURCES

```[Source code](https://android.googlesource.com/platform/packages/modules/adb/)```

```[Documentation](https://developer.android.com/tools/adb)```

<!-- verified: 2026-06-11 -->
