# TAGLINE

Start X Window System session

# TLDR

**Start** an X session

```startx```

**Start** X with a specific color depth

```startx -- -depth [16]```

**Start** X with a specific DPI value

```startx -- -dpi [100]```

**Start** X with a specific window manager

```startx [path/to/window_manager]```

**Start** X with a specific server layout

```startx -- -layout [Multihead]```

# SYNOPSIS

**startx** [ [ _client_ ] _options_ ... ] [ **--** [ _server_ ] [ _display_ ] _options_ ... ]

# PARAMETERS

**--**
> Separator between client arguments and server arguments.

**-depth _value_**
> Server option: set color depth (e.g. 8, 16, 24).

**-dpi _value_**
> Server option: set dots per inch for the display.

**-layout _name_**
> Server option: use a specific server layout from xorg.conf.

# DESCRIPTION

**startx** is a front-end to xinit that provides a convenient way to start an X session. It reads the user's .xinitrc file (or the system default if none exists) to determine what client programs to run. Similarly, it reads .xserverrc (or the system default) to determine the X server to start.

Typically startx runs a window manager or desktop environment and sets up the X display. Arguments before **--** are passed to the client, and arguments after **--** are passed to the server.

# ENVIRONMENT

**XINITRC**
> Path to an xinitrc file. If unset, ~/.xinitrc or /etc/X11/xinit/xinitrc is used.

**XSERVERRC**
> Path to an xserverrc file. If unset, ~/.xserverrc or /etc/X11/xinit/xserverrc is used.

**DISPLAY**
> Set by startx to the name of the display to which clients should connect.

**XAUTHORITY**
> If not already defined, set to ~/.Xauthority.

# CONFIGURATION

**~/.xinitrc**
> User startup script executed by startx to launch a window manager or desktop environment.

**~/.xserverrc**
> User server startup script to determine which X server to start.

**/etc/X11/xinit/xinitrc**
> System-wide default startup script used when no user .xinitrc exists.

**/etc/X11/xinit/xserverrc**
> System-wide default server script used when no user .xserverrc exists.

# CAVEATS

Requires X server to be installed. The .xinitrc file in the user's home directory controls which programs start with X. Not needed when using a display manager like GDM, SDDM, or LightDM.

# SEE ALSO

[xinit](/man/xinit)(1), [Xorg](/man/Xorg)(1), [xrandr](/man/xrandr)(1), [xterm](/man/xterm)(1)
