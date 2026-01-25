# TLDR

**TCP SYN ping**

```sudo hping3 -S -p [80] [target]```

**ICMP ping**

```sudo hping3 -1 [target]```

**UDP ping**

```sudo hping3 -2 -p [53] [target]```

**Traceroute mode**

```sudo hping3 --traceroute -p [80] -S [target]```

**Flood mode**

```sudo hping3 --flood -S -p [80] [target]```

**Set source port**

```sudo hping3 -S -p [80] -s [12345] [target]```

# SYNOPSIS

**hping3** [_options_] _host_

# PARAMETERS

**-S**, **--syn**
> Set SYN flag.

**-A**, **--ack**
> Set ACK flag.

**-F**, **--fin**
> Set FIN flag.

**-p** _port_
> Destination port.

**-s** _port_
> Source port.

**-1**, **--icmp**
> ICMP mode.

**-2**, **--udp**
> UDP mode.

**--flood**
> Flood mode (fast as possible).

**--traceroute**
> Traceroute mode.

**-i** _interval_
> Interval between packets.

**-c** _count_
> Packet count.

**-a** _address_
> Spoof source address.

**--data** _size_
> Data size.

# DESCRIPTION

**hping3** is a network tool for crafting TCP/IP packets. It's used for firewall testing, port scanning, network testing, and security auditing. It provides more control than ping or traceroute.

hping3 can send custom packets with specified flags, options, and payloads, making it valuable for penetration testing and troubleshooting.

# CAVEATS

Requires root privileges. Flood mode can cause DoS. Spoofed packets may be illegal. For authorized testing only. Some features may trigger IDS.

# HISTORY

hping was created by **Salvatore Sanfilippo** (antirez, also creator of Redis). hping3 is the latest version, adding scripting capabilities and improved functionality.

# SEE ALSO

[nmap](/man/nmap)(1), [ping](/man/ping)(8), [tcpdump](/man/tcpdump)(1), [scapy](/man/scapy)(1)
