# TAGLINE

command-line interface for the NordVPN service, providing secure VPN

# TLDR

**Log in** to a NordVPN account

```nordvpn login```

Show **whether the tunnel is up** and where it lands

```nordvpn status```

Connect to the **fastest nearby server**

```nordvpn connect```

List the **countries** with servers

```nordvpn countries```

List the **cities** available in a country

```nordvpn cities [Germany]```

Connect to a **specific country**

```nordvpn connect [Germany]```

Connect to a **specific city**

```nordvpn connect [Germany] [Berlin]```

Connect to a **server group**, such as the P2P set

```nordvpn connect [P2P]```

**Disconnect**

```nordvpn disconnect```

Review the **current settings**

```nordvpn settings```

Connect **automatically** whenever the machine comes up

```nordvpn set autoconnect on```

Block traffic entirely if the **tunnel drops**

```nordvpn set killswitch on```

**Log out** of the account

```nordvpn logout```

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

# INSTALL

```nix: nix profile install nixpkgs#nordvpn```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[openvpn](/man/openvpn)(8), [wg](/man/wg)(8), [nmcli](/man/nmcli)(1)
