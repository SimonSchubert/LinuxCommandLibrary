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

```sudo zerotier-cli peers```

**Allow a network to set the default route**

```sudo zerotier-cli set [network_id] allowDefault=1```

**Show the assigned IP** on a network

```sudo zerotier-cli get [network_id] ip```

**Output full JSON**

```sudo zerotier-cli -j listnetworks```

# SYNOPSIS

**zerotier-cli** [_-switches_] _command_ [_args_]

# PARAMETERS

**-h**
> Display help.

**-v**
> Show version.

**-j**
> Display full raw JSON output.

**-D**_path_
> ZeroTier home path for parameter auto-detect. No space before the value.

**-p**_port_
> HTTP port of the local API (default: auto). No space before the value.

**-T**_token_
> Authentication token (default: auto). No space before the value.

# SUBCOMMANDS

**info**, **status**
> Display node status info and address

**listpeers**
> List all peers

**peers**
> List all peers (prettier)

**listnetworks**
> List joined networks

**join** _network_
> Join a ZeroTier network

**leave** _network_
> Leave a ZeroTier network

**set** _network_ _setting_**=**_value_
> Set a network setting such as **allowManaged**, **allowGlobal**, **allowDefault** or **allowDNS**

**get** _network_ _setting_
> Get a network setting: a property from the **-j listnetworks** output, or **ip**, **ip4**, **ip6**, **ip6plane**, **ip6prefix**

**dump**
> Debug settings dump for support

**listmoons**
> List joined moons (custom roots)

**orbit** _world_id_ _seed_
> Join a moon

**deorbit** _world_id_
> Leave a moon

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

# RESOURCES

```[Source code](https://github.com/zerotier/ZeroTierOne)```

```[Homepage](https://www.zerotier.com)```

```[Documentation](https://docs.zerotier.com)```

<!-- verified: 2026-11-09 -->
