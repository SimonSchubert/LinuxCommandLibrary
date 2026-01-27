# TLDR

**Start stalonetray** with default settings

```stalonetray```

**Start with custom background color**

```stalonetray --background "[#2e3440]"```

**Start with custom icon size**

```stalonetray --icon-size [32]```

**Start with window strut** to reserve screen space

```stalonetray --window-strut [auto]```

**Start in dockapp mode** for WindowMaker

```stalonetray --dockapp-mode [wmaker]```

**Start with icons growing from bottom-right**

```stalonetray --icon-gravity [SE]```

**Use a custom configuration file**

```stalonetray --config [~/.config/stalonetray/stalonetrayrc]```

# SYNOPSIS

**stalonetray** [_options_]

# PARAMETERS

**-bg**, **--background** _color_
> Tray background color (hex triplet or X11 color name).

**-i**, **--icon-size** _n_
> Default icon size in pixels. Default: 24, minimum: 16.

**--icon-gravity** _gravity_
> Icon positioning gravity: **NW**, **NE**, **SW**, or **SE**. Default: NW.

**--grow-gravity** _gravity_
> Direction for tray growth: **NW**, **NE**, **SW**, **SE**, **N**, **S**, **E**, or **W**.

**--geometry** _geometry_
> Initial tray window geometry (WIDTHxHEIGHT+X+Y).

**--max-geometry** _geometry_
> Maximum tray dimensions.

**--window-type** _type_
> EWMH window type: **desktop**, **dock**, **normal**, **toolbar**, **utility**. Default: dock.

**--window-strut** _mode_
> Reserve screen space: **auto**, **top**, **bottom**, **left**, **right**, or **none**.

**-d**, **--dockapp-mode** _mode_
> Dockapp mode: **none**, **simple**, or **wmaker**.

**--slot-size** _size_
> Grid slot size for icon placement.

**--sticky**
> Make tray window appear on all desktops.

**--skip-taskbar**
> Remove tray window from taskbar.

**--kludges** _list_
> Enable workarounds: fix_window_pos, force_icons_size, use_icons_hints.

**--log-level** _level_
> Logging verbosity: **err**, **info**, or **trace**.

**-c**, **--config** _file_
> Configuration file path.

# DESCRIPTION

**stalonetray** is a stand-alone system tray (notification area) implementation for X11. It provides a minimalist tray that works with any EWMH-compliant window manager, making it ideal for lightweight setups or window managers without built-in system trays.

The tray supports the freedesktop.org System Tray Protocol and XEMBED specification for embedding application icons. It can be positioned anywhere on screen and configured to reserve space (struts) so other windows don't overlap it.

Configuration can be done via command-line options or a configuration file at **~/.stalonetrayrc**. The file uses keyword-argument pairs with command-line options taking precedence.

# CAVEATS

Some applications may not properly support the system tray protocol, requiring **--kludges** options. Window type **dock** may behave differently across window managers. Build requires only Xlib and optionally libXinerama. The trace log level requires building with --enable-debug.

# HISTORY

**stalonetray** was created as a minimal, dependency-free system tray implementation for X11. It fills the need for a system tray in window managers that don't provide one natively, such as i3, bspwm, or dwm. The project follows the freedesktop.org specifications for system tray interoperability.

# SEE ALSO

[trayer](/man/trayer)(1), [tint2](/man/tint2)(1), [polybar](/man/polybar)(1)
