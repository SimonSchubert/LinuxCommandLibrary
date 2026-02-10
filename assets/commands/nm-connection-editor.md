# TAGLINE

graphical editor for NetworkManager connections

# TLDR

**Open connection editor**

```nm-connection-editor```

**Edit specific connection**

```nm-connection-editor -e [connection_uuid]```

**Create new connection**

```nm-connection-editor -c```

**Create specific type**

```nm-connection-editor -t [wifi]```

# SYNOPSIS

**nm-connection-editor** [_options_]

# PARAMETERS

**-e**, **--edit** _uuid_
> Edit connection by UUID.

**-c**, **--create**
> Create new connection.

**-t**, **--type** _type_
> Connection type for new.

**-s**, **--show**
> Show editor window.

# DESCRIPTION

**nm-connection-editor** is a graphical editor for NetworkManager connections. It provides a GUI for creating, editing, and managing network connections.

The editor handles wired, wireless, VPN, mobile broadband, and other connection types.

# CONNECTION TYPES

```
ethernet  - Wired connections
wifi      - Wireless networks
vpn       - VPN connections
bond      - Bonded interfaces
bridge    - Network bridges
vlan      - VLAN configurations
```

# CONFIGURATION STORAGE

```
/etc/NetworkManager/system-connections/
```

# CAVEATS

Requires X11/Wayland display. Alternative: nmcli for CLI. Changes saved to system-connections.

# HISTORY

nm-connection-editor is part of the **NetworkManager** project developed by **Red Hat**, providing a GTK-based interface for network configuration.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmtui](/man/nmtui)(1), [NetworkManager](/man/NetworkManager)(8)
