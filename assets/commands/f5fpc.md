# TAGLINE

F5 BIG-IP SSL VPN client

# TLDR

**Open** a new VPN connection (skipping CA check)

```sudo f5fpc -s -x -t [https://host.example.com]```

**Show current VPN status**

```sudo f5fpc -i```

**Shutdown** VPN connection

```sudo f5fpc -o```

**Connect with username and password**

```sudo f5fpc -s -t [https://host.example.com] -u [username] -p [password]```

**Connect with specific certificate**

```sudo f5fpc --start --host [https://host.example.com] --cert [/path/to/cert.pem] --key [/path/to/key.pem]```

# SYNOPSIS

**f5fpc** [_options_]

# PARAMETERS

**-s**, **--start**
> Start VPN connection (returns to shell immediately)

**-o**, **--stop**
> Stop VPN connection

**-i**, **--info**
> Display connection status

**-t**, **--host** _url_
> VPN server URL [https://]hostname[:port] (required for --start)

**-u**, **--user** _username_
> Username for authentication

**-p**, **--password** _password_
> Password for authentication

**-r**, **--cert** _file_
> Client certificate file

**-k**, **--key** _file_
> Client certificate key file

**-a**, **--cacert** _file_
> Trusted CA certificate

**-x**, **--nocheck**
> Skip trusted CA certificate verification

**-b**, **--nonblock**
> Non-blocking mode

**-h**, **--help**
> Display help

# DESCRIPTION

**f5fpc** is the F5 BIG-IP Edge Client for SSL VPN connections. It establishes secure VPN tunnels to F5 network access servers.

Proprietary commercial VPN client for enterprise networks.

# CAVEATS

Proprietary software from F5 Networks. Requires root privileges. May require browser-based initial authentication. Not available in standard package repositories.

# SEE ALSO

[openconnect](/man/openconnect)(8), [openvpn](/man/openvpn)(8)
