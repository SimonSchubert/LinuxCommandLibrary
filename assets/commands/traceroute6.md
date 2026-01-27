# TLDR

**Trace the route to an IPv6 host**

```traceroute6 [host]```

**Trace with numeric output only** (no DNS resolution)

```traceroute6 -n [host]```

**Set maximum hop limit**

```traceroute6 -m [60] [host]```

**Start from a specific hop**

```traceroute6 -f [5] [host]```

**Use ICMP ECHO instead of UDP**

```traceroute6 -I [host]```

**Set the number of probes per hop**

```traceroute6 -q [5] [host]```

**Specify source address**

```traceroute6 -s [source_address] [host]```

# SYNOPSIS

**traceroute6** [_-dIlnNrvU_] [_-f firsthop_] [_-g gateway_] [_-m hoplimit_] [_-p port_] [_-q probes_] [_-s src_] [_-w waittime_] _target_ [_datalen_]

# PARAMETERS

**-n**
> Do not resolve addresses to hostnames

**-m** _hoplimit_
> Maximum hop limit (default: 30, max: 255)

**-f** _firsthop_
> Start probes at specified hop (skip earlier hops)

**-I**
> Use ICMPv6 ECHO instead of UDP datagrams

**-N**
> Use packets with no upper layer header

**-p** _port_
> Set destination UDP port

**-q** _probes_
> Number of probes per hop (default: 3)

**-s** _src_
> Use specified source address

**-w** _waittime_
> Wait time in seconds for responses

**-g** _gateway_
> Specify intermediate gateway (uses routing header)

# DESCRIPTION

**traceroute6** traces the route IPv6 packets take to reach a destination host. It exploits the IPv6 hop limit field by sending probes with increasing limits, eliciting ICMPv6 TIME_EXCEEDED responses from each router along the path.

Each line of output shows the hop number, gateway address (and hostname unless **-n** is used), and round-trip times for each probe. The trace continues until the destination responds or the maximum hop limit is reached.

The command is equivalent to **traceroute -6** and sends UDP datagrams by default. Use **-I** for ICMPv6 ECHO probes instead.

# CAVEATS

Requires CAP_NET_RAW capability or root privileges on Linux. Some routers may not respond to probes, appearing as * * * in output. Firewalls may block traceroute probes. Response times can vary significantly between probes.

# HISTORY

traceroute was originally written by **Van Jacobson** in **1988**. The IPv6 version was ported from NRL's IPv6 distribution in **1996** and later ported to Linux by Pedro Roque.

# SEE ALSO

[traceroute](/man/traceroute)(1), [ping6](/man/ping6)(8), [mtr](/man/mtr)(8), [tracepath](/man/tracepath)(8)
