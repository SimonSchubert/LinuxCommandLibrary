# TAGLINE

watches for network state changes in real-time and reports them to stdout

# TLDR

**Monitor** all network state changes

```ip monitor```

Monitor **specific** event types

```ip monitor [link|address|route|neigh|rule|maddress|nexthop]```

Monitor events for a **specific device** only

```ip monitor dev [eth0]```

Prefix each event with its **type** label and a **timestamp**

```ip -ts monitor label```

Monitor only **IPv6** route changes

```ip -6 monitor route```

Monitor events in **all network namespaces** with an nsid

```ip monitor all-nsid```

**Replay** an event file generated with rtmon

```ip monitor file [path/to/file]```

# SYNOPSIS

**ip** [_options_] **monitor** [**all** | _OBJECT-LIST_] [**file** _FILENAME_] [**label**] [**all-nsid**] [**dev** _DEVICE_]

# PARAMETERS

**all**
> Monitor all object types (default)

**link**
> Monitor link state changes

**address**
> Monitor address changes

**route**
> Monitor routing table changes

**mroute**
> Monitor multicast routing changes

**neigh**
> Monitor neighbour/ARP table changes

**rule**
> Monitor policy routing rule changes

**maddress**
> Monitor multicast address changes

**nexthop**
> Monitor nexthop object changes

**netconf**, **prefix**, **acaddress**, **stats**, **nsid**
> Monitor per-device configuration, IPv6 prefixes, anycast addresses, statistics and namespace ID changes

**label**
> Prefix each message with its object type, e.g. [LINK] or [NEIGH]

**all-nsid**
> Listen to all network namespaces that have an nsid assigned

**dev** _DEVICE_
> Only print events related to this device

**file** _FILE_
> Replay events from file (generated with rtmon)

**-t**, **-timestamp**
> Print a full timestamp on a separate line before each event

**-ts**, **-tshort**
> Print a short ISO-style timestamp on the same line as each event

# DESCRIPTION

**ip monitor** watches for network state changes in real-time and reports them to stdout. It uses netlink sockets to receive kernel notifications about network configuration changes.

This is useful for debugging network issues, monitoring dynamic changes, and understanding how network configuration evolves over time. Multiple event types can be monitored simultaneously by listing them.

# CAVEATS

Output can be verbose on active systems. Only events occurring after startup are shown; use **rtmon** started at boot to keep a full history.

# HISTORY

ip monitor is part of iproute2, developed by Alexey Kuznetsov. The netlink interface it uses was introduced in Linux 2.2 and has been enhanced in subsequent kernel versions.

# INSTALL

```apt: sudo apt install iproute2```

```pacman: sudo pacman -S iproute2```

```apk: sudo apk add iproute2-minimal```

```zypper: sudo zypper install iproute2```

```brew: brew install iproute2```

```nix: nix profile install nixpkgs#iproute2```

<!-- packages: 2026-09-28 -->

# SEE ALSO

[ip](/man/ip)(8), [rtmon](/man/rtmon)(8), [ss](/man/ss)(8), [bridge](/man/bridge)(8)

# RESOURCES

```[Source code](https://git.kernel.org/pub/scm/network/iproute2/iproute2.git)```

```[Documentation](https://man7.org/linux/man-pages/man8/ip-monitor.8.html)```

<!-- verified: 2026-09-29 -->
