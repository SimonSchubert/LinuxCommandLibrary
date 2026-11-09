# TAGLINE

adds new routes to the kernel routing tables

# TLDR

Add a **default route** via gateway

```sudo ip route add default via [gateway_ip]```

Add a **default route** via interface

```sudo ip route add default dev [eth0]```

Add a **static route**

```sudo ip route add [192.168.1.0/24] via [gateway_ip] dev [eth0]```

Add route with a specific **metric** (priority)

```sudo ip route add [192.168.2.0/24] via [gateway_ip] metric [100]```

Add route to a **specific routing table**

```sudo ip route add [10.0.0.0/8] dev [eth0] table [100]```

Add a route with a preferred **source address**

```sudo ip route add [192.168.1.0/24] dev [eth0] src [192.168.1.5]```

Add a **multipath** route across two gateways

```sudo ip route add default nexthop via [gateway1] weight [1] nexthop via [gateway2] weight [1]```

**Silently drop** traffic to a prefix

```sudo ip route add blackhole [203.0.113.0/24]```

Add the route, or **update it if it already exists**

```sudo ip route replace [192.168.1.0/24] via [gateway_ip]```

# SYNOPSIS

**ip route add** [_type_] _prefix_ [_options_]

# PARAMETERS

**default**
> Default route (0.0.0.0/0 or ::/0)

_TYPE_
> Route type, default unicast. Others include local, broadcast, multicast, throw, unreachable, prohibit, blackhole and nat.

**via** _GATEWAY_
> Next-hop gateway address

**dev** _DEVICE_
> Output device name

**table** _TABLE_
> Routing table (number or name from /etc/iproute2/rt_tables). Default is main.

**metric** _NUM_
> Route preference (lower = preferred)

**src** _ADDRESS_
> Preferred source address

**proto** _PROTOCOL_
> Routing protocol identifier (static, boot, dhcp, etc.)

**scope** _SCOPE_
> Scope of the route (global, link, host)

**mtu** _NUM_
> Maximum Transmission Unit for the route

**advmss** _NUM_
> Maximum Segment Size to advertise on TCP connections

**initcwnd** _NUM_
> Initial congestion window for TCP connections

**onlink**
> Treat the gateway as directly reachable on the link, even if no route says so

**nexthop** _NEXTHOP_
> Define a multipath route. Each hop takes **via**, **dev** and **weight**.

**nhid** _ID_
> Use a nexthop object created with **ip nexthop**

# DESCRIPTION

**ip route add** adds new routes to the kernel routing tables. Routes determine how packets are forwarded to their destinations based on the destination address.

A route specifies either a gateway (next-hop router) to forward packets to, or an interface for directly connected networks. Multiple routing tables can be used for policy routing together with **ip rule**.

# CAVEATS

Requires root privileges. Routes are not persistent across reboots without additional configuration. Adding a route that already exists fails with "File exists"; use **ip route replace** to add or update. Without a route to the gateway the command fails with "Nexthop has invalid gateway" unless **onlink** is used.

# HISTORY

The ip route command is part of iproute2, written by **Alexey Kuznetsov**, which replaced the older route command from net-tools on Linux.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-11-09 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-list](/man/ip-route-list)(8), [ip-rule](/man/ip-rule)(8), [ip-address](/man/ip-address)(8), [route](/man/route)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

<!-- verified: 2026-11-09 -->
