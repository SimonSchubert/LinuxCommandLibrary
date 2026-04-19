# TAGLINE

Share existing X display over VNC

# TLDR

Start with **passwordfile**

```x0vncserver -display :0 -passwordfile [path/to/file]```

Start on specific **port**

```x0vncserver -display :0 -rfbport [port]```

# SYNOPSIS

**x0vncserver** [_OPTIONS_]

# PARAMETERS

**-display** _DISPLAY_
> X display to share

**-passwordfile** _FILE_
> Password file for authentication

**-rfbport** _PORT_
> VNC port to listen on

**-SecurityTypes** _TYPES_
> Comma-separated list of accepted security types (e.g. `VncAuth,Plain`).

**-Geometry** _WxH+X+Y_
> Limit the shared region to a subrectangle of the display.

**-Log** _DEST:LEVEL_
> Configure logging (e.g. `stderr:100`, `*:stderr:30`).

**-SendCutText** / **-AcceptCutText**
> Enable/disable clipboard forwarding between server and client.

**-QueryConnect**
> Prompt the local user before accepting each incoming connection.

# DESCRIPTION

**x0vncserver** is a TigerVNC server that shares an existing X display over VNC. Unlike vncserver which creates a new virtual display, x0vncserver shares the physical display.

This allows remote access to the actual screen being displayed on the monitor.

# CAVEATS

Requires X11 display. Password must be set using vncpasswd. Security depends on network configuration. Consider SSH tunneling for secure access.

# SEE ALSO

[vncserver](/man/vncserver)(1), [vncpasswd](/man/vncpasswd)(1), [x11vnc](/man/x11vnc)(1)
