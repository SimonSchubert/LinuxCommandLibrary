# TAGLINE

Establish Proton VPN connections

# TLDR

**Connect to the fastest server available**

```protonvpn connect```

**Connect to the fastest server in a specific country**

```protonvpn connect --country [US]```

**Connect to the fastest server in a specific city**

```protonvpn connect --city "[New York]"```

**Connect to a specific server**

```protonvpn connect [CH#242]```

**Connect to the fastest P2P server** in a country

```protonvpn connect --country [IT] --p2p```

**Connect through a Secure Core server**

```protonvpn connect --securecore```

**Connect to a Tor server**

```protonvpn connect --tor```

**Connect to a random server**

```protonvpn connect --random```

# SYNOPSIS

**protonvpn connect** [_options_] [_server_]

# PARAMETERS

_SERVER_
> Name of a specific server to connect to, such as CH#242.

**--country** _COUNTRY_
> Connect to the fastest server in a country, given as a code (US, GB, DE) or full name.

**--city** _CITY_
> Connect to the fastest server in a city. Quote multi-word names.

**--p2p**
> Connect to the fastest P2P-optimized server.

**-sc**, **--securecore**
> Connect to the fastest Secure Core server.

**--tor**
> Connect to the fastest Tor server.

**--random**
> Connect to a random available server.

**--help**
> Display help message.

# DESCRIPTION

**protonvpn connect** establishes a connection to the Proton VPN service. With no arguments it selects the fastest server available on your plan, and it can also target a specific server, country, or city.

The command is part of the official Proton VPN CLI for Linux. Settings are stored under `~/.config/Proton/VPN/` and logs under `~/.cache/Proton/VPN/logs/`.

# CAVEATS

Requires a Proton VPN account and prior authentication with `protonvpn signin`. Some features and locations require a paid plan. The CLI uses WireGuard only, cannot run alongside the Proton VPN GUI app, and does not currently support headless setups.

# HISTORY

Proton released this CLI as a replacement for its earlier Python **linux-cli**, whose repository is now archived. Options from the old client, such as **--fastest**, **--cc**, **--sc** and **-p**, do not exist in this one.

# SEE ALSO

[protonvpn](/man/protonvpn)(1), [wg](/man/wg)(8)

# RESOURCES

```[Source code](https://github.com/ProtonVPN/proton-vpn-cli)```

```[Documentation](https://protonvpn.com/support/use-linux-cli)```

<!-- verified: 2026-11-09 -->
