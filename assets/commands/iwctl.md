# TLDR

Run **interactive** mode

```iwctl```

Display Wi-Fi **stations**

```iwctl station list```

**Scan** for networks

```iwctl station [station] scan```

Display **found networks**

```iwctl station [station] get-networks```

**Connect** to a network

```iwctl station [station] connect [network_name]```

Display **help**

```iwctl -h```

# SYNOPSIS

**iwctl** [_options_] [_command_]

# PARAMETERS

**station list**
> List wireless stations (interfaces)

**station** _STATION_ **scan**
> Trigger network scan

**station** _STATION_ **get-networks**
> Show discovered networks

**station** _STATION_ **connect** _SSID_
> Connect to a network

**station** _STATION_ **disconnect**
> Disconnect from current network

**known-networks list**
> List saved network profiles

**-h**, **--help**
> Display help

# DESCRIPTION

**iwctl** is the command-line interface for iwd (iNet Wireless Daemon), a modern wireless network configuration daemon. It provides interactive and command-line modes for managing Wi-Fi connections.

iwd is designed as a lightweight alternative to wpa_supplicant, with faster connection times and simpler configuration. Credentials are prompted interactively or can be pre-configured.

# CAVEATS

Requires iwd daemon to be running. Network credentials are stored in /var/lib/iwd/. May conflict with NetworkManager if both try to manage the same interface.

# HISTORY

iwd was developed by Intel and first released in **2017** as a modern replacement for wpa_supplicant. It aims to provide simpler configuration and faster connection times while supporting modern wireless security protocols.

# SEE ALSO

[iw](/man/iw)(8), [nmcli](/man/nmcli)(1), [wpa_supplicant](/man/wpa_supplicant)(8)
