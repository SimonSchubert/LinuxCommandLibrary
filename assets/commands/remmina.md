# TAGLINE

Remote desktop client application

# TLDR

**Launch Remmina**

```remmina```

**Connect to saved connection**

```remmina -c [connection_name]```

**Connect to RDP server**

```remmina -c rdp://[user]@[host]```

**Connect to VNC server**

```remmina -c vnc://[host]```

**Connect to SSH**

```remmina -c ssh://[user]@[host]```

# SYNOPSIS

**remmina** [_-a_|_-i_|_-n_|_-q_|_-v_] [_-c file_] [_-e file_] [_-p tabindex_] [_-s server_] [_-t protocol_] [_options_]

# PARAMETERS

**-c**, **--connect** _file_
> Connect to a desktop described in a file or a supported URI (RDP, VNC, SSH, SPICE).

**-e**, **--edit** _file_
> Open and edit a connection profile file.

**-n**, **--new**
> Create a new connection profile.

**-t**, **--protocol** _protocol_
> Use default protocol for new connections (RDP, VNC, SSH, SPICE).

**-s**, **--server** _server_
> Use default server name for new connections (used with --new).

**-p**, **--pref** _tabindex_
> Show preferences dialog page.

**-i**, **--icon**
> Start as tray icon.

**-k**, **--kiosk**
> Start in kiosk mode (thin client).

**-q**, **--quit**
> Quit the application.

**-v**, **--version**
> Show version.

**--update-profile**
> Modify a connection profile non-interactively (requires --set-option).

**--set-option** _OPTION[=VALUE]_
> Set profile option, used with --update-profile.

# DESCRIPTION

**Remmina** is a GTK remote desktop client supporting multiple protocols including RDP, VNC, SSH, SPICE, and more. It provides a unified interface for managing remote connections.

# EXAMPLES

```bash
# Launch GUI
remmina

# Connect to RDP
remmina -c rdp://administrator@192.168.1.100

# Connect to VNC
remmina -c vnc://192.168.1.100:5900

# SSH connection
remmina -c ssh://user@server.example.com

# Connect using saved profile
remmina -c ~/.local/share/remmina/myserver.remmina

# Update a profile's username non-interactively
remmina --update-profile ~/.local/share/remmina/myserver.remmina --set-option username=admin
```

# PROTOCOLS

```
RDP    - Windows Remote Desktop
VNC    - Virtual Network Computing
SSH    - Secure Shell
SPICE  - Virtual machine display
NX     - NoMachine protocol
SFTP   - Secure file transfer
```

# CONFIGURATION

**~/.local/share/remmina/**
> Directory containing saved connection profiles as .remmina files, each storing server address, protocol, credentials, and display settings.

**~/.config/remmina/remmina.pref**
> Global preferences file controlling default behavior, keyboard shortcuts, appearance, and plugin settings.

# CAVEATS

Requires protocol plugins. FreeRDP for RDP support. Some features require additional packages.

# HISTORY

Remmina was forked from **grdc** in 2009 by **Vic Lee** to create a more feature-rich remote desktop client.

# SEE ALSO

[xfreerdp](/man/xfreerdp)(1), [vncviewer](/man/vncviewer)(1), [ssh](/man/ssh)(1)
