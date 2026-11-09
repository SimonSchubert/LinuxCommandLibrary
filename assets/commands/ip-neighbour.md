# TAGLINE

manages the ARP and NDP neighbour tables

# TLDR

Display the **neighbour/ARP table**

```ip neighbour```

**Flush** entries for a specific device

```sudo ip neighbour flush dev [eth0]```

**Lookup** a neighbour entry

```ip neighbour get [192.168.1.1] dev [eth0]```

**Add** a static ARP entry

```sudo ip neighbour add [192.168.1.100] lladdr [00:11:22:33:44:55] dev [eth0] nud permanent```

**Show** only entries in a given state

```ip neighbour show nud [reachable]```

**Delete** an ARP entry

```sudo ip neighbour delete [192.168.1.100] dev [eth0]```

**Replace** an ARP entry

```sudo ip neighbour replace [192.168.1.100] lladdr [00:11:22:33:44:55] dev [eth0]```

# SYNOPSIS

**ip neighbour** [_command_] [_options_]

# PARAMETERS

**show** [**dev** _DEVICE_]
> Display neighbour table entries

**add** _IP_ **lladdr** _MAC_ **dev** _DEVICE_
> Add a neighbour entry

**delete** _IP_ **dev** _DEVICE_
> Remove a neighbour entry

**change** _IP_ **lladdr** _MAC_ **dev** _DEVICE_
> Modify existing entry

**replace** _IP_ **lladdr** _MAC_ **dev** _DEVICE_
> Add or change entry

**flush** **dev** _DEVICE_
> Clear entries for a device. Takes the same selectors as show, refuses to run without arguments, and skips permanent and noarp entries by default.

**get** _IP_ **dev** _DEVICE_
> Lookup single entry

**nud** _STATE_
> Neighbour state: permanent, noarp, reachable, stale, none, incomplete, delay, probe, failed.

**proxy** _ADDR_
> Manage proxy ARP/NDP entries.

**to** _PREFIX_
> Filter entries by address prefix (used with show/flush).

**router**
> Mark the neighbour as a router.

**extern_learn**
> Mark the entry as learned externally by a controller. The kernel will not garbage-collect it.

**protocol** _PROTO_
> Origin of the entry; also filters show/flush output.

**vrf** _NAME_
> Only list neighbours for the given VRF (show/flush).

**nomaster**
> Only list neighbours on interfaces with no master (show/flush).

**unused**
> Only list neighbours not currently in use (show).

# DESCRIPTION

**ip neighbour** manages the ARP (IPv4) and NDP (IPv6) neighbour tables. These tables map IP addresses to link-layer (MAC) addresses for hosts on directly connected networks.

The neighbour cache is normally populated automatically through ARP/NDP protocols, but static entries can be added for hosts that don't respond to ARP or for security purposes.

# CAVEATS

Modifying entries requires root privileges. Permanent entries do not follow MAC changes on the network and must be updated by hand. Deleting or changing a kernel-created **noarp** entry may cause unpredictable behaviour. IPv6 uses NDP instead of ARP but is managed through the same interface.

# HISTORY

ip neighbour is part of iproute2 and replaces the older arp command from net-tools. It provides unified IPv4 and IPv6 neighbour management.

# SEE ALSO

[ip](/man/ip)(8), [arp](/man/arp)(8), [arping](/man/arping)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-neighbour.8.html)```

<!-- verified: 2026-11-09 -->

