# TAGLINE

network tool for crafting TCP/IP packets

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

**Scan a range of ports**

```sudo hping3 -8 [1-1000] -S [target]```

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

**-8**, **--scan** _range_
> Port scan mode, e.g. `-8 1-1000`.

**-V**, **--verbose**
> Verbose output.

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

hping3 can send custom packets with specified flags, options, and payloads, making it valuable for penetration testing and troubleshooting. When no protocol mode is given, it defaults to **TCP mode**, sending headers to the target's port 0 with no flags set.

# CAVEATS

Requires root privileges. Flood mode can cause DoS. Spoofed packets may be illegal. For authorized testing only. Some features may trigger IDS.

# HISTORY

hping was created by **Salvatore Sanfilippo** (antirez, also creator of Redis). hping3 is the latest version, adding scripting capabilities and improved functionality.

# INSTALL

```apt: sudo apt install hping3```

```dnf: sudo dnf install hping3```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[hping](/man/hping)(8), [nmap](/man/nmap)(1), [ping](/man/ping)(8), [tcpdump](/man/tcpdump)(1), [scapy](/man/scapy)(1)

# RESOURCES

```[Source code](https://github.com/antirez/hping)```

<!-- verified: 2026-07-19 -->

