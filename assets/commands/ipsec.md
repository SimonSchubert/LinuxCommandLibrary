# TLDR

**Start IPsec service**

```sudo ipsec start```

**Stop IPsec service**

```sudo ipsec stop```

**Check status**

```sudo ipsec status```

**Show all connections**

```sudo ipsec statusall```

**Reload configuration**

```sudo ipsec reload```

**Start specific connection**

```sudo ipsec up [connection]```

**Stop specific connection**

```sudo ipsec down [connection]```

# SYNOPSIS

**ipsec** _command_ [_options_]

# PARAMETERS

**start**
> Start IPsec daemon.

**stop**
> Stop IPsec daemon.

**restart**
> Restart daemon.

**status**
> Show active connections.

**statusall**
> Show detailed status.

**reload**
> Reload configuration.

**up** _connection_
> Start connection.

**down** _connection_
> Stop connection.

**listcerts**
> List certificates.

**listall**
> List all information.

**stroke** _command_
> Send command to daemon.

# DESCRIPTION

**ipsec** is the control interface for strongSwan/Libreswan IPsec VPN implementations. It manages IKE (Internet Key Exchange) connections for encrypted network tunnels.

IPsec provides network-layer encryption for VPNs, supporting site-to-site tunnels and remote access. Configuration is typically in /etc/ipsec.conf and /etc/ipsec.secrets.

# CONFIGURATION

```
# /etc/ipsec.conf
conn myvpn
    left=%defaultroute
    leftid=@myserver
    right=remote.example.com
    rightid=@remote
    auto=start
```

# CAVEATS

Requires kernel IPsec support. Certificate management can be complex. Firewall rules needed for IKE (UDP 500, 4500). Debug with ipsec statusall.

# HISTORY

IPsec was standardized by IETF in the 1990s. strongSwan (forked from FreeS/WAN in 2005) and Libreswan are the main Linux implementations, providing the ipsec command interface.

# SEE ALSO

[strongswan](/man/strongswan)(8), [swanctl](/man/swanctl)(8), [ip-xfrm](/man/ip-xfrm)(8)
