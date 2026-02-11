# TAGLINE

Display X11 window properties

# TLDR

**Click to select a window** and display its properties

```xprop```

**Display properties of the root window**

```xprop -root```

**Display properties of a window by ID**

```xprop -id [0x200007]```

**Display properties of a window by name**

```xprop -name "[window_name]"```

**Display a specific property**

```xprop -root WM_NAME```

**Monitor property changes** continuously

```xprop -spy -id [window_id]```

**Set a property** on a window

```xprop -root -set [PROPERTY_NAME] "[value]"```

**Remove a property** from a window

```xprop -root -remove [PROPERTY_NAME]```

# SYNOPSIS

**xprop** [_-display display_] [_-id id_] [_-name name_] [_-root_] [_-frame_] [_-spy_] [_property ..._]

# PARAMETERS

**-display** _display_
> Connect to the specified X server.

**-id** _id_
> Query window by numeric ID (decimal or hex with 0x prefix).

**-name** _name_
> Query window by its WM_NAME property (title).

**-root**
> Display properties of the root window (desktop).

**-frame**
> Select the window manager frame instead of the client window.

**-len** _n_
> Limit output to the first n bytes per property.

**-notype**
> Don't print property types, only names and values.

**-spy**
> Monitor for property change events continuously.

**-set** _property_ _value_
> Set a property on the window.

**-remove** _property_
> Remove a property from the window.

**-f** _atom_ _format_ [_dformat_]
> Specify format for interpreting a property.

**-version**
> Print version and exit.

# DESCRIPTION

**xprop** displays properties of X Window System windows. Properties are arbitrary data that applications and window managers use to communicate, such as window titles (WM_NAME), window classes (WM_CLASS), and window states.

When invoked without **-id**, **-name**, or **-root**, xprop displays a crosshair cursor allowing interactive window selection by clicking. Specific properties can be listed as arguments to display only those.

Common properties include WM_NAME (title), WM_CLASS (application class), WM_STATE, _NET_WM_PID, and various Extended Window Manager Hints (_NET_WM_*).

# CAVEATS

xprop only works with X11 windows; Wayland applications may not expose properties the same way. Window IDs can be obtained from **xwininfo** or **xdotool**. Property names are case-sensitive.

# HISTORY

xprop is part of the standard X.Org utility collection and has been included with X Window System distributions since the early X11 releases in the **1980s**. It remains an essential debugging and scripting tool for X11 environments.

# SEE ALSO

[xwininfo](/man/xwininfo)(1), [xdotool](/man/xdotool)(1), [wmctrl](/man/wmctrl)(1), [xdpyinfo](/man/xdpyinfo)(1)
