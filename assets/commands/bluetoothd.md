# TAGLINE

Bluetooth system daemon

# TLDR

**Start** the daemon

```bluetoothd```

Start the daemon, **logging to stdout**

```bluetoothd -n```

Start with a **specific configuration** file

```bluetoothd -f [path/to/file]```

Start with **verbose debug** output

```bluetoothd -d```

Start with debug output from **specific source files**

```bluetoothd -d=[path/to/file1:path/to/file2]```

# SYNOPSIS

**bluetoothd** [_options_]

# DESCRIPTION

**bluetoothd** is the Bluetooth system daemon that manages Bluetooth devices, connections, and services. It handles device discovery, pairing, and connection management for all Bluetooth functionality on the system.

The daemon is typically started automatically by systemd. It reads configuration from **/etc/bluetooth/main.conf** and manages the Bluetooth adapter(s) and connected devices.

# PARAMETERS

**-n, --nodetach**
> Run in the foreground; do not detach and become a daemon. Log goes to stdout.

**-f, --configfile** _file_
> Use alternate configuration file instead of /etc/bluetooth/main.conf.

**-d, --debug** [_files_]
> Enable debug output, optionally limited to a colon-separated list of source files.

**-E, --experimental**
> Enable experimental D-Bus interfaces and features.

**-p, --plugin** _name_
> Specify plugins to load

**-P, --noplugin** _name_
> Specify plugins to exclude

# CONFIGURATION

**/etc/bluetooth/main.conf**
> Main configuration file controlling device class, name, pairing timeout, discoverable mode, and adapter defaults.

# CAVEATS

Usually managed by systemd; manual invocation rarely needed. Requires root privileges. Configuration changes require daemon restart. Debug mode generates extensive output.

# HISTORY

**bluetoothd** is part of **BlueZ**, the official Linux Bluetooth protocol stack maintained since the early **2000s**. It replaced the older per-profile daemons of BlueZ 4 with a single plugin-based daemon in BlueZ 5 (**2012**), exposing its functionality over D-Bus.

# INSTALL

```apt: sudo apt install bluez```

```dnf: sudo dnf install bluez```

```pacman: sudo pacman -S bluez```

```zypper: sudo zypper install bluez```

```brew: brew install bluez```

```nix: nix profile install nixpkgs#bluez```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [hcitool](/man/hcitool)(1)

# RESOURCES

```[Homepage](http://www.bluez.org/)```

```[Source code](https://github.com/bluez/bluez)```

<!-- verified: 2026-06-19 -->
