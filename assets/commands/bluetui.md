# TAGLINE

Terminal user interface for Bluetooth management

# TLDR

**Start the Bluetooth TUI**

```bluetui```

**Start with a custom config file**

```bluetui -c [/path/to/config.toml]```

**Display help**

```bluetui -h```

# SYNOPSIS

**bluetui** [_options_]

# PARAMETERS

**-c** _path_
> Use custom configuration file.

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Display version information.

# KEYBOARD COMMANDS

**Tab** or **l**
> Switch to next section.

**Shift+Tab** or **h**
> Switch to previous section.

**j**/**k** or **Down**/**Up**
> Navigate device list.

**Space** or **Enter**
> Connect/disconnect or pair device.

**s**
> Start/stop scanning.

**t**
> Toggle adapter power.

**q**
> Quit.

# DESCRIPTION

**bluetui** is a terminal user interface for managing Bluetooth devices. It provides an interactive way to scan for devices, pair, connect, and manage Bluetooth connections without using the command-line bluetoothctl tool directly.

The TUI displays adapter information, available devices, paired devices, and connection status. It supports device pairing/unpairing, renaming, power management, and discoverability settings.

# CONFIGURATION

**~/.config/bluetui/config.toml**
> Configuration file for customizing keybindings and behavior.

# CAVEATS

Requires the Bluetooth daemon (bluetoothd) to be running. May require appropriate permissions to access the Bluetooth adapter. Written in Rust using the Ratatui framework.

# SEE ALSO

[bluetoothctl](/man/bluetoothctl)(1)
