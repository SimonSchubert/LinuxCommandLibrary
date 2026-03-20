# TAGLINE

X11 event monitoring tool

# TLDR

**Start xev**

```xev```

**Show only keyboard events**

```xev -event keyboard```

**Show only mouse button** events

```xev -event button```

**Monitor specific window** by ID

```xev -id [window_id]```

**Monitor root window** events

```xev -root```

# SYNOPSIS

**xev** [_-event type_] [_-id window_] [_-root_] [_options_]

# PARAMETERS

**-display** _DISPLAY_
> X server to contact.

**-event** _TYPE_
> Event type filter (can be specified multiple times).

**-id** _WINDOW_
> Monitor events on an existing window by ID.

**-root**
> Monitor events on the root window.

**-name** _NAME_
> Name to assign to the created window.

**-geometry** _GEOM_
> Window size and position.

**-bw** _PIXELS_
> Border width for the window.

**-bs** _TYPE_
> Backing store type (NotUseful, WhenMapped, Always). Default NotUseful.

**-rv**
> Display window in reverse video.

# EVENT TYPES

**keyboard** - Key press/release events
**mouse** - All pointer events
**button** - Button press/release events
**motion** - Pointer motion events
**expose** - Expose events
**visibility** - Visibility change events
**structure** - Window structure events
**substructure** - Substructure events
**focus** - Focus change events
**property** - Property change events
**colormap** - Colormap events
**owner_grab_button** - Owner grab button events
**randr** - RandR events

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
