# TAGLINE

Send ARP requests to discover and test network hosts

# TLDR

**Ping a host using ARP**

```sudo arping [192.168.1.1]```

**Ping using a specific interface**

```sudo arping -I [eth0] [192.168.1.1]```

**Send a specific number of requests**

```sudo arping -c [5] [192.168.1.1]```

**Detect duplicate IP addresses on the network**

```sudo arping -D [192.168.1.1]```

**Quit after first reply** (check if host is alive)

```sudo arping -f [192.168.1.1]```

# SYNOPSIS

**arping** [_-c count_] [_-I interface_] [_-D_] _destination_

# DESCRIPTION

**arping** sends ARP requests to a target host and displays responses. Unlike ICMP ping, ARP operates at layer 2 and cannot be blocked by IP firewalls.

The tool is useful for verifying layer 2 connectivity, finding MAC addresses, and detecting duplicate IP addresses on a network.

# PARAMETERS

**-c** _count_
> Stop after sending _count_ ARP REQUEST packets.

**-I** _interface_
> Network interface to send ARP requests on.

**-D**
> Duplicate address detection mode (DAD). See RFC 2131.

**-A**
> ARP reply mode (gratuitous ARP reply).

**-U**
> Unsolicited ARP mode to update neighbours' ARP caches. No replies are expected.

**-b**
> Send only MAC-level broadcasts; do not switch to unicast after reply.

**-q**
> Quiet mode; nothing is displayed.

**-s** _source_
> Source IP address to use in ARP packets.

**-w** _deadline_
> Timeout in seconds before exiting regardless of packets sent or received.

**-i** _interval_
> Interval in seconds between packets.

**-f**
> Quit after the first reply confirming target is alive.

**-V**
> Print version and exit.

# CAVEATS

Requires root/sudo for raw socket access. Only works on local network segment. Cannot ping across routers.

# HISTORY

**arping** has existed in various forms since the early **2000s**. The most common implementation is in the **iputils** package maintained as part of Linux networking tools. A separate implementation by Thomas Habets provides additional features.

# SEE ALSO

[ping](/man/ping)(8), [arp](/man/arp)(8), [arp-scan](/man/arp-scan)(1), [ip](/man/ip)(8)
