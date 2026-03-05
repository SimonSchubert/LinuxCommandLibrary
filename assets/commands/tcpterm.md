# TAGLINE

TUI packet visualizer, tcpdump for humans

# TLDR

**Capture packets on a network interface**

```tcpterm -i [eth0]```

**Read packets from a pcap file**

```tcpterm --read [capture.pcap]```

**Apply a BPF filter for HTTP traffic**

```tcpterm --filter "[port 80]"```

# SYNOPSIS

**tcpterm** [_options_]

# PARAMETERS

**-i** _INTERFACE_
> Network interface to capture packets from.

**--read** _FILE_
> Read packets from a pcap file.

**--filter** _EXPRESSION_
> BPF filter expression.

# DESCRIPTION

**tcpterm** is a terminal-based packet visualizer that provides a more user-friendly alternative to tcpdump. It can capture live traffic from a network interface or read from pcap files, with BPF filter support.

# HISTORY

**tcpterm** was created by **Takumasa Sakao** (sachaos) and is written in **Go**.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1)
