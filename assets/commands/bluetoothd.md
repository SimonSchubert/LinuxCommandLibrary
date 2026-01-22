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
> Do not daemonize; log to stdout

**-f, --configfile** _file_
> Use alternate configuration file

**-d, --debug**
> Enable verbose debug output

**-p, --plugin** _name_
> Specify plugins to load

**-P, --noplugin** _name_
> Specify plugins to exclude

# CAVEATS

Usually managed by systemd; manual invocation rarely needed. Requires root privileges. Configuration changes require daemon restart. Debug mode generates extensive output.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [hciconfig](/man/hciconfig)(1), [hcitool](/man/hcitool)(1)
