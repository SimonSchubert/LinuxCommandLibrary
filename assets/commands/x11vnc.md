# TAGLINE

VNC server for existing X displays

# TLDR

**Launch** a VNC server that allows multiple clients

```x11vnc -shared```

**Launch** a VNC server in view-only mode that doesn't terminate

```x11vnc -forever -viewonly```

**Launch** on a specific display and screen

```x11vnc -display :[display].[screen]```

**Launch** on the third display's default screen

```x11vnc -display :2```

**Launch** on the first display's second screen

```x11vnc -display :0.1```

# SYNOPSIS

**x11vnc** [_options_]

# PARAMETERS

**-display _display_**
> X display to share (e.g., :0, :1.0)

**-shared**
> Allow multiple simultaneous clients

**-forever**
> Don't exit when last client disconnects

**-viewonly**
> Clients can only view, not interact

**-passwd _password_**
> Set VNC password

**-rfbauth _file_**
> Use password file

**-rfbport _port_**
> Set VNC port (default: 5900)

**-noxdamage**
> Disable X DAMAGE extension

**-clip _WxH+X+Y_**
> Share only a portion of the screen

**-scale _fraction_**
> Scale the framebuffer

**-ssl**
> Enable SSL/TLS encryption

# DESCRIPTION

**x11vnc** allows VNC access to an existing X11 display. Unlike other VNC servers that create virtual displays, x11vnc shares the actual running desktop, allowing remote control of the physical display.

The server captures the display content and transmits it to VNC clients. By default, it terminates when all clients disconnect, unless **-forever** is specified.

# CAVEATS

Requires an existing X display to be running. May have performance issues with compositing window managers. Security concerns when used without encryption; consider using **-ssl** or tunneling over SSH.

# SEE ALSO

[vncviewer](/man/vncviewer)(1), [xvnc](/man/xvnc)(1), [ssh](/man/ssh)(1)
