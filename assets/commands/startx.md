# TLDR

**Start** an X session

```startx```

**Start** X with a specific color depth

```startx -- -depth [value]```

**Start** X with a specific DPI value

```startx -- -dpi [value]```

**Start** X with a specific window manager

```startx [path/to/window_manager]```

# SYNOPSIS

**startx** [_client_] [_options_] [_--_] [_server_] [_display_]

# PARAMETERS

**--**
> Separator between client and server arguments

**-depth _value_**
> Set color depth (8, 16, 24, 32)

**-dpi _value_**
> Set dots per inch

# DESCRIPTION

**startx** is a front-end to xinit that provides a convenient way to start an X session. It reads the user's .xinitrc file (or the system default if none exists) to determine what programs to run.

Typically startx runs a window manager or desktop environment and sets up the X display.

# CAVEATS

Requires X server to be installed. The .xinitrc file in the user's home directory controls which programs start with X. Not needed when using a display manager like GDM, SDDM, or LightDM.

# SEE ALSO

[xinit](/man/xinit)(1), [xorg](/man/xorg)(1), [xrandr](/man/xrandr)(1)
