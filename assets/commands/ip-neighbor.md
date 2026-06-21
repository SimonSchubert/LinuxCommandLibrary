# TAGLINE

manages the ARP and NDP neighbor tables

# TLDR

Display the **neighbor/ARP table**

```ip neighbor```

**Flush** entries for a specific device

```sudo ip neighbor flush dev [eth0]```

**Lookup** a neighbor entry

```ip neighbor get [192.168.1.1] dev [eth0]```

**Add** a static ARP entry

```sudo ip neighbor add [192.168.1.100] lladdr [00:11:22:33:44:55] dev [eth0] nud reachable```

**Delete** an ARP entry

```sudo ip neighbor delete [192.168.1.100] dev [eth0]```

**Replace** an ARP entry

```sudo ip neighbor replace [192.168.1.100] lladdr [00:11:22:33:44:55] dev [eth0]```

# SYNOPSIS

**ip neighbor** [_command_] [_options_]

# PARAMETERS

**show** [**dev** _DEVICE_]
> Display neighbor table entries

**add** _IP_ **lladdr** _MAC_ **dev** _DEVICE_
> Add a neighbor entry

**delete** _IP_ **dev** _DEVICE_
> Remove a neighbor entry

**change** _IP_ **lladdr** _MAC_ **dev** _DEVICE_
> Modify existing entry

**replace** _IP_ **lladdr** _MAC_ **dev** _DEVICE_
> Add or change entry

**flush** **dev** _DEVICE_
> Clear entries for a device

**get** _IP_ **dev** _DEVICE_
> Lookup single entry

**nud** _STATE_
> Neighbor state: permanent, noarp, reachable, stale, none, incomplete, delay, probe, failed.

**proxy** _ADDR_
> Manage proxy ARP/NDP entries.

**to** _PREFIX_
> Filter entries by address prefix (used with show/flush).

# DESCRIPTION

**ip neighbor** manages the ARP (IPv4) and NDP (IPv6) neighbor tables. These tables map IP addresses to link-layer (MAC) addresses for hosts on directly connected networks.

The neighbor cache is normally populated automatically through ARP/NDP protocols, but static entries can be added for hosts that don't respond to ARP or for security purposes.

**neighbor** is the American spelling accepted by **ip**; **neighbour** is the equivalent British spelling, and both refer to the same object. The keyword can also be abbreviated to **neigh** or **n**.

# CAVEATS

Modifying entries requires root privileges. Static entries may become stale if the actual MAC changes. IPv6 uses NDP instead of ARP but is managed through the same interface.

# HISTORY

ip neighbor is part of iproute2 and replaces the older arp command from net-tools. It provides unified IPv4 and IPv6 neighbor management.

# SEE ALSO

[ip](/man/ip)(8), [ip-neighbour](/man/ip-neighbour)(8), [arp](/man/arp)(8), [arping](/man/arping)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://www.man7.org/linux/man-pages/man8/ip-neighbour.8.html)```

<!-- verified: 2026-06-22 -->
