# TLDR

**Start service in foreground**

```sudo zerotier-one```

**Start with custom home directory**

```sudo zerotier-one [/var/lib/zerotier-one]```

**Run in background (daemon mode)**

```sudo zerotier-one -d```

# SYNOPSIS

**zerotier-one** [**-d**] [_home_directory_]

# PARAMETERS

**-d**
> Run as daemon in background

_home_directory_
> ZeroTier home directory (default: /var/lib/zerotier-one)

# DESCRIPTION

**zerotier-one** is the ZeroTier network virtualization service daemon. It creates virtual network interfaces and manages encrypted peer-to-peer connections to form software-defined networks.

When running, the service:
- Maintains connections to ZeroTier root servers
- Establishes peer-to-peer tunnels with other nodes
- Creates virtual network interfaces (zt*) for joined networks
- Provides a local API for zerotier-cli
- Handles NAT traversal and connection optimization

The home directory contains identity files, network configurations, and the authentication token for the local API.

On systemd systems, zerotier-one is typically managed as a systemd service (zerotier-one.service) rather than run directly.

# CAVEATS

Requires root privileges to create network interfaces and bind to privileged ports.

The service binds to UDP port 9993 by default for peer communication.

Identity files in the home directory (identity.secret, identity.public) should be backed up. Losing them means generating a new identity with a different address.

Firewall rules must allow UDP traffic for peer connections. Blocked UDP can force traffic through relays, reducing performance.

# SEE ALSO

[zerotier-cli](/man/zerotier-cli)(1), [zerotier-idtool](/man/zerotier-idtool)(1), [systemctl](/man/systemctl)(1)
