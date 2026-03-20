# TAGLINE

control interface for strongSwan/Libreswan IPsec VPN implementations

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

**Show version information**

```ipsec --version```

**Reload secrets** from ipsec.secrets

```sudo ipsec rereadsecrets```

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

**update**
> Apply config changes without full restart.

**route** _connection_
> Install kernel IPsec policy for a connection.

**unroute** _connection_
> Remove kernel IPsec policy for a connection.

**rereadsecrets**
> Reload secrets from ipsec.secrets.

**listalgs**
> List supported cryptographic algorithms.

**listcerts**
> List certificates.

**listcacerts**
> List CA certificates.

**listall**
> List all information.

**rereadall**
> Execute all reread operations.

**--version**
> Show version information.

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

[ip](/man/ip)(8), [openvpn](/man/openvpn)(8), [wg](/man/wg)(8)
