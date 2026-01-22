# TLDR

**List** all connections

```conntrack -L```

Show **real-time** events

```conntrack -E```

Events with **timestamps**

```conntrack -E -o timestamp```

Events for specific **IP**

```conntrack -E -s ip_address```

**Delete** flows by source IP

```conntrack -D -s ip_address```

# SYNOPSIS

**conntrack** [_OPTIONS_]

# DESCRIPTION

**conntrack** interacts with the Linux kernel's connection tracking system (conntrack). It allows viewing, searching, and modifying tracked network connections used by stateful firewalling.

# PARAMETERS

**-L, --dump**
> List all currently tracked connections

**-E, --event**
> Display real-time connection events

**-D, --delete**
> Delete connections matching criteria

**-U, --update**
> Update connections matching criteria

**-s, --orig-src** _address_
> Filter by original source address

**-d, --orig-dst** _address_
> Filter by original destination address

**-p, --proto** _protocol_
> Filter by protocol (tcp, udp, icmp)

**-o, --output** _type_
> Output format (extended, timestamp, xml)

**--src-nat**
> Filter for SNAT connections

**--dst-nat**
> Filter for DNAT connections

# CAVEATS

Requires root privileges and the nf_conntrack kernel module. Deleting connections may disrupt active sessions. High traffic systems may have thousands of tracked connections.

# HISTORY

**conntrack** is part of the **conntrack-tools** package for managing the Linux connection tracking system.

# SEE ALSO

[iptables](/man/iptables)(8), [nft](/man/nft)(8), [ss](/man/ss)(8)
