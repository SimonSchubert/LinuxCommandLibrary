# TAGLINE

Trace IPv6 packet route to host

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

**Use TCP SYN probes** to get through firewalls

```sudo traceroute6 -T -p [443] [host]```

**Set the number of probes per hop**

```traceroute6 -q [5] [host]```

**Specify source address**

```traceroute6 -s [source_address] [host]```

**Send probes through a specific interface**

```traceroute6 -i [eth0] [host]```

# SYNOPSIS

**traceroute6** [_-dFInrTU_] [_-f first_ttl_] [_-g gateway_] [_-i interface_] [_-m max_ttl_] [_-N squeries_] [_-p port_] [_-q nqueries_] [_-s src_] [_-w max_] _host_ [_packet_len_]

# PARAMETERS

**-n**
> Do not resolve addresses to hostnames

**-m** _max_ttl_
> Maximum number of hops (default: 30)

**-f** _first_ttl_
> Start probes at specified hop (default: 1)

**-I**
> Use ICMPv6 ECHO for probes

**-T**
> Use TCP SYN for probes

**-U**
> Use UDP to a particular destination port instead of increasing the port per probe (default port 53)

**-N** _squeries_
> Number of probes sent out simultaneously (default: 16)

**-p** _port_
> Destination port base for UDP, initial sequence for ICMP, constant port for TCP

**-q** _nqueries_
> Number of probes per hop (default: 3)

**-s** _src_
> Use specified source address

**-i** _interface_
> Send packets through the specified interface

**-w** _max_
> Maximum wait time in seconds for a response (default: 5.0)

**-F**
> Do not fragment probe packets

**-g** _gateway_
> Route packets through an intermediate gateway (uses a routing header)

# DESCRIPTION

**traceroute6** traces the route IPv6 packets take to reach a destination host. It exploits the IPv6 hop limit field by sending probes with increasing limits, eliciting ICMPv6 TIME_EXCEEDED responses from each router along the path.

Each line of output shows the hop number, gateway address (and hostname unless **-n** is used), and round-trip times for each probe. The trace continues until the destination responds or the maximum hop limit is reached.

On Linux the command is usually provided by the **traceroute** package, where it is equivalent to **traceroute -6** and sends UDP datagrams by default. Use **-I** for ICMPv6 ECHO probes instead.

# CAVEATS

The options above are those of the Linux **traceroute** package. Other implementations differ: the BSD **traceroute6** has a **-N** that sends probes with no upper layer header, and the older iputils version accepted only **-dnrvV**, **-i**, **-m**, **-p**, **-q**, **-s** and **-w**. UDP probes are allowed for unprivileged users, while methods such as **-T** need privileges. Some routers may not respond to probes, appearing as * * * in output. Firewalls may block traceroute probes. Response times can vary significantly between probes.

# HISTORY

traceroute was originally written by **Van Jacobson** in **1988**. A Linux traceroute6 based on the port in NRL's IPv6 distribution from **1996**, ported by Pedro Roque, long lived in iputils until it was removed in release **20211215** in favor of **traceroute**, **tracepath** and **mtr**.

# SEE ALSO

[traceroute](/man/traceroute)(1), [ping6](/man/ping6)(8), [mtr](/man/mtr)(8), [tracepath](/man/tracepath)(8)

# RESOURCES

```[Homepage](https://traceroute.sourceforge.net/)```

<!-- verified: 2026-11-09 -->
