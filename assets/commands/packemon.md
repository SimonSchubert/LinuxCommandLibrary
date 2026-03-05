# TAGLINE

TUI tool for generating and monitoring network packets

# TLDR

**Launch the packet monitor**

```sudo packemon monitor```

**Launch the packet generator**

```sudo packemon generator```

**Monitor on a specific interface**

```sudo packemon monitor --interface [eth0]```

**List available network interfaces**

```packemon interfaces```

# SYNOPSIS

**packemon** _command_ [_options_]

# PARAMETERS

**monitor**, **mon**, **m**
> Monitor packets on the specified network interface.

**generator**, **gen**, **g**
> Generate and send custom network packets.

**interfaces**, **intfs**, **i**
> List available network interfaces.

**--interface** _NAME_
> Specify the network interface. Default: eth0.

# DESCRIPTION

**packemon** is a TUI tool for generating custom network packets and monitoring traffic on network interfaces. It supports Ethernet, ARP, IPv4/IPv6, ICMP, TCP, UDP, TLS 1.2/1.3, QUIC, DNS, and HTTP protocols. The monitor mode can capture packets and export them to pcapng format for analysis in Wireshark.

# CAVEATS

Requires root privileges. On Linux, depends on eBPF for TCP RST suppression. On Windows, requires Npcap.

# HISTORY

**packemon** was created by **ddddddO** and is written in **Go**.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [nmap](/man/nmap)(1)
