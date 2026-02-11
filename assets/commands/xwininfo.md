# TAGLINE

Display X11 window information

# TLDR

**Get window info by clicking**

```xwininfo```

**Get root window info**

```xwininfo -root```

**Get by window ID**

```xwininfo -id [0x12345]```

**Get by name**

```xwininfo -name "[Window Name]"```

**Show tree**

```xwininfo -root -tree```

**Stats only**

```xwininfo -stats```

# SYNOPSIS

**xwininfo** [_-root_] [_-id wid_] [_-name name_] [_options_]

# PARAMETERS

**-root**
> Root window.

**-id** _WID_
> Window ID.

**-name** _NAME_
> Window name.

**-tree**
> Show tree.

**-stats**
> Statistics.

**-all**
> All info.

# DESCRIPTION

**xwininfo** displays detailed information about X11 windows, including geometry (size and position), window ID, depth, visual class, and colormap. When run without arguments, it presents a crosshair cursor for interactive window selection by clicking.

Specific windows can be targeted using **-id** for a window ID, **-name** for a window title, or **-root** for the root window. The **-tree** option displays the complete window hierarchy, showing how windows are nested within each other. The tool is commonly used for debugging window managers and scripting X11 window operations.

# CAVEATS

X11 only. No Wayland. Part of xorg-apps.

# HISTORY

**xwininfo** is a standard X11 utility for displaying information about windows.

# SEE ALSO

[xprop](/man/xprop)(1), [xdotool](/man/xdotool)(1), [xlsclients](/man/xlsclients)(1)
