# TAGLINE

Loop-avoiding distance-vector routing protocol daemon.

# TLDR

**Start** Babel routing daemon

```babeld [eth0]```

Start with **configuration file**

```babeld -c [/etc/babeld.conf] [eth0]```

Run in **foreground**

```babeld -d [1] [eth0]```

**Multiple interfaces**

```babeld [eth0] [eth1] [wlan0]```

# SYNOPSIS

**babeld** [_options_] _interface_...

# DESCRIPTION

**babeld** is a loop-avoiding distance-vector routing protocol daemon. Babel is designed for IPv6 and IPv4 networks, particularly wireless mesh networks, providing fast convergence and low overhead.

The daemon implements the Babel routing protocol (RFC 8966) and is suitable for small to medium-sized networks.

# PARAMETERS

**-c** _file_
> Configuration file (repeatable).

**-C** _statement_
> Provide configuration via command line.

**-d** _level_
> Debug level (0-3).

**-D**
> Daemonize at startup.

**-L** _file_
> Log file location.

**-I** _file_
> PID file location.

**-S** _file_
> State file for preserving long-term information between invocations.

**-h** _seconds_
> Hello packet interval for wireless interfaces (default: 4s).

**-H** _seconds_
> Hello packet interval for wired interfaces (default: 4s).

**-m** _address_
> Link-local multicast address (default: ff02:0:0:0:0:0:1:6).

**-p** _port_
> UDP port number (default: 6696).

**-k** _priority_
> Kernel route installation priority (default: 0).

**-g** _port|path_
> Enable read-only configuration server.

**-G** _port|path_
> Enable read-write configuration server.

**-t** _table_
> Kernel routing table for route insertion.

**-w**
> Treat all interfaces as wireless by default.

**-s**
> Disable split-horizon on wired interfaces.

**-r**
> Use random router-id instead of deriving from MAC address.

**-l**
> Use IFF_RUNNING to detect interface availability.

# FEATURES

- Loop-free routing
- Fast convergence
- IPv4 and IPv6 support
- Link quality sensing
- Multiple routing metrics
- Extensible through configuration

# CONFIGURATION

**/etc/babeld.conf**
> Main configuration file for interface settings, filters, and redistribution rules.

# CAVEATS

Requires proper network configuration. All nodes must run compatible Babel implementation. Wireless networks need link quality extensions. Not suitable for large-scale networks (use BGP/OSPF). Configuration errors can cause routing loops.

# HISTORY

**Babel** was designed by Juliusz Chroboczek around **2008** as an improved distance-vector protocol for mesh networks, later standardized as RFC 6126 and updated to RFC 8966.

# SEE ALSO

[bird](/man/bird)(1), [route](/man/route)(8), [ip](/man/ip)(8), [traceroute](/man/traceroute)(1)
