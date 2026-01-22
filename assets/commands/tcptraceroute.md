# TLDR

**Trace** route to a host

```tcptraceroute host```

Trace to specific **destination port**

```tcptraceroute host 80```

Specify **source port** and address

```tcptraceroute host -p 12345 -s 192.168.1.10```

Set **first and maximum TTL**

```tcptraceroute host -f 1 -m 30```

Set **wait time** and queries per hop

```tcptraceroute host -w 3 -q 3```

Specify **network interface**

```tcptraceroute host -i eth0```

Use **numeric** output only

```tcptraceroute -n host```

# SYNOPSIS

**tcptraceroute** [_options_] _host_ [_destination_port_] [_packet_length_]

# DESCRIPTION

**tcptraceroute** is a traceroute implementation using TCP packets. It can trace through firewalls that block traditional ICMP or UDP traceroute packets by using TCP SYN packets to a specified port.

# PARAMETERS

**-p PORT**
> Set local source port

**-s ADDRESS**
> Set source IP address

**-i INTERFACE**
> Specify network interface to use

**-f TTL**
> Set the initial (first) TTL value

**-m TTL**
> Set the maximum TTL value (default: 30)

**-w SECONDS**
> Set the timeout for each probe (default: 3)

**-q QUERIES**
> Set number of queries per hop (default: 3)

**-n**
> Print numeric addresses only (no DNS resolution)

**-N**
> Enable lookup of hostnames

**-S**
> Set SYN flag on outgoing packets

**-A**
> Set ACK flag on outgoing packets

**-E**
> Set ECN flag on outgoing packets

# CAVEATS

Requires root privileges or appropriate capabilities to send raw packets. The destination port defaults to 80 (HTTP). Some firewalls may still block TCP probes depending on their configuration.

# HISTORY

**tcptraceroute** was created as an alternative to traditional traceroute that could bypass firewalls blocking ICMP and UDP packets by using TCP SYN packets.

# SEE ALSO

[traceroute](/man/traceroute)(8), [mtr](/man/mtr)(8), [tracepath](/man/tracepath)(8)
