# TLDR

**TCP ping to port**

```nping --tcp -p [80] [target]```

**UDP ping**

```nping --udp -p [53] [target]```

**ICMP echo ping**

```nping --icmp [target]```

**Send multiple packets**

```nping -c [5] [target]```

**Set packet rate**

```nping --rate [10] [target]```

**TCP SYN packets**

```nping --tcp --flags syn -p [22] [target]```

**ARP ping** (local network)

```nping --arp [192.168.1.0/24]```

**Traceroute mode**

```nping --traceroute [target]```

# SYNOPSIS

**nping** [_--tcp_] [_--udp_] [_--icmp_] [_-p port_] [_-c count_] [_options_] _targets_

# PARAMETERS

**--tcp**
> TCP mode.

**--udp**
> UDP mode.

**--icmp**
> ICMP mode.

**--arp**
> ARP mode.

**-p** _PORT_
> Target port(s).

**-c** _COUNT_
> Packet count.

**--rate** _RATE_
> Packets per second.

**--flags** _FLAGS_
> TCP flags (syn, ack, rst, etc.).

**--ttl** _TTL_
> IP time to live.

**--data-length** _LEN_
> Append random data.

**--data-string** _STR_
> Append string data.

**--traceroute**
> Traceroute mode.

**-e** _IFACE_
> Network interface.

**-S** _ADDR_
> Source address.

**--echo-client** _PASS_
> Echo mode client.

**--echo-server** _PASS_
> Echo mode server.

# DESCRIPTION

**nping** is a flexible packet generation and response analysis tool. It extends ping functionality to arbitrary protocol combinations.

TCP mode probes ports without completing connections. SYN packets test firewall rules and service availability. Custom flag combinations test TCP stack behavior.

UDP probing tests UDP services. ICMP includes various message types beyond echo requests. ARP queries resolve MAC addresses on local networks.

Echo mode bounces packets through a server, useful for testing firewalls and NAT traversal. The client sends packets to the server, which returns them.

Traceroute mode discovers network paths by incrementing TTL values. It works with TCP, UDP, or ICMP probes.

Packet customization includes payload data, timing, and protocol options. This enables protocol research and network testing.

# CAVEATS

Raw sockets require root privileges. Some modes may trigger IDS alerts. Use only on authorized networks. Results depend on firewall configuration.

# HISTORY

**nping** was developed as part of the **Nmap** project by **Gordon Lyon** (Fyodor) and contributors. It complements Nmap's port scanning with active probing capabilities.

# SEE ALSO

[nmap](/man/nmap)(1), [hping3](/man/hping3)(8), [ping](/man/ping)(1), [traceroute](/man/traceroute)(1)
