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

**xwininfo** shows window info. It queries X properties.

Window geometry. Size and position.

Window ID. Identification.

Tree display. Window hierarchy.

Click to select. Interactive mode.

# CAVEATS

X11 only. No Wayland. Part of xorg-apps.

# HISTORY

**xwininfo** is a standard X11 utility for displaying information about windows.

# SEE ALSO

[xprop](/man/xprop)(1), [xdotool](/man/xdotool)(1), [xlsclients](/man/xlsclients)(1)
