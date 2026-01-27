# TLDR

**Start vinagre**

```vinagre```

**Connect to VNC server**

```vinagre [vnc://hostname:5900]```

**Connect to RDP server**

```vinagre [rdp://hostname]```

**Connect with display number**

```vinagre [vnc://hostname:1]```

**Open in fullscreen mode**

```vinagre -f [vnc://hostname]```

**Connect in new window**

```vinagre -n [vnc://hostname]```

# SYNOPSIS

**vinagre** [_options_] [_server_]

# PARAMETERS

**-f**, **--fullscreen**
> Open in fullscreen mode.

**-n**, **--new-window**
> Create a new window for connection.

**-F** _file_
> Open connection from .vnc file.

**--geometry** _WxH+X+Y_
> Set initial window geometry.

**--help**
> Display help.

**--version**
> Display version.

# URI FORMAT

**vnc://host::port**: Connect via VNC (port 5900 default).

**vnc://host:display**: Connect to display number (adds 5900).

**rdp://host**: Connect via RDP protocol.

**spice://host**: Connect via SPICE protocol.

**ssh://host**: Connect via SSH.

# DESCRIPTION

**vinagre** is a remote desktop viewer for GNOME supporting VNC, RDP, SPICE, and SSH protocols. It provides tabbed connections, favorites/bookmarks, and integrates with GNOME keyring for password storage.

The application can browse the network for VNC servers using Avahi/mDNS. Multiple simultaneous connections are supported in tabs or separate windows. Connection settings can be saved as favorites for quick access.

Vinagre superseded earlier GNOME VNC clients and was itself later replaced by GNOME Connections in newer GNOME versions.

# CAVEATS

Deprecated in favor of GNOME Connections. Some protocols require optional dependencies. RDP support may require freerdp. Network browsing requires Avahi. GNOME-centric; other desktops may prefer alternatives.

# HISTORY

**vinagre** was introduced in GNOME 2.22 as the official remote desktop client. The name is Portuguese for "vinegar". It unified VNC, RDP, and other protocols under one interface. Development slowed after GNOME 3, with GNOME Connections eventually becoming its successor.

# SEE ALSO

[remmina](/man/remmina)(1), [vncviewer](/man/vncviewer)(1), [xfreerdp](/man/xfreerdp)(1), [gnome-connections](/man/gnome-connections)(1)
