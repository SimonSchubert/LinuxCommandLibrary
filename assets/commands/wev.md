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
> Include only specified interface/events

**-F** _INTERFACE[:EVENT]_
> Exclude specified interface/events

**-M** _FILE_
> Write keymap to file

**-g**
> Print Wayland globals

# DESCRIPTION

**wev** prints the contents of Wayland events, similar to xev for X11. It displays keyboard, mouse, and other input events as they occur.

This tool is useful for debugging Wayland input handling, discovering keycodes, and understanding Wayland protocol events.

# CAVEATS

Wayland only. Output can be verbose. Some events may require specific compositor support.

# SEE ALSO

[xev](/man/xev)(1), [libinput](/man/libinput)(1)
