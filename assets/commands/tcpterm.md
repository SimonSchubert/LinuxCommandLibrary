# TAGLINE

TUI packet visualizer, tcpdump for humans

# TLDR

**Capture packets on a network interface**

```tcpterm -i [eth0]```

**Read packets from a pcap file**

```tcpterm -r [capture.pcap]```

**Apply a BPF filter** (passed as positional arguments)

```tcpterm -i [eth0] [port 80]```

# SYNOPSIS

**tcpterm** [_options_]

# PARAMETERS

**-i** _INTERFACE_
> Network interface to capture packets from.

**-r** _FILE_
> Read packets from a pcap file.

**-s** _SNAPLEN_
> Snapshot length per packet (default 65535).

**--help**
> Show help information.

**--version**
> Show version information.

_expression_
> Optional BPF filter expression (positional), e.g. `port 80`.

# DESCRIPTION

**tcpterm** is a terminal-based packet visualizer that provides a more user-friendly alternative to tcpdump. It can capture live traffic from a network interface or read from pcap files, with BPF filter support.

# HISTORY

**tcpterm** was created by **Takumasa Sakao** (sachaos) and is written in **Go**.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1)
