# TLDR

**Send ICMP ping**

```hping3 -1 [host]```

**Send TCP SYN to port**

```hping3 -S -p [80] [host]```

**Send UDP packets**

```hping3 -2 -p [53] [host]```

**Traceroute mode**

```hping3 --traceroute -1 [host]```

**Specify packet count**

```hping3 -c [5] -1 [host]```

**Set source IP (spoofing)**

```hping3 -a [source-ip] -S -p [80] [host]```

**Port scan**

```hping3 -8 [1-100] -S [host]```

# SYNOPSIS

**hping3** [_options_] _host_

# PARAMETERS

**-1**
> ICMP mode (default echo request).

**-2**
> UDP mode.

**-S**
> TCP SYN flag.

**-p** _port_
> Destination port.

**-c** _count_
> Number of packets.

**-a** _address_
> Spoof source IP.

**-8** _range_
> Port scan mode.

**--traceroute**
> Traceroute mode.

**-C** _type_
> Set ICMP type.

**-K** _code_
> Set ICMP code.

# DESCRIPTION

**hping3** is a network packet crafting tool that sends custom TCP, UDP, ICMP, or raw IP packets and displays replies. Use it for firewall testing, port scanning, network performance testing, path MTU discovery, and OS fingerprinting. Supports packet fragmentation and arbitrary body content.

# CAVEATS

Requires root privileges. Some features may be blocked by firewalls or IDS systems.

# SEE ALSO

[ping](/man/ping)(1), [nmap](/man/nmap)(1), [traceroute](/man/traceroute)(1)

