# TAGLINE

Legacy TCP/IP packet crafting and analysis tool, the predecessor to hping3

# TLDR

**Send ICMP ping**

```hping -1 [host]```

**Send TCP SYN to a port**

```hping -S -p [80] [host]```

**Send UDP packets to a port**

```hping -2 -p [53] [host]```

**Traceroute mode**

```hping --traceroute -1 [host]```

**Send a fixed number of packets**

```hping -c [5] -1 [host]```

**Spoof the source IP address**

```hping -a [source-ip] -S -p [80] [host]```

**Scan a range of ports**

```hping -8 [1-100] -S [host]```

# SYNOPSIS

**hping** [_options_] _host_

# PARAMETERS

**-0**, **--rawip**
> Raw IP mode.

**-1**, **--icmp**
> ICMP mode.

**-2**, **--udp**
> UDP mode.

**-8**, **--scan** _range_
> Port scan mode.

**-S**, **--syn**
> Set TCP SYN flag.

**-A**, **--ack**
> Set TCP ACK flag.

**-p**, **--destport** _port_
> Destination port.

**-s**, **--baseport** _port_
> Source port.

**-c**, **--count** _count_
> Number of packets to send.

**-i**, **--interval** _wait_
> Interval between packets.

**-a**, **--spoof** _host_
> Spoof the source address.

**-T**, **--traceroute**
> Traceroute mode.

**-C** _type_
> Set ICMP type.

**-K** _code_
> Set ICMP code.

# DESCRIPTION

**hping** (also known as hping2) is a command-line tool that crafts and sends custom TCP, UDP, ICMP, or raw IP packets and displays the target's replies, similar to how **ping** shows ICMP echo replies. It supports fragmentation, arbitrary packet bodies, and can be used for firewall testing, port scanning, path MTU discovery, traceroute-like probing over arbitrary protocols, and TCP/IP stack auditing.

**hping3** superseded this version by adding Tcl scripting support, but reuses the same underlying packet-generation code, so hping's command-line flags carry over almost unchanged. Most current Linux distributions only package **hping3**; the plain **hping** binary is largely a legacy name kept for compatibility and may not be installed by default.

# CAVEATS

Requires root privileges to craft raw packets. **hping** is unmaintained; new deployments should use **hping3** instead, which receives the (limited) ongoing upkeep. Spoofed packets and aggressive scanning may be illegal without authorization and can trigger firewalls or IDS systems.

# HISTORY

**hping** was created by **Salvatore Sanfilippo** ("antirez", also the creator of Redis) in the late 1990s as a packet generator and analyzer for TCP/IP protocols. Sanfilippo used it to develop the idle scan technique later adopted by Nmap. **hping3**, released in 2005, replaced it as the actively developed version by adding a Tcl scripting engine on top of the same core packet-crafting code.

# SEE ALSO

[hping3](/man/hping3)(8), [nmap](/man/nmap)(1), [ping](/man/ping)(1), [traceroute](/man/traceroute)(1)

# RESOURCES

```[Source code](https://github.com/antirez/hping)```

<!-- verified: 2026-07-19 -->
