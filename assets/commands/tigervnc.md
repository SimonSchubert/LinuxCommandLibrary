# TLDR

**Connect to VNC server**

```vncviewer [hostname:display]```

**Connect to specific port**

```vncviewer [hostname::5901]```

**Connect in fullscreen mode**

```vncviewer -FullScreen [hostname:1]```

**Connect in view-only mode**

```vncviewer -ViewOnly [hostname:1]```

**Connect through SSH tunnel**

```vncviewer -via [gateway] [hostname:1]```

**Connect with password file**

```vncviewer -passwd [~/.vnc/passwd] [hostname:1]```

**Listen for reverse connections**

```vncviewer -listen [5500]```

**Set preferred encoding**

```vncviewer -PreferredEncoding Tight [hostname:1]```

# SYNOPSIS

**vncviewer** [_options_] [_host_][:_display_]

**vncviewer** [_options_] [_host_][::_port_]

**vncviewer** [_options_] **-listen** [_port_]

# PARAMETERS

**-FullScreen**
> Start in fullscreen mode.

**-FullScreenAllMonitors**
> Use all monitors in fullscreen.

**-Maximize**
> Maximize viewer window.

**-ViewOnly**
> Disable keyboard and mouse input.

**-Shared**
> Share desktop with existing connections.

**-listen** _port_
> Listen for reverse connections (default: 5500).

**-via** _gateway_
> Tunnel through SSH gateway.

**-passwd** _file_
> Password file location.

**-geometry** _WxH+X+Y_
> Initial window position and size.

**-PreferredEncoding** _encoding_
> Encoding: Tight, ZRLE, hextile, raw.

**-QualityLevel** _n_
> JPEG quality (0-9, default: 8).

**-CompressLevel** _n_
> Compression level (0-6, default: 2).

**-NoJPEG**
> Disable JPEG compression.

**-AutoSelect**
> Auto-select encoding and format.

**-AcceptClipboard**
> Accept clipboard from server.

**-SendClipboard**
> Send clipboard to server.

**-X509CA** _file_
> CA certificate for TLS.

**-Log** _config_
> Debug logging configuration.

**-h**
> Display help.

# DESCRIPTION

**TigerVNC** (vncviewer) is a VNC client for connecting to remote desktops. It displays the graphical desktop of a remote VNC server and allows interaction via keyboard and mouse.

The viewer supports multiple encodings optimized for different network conditions: Tight encoding with JPEG compression for low bandwidth, and raw or hextile for local networks. Automatic encoding selection adapts to connection quality.

Security features include TLS encryption and various authentication methods. The -via option provides SSH tunneling for secure connections through untrusted networks.

TigerVNC can also act as a reverse-connection client using -listen mode, where the server initiates the connection to the viewer.

# CAVEATS

Display numbers start at 0 (port 5900). Double-colon specifies raw port number. Some features require server support. Full-screen mode exit may need platform-specific key combinations.

# HISTORY

**TigerVNC** is a fork of TightVNC, focused on performance and security improvements. It originated from the VNC (Virtual Network Computing) technology developed at Olivetti Research Laboratory in the late 1990s. TigerVNC is widely used in enterprise environments and Linux distributions.

# SEE ALSO

[vncserver](/man/vncserver)(1), [Xvnc](/man/Xvnc)(1), [x11vnc](/man/x11vnc)(1), [ssh](/man/ssh)(1)
