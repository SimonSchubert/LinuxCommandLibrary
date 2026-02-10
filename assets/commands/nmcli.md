# TAGLINE

command-line client for NetworkManager

# TLDR

List all **NetworkManager connections**

```nmcli connection```

Show **device status**

```nmcli device```

**Connect** to a Wi-Fi network

```nmcli device wifi connect ssid --ask```

Show available **Wi-Fi networks**

```nmcli device wifi```

Show **password** for current Wi-Fi

```nmcli device wifi show-password```

**Activate** a connection

```nmcli connection up connection_name```

**Deactivate** a connection

```nmcli connection down connection_name```

# SYNOPSIS

**nmcli** [_OPTIONS_] {_general_|_networking_|_radio_|_connection_|_device_|_agent_|_monitor_} [_COMMAND_] [_ARGUMENTS_]

# DESCRIPTION

**nmcli** is a command-line client for NetworkManager. It allows controlling NetworkManager and reporting network status, creating, editing, activating, and deactivating network connections, and managing network devices.

# OBJECTS

**general**
> Manage NetworkManager status, hostname, permissions, and logging

**networking**
> Control overall networking state and connectivity

**radio**
> Manage Wi-Fi and WWAN radio switches

**connection**
> Manage network connection profiles

**device**
> Manage network interfaces

**agent**
> Run as a NetworkManager secret or polkit agent

**monitor**
> Observe NetworkManager activity in real-time

# PARAMETERS

**-t, --terse**
> Produce terse output suitable for scripts

**-p, --pretty**
> Produce human-readable formatted output

**-m, --mode tabular|multiline**
> Switch between output modes

**-c, --colors auto|yes|no**
> Control colored output

**-f, --fields**
> Specify which fields/columns to output

**-e, --escape yes|no**
> Escape column separators in values

**-a, --ask**
> Prompt for missing parameters

**-s, --show-secrets**
> Display passwords and secrets

**-w, --wait seconds**
> Set timeout for operations

**--offline**
> Work without NetworkManager daemon

# COMMON CONNECTION COMMANDS

**nmcli connection show**: List all connections
**nmcli connection up**: Activate a connection
**nmcli connection down**: Deactivate a connection
**nmcli connection add**: Create a new connection
**nmcli connection modify**: Change connection settings
**nmcli connection delete**: Remove a connection
**nmcli connection import**: Import a VPN connection

# CAVEATS

The **--ask** flag prompts for passwords interactively. Use **--show-secrets** carefully as it displays sensitive information. The **-t** option with **-f** is useful for scripting.

# HISTORY

**nmcli** is the command-line interface for **NetworkManager**, first released around 2004. It provides a way to manage network connections on systems without graphical interfaces or for automation.

# SEE ALSO

[nmtui](/man/nmtui)(1), [NetworkManager](/man/NetworkManager)(8), [nm-settings](/man/nm-settings)(5)
