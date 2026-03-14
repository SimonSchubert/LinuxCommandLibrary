# TAGLINE

GPU-accelerated terminal emulator

# TLDR

**Start kitty**

```kitty```

**Start with a specific command**

```kitty [command]```

**Start in a specific directory**

```kitty -d [/path/to/directory]```

**Start with a session layout**

```kitty --session [session.conf]```

**Override a configuration option**

```kitty -o [font_size=14]```

**Open a new window via remote control**

```kitty @ new-window```

**Open a new tab via remote control**

```kitty @ new-tab```

**List all windows as JSON**

```kitty @ ls```

# SYNOPSIS

**kitty** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to run in the terminal.

**@**
> Remote control prefix for sending commands to a running kitty instance.

**--config** _FILE_, **-c** _FILE_
> Path to configuration file(s) to use.

**--override** _OPTION=VALUE_, **-o** _OPTION=VALUE_
> Override individual configuration options.

**--start-as** _MODE_
> Window mode: normal, fullscreen, maximized, minimized.

**--directory** _DIR_, **-d** _DIR_
> Change to the specified directory when launching.

**--session** _FILE_
> Path to a file containing the startup session (tabs, windows, layout, programs).

**--single-instance**, **-1**
> Open a new window in an existing kitty instance if one is running.

**--listen-on** _ADDRESS_
> Listen on the specified address for remote control messages.

**--title** _TITLE_, **-T** _TITLE_
> Set the OS window title.

**--class** _CLS_
> Set the WM_CLASS window property (or Wayland app id).

**--detach**
> Detach from the controlling terminal.

# DESCRIPTION

**kitty** is a fast, feature-rich GPU-accelerated terminal emulator that renders using OpenGL for smooth performance. It supports inline image display, font ligatures, Unicode, multiple layouts, tabs and windows, and extensible kitten programs for specialized tasks. It is highly configurable via kitty.conf and scriptable through its remote control protocol.

# CAVEATS

Requires GPU with OpenGL 3.3+ support. Uses its own terminfo entry (xterm-kitty), which may need to be installed on remote servers for SSH sessions. Remote control requires --listen-on or allow_remote_control in kitty.conf.

# HISTORY

kitty was created by **Kovid Goyal** as a fast, feature-rich terminal emulator leveraging modern GPU capabilities.

# SEE ALSO

[alacritty](/man/alacritty)(1), [wezterm](/man/wezterm)(1), [tmux](/man/tmux)(1)
