# TAGLINE

command-line client for IVPN service

# TLDR

**Connect to VPN**

```ivpn connect```

**Connect to specific server**

```ivpn connect -c [country_code]```

**Disconnect**

```ivpn disconnect```

**Show status**

```ivpn status```

**List servers**

```ivpn servers```

**Enable firewall**

```ivpn firewall -on```

# SYNOPSIS

**ivpn** _command_ [_options_]

# PARAMETERS

**connect**
> Connect to VPN.

**disconnect**
> Disconnect from VPN.

**status**
> Show connection status.

**servers**
> List available servers.

**firewall** _STATE_
> Control IVPN firewall (-on, -off).

**-c** _COUNTRY_
> Country code for server.

**-fastest**
> Connect to fastest server.

**--help**
> Display help information.

# DESCRIPTION

**ivpn** is the command-line client for IVPN service. It manages VPN connections with privacy-focused features.

The tool supports WireGuard and OpenVPN protocols. It includes a firewall to prevent leaks.

# CAVEATS

Requires IVPN subscription. Daemon must be running. Privacy-focused provider.

# HISTORY

ivpn CLI is the official client for **IVPN**, a privacy-focused VPN service based in Gibraltar.

# SEE ALSO

[wg](/man/wg)(1), [openvpn](/man/openvpn)(8), [wireguard](/man/wireguard)(8)
