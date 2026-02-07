# TAGLINE

Terminal user interface for Bluetooth management

# TLDR

**Start** the Bluetooth TUI

```bluetui```

Display **help**

```bluetui -h```

# SYNOPSIS

**bluetui** [_options_]

# DESCRIPTION

**bluetui** is a terminal user interface for managing Bluetooth devices. It provides an interactive way to scan for devices, pair, connect, and manage Bluetooth connections without using the command-line bluetoothctl tool directly.

The TUI displays available devices, paired devices, and connection status in a user-friendly terminal interface.

# PARAMETERS

**-h, --help**
> Display help information

# CAVEATS

Requires the Bluetooth daemon (bluetoothd) to be running. May require appropriate permissions to access Bluetooth adapter.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1), [bluetoothd](/man/bluetoothd)(8)
