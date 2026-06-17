# TAGLINE

Forge ARP replies for man-in-the-middle interception.

# TLDR

**Poison** all hosts for target

```sudo arpspoof -i wlan0 host_ip```

Poison specific **target**

```sudo arpspoof -i wlan0 -t target_ip host_ip```

**Bidirectional** poisoning

```sudo arpspoof -i wlan0 -r -t target_ip host_ip```

# SYNOPSIS

**arpspoof** [_-i interface_] [_-c own_|_host_|_both_] [_-t target_] [_-r_] _host_

# DESCRIPTION

**arpspoof** forges ARP replies to intercept network packets. It sends fake ARP responses to redirect traffic through the attacker's machine, enabling man-in-the-middle attacks for network analysis and security testing.

# PARAMETERS

**-i** _interface_
> Network interface to use

**-c** _own_|_host_|_both_
> Which hardware address to use when restoring the ARP configuration on cleanup (default: own)

**-t** _target_
> Target IP address to poison (poisons all hosts if omitted). May be repeated to specify multiple targets

**-r**
> Poison both host and target to capture traffic in both directions (only valid in conjunction with -t)

**host**
> IP address of the host to impersonate (usually the gateway)

# CAVEATS

This is a penetration testing tool that can disrupt network traffic. Only use on networks you own or have explicit authorization to test. Requires root privileges and IP forwarding enabled for traffic to flow.

# HISTORY

**arpspoof** is part of the **dsniff** package, a collection of network auditing tools for penetration testing and security analysis.

# SEE ALSO

[dsniff](/man/dsniff)(8), [tcpdump](/man/tcpdump)(8), [ettercap](/man/ettercap)(8)

# RESOURCES

```[Source code](https://github.com/tecknicaltom/dsniff)```

```[Homepage](https://www.monkey.org/~dugsong/dsniff/)```

<!-- verified: 2026-06-16 -->
