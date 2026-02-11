# TAGLINE

GPU-accelerated terminal emulator

# TLDR

**Start terminal**

```wezterm```

**Start with command**

```wezterm start -- [command]```

**Open new tab**

```wezterm cli spawn```

**Split pane horizontally**

```wezterm cli split-pane --horizontal```

**Split pane vertically**

```wezterm cli split-pane```

**List tabs**

```wezterm cli list```

**Connect to remote**

```wezterm connect [host]```

**Show configuration**

```wezterm show-keys```

# SYNOPSIS

**wezterm** [_start_] [_cli_] [_connect_] [_options_] [_-- command_]

# PARAMETERS

**start** [_--_] _CMD_
> Start terminal with command.

**cli spawn**
> Open new tab.

**cli split-pane**
> Split current pane.

**cli list**
> List panes/tabs.

**connect** _HOST_
> Connect to multiplexer.

**ssh** _DEST_
> SSH connection.

**serial** _PORT_
> Serial connection.

**show-keys**
> Show key bindings.

**--config** _KEY=VALUE_
> Override config.

**--config-file** _FILE_
> Config file path.

# DESCRIPTION

**wezterm** is a GPU-accelerated terminal emulator. Written in Rust, it's cross-platform and highly configurable.

Configuration uses Lua scripts. Keybindings, appearance, and behavior are programmable with full scripting capability.

Multiplexing is built-in. Tabs and panes work without tmux. Sessions persist and can be reattached.

Remote multiplexing connects to wezterm running on other machines. Local terminal controls remote sessions.

GPU rendering provides smooth scrolling and efficient display. Ligatures, emoji, and Nerd Fonts work correctly.

Hyperlinks are clickable. URLs, file paths, and custom patterns can be configured as clickable links.

# CAVEATS

Lua config has learning curve. Some features are cross-platform only. GPU acceleration needs compatible drivers.

# HISTORY

**WezTerm** was created by **Wez Furlong** (wez) around **2018**. It combines modern rendering with powerful multiplexing, positioning itself between simple terminals and full terminal multiplexers.

# SEE ALSO

[alacritty](/man/alacritty)(1), [kitty](/man/kitty)(1), [tmux](/man/tmux)(1), [foot](/man/foot)(1)
