# TAGLINE

displays network configuration parameters for interfaces

# TLDR

Show **all** network configuration

```ip netconf```

Show config for **specific interface**

```ip netconf show dev eth0```

Show only **IPv4** configuration

```ip -4 netconf```

Show only **IPv6** configuration

```ip -6 netconf```

# SYNOPSIS

**ip** [_OPTIONS_] **netconf** { **show** | **help** }

# DESCRIPTION

**ip netconf** displays network configuration parameters for interfaces. It shows settings like forwarding status, RPF (Reverse Path Filtering) mode, MC forwarding, and proxy ARP/NDP status.

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

# CAVEATS

Use -4 or -6 to filter by address family. Configuration can only be changed through sysctl or interface-specific tools, not through ip netconf directly.

# HISTORY

**ip netconf** is part of **iproute2**, providing network configuration management for Linux systems.

# SEE ALSO

[ip](/man/ip)(8), [ip-link](/man/ip-link)(8), [sysctl](/man/sysctl)(8)
