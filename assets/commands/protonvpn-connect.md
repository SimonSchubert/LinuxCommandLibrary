# TAGLINE

Establish Proton VPN connections

# TLDR

Connect using the **fastest server** available

```protonvpn connect```

Connect to the fastest server in a specific **country**

```protonvpn connect --country "US"```

Connect to the fastest server in a specific **city**

```protonvpn connect --city "New York"```

Connect to a **specific server**

```protonvpn connect server_name```

Display **help**

```protonvpn connect -h```

# SYNOPSIS

**protonvpn connect** [_options_] [_server_]

# PARAMETERS

**--country** _code_
> Connect to fastest server in specified country

**--city** _name_
> Connect to fastest server in specified city

**-h**, **--help**
> Display help message

# DESCRIPTION

**protonvpn connect** establishes a connection to Proton VPN service. It can automatically select the fastest available server or connect to a specific server, country, or city.

The command is part of the Proton VPN CLI tool for Linux, providing secure VPN connectivity through the Proton network.

# CAVEATS

Requires valid Proton VPN subscription and prior authentication with protonvpn login. Network configuration may require root privileges.

# HISTORY

Part of **Proton VPN** CLI client for Linux, developed by Proton AG for secure internet access through their VPN infrastructure.

# SEE ALSO

[protonvpn](/man/protonvpn)(1), [openvpn](/man/openvpn)(8), [wireguard](/man/wireguard)(8)
