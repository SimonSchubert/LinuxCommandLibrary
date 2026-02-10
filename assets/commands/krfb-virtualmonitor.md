# TAGLINE

creates a virtual monitor on KDE Plasma that can be accessed via VNC

# TLDR

Create a **virtual monitor** with VNC access

```krfb-virtualmonitor --resolution 1920x1080 --name [monitor_name] --password [password] --port 5900```

# SYNOPSIS

**krfb-virtualmonitor** **--resolution** _WxH_ **--name** _name_ **--password** _password_ **--port** _port_

# DESCRIPTION

**krfb-virtualmonitor** creates a virtual monitor on KDE Plasma that can be accessed via VNC. This is useful for headless systems or for creating additional virtual displays that can be shared remotely.

# PARAMETERS

**--resolution WxH**
> Set virtual monitor resolution (e.g., 1920x1080)

**--name NAME**
> Assign a name to the virtual monitor

**--password PASSWORD**
> Set VNC password for remote access

**--port PORT**
> VNC port number (default: 5900)

# CAVEATS

Requires KDE Plasma desktop environment. The VNC password is passed on the command line which may be visible in process listings.

# SEE ALSO

[krfb](/man/krfb)(1), [x11vnc](/man/x11vnc)(1)
