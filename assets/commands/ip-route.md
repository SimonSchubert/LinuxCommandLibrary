# TAGLINE

manages the kernel routing table

# TLDR

Show **routing** table

```ip route```

Add **default** gateway

```sudo ip route add default via [gateway_ip]```

Add default via **interface**

```sudo ip route add default dev [eth0]```

Add **static** route

```sudo ip route add [10.0.0.0/24] via [gateway_ip] dev [eth0]```

Add a route with a **metric** and preferred **source** address

```sudo ip route add [10.0.0.0/24] via [gateway_ip] metric [100] src [local_ip]```

**Replace** a route, adding it if it does not exist (idempotent)

```sudo ip route replace default via [gateway_ip] dev [eth0]```

**Delete** route

```sudo ip route delete [10.0.0.0/24] dev [eth0]```

**Change** route

```sudo ip route change [10.0.0.0/24] via [gateway_ip] dev [eth0]```

Add a **blackhole** route that silently drops traffic

```sudo ip route add blackhole [203.0.113.0/24]```

Add a **multipath** (ECMP) default route

```sudo ip route add default nexthop via [gw1] weight 1 nexthop via [gw2] weight 1```

**Get** route to destination

```ip route get [destination_ip]```

Show specific **table**

```ip route list table [100]```

**Flush** all routes of a device

```sudo ip route flush dev [eth0]```

**Save** and **restore** the routing table

```ip route save > [routes.bin] && sudo ip route restore < [routes.bin]```

# SYNOPSIS

**ip** [_options_] **route** { _command_ | **help** }

**ip route** { **show** | **flush** } _SELECTOR_

**ip route** { **add** | **del** | **change** | **append** | **replace** } _ROUTE_

**ip route get** _ADDRESS_ [_options_]

**ip route** { **save** | **restore** }

# DESCRIPTION

**ip route** manages the kernel routing table. It can add, delete, and modify routes, as well as query which route the kernel will use for a specific destination.

# PARAMETERS

**list** (or no command)
> Display the routing table

**add**
> Add a new route

**delete**
> Remove a route

**change**
> Modify an existing route

**replace**
> Change or add if not exists

**append**
> Add a route even if one with the same key exists (for IPv6, adds a nexthop to a multipath route)

**flush** _SELECTOR_
> Remove all routes matching the selector

**save**, **restore**
> Dump routes as raw netlink data to stdout, or restore them from stdin

**get** _address_
> Show route for a specific destination

**default**
> Default gateway route

**via** _gateway_
> Specify next-hop gateway

**dev** _interface_
> Specify output interface

**table** _id_
> Work with a specific routing table

**src** _address_
> Preferred source address for traffic to this destination

**metric** _number_
> Route priority; lower values are preferred

**proto** _rtproto_
> Routing protocol identifier: kernel, boot, static, dhcp, or a number

**scope** _scope_
> Route scope: global, link, or host

**onlink**
> Pretend the next hop is directly attached even if it does not match any prefix

**nexthop** _NH_
> Define a next hop of a multipath route (can be repeated, with optional **weight**)

**mtu** _number_
> Set the path MTU for the route

**type**
> Route type: unicast (default), local, broadcast, multicast, blackhole, unreachable, prohibit, throw

# CAVEATS

Routes added are not persistent; use network configuration files for persistence. Multiple routing tables can be used with policy routing. The default table is "main".

# HISTORY

**ip route** is part of **iproute2**, written by Alexey Kuznetsov in the late 1990s, replacing the deprecated **route** command from net-tools.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-route-get](/man/ip-route-get)(8), [ip-route-list](/man/ip-route-list)(8), [ip-rule](/man/ip-rule)(8), [ip-address](/man/ip-address)(8), [routel](/man/routel)(8), [route](/man/route)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-route.8.html)```

<!-- verified: 2026-09-29 -->
