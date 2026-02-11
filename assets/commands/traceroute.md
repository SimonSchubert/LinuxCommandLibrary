# TAGLINE

Trace packet route to network host

# TLDR

**Trace route to a host**

```traceroute [host]```

**Use ICMP echo** instead of UDP

```traceroute -I [host]```

**Use TCP SYN** for probes

```sudo traceroute -T [host]```

**Set maximum hops**

```traceroute -m [20] [host]```

**Set number of probes** per hop

```traceroute -q [1] [host]```

**Use a specific port**

```traceroute -p [80] [host]```

**Force IPv4 or IPv6**

```traceroute -4 [host]```

**Don't resolve hostnames**

```traceroute -n [host]```

# SYNOPSIS

**traceroute** [_options_] _host_ [_packet_size_]

# PARAMETERS

**-4**, **-6**
> Force IPv4 or IPv6

**-I**
> Use ICMP ECHO for probes

**-T**
> Use TCP SYN for probes (requires root)

**-U**
> Use UDP datagrams (default)

**-m** _MAX_
> Maximum number of hops (default: 30)

**-q** _NQUERIES_
> Number of probes per hop (default: 3)

**-w** _WAIT_
> Wait time for response in seconds (default: 5.0)

**-p** _PORT_
> Destination port (UDP base or TCP destination)

**-n**
> Do not resolve IP addresses to hostnames

**-N** _NUM_
> Number of simultaneous probes (default: 16)

**-f** _FIRST_
> Start from specified TTL (default: 1)

**-F**
> Set "Don't Fragment" bit

**-i** _INTERFACE_
> Specify network interface

**-s** _SOURCE_
> Use specified source address

**-z** _PAUSE_
> Pause between probes (seconds or milliseconds if >10)

**-A**
> Perform AS path lookups

**--mtu**
> Discover MTU along the path

**-V**
> Show version

# DESCRIPTION

**traceroute** displays the route packets take to reach a network host. It sends probe packets with incrementing TTL (Time To Live) values, causing each router along the path to respond with an ICMP "time exceeded" message, revealing its address.

Each line shows a hop number, router hostname/IP, and round-trip times for each probe (default: 3). Asterisks (*) indicate no response within the timeout period—this may be due to firewalls, rate limiting, or packet loss.

Different probe methods work better in different networks: ICMP (**-I**) may be blocked by firewalls, TCP (**-T**) can reach hosts that block other probes, and UDP (default) works for unprivileged users but may be filtered.

# CAVEATS

Many networks filter ICMP or UDP traceroute packets. Asymmetric routing means the return path may differ from the forward path shown. Response times include processing delays at each hop, not just transmission time. Some routers don't decrement TTL or respond to probes. TCP mode requires root privileges.

# HISTORY

traceroute was written by **Van Jacobson** in **1987** at Lawrence Berkeley Laboratory. It became an essential network diagnostic tool, included in virtually all Unix-like systems. The concept exploits the TTL field's original purpose of preventing routing loops. Variants include **tracepath** (doesn't require root), **mtr** (combines ping and traceroute), and Windows **tracert**.

# SEE ALSO

[ping](/man/ping)(8), [mtr](/man/mtr)(8), [tracepath](/man/tracepath)(8), [netstat](/man/netstat)(8)
