# TAGLINE

Highly configurable tiling window manager for X11

# TLDR

**Start awesome** window manager

```awesome```

**Start with a specific configuration** file

```awesome -c [~/.config/awesome/rc.lua]```

**Check configuration** for errors

```awesome -k```

**Check specific config file** for errors

```awesome -k -c [path/to/rc.lua]```

**Display version** information

```awesome -v```

**Replace a running window manager**

```awesome --replace```

# SYNOPSIS

**awesome** [**-v** | **--version**] [**-h** | **--help**] [**-c** | **--config** _FILE_] [**-k** | **--check**] [**--search** _DIR_] [**--no-argb**] [**--replace**]

# PARAMETERS

**-v**, **--version**
> Display version information and exit

**-h**, **--help**
> Display help message and exit

**-c** _FILE_, **--config** _FILE_
> Use specified Lua configuration file instead of default

**-k**, **--check**
> Check configuration file syntax and exit

**--search** _DIR_
> Add directory to Lua library search path

**--no-argb**
> Disable ARGB visuals (transparency)

**--replace**
> Replace an existing window manager

**-a**, **--no-argb**
> Disable composite manager visual effects

# DESCRIPTION

**awesome** is a highly configurable, tiling window manager for X11. It manages windows in tiled, floating, and other layouts, maximizing screen space efficiency for keyboard-driven workflows.

Configuration is done through **~/.config/awesome/rc.lua** using the Lua programming language, allowing extensive customization of layouts, keybindings, widgets, and appearance. The default configuration provides a functional starting point with sensible defaults.

Key concepts include tags (virtual desktops), layouts (tiling algorithms), and widgets (status bar components). The Mod4 key (typically Windows/Super key) is the default modifier for keybindings.

Default keybindings include:
- **Mod4 + Enter**: Open terminal
- **Mod4 + r**: Run prompt
- **Mod4 + j/k**: Focus next/previous client
- **Mod4 + Shift + c**: Close focused client
- **Mod4 + Space**: Cycle layouts
- **Mod4 + 1-9**: Switch to tag

The window manager includes a built-in menu, notification system, and status bar with system information.

# CONFIGURATION

**~/.config/awesome/rc.lua**
> Main configuration file written in Lua. Controls layouts, keybindings, widgets, themes, and all window manager behavior.

# CAVEATS

Requires X11; does not support Wayland. Configuration errors in rc.lua will cause awesome to fall back to defaults. Some features require a compositor for transparency effects. The learning curve for Lua configuration can be steep for new users.

# HISTORY

**awesome** was created by **Julien Danjou** and first released in **2007**. It was designed as a successor to dwm with greater extensibility through Lua scripting. The name is a playful reference to being "awesome" rather than just "good." The project continues active development with a focus on stability and customization.

# SEE ALSO

[i3](/man/i3)(1), [dwm](/man/dwm)(1), [bspwm](/man/bspwm)(1), [xmonad](/man/xmonad)(1), [lua](/man/lua)(1)
