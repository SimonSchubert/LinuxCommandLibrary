# TAGLINE

List routing table in columnar format

# TLDR

Display the **default routing** table

```routel```

Display a **specific routing** table

```routel main```

Display only **IPv4** routes

```routel -4```

Display only **IPv6** routes

```routel -6```

# SYNOPSIS

**routel** [_options_] [_table_]

# PARAMETERS

**-4**, **--family inet**
> Show only IPv4 routes

**-6**, **--family inet6**
> Show only IPv6 routes

_table_
> Routing table to display (main, local, default, or number)

# DESCRIPTION

**routel** displays IP routing tables in a human-readable format. It provides a more organized view of routing information compared to raw ip route output.

The tool shows destination networks, gateways, interfaces, and other routing attributes in columnar format.

# CAVEATS

Wrapper around ip route with formatted output. May not show all information available through ip route directly.

# HISTORY

Part of **iproute2** package, providing user-friendly network routing display.

# SEE ALSO

[ip-route](/man/ip-route)(8), [route](/man/route)(8), [netstat](/man/netstat)(8)
