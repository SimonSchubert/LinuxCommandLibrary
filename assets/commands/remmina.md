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

**remmina** [_options_] [_file_]

# PARAMETERS

**-c**, **--connect** _uri_
> Connect to URI or file.

**-e**, **--edit** _file_
> Edit connection file.

**-n**, **--new**
> New connection.

**--protocol** _protocol_
> Protocol (RDP, VNC, SSH).

**-s**, **--server** _server_
> Server address.

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
