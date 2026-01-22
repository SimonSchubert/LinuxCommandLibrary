# TLDR

Launch **GUI**

```xfce4-screenshooter```

Capture **fullscreen**

```xfce4-screenshooter -f```

Capture and **save**

```xfce4-screenshooter -f -s [path/to/directory]```

Capture after **delay**

```xfce4-screenshooter -d [seconds]```

Capture **region**

```xfce4-screenshooter -r```

Capture **window** to clipboard

```xfce4-screenshooter -w -c```

Capture and **open** in program

```xfce4-screenshooter -w -o [gimp]```

# SYNOPSIS

**xfce4-screenshooter** [_OPTIONS_]

# PARAMETERS

**-f, --fullscreen**
> Capture entire screen

**-w, --window**
> Capture active window

**-r, --region**
> Select region with mouse

**-d, --delay** _SECONDS_
> Wait before capturing

**-s, --save** _DIRECTORY_
> Save to directory

**-c, --clipboard**
> Copy to clipboard

**-o, --open** _APPLICATION_
> Open with application

# DESCRIPTION

**xfce4-screenshooter** is the screenshot utility for the XFCE desktop environment. It can capture the entire screen, a window, or a selected region.

Screenshots can be saved to file, copied to clipboard, or opened in an image editor.

# CAVEATS

Designed for XFCE but works on other desktops. Region selection requires mouse interaction.

# SEE ALSO

[scrot](/man/scrot)(1), [gnome-screenshot](/man/gnome-screenshot)(1), [flameshot](/man/flameshot)(1)
