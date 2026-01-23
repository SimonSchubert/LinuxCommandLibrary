# TLDR

**Show BGP summary** (neighbor status)

```bgpctl show summary```

**Show all BGP neighbors**

```bgpctl show neighbor```

**Show RIB** (Routing Information Base)

```bgpctl show rib```

**Show routes from a specific neighbor**

```bgpctl show rib neighbor [192.168.1.1]```

**Show routes for a specific prefix**

```bgpctl show rib [10.0.0.0/8]```

**Soft reset a neighbor** session

```bgpctl neighbor [192.168.1.1] refresh```

**Clear a neighbor** session

```bgpctl neighbor [192.168.1.1] clear```

**Show BGP network statements**

```bgpctl show network```

# SYNOPSIS

**bgpctl** [**-n**] [**-s** _socket_] _command_ [_arguments_]

# DESCRIPTION

**bgpctl** is the control program for OpenBGPD, an implementation of the Border Gateway Protocol version 4. It communicates with the running bgpd daemon to display routing information and control BGP sessions.

The command provides visibility into the BGP Routing Information Base (RIB), neighbor session states, and allows administrative actions like resetting sessions or injecting routes. It connects to bgpd via a Unix socket.

bgpctl is part of the OpenBGPD project, which originated in OpenBSD and has been ported to other operating systems.

# PARAMETERS

**show summary**
> Display neighbor status overview.

**show neighbor** [_peer_]
> Show detailed neighbor information.

**show rib** [_options_]
> Display routing information base.

**show network**
> Show configured network statements.

**show fib** [_options_]
> Show forwarding information base.

**neighbor** _peer_ **up**
> Bring up a neighbor session.

**neighbor** _peer_ **down**
> Bring down a neighbor session.

**neighbor** _peer_ **clear**
> Clear and reset a session.

**neighbor** _peer_ **refresh**
> Request route refresh.

**network add** _prefix_
> Add a network to advertise.

**network delete** _prefix_
> Remove a network advertisement.

**-n**
> Show IP addresses instead of names.

**-s** _socket_
> Connect to alternate control socket.

# CAVEATS

Requires appropriate permissions to access bgpd control socket. Some commands may disrupt BGP sessions and cause routing changes. The clear command tears down the TCP session while refresh performs a soft reset. Route changes may take time to propagate through the network.

# HISTORY

**bgpctl** is part of **OpenBGPD**, which was developed by Henning Brauer and Claudio Jeker for **OpenBSD** starting in **2003**. It was designed as a clean, secure implementation of BGP after concerns about other implementations. The portable version for Linux and other systems has been available since **2016**. OpenBGPD is known for its simplicity and security focus.

# SEE ALSO

[bgpd](/man/bgpd)(8), [bgpd.conf](/man/bgpd.conf)(5), [ospfctl](/man/ospfctl)(8), [vtysh](/man/vtysh)(1)
