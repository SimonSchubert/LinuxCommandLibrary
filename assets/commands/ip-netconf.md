# TAGLINE

displays network configuration parameters for interfaces

# TLDR

Show **all** network configuration

```ip netconf```

Show config for **specific interface**

```ip netconf show dev [eth0]```

Show only **IPv4** configuration

```ip -4 netconf```

Show only **IPv6** configuration

```ip -6 netconf```

**Watch** configuration changes as they happen

```ip monitor netconf```

# SYNOPSIS

**ip** [_OPTIONS_] **netconf** { **show** [ **dev** _NAME_ ] | **help** }

# DESCRIPTION

**ip netconf** displays IPv4 and IPv6 network configuration parameters, the same ones exposed under /proc/sys/net/ipv[4|6]/conf/. It shows settings like forwarding status, RPF (Reverse Path Filtering) mode, MC forwarding, and proxy ARP/NDP status. Without **dev**, it dumps the entries for all interfaces, including the **all** and **default** entries.

# PARAMETERS

**show**
> Show network configuration (default if omitted)

**dev NAME**
> Show configuration for specific interface

**help**
> Display help information

# OUTPUT FIELDS

**forwarding**
> Whether IP forwarding is enabled

**rp_filter**
> Reverse Path Filtering mode (0=off, 1=strict, 2=loose)

**mc_forwarding**
> Whether multicast forwarding is enabled

**proxy_neigh**
> Whether proxy neighbor (ARP/NDP) is enabled

**ignore_routes_with_linkdown**
> Ignore routes when link is down

**input**
> Whether MPLS input is enabled (MPLS entries only)

# CAVEATS

Use -4 or -6 to filter by address family. Configuration can only be changed through sysctl or interface-specific tools, not through ip netconf directly.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [ip-address](/man/ip-address)(8), [ip-monitor](/man/ip-monitor)(8), [sysctl](/man/sysctl)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-netconf.8.html)```

<!-- verified: 2026-11-09 -->
