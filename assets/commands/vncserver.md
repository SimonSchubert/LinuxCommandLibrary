# TAGLINE

Launch VNC remote desktop server

# TLDR

Launch on next **available** display

```vncserver```

Launch with **geometry**

```vncserver --geometry [width]x[height]```

**Kill** specific display

```vncserver --kill :[display_number]```

# SYNOPSIS

**vncserver** [_OPTIONS_] [:_DISPLAY_]

# PARAMETERS

**--geometry** _WxH_
> Specify screen geometry

**--kill** _:DISPLAY_
> Kill VNC server on specified display

**--depth** _N_
> Color depth in bits

**--name** _NAME_
> Desktop name shown to clients

# DESCRIPTION

**vncserver** launches a VNC (Virtual Network Computing) desktop server. It creates a new X display that can be accessed remotely using a VNC viewer.

Each server instance runs on a separate display number. The first available display is used if not specified.

# CAVEATS

Password must be set before first use. Display number is added to base port 5900. Firewall may need to allow VNC ports. Consider SSH tunneling for security.

# SEE ALSO

[vncviewer](/man/vncviewer)(1), [x11vnc](/man/x11vnc)(1)
