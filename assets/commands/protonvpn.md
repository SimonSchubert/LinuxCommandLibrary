# TAGLINE

Official Proton VPN command-line client

# TLDR

**Sign in** to Proton VPN

```protonvpn signin [username]```

**Connect** to the fastest server

```protonvpn connect```

Connect to a **specific country**

```protonvpn connect --country [US]```

Connect to a **city** (quote multi-word names)

```protonvpn connect --city "[New York]"```

Connect to a **specific server**

```protonvpn connect [CH#242]```

Connect to the fastest **P2P** or **Secure Core** server

```protonvpn connect [--p2p|--securecore]```

Show **connection status**

```protonvpn status```

**Disconnect**

```protonvpn disconnect```

**Enable kill switch**

```protonvpn config set kill-switch standard```

**List current settings**

```protonvpn config list```

# SYNOPSIS

**protonvpn** [**-v**] _command_ [_options_] [_arguments_]

# COMMANDS

**signin** _username_ [**--totp**]
> Authenticate with Proton credentials; the password is prompted for. **--totp** uses an authenticator app or recovery code instead of a security key.

**signout**
> Sign out and remove stored credentials. All settings reset to their defaults.

**info**
> Display account information.

**connect** [_server_]
> Establish a VPN connection. Without arguments, connects to the fastest server available on your plan. Accepts a server name (e.g. _IT#23_) or the options below.

**disconnect**
> Terminate the active VPN connection (you stay signed in).

**status**
> Show current connection status.

**servers**
> List available servers.

**countries list**
> List all countries with Proton VPN servers.

**cities list** _country_
> List cities with servers in a country.

**config list**
> Show current settings.

**config set** _option_ _value_
> Change a setting: **kill-switch** _off_|_standard_, **netshield** _off_|_malware-only_|_malware-ads-trackers_, **custom-dns** _on_|_off_ [**--dns** _ips_], and _on_|_off_ toggles for **vpn-accelerator**, **moderate-nat**, **ipv6**, **port-forwarding** and **anonymous-crash-reports**.

# PARAMETERS

**--country** _CODE_|_NAME_
> Connect to the fastest server in a country (code such as _US_ or full name).

**--city** _CITY_
> Connect to the fastest server in a city.

**--p2p**
> Connect to the fastest P2P-optimized server.

**-sc**, **--securecore**
> Connect to the fastest Secure Core server.

**--tor**
> Connect to the fastest Tor over VPN server.

**--random**
> Connect to a random available server.

**-v**, **--verbose**
> Show detailed output during command execution.

**-h**, **--help**
> Display help information (also available per command).

# DESCRIPTION

**protonvpn** is the official command-line client for the Proton VPN service on Linux. It connects over **WireGuard** and supports server selection by country, city or server name, Secure Core, P2P and Tor servers, kill switch, NetShield ad and malware blocking, port forwarding, custom DNS, IPv6 and VPN Accelerator.

Country, city and server names are not case sensitive.

# CAVEATS

Some features and server locations require a paid plan. Requires **NetworkManager** and a keyring (e.g. gnome-keyring); headless setups are not currently supported. The CLI cannot run while the Proton VPN desktop app is running. Split tunneling is not yet available. Officially supported on Debian, Ubuntu and Fedora (package **proton-vpn-cli**).

# HISTORY

**Proton AG** published this CLI in **late 2025**, built on the same Python libraries (proton-vpn-api-core, proton-keyring-linux) as its Linux desktop app. It replaces the older, discontinued **protonvpn-cli** (commands such as **protonvpn-cli c -f** and **protonvpn-cli ks**).

# SEE ALSO

[protonvpn-connect](/man/protonvpn-connect)(1), [wg-quick](/man/wg-quick)(8), [nmcli](/man/nmcli)(1), [openvpn](/man/openvpn)(8)

# RESOURCES

```[Source code](https://github.com/ProtonVPN/proton-vpn-cli)```

```[Documentation](https://protonvpn.com/support/use-linux-cli)```

<!-- verified: 2026-11-23 -->
