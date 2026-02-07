# TAGLINE

screen color picker for X11 and Wayland

# TLDR

Display **preview** and copy hexadecimal value

```farge```

Copy hex value **without** preview

```farge --no-preview```

**Output** hex value to stdout

```farge --stdout```

Output **RGB** value to stdout

```farge --rgb --stdout```

Display as **notification** with expiry time

```farge --notify --expire-time [5000]```

# SYNOPSIS

**farge** [_options_]

# DESCRIPTION

**farge** picks and displays the color of a specific pixel on the screen. It can output colors in hexadecimal or RGB format and copies the value to the clipboard.

Useful for designers and developers to quickly sample colors from anywhere on screen.

# PARAMETERS

**--no-preview**
> Don't show preview window

**--stdout**
> Output to stdout

**--rgb**
> Output as RGB format

**--notify**
> Show as notification

**--expire-time** _ms_
> Notification expiry time in milliseconds

# CAVEATS

Requires clipboard and notification tools. Works on X11 and Wayland with appropriate backends.

# SEE ALSO

[xcolor](/man/xcolor)(1), [gpick](/man/gpick)(1)
