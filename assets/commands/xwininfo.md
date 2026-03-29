# TAGLINE

Display X11 window information

# TLDR

**Get window info by clicking** on it

```xwininfo```

**Get root window info**

```xwininfo -root```

**Get all info** for a window selected by clicking

```xwininfo -all```

**Get by window ID**

```xwininfo -id [0x12345]```

**Get by window name**

```xwininfo -name "[Window Name]"```

**Show the full window tree** recursively from root

```xwininfo -root -tree```

**Display window IDs as integers** instead of hexadecimal

```xwininfo -int```

**Show window manager hints** for a specific window

```xwininfo -wm -id [0x12345]```

# SYNOPSIS

**xwininfo** [_-help_] [_-id wid_] [_-root_] [_-name wdname_] [_-int_] [_-children_] [_-tree_] [_-stats_] [_-bits_] [_-events_] [_-size_] [_-wm_] [_-shape_] [_-frame_] [_-all_] [_-english_] [_-metric_] [_-display host:dpy_] [_-version_]

# PARAMETERS

**-root**
> Select the root window as the target without using the cursor.

**-id** _wid_
> Specify the target window by its X window ID.

**-name** _wdname_
> Specify the target window by name.

**-int**
> Display all X window IDs as integer values. Default is hexadecimal.

**-children**
> Display the root, parent, and children windows' IDs and names.

**-tree**
> Like -children, but display all children recursively.

**-stats**
> Display location and appearance attributes including size, position, depth, and visual info. This is the default if no options are specified.

**-bits**
> Display bit gravity, window gravity, backing-store, and save-under attributes.

**-events**
> Display the selected window's event masks.

**-size**
> Display sizing hints including minimum, maximum, and resize increment sizes.

**-wm**
> Display window manager hints including input model, icon info, and initial state.

**-shape**
> Display the window and border shape extents.

**-frame**
> Consider window manager frames when manually selecting windows.

**-metric**
> Display dimensions in millimeters as well as number of pixels.

**-english**
> Display dimensions in inches as well as number of pixels.

**-all**
> Show all available information.

**-display** _host:dpy_
> Specify the X server to connect to.

**-version**
> Print version information and exit.

# DESCRIPTION

**xwininfo** displays detailed information about X11 windows, including geometry (size and position), window ID, depth, visual class, and colormap. When run without arguments, it presents a crosshair cursor for interactive window selection by clicking.

Specific windows can be targeted using **-id** for a window ID, **-name** for a window title, or **-root** for the root window. The **-tree** option displays the complete window hierarchy, showing how windows are nested within each other. If no information option is specified, **-stats** is assumed. The tool is commonly used for debugging window managers and scripting X11 window operations.

# CAVEATS

X11 only. Does not work on Wayland. Part of the x11-utils package (or xorg-xwininfo on Arch).

# HISTORY

**xwininfo** is a standard X11 utility for displaying information about windows.

# SEE ALSO

[xprop](/man/xprop)(1), [xdotool](/man/xdotool)(1), [xlsclients](/man/xlsclients)(1), [xdpyinfo](/man/xdpyinfo)(1), [xkill](/man/xkill)(1), [wmctrl](/man/wmctrl)(1)
