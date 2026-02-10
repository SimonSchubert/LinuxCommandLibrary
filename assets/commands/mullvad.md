# TAGLINE

command-line interface for Mullvad VPN, a privacy-focused VPN service

# TLDR

**Connect to VPN**

```mullvad connect```

**Disconnect from VPN**

```mullvad disconnect```

**Check connection status**

```mullvad status```

**Set VPN server location**

```mullvad relay set location [us] [nyc]```

**List available locations**

```mullvad relay list```

**Enable auto-connect on boot**

```mullvad auto-connect set on```

**Enable kill switch**

```mullvad lockdown-mode set on```

**Check account status**

```mullvad account get```

# SYNOPSIS

**mullvad** _command_ [_subcommand_] [_options_]

# PARAMETERS

**connect**
> Establish VPN connection.

**disconnect**
> Close VPN connection.

**reconnect**
> Reconnect to VPN.

**status**
> Show current connection status.

**account** _subcommand_
> Manage account (login, logout, get, set).

**relay** _subcommand_
> Configure relay/server selection.

**tunnel** _subcommand_
> Configure tunnel protocol options.

**dns** _subcommand_
> Configure DNS settings.

**lockdown-mode** _subcommand_
> Configure kill switch (block non-VPN traffic).

**auto-connect** _subcommand_
> Configure auto-connect on startup.

**lan** _subcommand_
> Allow/block local network access.

**obfuscation** _subcommand_
> Configure traffic obfuscation.

**split-tunnel** _subcommand_
> Exclude apps from VPN tunnel.

**bridge** _subcommand_
> Configure bridge mode for censored networks.

**version**
> Show version information.

# DESCRIPTION

**mullvad** is the command-line interface for Mullvad VPN, a privacy-focused VPN service based in Sweden. It controls the Mullvad daemon to manage VPN connections and configuration.

The client supports WireGuard and OpenVPN protocols. WireGuard is default and recommended for performance. Server selection can be automatic or manually set by country, city, or specific server. The relay list shows all available endpoints.

Lockdown mode (kill switch) blocks all internet traffic when VPN is disconnected, preventing leaks. LAN access can be allowed for local network resources. Split tunneling excludes specific applications from the VPN tunnel.

DNS options include using Mullvad's DNS, custom servers, or blocking ads/trackers/malware via their DNS. Obfuscation helps bypass VPN blocking in censored networks.

The account system uses numbered tokens rather than email/password. Anonymous payment options include cash and cryptocurrency.

# CAVEATS

Requires Mullvad subscription. Daemon must be running (mullvad-daemon service). Some features require root. Split tunneling support varies by platform. WireGuard requires kernel module on Linux. Kill switch may disrupt local services. Account tokens should be kept secure.

# HISTORY

**Mullvad** was founded in **2009** in Sweden by Amagicom AB, focusing on privacy from the start. The CLI tool evolved alongside their desktop clients. Mullvad gained attention for pioneering WireGuard VPN support and their anonymous account system. In **2022**, the Swedish police attempted to seize their servers but found no user data due to their no-logging policy. The service has been independently audited multiple times.

# SEE ALSO

[wg](/man/wg)(1), [openvpn](/man/openvpn)(1), [wireguard](/man/wireguard)(1), [nordvpn](/man/nordvpn)(1)
