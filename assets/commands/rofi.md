# TAGLINE

Application launcher and window switcher

# TLDR

Show **application** launcher

```rofi -show drun```

Show **command** launcher

```rofi -show run```

**Switch** windows

```rofi -show window```

Use as **dmenu** replacement

```printf "Choice1\nChoice2\nChoice3" | rofi -dmenu```

# SYNOPSIS

**rofi** [**-show** _mode_] [**-dmenu**] [**-theme** _theme_]

# MODES

**drun**
> Desktop application launcher

**run**
> Command launcher

**window**
> Window switcher

**ssh**
> SSH connection manager

**keys**
> Keybinding viewer

**combi**
> Combined modes

# PARAMETERS

**-show _mode_**
> Show specified mode

**-dmenu**
> Run as dmenu replacement

**-theme _theme_**
> Use specified theme

**-modi _modes_**
> Enable specified modes

**-matching _method_**
> Match method (fuzzy, regex, glob, normal)

**-i**
> Case insensitive matching

# DESCRIPTION

**rofi** is a versatile application launcher and window switcher. It provides a searchable interface for launching programs, switching windows, running commands, and more.

The tool is highly customizable with themes and supports scripting via the dmenu mode. It's popular in tiling window manager setups as a replacement for dmenu.

# CONFIGURATION

**~/.config/rofi/config.rasi**
> Main configuration file in rasi format, controlling modes, keybindings, matching behavior, and default settings.

**~/.config/rofi/themes/**
> Directory for custom theme files that control appearance, colors, fonts, and layout.

**~/.local/share/rofi/themes/**
> Additional theme search path for user-installed themes.

# CAVEATS

Requires X11 (Wayland support via rofi-wayland). Configuration in ~/.config/rofi/. Themes control appearance extensively. Scripts can extend functionality.

# HISTORY

**rofi** was created by **Dave Davenport** as a more feature-rich alternative to dmenu. It has become a standard component in many Linux desktop configurations.

# SEE ALSO

[dmenu](/man/dmenu)(1), [wofi](/man/wofi)(1), [fuzzel](/man/fuzzel)(1)
