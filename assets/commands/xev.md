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

**xev** displays X11 events. It shows what the X server receives.

Window opens to capture events. Click, type, move mouse.

Event details are printed. Keycodes, coordinates, modifiers.

Useful for debugging input. Find keycodes for configuration.

Window ID mode monitors other windows. Spy on specific applications.

Root mode catches global events. Display-wide monitoring.

# CAVEATS

X11 only, not Wayland. Creates visible window. Output is verbose.

# HISTORY

**xev** is part of the standard X11 utilities. It's essential for understanding X input events and configuring key bindings.

# SEE ALSO

[xdotool](/man/xdotool)(1), [xmodmap](/man/xmodmap)(1), [xinput](/man/xinput)(1)
