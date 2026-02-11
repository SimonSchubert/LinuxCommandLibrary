# TAGLINE

Official Proton VPN command-line client

# TLDR

**Sign in** to Proton VPN

```protonvpn signin```

**Sign out**

```protonvpn signout```

Display **account info**

```protonvpn info```

**Connect** interactively

```protonvpn connect```

**Disconnect**

```protonvpn disconnect```

Display **help**

```protonvpn -h```

# SYNOPSIS

**protonvpn** [**signin**|**signout**|**connect**|**disconnect**|**info**|**status**]

# COMMANDS

**signin**
> Authenticate with Proton VPN credentials

**signout**
> Remove stored credentials

**connect**
> Establish VPN connection

**disconnect**
> Terminate VPN connection

**status**
> Show current connection status

**info**
> Display account information

# PARAMETERS

**-h, --help**
> Display help information

# DESCRIPTION

**protonvpn** is the official command-line client for Proton VPN service. It provides secure, encrypted VPN connections with features like kill switch, split tunneling, and server selection.

The CLI allows scripting VPN connections and provides all functionality of the graphical client for headless servers or terminal users.

# CAVEATS

Requires Proton VPN subscription. Some features require paid plans. Network manager integration varies by distribution. Root may be required for some operations.

# HISTORY

**protonvpn** CLI was developed by **Proton AG** to complement their graphical VPN clients. Proton VPN emphasizes privacy and is based in Switzerland with strong privacy laws.

# SEE ALSO

[openvpn](/man/openvpn)(8), [wireguard](/man/wireguard)(8), [nmcli](/man/nmcli)(1)
