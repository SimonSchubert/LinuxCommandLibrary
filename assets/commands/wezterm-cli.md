# TAGLINE

WezTerm terminal control CLI

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

# CONFIGURATION

**~/.wezterm.lua** or **~/.config/wezterm/wezterm.lua**
> Lua-based configuration file for keybindings, fonts, colors, multiplexer settings, and SSH domains.

# DESCRIPTION

**wezterm** is a GPU-accelerated terminal emulator and multiplexer. It supports tabs, split panes, SSH and serial connections, and image display (sixel, iTerm2 protocol). Configuration is done via Lua scripts, enabling dynamic behavior and complex key mappings.

The `wezterm cli` subcommands control a running wezterm instance, allowing scripted pane management similar to tmux.

# CAVEATS

The `cli` subcommands require a running wezterm instance with the mux server enabled. Lua configuration errors prevent the terminal from starting; use `wezterm --config-file` to test alternate configs.

# SEE ALSO

[alacritty](/man/alacritty)(1), [kitty](/man/kitty)(1), [tmux](/man/tmux)(1)

