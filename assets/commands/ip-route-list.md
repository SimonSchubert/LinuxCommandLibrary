# TAGLINE

displays entries from the kernel routing tables

# TLDR

Display the **main** routing table

```ip route list```

Display the **local** routing table

```ip route list table local```

Display **all** routing tables

```ip route list table all```

List routes for a **specific device**

```ip route list dev [eth0]```

List routes within a **specific scope**

```ip route list scope link```

List routes **via a specific gateway**

```ip route list via [192.168.1.1]```

List routes added by a **specific protocol** (e.g. DHCP, static)

```ip route list proto [dhcp|static|kernel]```

Show **exact** route for a prefix, or all routes **matching** an address

```ip route list [exact|match] [10.0.0.0/8]```

Display IPv6 **cached** (exception) routes, e.g. PMTU entries

```ip -6 route list cached```

Display only **IPv6** routes

```ip -6 route```

Display only **IPv4** routes

```ip -4 route```

# SYNOPSIS

**ip route** { **list** | **show** } [[**to**] [**root** | **match** | **exact**] _PREFIX_] [**table** _TABLE_] [**vrf** _NAME_] [**proto** _RTPROTO_] [**type** _TYPE_] [**scope** _SCOPE_] [**dev** _DEV_] [**via** _PREFIX_] [**src** _PREFIX_]

# PARAMETERS

**to** [**root** | **match** | **exact**] _PREFIX_
> Select destinations: **root** lists prefixes not shorter than PREFIX, **match** those not longer than PREFIX (covering routes), **exact** (default) only that prefix. Without a prefix, the whole table is listed

**table** _TABLE_
> Routing table: main (254), local (255), all (0), or custom name/number

**dev** _DEVICE_
> Show routes for specific device only

**scope** _SCOPE_
> Filter by scope: global, link, host

**vrf** _NAME_
> Show routes of the table bound to a VRF

**cached**, **cloned**
> Show cloned/cached routes (equivalent to **table cache**)

**via** _PREFIX_
> Only routes whose next hop matches PREFIX

**src** _PREFIX_
> Only routes with a preferred source address in PREFIX

**type** _TYPE_
> Route type: unicast, local, broadcast, multicast, etc.

**proto** _PROTOCOL_
> Filter by routing protocol: kernel, boot, static, dhcp, ra, bgp, etc.

# DESCRIPTION

**ip route list** displays entries from the kernel routing tables. The main table contains user-configured routes, while the local table contains routes for local addresses automatically maintained by the kernel.

Without a command, **ip route** defaults to **list**; **show** is a synonym. Routes show the destination network, gateway or interface, and various attributes like metrics, source preference, and protocol that added the route.

# CAVEATS

The IPv4 routing cache was removed in Linux 3.6, so **cached** only shows IPv6 exception routes on modern kernels. Very large routing tables may produce extensive output. Multiple tables exist for policy routing setups.

# HISTORY

ip route list is part of iproute2 and replaces the older route command. It provides comprehensive access to Linux's advanced routing features including multiple tables and policy routing.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-add](/man/ip-route-add)(8), [ip-rule](/man/ip-rule)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-route.8.html)```

<!-- verified: 2026-09-29 -->
