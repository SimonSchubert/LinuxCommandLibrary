# TAGLINE

Wayland event viewer for input debugging

# TLDR

Monitor **all** events

```wev```

Filter by **interface**

```wev -f [wl_keyboard]```

Filter specific **events**

```wev -f [wl_keyboard]:[key]```

**Exclude** events

```wev -F [wl_keyboard]:[key]```

Write **keymap** to file

```wev -M [path/to/file]```

Print **globals**

```wev -g```

# SYNOPSIS

**wev** [_OPTIONS_]

# PARAMETERS

**-f** _INTERFACE[:EVENT]_
> Include only specified interface/events. May be specified multiple times.

**-F** _INTERFACE[:EVENT]_
> Exclude specified interface/events. May be specified multiple times.

**-M** _FILE_
> Write keymap to file

**-g**
> Print Wayland globals

# DESCRIPTION

**wev** opens an xdg-shell toplevel window on the default Wayland display (via the **WAYLAND_DISPLAY** environment variable), then prints events associated with that window. It displays keyboard, mouse, touch, and other input events as they occur, similar to **xev** for X11.

This tool is useful for debugging Wayland input handling, discovering keycodes, and understanding Wayland protocol events.

# CAVEATS

Wayland only. Output can be verbose. Some events may require specific compositor support.

# SEE ALSO

[xev](/man/xev)(1), [libinput](/man/libinput)(1)
