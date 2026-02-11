# TAGLINE

X11 event monitoring tool

# TLDR

**Start xev**

```xev```

**Show specific event types**

```xev -event [keyboard]```

**Monitor specific window**

```xev -id [window_id]```

**Use root window**

```xev -root```

**Show only key events**

```xev -event keyboard```

# SYNOPSIS

**xev** [_-event type_] [_-id window_] [_-root_] [_options_]

# PARAMETERS

**-event** _TYPE_
> Event type filter.

**-id** _WINDOW_
> Window ID.

**-root**
> Root window.

**-name** _NAME_
> Window name.

**-geometry** _GEOM_
> Window geometry.

# EVENT TYPES

**keyboard** - Key events
**mouse** - Pointer events
**button** - Button events
**motion** - Motion events
**expose** - Expose events

# DESCRIPTION

**xev** is an X11 event monitoring utility that displays all events received by a window. When launched, it opens a small window and prints detailed information about every X event that occurs within it, including key presses, mouse movements, button clicks, window exposure, and focus changes.

The tool is primarily used for debugging X11 input issues and discovering keycodes for keyboard configuration. Each event is printed with full details including keycodes, key symbols, coordinates, modifier states, and timestamps. This makes it invaluable for setting up key bindings in window managers or diagnosing input problems.

Events can be filtered by type using the **-event** option to show only keyboard, mouse, button, or motion events. The **-id** option monitors events on a specific existing window, while **-root** captures events on the root window for display-wide monitoring.

# CAVEATS

X11 only, not Wayland. Creates visible window. Output is verbose.

# HISTORY

**xev** is part of the standard X11 utilities. It's essential for understanding X input events and configuring key bindings.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xmodmap](/man/xmodmap)(1), [xinput](/man/xinput)(1)
