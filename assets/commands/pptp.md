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

**pptp** establishes PPTP VPN connections. Point-to-Point Tunneling Protocol.

The tool creates encrypted tunnels. Legacy VPN protocol.

pptp connects to VPN.

# CAVEATS

Deprecated protocol. Security concerns. Use OpenVPN or WireGuard instead.

# HISTORY

PPTP was developed by **Microsoft** for VPN connections in the 1990s.

# SEE ALSO

[pptpsetup](/man/pptpsetup)(8), [pppd](/man/pppd)(8), [openvpn](/man/openvpn)(8)

