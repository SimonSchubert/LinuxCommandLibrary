# TLDR

**Open** a new VPN connection

```sudo f5fpc --start```

Open VPN connection to **specific host**

```sudo f5fpc --start --host [host.example.com]```

Specify **username**

```sudo f5fpc --start --host [host.example.com] --username [user]```

Show current **VPN status**

```sudo f5fpc --info```

**Shutdown** VPN connection

```sudo f5fpc --stop```

# SYNOPSIS

**f5fpc** [_options_]

# DESCRIPTION

**f5fpc** is the F5 BIG-IP Edge Client for SSL VPN connections. It establishes secure VPN tunnels to F5 network access servers.

Proprietary commercial VPN client for enterprise networks.

# PARAMETERS

**--start**
> Start VPN connection

**--stop**
> Stop VPN connection

**--info**
> Display connection status

**--host** _hostname_
> VPN server hostname

**--username** _user_
> Username for authentication

# CAVEATS

Proprietary software from F5 Networks. Requires root privileges. May require browser-based initial authentication. Not available in standard package repositories.

# SEE ALSO

[openconnect](/man/openconnect)(8), [openvpn](/man/openvpn)(8)
