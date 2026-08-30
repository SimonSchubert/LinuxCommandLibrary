# TAGLINE

Multiple GNOME terminals in one window

# TLDR

Start terminator

```terminator```

Start **maximised**

```terminator --maximise```

Start **full screen**

```terminator --fullscreen```

Start **without window decorations**

```terminator --borderless```

Start from a **saved layout**

```terminator --layout [layout_name]```

Start with a particular **profile**

```terminator --profile [profile_name]```

**Run a command** in the new window

```terminator --command "[command]"```

Start in a given **working directory**

```terminator --working-directory [path/to/directory]```

Set the **window title**

```terminator --title "[title]"```

Split the current terminal **left and right**

```Ctrl+Shift+E```

Split the current terminal **top and bottom**

```Ctrl+Shift+O```

Move between the **split panes**

```Alt+Arrow keys```

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

# INSTALL

```dnf: sudo dnf install terminator```

```pacman: sudo pacman -S terminator```

```apk: sudo apk add terminator```

```zypper: sudo zypper install terminator```

```brew: brew install terminator```

```nix: nix profile install nixpkgs#terminator```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gnome-terminal](/man/gnome-terminal)(1), [tmux](/man/tmux)(1), [screen](/man/screen)(1), [konsole](/man/konsole)(1)
