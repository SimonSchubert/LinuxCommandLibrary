# TAGLINE

KDE remote desktop client

# TLDR

**Launch** the remote desktop client

```krdc```

**Connect to a VNC server**

```krdc vnc://[hostname:display]```

**Connect to an RDP server**

```krdc rdp://[hostname]```

**Connect to an RDP server** on a custom port

```krdc rdp://[hostname:port]```

**Start in fullscreen mode** connecting to a host

```krdc --fullscreen vnc://[hostname]```

# SYNOPSIS

**krdc** [_options_] [_URL_]

# PARAMETERS

**--fullscreen**
> Start in fullscreen mode. Works only when a single URL is specified.

**-h**, **--help**
> Display help text listing available options.

**--version**
> Display version information.

**--author**
> Show author information.

**--license**
> Show license information.

# DESCRIPTION

**KRDC** (KDE Remote Desktop Client) is a graphical application that allows viewing and controlling the desktop session on another machine running a compatible server. It operates at the frame-buffer level, making it compatible with multiple windowing systems including X11, Wayland, macOS, and Windows.

KRDC supports two protocols: **VNC** (Virtual Network Computing) for cross-platform remote access, and **RDP** (Remote Desktop Protocol) for connecting to Windows machines and other RDP-enabled hosts. RDP support requires **xfreerdp** (FreeRDP) as a runtime dependency.

The client provides bookmark management for frequently-accessed connections, a history of recent sessions, per-host settings, and configurable connection speed profiles (LAN, DSL/Cable, Modem) that adjust quality and compression. Passwords can be stored securely via **KWallet** integration.

# CONFIGURATION

Connection settings are stored per-host and accessible through the configuration dialog, which provides three tabs: **General**, **VNC Defaults**, and **RDP Defaults**. Speed profiles control color depth and compression to balance quality against bandwidth. Per-host settings avoid repeated configuration prompts on reconnection.

# CAVEATS

KRDC is a graphical application and requires a running display server (X11 or Wayland). RDP connections require **xfreerdp** to be installed separately. VNC connections are unencrypted by default; tunnel through SSH for security on untrusted networks.

# HISTORY

KRDC was originally written by **Tim Jansen** as part of the KDE project. A major rewrite was completed by **Urs Wolfer** during **Google Summer of Code 2007**, modernizing the codebase and improving protocol support. It has been a standard component of the **KDE Applications** suite since KDE 3.x and continues active development as part of KDE Gear releases.

# SEE ALSO

[rdesktop](/man/rdesktop)(1), [xfreerdp](/man/xfreerdp)(1), [vncviewer](/man/vncviewer)(1), [ssh](/man/ssh)(1)
