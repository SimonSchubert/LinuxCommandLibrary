# TAGLINE

Establish Proton VPN connections

# TLDR

**Connect to the fastest server available**

```protonvpn connect --fastest```

**Connect to the fastest server in a specific country**

```protonvpn connect --cc [US]```

**Connect to a specific server**

```protonvpn connect [server_name]```

**Connect to the fastest P2P server**

```protonvpn connect --p2p```

**Connect to the fastest Secure Core server**

```protonvpn connect --sc```

**Connect using TCP protocol**

```protonvpn connect --fastest -p tcp```

# SYNOPSIS

**protonvpn connect** [_options_] [_server_]

# PARAMETERS

**--fastest**
> Connect to the fastest available server.

**--random**
> Connect to a random server.

**--cc** _CODE_
> Connect to the fastest server in specified country.

**--p2p**
> Connect to the fastest P2P server.

**--sc**
> Connect to the fastest Secure Core server.

**-p** _PROTOCOL_
> Specify transmission protocol (udp or tcp).

**-h**, **--help**
> Display help message.

# DESCRIPTION

**protonvpn connect** establishes a connection to Proton VPN service. It can automatically select the fastest available server or connect to a specific server, country, or city.

The command is part of the Proton VPN CLI tool for Linux, providing secure VPN connectivity through the Proton network.

# CAVEATS

Requires valid Proton VPN subscription and prior authentication with `protonvpn login`. Network configuration may require root privileges.

# HISTORY

Part of **Proton VPN** CLI client for Linux, developed by Proton AG for secure internet access through their VPN infrastructure.

# SEE ALSO

[protonvpn](/man/protonvpn)(1), [openvpn](/man/openvpn)(8)
