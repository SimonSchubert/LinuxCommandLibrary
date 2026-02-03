# TLDR

**Start new terminal**

```wezterm start```

**Connect to SSH**

```wezterm ssh [user@host]```

**Connect to serial port**

```wezterm serial [/dev/ttyUSB0]```

**Spawn new tab**

```wezterm cli spawn```

**Split pane**

```wezterm cli split-pane --right```

**List panes**

```wezterm cli list```

# SYNOPSIS

**wezterm** [_command_] [_options_]

# PARAMETERS

**start**
> Start new terminal.

**ssh** _destination_
> SSH connection.

**serial** _port_
> Serial port connection.

**cli spawn**
> Create new tab.

**cli split-pane**
> Split current pane.

**cli list**
> List windows/tabs/panes.

**--config** _key=value_
> Override configuration.

# DESCRIPTION

**wezterm** is a GPU-accelerated terminal emulator with multiplexing. Supports tabs, splits, SSH, and serial connections. Cross-platform with Lua configuration and extensive customization.

# SEE ALSO

[alacritty](/man/alacritty)(1), [kitty](/man/kitty)(1), [tmux](/man/tmux)(1)

