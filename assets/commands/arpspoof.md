# TLDR

**Poison** all hosts for target

```sudo arpspoof -i wlan0 host_ip```

Poison specific **target**

```sudo arpspoof -i wlan0 -t target_ip host_ip```

**Bidirectional** poisoning

```sudo arpspoof -i wlan0 -r -t target_ip host_ip```

# SYNOPSIS

**arpspoof** [_OPTIONS_] _host_

# DESCRIPTION

**arpspoof** forges ARP replies to intercept network packets. It sends fake ARP responses to redirect traffic through the attacker's machine, enabling man-in-the-middle attacks for network analysis and security testing.

# PARAMETERS

**-i** _interface_
> Network interface to use

**-t** _target_
> Target IP address to poison (poisons all hosts if omitted)

**-r**
> Poison both target and host (bidirectional)

**host**
> IP address of the host to impersonate (usually the gateway)

# CAVEATS

This is a penetration testing tool that can disrupt network traffic. Only use on networks you own or have explicit authorization to test. Requires root privileges and IP forwarding enabled for traffic to flow.

# HISTORY

**arpspoof** is part of the **dsniff** package, a collection of network auditing tools for penetration testing and security analysis.

# SEE ALSO

[dsniff](/man/dsniff)(8), [tcpdump](/man/tcpdump)(8), [ettercap](/man/ettercap)(8)
