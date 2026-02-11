# TAGLINE

Lightweight standalone system tray panel

# TLDR

**Run** trayer

```trayer```

Position to **edge**

```trayer --edge [left|right|top|bottom]```

Set **dimensions**

```trayer --width [10] --height [32]```

Set width **type** and size

```trayer --widthtype [pixel|percent] --width [72]```

**Align** panel

```trayer --align [left|center|right]```

Set icon **spacing**

```trayer --iconspacing [10]```

# SYNOPSIS

**trayer** [_OPTIONS_]

# PARAMETERS

**--edge** _POSITION_
> Position panel at left, right, top, or bottom

**--width** _N_
> Panel width (pixels or percent)

**--height** _N_
> Panel height in pixels

**--widthtype** _TYPE_
> Width unit: pixel or percent

**--align** _DIRECTION_
> Align panel: left, center, or right

**--iconspacing** _N_
> Spacing between icons in pixels

**--transparent** _BOOL_
> Enable transparency

**--alpha** _N_
> Transparency level (0-255)

# DESCRIPTION

**trayer** is a lightweight GTK-2 based system tray panel. It provides a standalone systray that can be used with minimalist window managers that don't include their own system tray implementation.

The panel displays system tray icons from applications and can be positioned and sized according to user preferences.

# CAVEATS

Requires GTK-2. May not support all modern tray icon features. Transparency requires compositor support. Some window managers may conflict with positioning.

# HISTORY

**trayer** was developed as a standalone system tray for use with tiling and minimal window managers that lack built-in system tray support.

# SEE ALSO

[stalonetray](/man/stalonetray)(1)
