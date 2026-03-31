# TAGLINE

Establish PPTP VPN tunnel connections

# TLDR

**Connect to a PPTP VPN server**

```pptp [server] --nolaunchpppd```

**Connect with debug output**

```pptp [server] debug```

**Connect with increased log verbosity**

```pptp [server] --loglevel [3]```

# SYNOPSIS

**pptp** _server_ [_options_] [_pppd-options_]

# PARAMETERS

_server_
> IP address or hostname of the PPTP server.

**--nolaunchpppd**
> Do not launch pppd; use when pppd is launched independently.

**--phone** _number_
> Pass the phone number to the remote host (used by some servers for call identification).

**--loglevel** _N_
> Set logging verbosity (0=least, 3=most).

**debug**
> Enable debug mode, outputting additional diagnostics.

**--quirks** _quirk_
> Work around bugs in specific PPTP implementations (e.g., BEZEQ_ISRAEL).

**--timeout** _seconds_
> Time to wait for a connection reply from the server.

# DESCRIPTION

**pptp** establishes VPN connections using the Point-to-Point Tunneling Protocol. It creates a tunnel to a remote PPTP server by wrapping PPP sessions inside GRE (Generic Routing Encapsulation) packets.

The client works in conjunction with **pppd** which handles the PPP negotiation and authentication within the tunnel. Any options not recognized by pptp are passed to pppd. PPTP is considered a legacy protocol with known security weaknesses, and modern alternatives like OpenVPN or WireGuard are recommended for new deployments.

# CAVEATS

PPTP has known cryptographic weaknesses (MS-CHAPv2 and MPPE vulnerabilities). It should not be used for security-sensitive connections. Use OpenVPN or WireGuard instead. Requires the ip_gre kernel module to be loaded.

# HISTORY

PPTP was developed by **Microsoft** and several other companies for VPN connections in the 1990s. The Linux client implementation is part of the pptp-linux project.

# SEE ALSO

[pptpsetup](/man/pptpsetup)(8), [pppd](/man/pppd)(8), [openvpn](/man/openvpn)(8), [ip](/man/ip)(8)

