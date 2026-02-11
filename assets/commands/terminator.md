# TAGLINE

Multiple GNOME terminals in one window

# TLDR

**Start** terminator window

```terminator```

**Start** with a fullscreen window

```terminator -f```

**Split** terminals horizontally

```Ctrl+Shift+O```

**Split** terminals vertically

```Ctrl+Shift+E```

**Open** new tab

```Ctrl+Shift+T```

# SYNOPSIS

**terminator** [_options_]

# PARAMETERS

**-f, --fullscreen**
> Start in fullscreen mode

**-m, --maximise**
> Start maximized

**-b, --borderless**
> Start without window decorations

**-T, --title _title_**
> Set window title

**-e, --command _command_**
> Run command in the terminal

**-l, --layout _layout_**
> Load a specific layout

**-p, --profile _profile_**
> Use specified profile

**-g, --config _file_**
> Use alternate config file

# DESCRIPTION

**terminator** is a terminal emulator that allows arranging multiple GNOME terminals in a single window. Terminals can be split horizontally and vertically, organized into tabs, and resized dynamically.

Key bindings allow quick navigation and manipulation of the terminal grid. Layouts and profiles can be saved and restored for consistent workspace setups.

# CAVEATS

Requires a graphical environment. Configuration is stored in **~/.config/terminator/**. Some key bindings may conflict with applications running in the terminal.

# SEE ALSO

[gnome-terminal](/man/gnome-terminal)(1), [tmux](/man/tmux)(1), [screen](/man/screen)(1), [konsole](/man/konsole)(1)
