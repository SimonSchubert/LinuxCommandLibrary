# TLDR

**Monitor** all network state changes

```ip monitor```

Monitor **specific** event type

```ip monitor [link|address|route|neigh|rule|maddress]```

**Replay** an event file generated with rtmon

```ip monitor file [path/to/file]```

# SYNOPSIS

**ip monitor** [_type_] [_options_]

# PARAMETERS

**link**
> Monitor link state changes

**address**
> Monitor address changes

**route**
> Monitor routing table changes

**neigh**
> Monitor neighbour/ARP table changes

**rule**
> Monitor policy routing rule changes

**maddress**
> Monitor multicast address changes

**file** _FILE_
> Replay events from file (generated with rtmon)

# DESCRIPTION

**ip monitor** watches for network state changes in real-time and reports them to stdout. It uses netlink sockets to receive kernel notifications about network configuration changes.

This is useful for debugging network issues, monitoring dynamic changes, and understanding how network configuration evolves over time. Multiple event types can be monitored simultaneously.

# CAVEATS

Monitoring requires appropriate privileges to access netlink sockets. Output can be verbose on active systems. Events are reported in real-time but may be buffered.

# HISTORY

ip monitor is part of iproute2, developed by Alexey Kuznetsov. The netlink interface it uses was introduced in Linux 2.2 and has been enhanced in subsequent kernel versions.

# SEE ALSO

[ip](/man/ip)(8), [rtmon](/man/rtmon)(8), [ss](/man/ss)(8)
