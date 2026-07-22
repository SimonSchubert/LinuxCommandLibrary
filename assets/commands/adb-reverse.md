# TAGLINE

Set up reverse port forwarding from device to host

# TLDR

**Reverse forward** device port to local port

```adb reverse tcp:[8080] tcp:[8080]```

**List** all reverse forwards

```adb reverse --list```

**Remove** a specific reverse forward

```adb reverse --remove tcp:[8080]```

Remove **all** reverse forwards

```adb reverse --remove-all```

# SYNOPSIS

**adb reverse** [_--no-rebind_] _remote_ _local_

**adb reverse** --list | --remove _remote_ | --remove-all

# DESCRIPTION

**adb reverse** sets up reverse port forwarding from the Android device to your computer. This allows apps on the device to connect to services running on your development machine as if they were running locally on the device.

This is commonly used for connecting React Native apps to the Metro bundler, or allowing device apps to access local development servers.

# PARAMETERS

**tcp:**_port_
> TCP port number

**localabstract:**_name_
> Unix domain socket in abstract namespace

**--no-rebind**
> Fail if remote port is already forwarded

**--list**
> List all active reverse forwards

**--remove** _remote_
> Remove specific reverse forward rule

**--remove-all**
> Remove all reverse forward rules

# CAVEATS

Reverse forwarding is available on Android 5.0+ only. The feature requires the adb server to maintain the connection. Reverse forwards are lost when the device disconnects or adb server restarts.

# HISTORY

**adb reverse** was added in Android 5.0 Lollipop (**2014**) to support development workflows where device apps need to connect to services on the development machine.

# INSTALL

```apt: sudo apt install adb```

```dnf: sudo dnf install android-tools```

```pacman: sudo pacman -S android-tools```

```apk: sudo apk add android-tools-adb```

```zypper: sudo zypper install android-tools```

```nix: nix profile install nixpkgs#android-tools```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[adb](/man/adb)(1), [adb-forward](/man/adb-forward)(1), [adb-shell](/man/adb-shell)(1), [scrcpy](/man/scrcpy)(1)

# RESOURCES

```[Source code](https://android.googlesource.com/platform/packages/modules/adb/)```

```[Documentation](https://developer.android.com/tools/adb)```

<!-- verified: 2026-06-11 -->
