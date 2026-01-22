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

Display the **routing cache**

```ip route list cache```

Display only **IPv6** routes

```ip -6 route```

Display only **IPv4** routes

```ip -4 route```

# SYNOPSIS

**ip route list** [_selector_]

# PARAMETERS

**table** _TABLE_
> Routing table: main (254), local (255), all (0), or custom name/number

**dev** _DEVICE_
> Show routes for specific device only

**scope** _SCOPE_
> Filter by scope: global, link, host

**cache**
> Show routing cache entries

**type** _TYPE_
> Route type: unicast, local, broadcast, multicast, etc.

**proto** _PROTOCOL_
> Filter by routing protocol

# DESCRIPTION

**ip route list** displays entries from the kernel routing tables. The main table contains user-configured routes, while the local table contains routes for local addresses automatically maintained by the kernel.

Routes show the destination network, gateway or interface, and various attributes like metrics, source preference, and protocol that added the route.

# CAVEATS

The routing cache was removed in Linux 3.6. Very large routing tables may produce extensive output. Multiple tables exist for policy routing setups.

# HISTORY

ip route list is part of iproute2 and replaces the older route command. It provides comprehensive access to Linux's advanced routing features including multiple tables and policy routing.

# SEE ALSO

[ip](/man/ip)(8), [ip-route](/man/ip-route)(8), [ip-route-add](/man/ip-route-add)(8), [ip-rule](/man/ip-rule)(8)
