# TAGLINE

command-line interface for the NordVPN service, providing secure VPN

# TLDR

**Interactively log into** a NordVPN account

```nordvpn login```

Display the **connection status**

```nordvpn status```

Connect to the **nearest NordVPN server**

```nordvpn connect```

List all **available countries**

```nordvpn countries```

Connect to a server in a **specific country**

```nordvpn connect [Germany]```

Connect to a server in a **specific country and city**

```nordvpn connect [Germany] [Berlin]```

Set **autoconnect option**

```nordvpn set autoconnect on```

# SYNOPSIS

**nordvpn** _command_ [_options_]

# PARAMETERS

**login**
> Authenticate with NordVPN account

**logout**
> Log out of the current account

**connect, c**
> Connect to a VPN server

**disconnect, d**
> Disconnect from the VPN

**status**
> Show current connection status

**countries**
> List available server countries

**cities _country_**
> List available cities in a country

**set, s**
> Configure NordVPN settings

**settings**
> Display current settings

**whitelist**
> Manage whitelisted ports and subnets

# DESCRIPTION

**nordvpn** is the command-line interface for the NordVPN service, providing secure VPN connections to servers worldwide. It manages authentication, server connections, and client settings.

The client supports various connection protocols (NordLynx/WireGuard, OpenVPN) and features like kill switch, auto-connect, and split tunneling. Server selection can be automatic (nearest/fastest) or manual by country, city, or specific server.

The NordVPN daemon must be running for the CLI to function; it's typically managed as a systemd service.

# CAVEATS

Requires an active NordVPN subscription. The nordvpnd daemon must be running (usually started via systemd). Initial login opens a browser for authentication. The kill switch, when enabled, blocks internet access if the VPN disconnects.

# SEE ALSO

[openvpn](/man/openvpn)(8), [wg](/man/wg)(8), [nmcli](/man/nmcli)(1)
