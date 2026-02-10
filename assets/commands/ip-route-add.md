# TAGLINE

adds new routes to the kernel routing tables

# TLDR

Add a **default route** via gateway

```sudo ip route add default via [gateway_ip]```

Add a **default route** via interface

```sudo ip route add default dev [eth0]```

Add a **static route**

```sudo ip route add [192.168.1.0/24] via [gateway_ip] dev [eth0]```

Add route to a **specific routing table**

```sudo ip route add [10.0.0.0/8] dev [eth0] table [100]```

# SYNOPSIS

**ip route add** _destination_ [_options_]

# PARAMETERS

**default**
> Default route (0.0.0.0/0 or ::/0)

**via** _GATEWAY_
> Next-hop gateway address

**dev** _DEVICE_
> Output device name

**table** _TABLE_
> Routing table (number or name)

**metric** _NUM_
> Route preference (lower = preferred)

**src** _ADDRESS_
> Preferred source address

**proto** _PROTOCOL_
> Routing protocol identifier

# DESCRIPTION

**ip route add** adds new routes to the kernel routing tables. Routes determine how packets are forwarded to their destinations based on the destination address.

A route specifies either a gateway (next-hop router) to forward packets to, or an interface for directly connected networks. Multiple routing tables can be used for policy routing.

# CAVEATS

Requires root privileges. Routes are not persistent across reboots without additional configuration. Adding conflicting routes may fail or create unexpected behavior.

# HISTORY

The ip route command is part of iproute2, which replaced the older route command from net-tools. iproute2 provides unified management of all Linux networking features.

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-list](/man/ip-route-list)(8), [ip-rule](/man/ip-rule)(8)
