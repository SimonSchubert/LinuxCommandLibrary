# TLDR

**Start VNC server on display :1**

```Xvnc :1```

**Start with specific geometry**

```Xvnc :1 -geometry [1280x1024]```

**Start with color depth**

```Xvnc :1 -depth [24]```

**Start with password file**

```Xvnc :1 -PasswordFile [~/.vnc/passwd]```

**Start on specific port**

```Xvnc :1 -rfbport [5901]```

**Use vncserver script (recommended)**

```vncserver :1```

# SYNOPSIS

**Xvnc** [:_display_] [_options_]

# PARAMETERS

**-geometry** _WxH_
> Desktop size (default: 1024x768).

**-depth** _n_
> Color depth: 16, 24, or 32 (default: 24).

**-rfbport** _port_
> VNC listener port (default: 5900+display).

**-PasswordFile** _file_
> Password file for authentication.

**-SecurityTypes** _types_
> Comma-separated list of security types.

**-localhost**
> Only accept connections from localhost.

**-AlwaysShared**
> Allow multiple simultaneous connections.

**-NeverShared**
> Disconnect existing clients on new connection.

# DESCRIPTION

**Xvnc** is both an X server and a VNC server. It creates a virtual X display with no physical screen, accessible only via VNC viewers. Applications run on Xvnc as on a normal X display.

The server listens on TCP port 5900+display for VNC connections. Unlike x11vnc which shares an existing display, Xvnc creates new independent virtual displays.

The vncserver script is the recommended way to start Xvnc, handling environment setup and running initial applications. Multiple Xvnc instances can run on different display numbers.

# CAVEATS

No hardware acceleration for 3D. Each session uses separate display number. Password file must be created with vncpasswd. Firewall rules needed for remote access.

# HISTORY

**Xvnc** was developed as part of VNC (Virtual Network Computing) at AT&T Laboratories Cambridge. Various implementations exist including TightVNC, TigerVNC, and RealVNC, each with additional features and optimizations.

# SEE ALSO

[vncserver](/man/vncserver)(1), [vncviewer](/man/vncviewer)(1), [vncpasswd](/man/vncpasswd)(1), [x11vnc](/man/x11vnc)(1)
