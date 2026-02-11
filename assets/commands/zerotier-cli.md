# TAGLINE

Manage ZeroTier virtual network connections

# TLDR

**Show node status**

```sudo zerotier-cli status```

**Join a network**

```sudo zerotier-cli join [network_id]```

**Leave a network**

```sudo zerotier-cli leave [network_id]```

**List joined networks**

```sudo zerotier-cli listnetworks```

**List connected peers**

```sudo zerotier-cli listpeers```

**Show node info**

```sudo zerotier-cli info```

# SYNOPSIS

**zerotier-cli** [_options_] _command_ [_args_]

# PARAMETERS

**-D** _path_
> ZeroTier home directory

**-p** _port_
> Local API port

**-T** _token_
> Authentication token

# SUBCOMMANDS

**status**
> Show node status and address

**info**
> Display node information

**join** _network_
> Join a ZeroTier network

**leave** _network_
> Leave a ZeroTier network

**listnetworks**
> List joined networks

**listpeers**
> List connected peers

**listmoons**
> List joined moons (custom roots)

**orbit** _world_id_ _seed_
> Join a moon

**deorbit** _world_id_
> Leave a moon

**set** _network_ _setting_ _value_
> Configure network settings

# DESCRIPTION

**zerotier-cli** is the command-line interface for managing ZeroTier One, a software-defined networking (SDN) service that creates secure virtual networks. It communicates with the local zerotier-one service.

ZeroTier creates encrypted peer-to-peer connections between nodes, forming virtual LANs across the internet. Each node gets a unique 10-digit address. Networks are identified by 16-digit network IDs.

After joining a network, nodes can communicate as if on the same LAN, enabling remote access, gaming, and connecting distributed systems. Network membership is managed through ZeroTier Central or self-hosted controllers.

# CAVEATS

Most commands require root/sudo to communicate with the zerotier-one service.

Joining a network requires authorization from the network controller (automatic for public networks, manual for private).

Firewall rules may need adjustment to allow ZeroTier traffic (UDP port 9993 by default).

Network performance depends on whether direct peer connections can be established or traffic must relay.

# SEE ALSO

[zerotier-one](/man/zerotier-one)(8), [zerotier-idtool](/man/zerotier-idtool)(1), [ip](/man/ip)(8), [wg](/man/wg)(8)
