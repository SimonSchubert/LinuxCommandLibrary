# TLDR

**Start kitty**

```kitty```

**Start with command**

```kitty [command]```

**Open new window**

```kitty @ new-window```

**New tab**

```kitty @ new-tab```

**List windows**

```kitty @ ls```

**Send text to window**

```kitty @ send-text "[text]"```

**Change config option**

```kitty @ set-config [option] [value]```

# SYNOPSIS

**kitty** [_options_] [_command_]

# PARAMETERS

_COMMAND_
> Command to run in terminal.

**@**
> Remote control prefix.

**--config** _FILE_
> Configuration file.

**--start-as** _MODE_
> Window mode (normal, fullscreen, maximized).

**-o** _OPTION=VALUE_
> Set config option.

**--help**
> Display help information.

# DESCRIPTION

**kitty** is a GPU-accelerated terminal emulator. It renders using OpenGL for smooth performance.

The terminal supports images, ligatures, and extensible kitten programs. It's highly configurable and scriptable.

kitty is GPU-based terminal.

# CAVEATS

Requires GPU support. Custom terminfo. Extensive configuration options.

# HISTORY

kitty was created by **Kovid Goyal** as a fast, feature-rich terminal emulator leveraging modern GPU capabilities.

# SEE ALSO

[alacritty](/man/alacritty)(1), [wezterm](/man/wezterm)(1), [tmux](/man/tmux)(1)
