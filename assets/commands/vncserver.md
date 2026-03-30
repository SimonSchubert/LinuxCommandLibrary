# TAGLINE

Launch VNC remote desktop server

# TLDR

Launch on next **available** display

```vncserver```

Launch with specific **geometry**

```vncserver -geometry [1920]x[1080]```

Launch on a specific **display** number

```vncserver :[display_number]```

**Kill** specific display

```vncserver -kill :[display_number]```

**List** running VNC servers

```vncserver -list```

# SYNOPSIS

**vncserver** [_OPTIONS_] [:_DISPLAY_]

# PARAMETERS

**-geometry** _WxH_
> Specify desktop size (default: 1920x1200).

**-depth** _depth_
> Pixel depth in bits (16, 24, or 32; default: 24).

**-kill** _:DISPLAY_
> Kill a previously started VNC server on the specified display.

**-list**
> List all running VNC server instances.

**-localhost** [_yes|no_]
> Only accept connections from localhost. Useful with SSH tunneling.

**-SecurityTypes** _types_
> Comma-separated list of security types (None, VncAuth, Plain, TLSVnc, X509Vnc, etc.).

**-desktop** _name_
> Desktop name displayed to connecting clients.

**-fg**
> Run the server as a foreground process.

**-autokill** [_yes|no_]
> Automatically kill the server when the session script exits (default: yes).

**-xstartup** _script_
> Run a custom startup script instead of the default session script.

**-noxstartup**
> Do not run any startup script after launching the server.

**-rfbport** _port_
> TCP port for VNC connections (default: 5900 + display number).

# DESCRIPTION

**vncserver** launches a VNC (Virtual Network Computing) desktop server. It creates a new X display that can be accessed remotely using a VNC viewer.

Each server instance runs on a separate display number. The first available display is used if not specified.

# CAVEATS

Password must be set with **vncpasswd** before first use. Display number is added to base port 5900 (e.g., display :1 uses port 5901). Firewall may need to allow VNC ports. VNC traffic is unencrypted by default; use SSH tunneling or TLS security types for secure connections.

# SEE ALSO

[vncviewer](/man/vncviewer)(1), [vncpasswd](/man/vncpasswd)(1), [x11vnc](/man/x11vnc)(1), [ssh](/man/ssh)(1)
