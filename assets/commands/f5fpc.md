# TAGLINE

F5 BIG-IP SSL VPN client

# TLDR

**Open** a new VPN connection

```sudo f5fpc -s -x -t [https://host.example.com]```

**Show current VPN status**

```sudo f5fpc -i```

**Shutdown** VPN connection

```sudo f5fpc -o```

**Connect with specific certificate**

```sudo f5fpc -s -x -t [https://host.example.com] -C [/path/to/cert.pem]```

# SYNOPSIS

**f5fpc** [_options_]

# PARAMETERS

**-s**
> Start VPN connection

**-o**
> Stop VPN connection

**-i**
> Display connection status

**-t** _url_
> VPN server URL

**-x**
> Use browser-based authentication

**-C** _cert_
> Client certificate file

# DESCRIPTION

**f5fpc** is the F5 BIG-IP Edge Client for SSL VPN connections. It establishes secure VPN tunnels to F5 network access servers.

Proprietary commercial VPN client for enterprise networks.

# CAVEATS

Proprietary software from F5 Networks. Requires root privileges. May require browser-based initial authentication. Not available in standard package repositories.

# SEE ALSO

[openconnect](/man/openconnect)(8), [openvpn](/man/openvpn)(8)
