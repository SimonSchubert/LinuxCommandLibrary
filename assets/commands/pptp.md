# TAGLINE

Establish PPTP VPN tunnel connections

# TLDR

**Connect to PPTP VPN**

```pptp [server] [options]```

**Connect with call ID**

```pptp [server] --nolaunchpppd```

**Debug mode**

```pptp [server] debug```

# SYNOPSIS

**pptp** _server_ [_options_]

# PARAMETERS

_SERVER_
> PPTP server address.

**--nolaunchpppd**
> Don't launch pppd.

**debug**
> Enable debugging.

**--loglevel** _N_
> Logging verbosity.

# DESCRIPTION

**pptp** establishes VPN connections using the Point-to-Point Tunneling Protocol. It creates an encrypted tunnel to a remote PPTP server by wrapping PPP sessions inside GRE (Generic Routing Encapsulation) packets, allowing secure communication over the internet.

The client works in conjunction with **pppd** which handles the PPP negotiation and authentication within the tunnel. PPTP is considered a legacy protocol with known security weaknesses, and modern alternatives like OpenVPN or WireGuard are recommended for new deployments.

# CAVEATS

Deprecated protocol. Security concerns. Use OpenVPN or WireGuard instead.

# HISTORY

PPTP was developed by **Microsoft** for VPN connections in the 1990s.

# SEE ALSO

[pptpsetup](/man/pptpsetup)(8), [pppd](/man/pppd)(8), [openvpn](/man/openvpn)(8)

