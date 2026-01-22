# TLDR

**Connect** to host display

```vncviewer [host]:[display_number]```

Connect in **fullscreen**

```vncviewer -FullScreen [host]:[display_number]```

Connect with **geometry**

```vncviewer --geometry [width]x[height] [host]:[display_number]```

Connect to specific **port**

```vncviewer [host]::[port]```

# SYNOPSIS

**vncviewer** [_OPTIONS_] _HOST_[:_DISPLAY_|::_PORT_]

# PARAMETERS

**-FullScreen**
> Launch in fullscreen mode

**--geometry** _WxH_
> Window geometry

**-ViewOnly**
> View only, no input

**-Shared**
> Share the connection with other viewers

# DESCRIPTION

**vncviewer** is a VNC (Virtual Network Computing) client that connects to remote VNC servers. It allows viewing and controlling a remote desktop over the network.

The display number (after single colon) is added to port 5900. Use double colon for direct port specification.

# CAVEATS

VNC traffic is unencrypted by default. Use SSH tunneling for secure connections. Performance depends on network bandwidth and latency.

# SEE ALSO

[vncserver](/man/vncserver)(1), [x11vnc](/man/x11vnc)(1)
