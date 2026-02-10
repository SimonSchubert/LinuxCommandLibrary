# TAGLINE

daemon that manages network connections

# TLDR

**Show connection status**

```nmcli general status```

**List connections**

```nmcli connection show```

**Connect to WiFi**

```nmcli device wifi connect "[SSID]" password "[password]"```

**Show WiFi networks**

```nmcli device wifi list```

**Bring up connection**

```nmcli connection up [connection_name]```

**Create static connection**

```nmcli connection add type ethernet con-name [myeth] ifname [eth0] ip4 [192.168.1.10/24] gw4 [192.168.1.1]```

# SYNOPSIS

**NetworkManager** [_options_]

# PARAMETERS

**--debug**
> Debug mode.

**--log-level** _level_
> Logging level.

**--log-domains** _domains_
> Logging domains.

**--pid-file** _file_
> PID file location.

# DESCRIPTION

**NetworkManager** is a daemon that manages network connections. It provides automatic network detection and configuration, handling wired, wireless, mobile broadband, and VPN connections.

NetworkManager is controlled via nmcli, nmtui, or GUI applets.

# CLI TOOL (nmcli)

```bash
nmcli device                    # List devices
nmcli connection                # List connections
nmcli connection modify ...     # Modify connection
nmcli networking off            # Disable networking
```

# CONFIGURATION

```
/etc/NetworkManager/
├── NetworkManager.conf
├── system-connections/
└── conf.d/
```

# CAVEATS

May conflict with other network tools. Connections stored in /etc/NetworkManager/. Some systems use alternatives.

# HISTORY

NetworkManager was developed by **Red Hat** starting in **2004** to simplify network configuration on Linux desktops.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmtui](/man/nmtui)(1), [systemd-networkd](/man/systemd-networkd)(8), [netctl](/man/netctl)(1)
