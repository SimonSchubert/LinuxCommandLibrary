# TAGLINE

SSL VPN client

# TLDR

**Connect to VPN**

```openconnect [vpn.example.com]```

**Connect with username**

```openconnect -u [username] [vpn.example.com]```

**Use certificate**

```openconnect -c [cert.pem] [vpn.example.com]```

**Specify protocol**

```openconnect --protocol=[anyconnect|nc|gp] [vpn.example.com]```

**Background mode**

```openconnect -b [vpn.example.com]```

# SYNOPSIS

**openconnect** [_options_] _server_

# PARAMETERS

_SERVER_
> VPN server address.

**-u** _USER_
> Username.

**-c** _CERT_
> Client certificate.

**--protocol** _PROTO_
> VPN protocol.

**-b**
> Run in background.

**--help**
> Display help information.

# DESCRIPTION

**openconnect** is an SSL VPN client. Compatible with Cisco AnyConnect.

The tool establishes VPN connections. Supports multiple protocols.

# CAVEATS

Requires root/sudo for tun device. Multiple protocol support.

# HISTORY

openconnect was created as an **open-source alternative** to Cisco AnyConnect client.

# SEE ALSO

[openvpn](/man/openvpn)(1), [vpnc](/man/vpnc)(1), [wireguard](/man/wireguard)(1)

