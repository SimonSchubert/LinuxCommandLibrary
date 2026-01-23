# TLDR

**Capture packets** on default interface

```tcpdump```

**Capture on specific interface**

```tcpdump -i [eth0]```

**Capture only packets** to/from host

```tcpdump host [192.168.1.1]```

**Capture packets** on specific port

```tcpdump port [80]```

**Capture and save** to file

```tcpdump -w [capture.pcap]```

**Read packets** from file

```tcpdump -r [capture.pcap]```

**Capture with verbose output**

```tcpdump -v```

**Capture HTTP traffic**

```tcpdump -A port [80]```

**Capture packets** with specific protocol

```tcpdump icmp```

**Capture limited number** of packets

```tcpdump -c [100]```

**Don't resolve hostnames**

```tcpdump -n```

# SYNOPSIS

**tcpdump** [_options_] [_filter expression_]

# DESCRIPTION

**tcpdump** is a packet analyzer that captures and displays network traffic. It uses libpcap to capture packets from network interfaces and can filter traffic using Berkeley Packet Filter (BPF) syntax.

The tool can capture packets in real-time, display their contents in various formats, and save them to files for later analysis. Output can show packet headers, full content, or hexadecimal dumps.

tcpdump is essential for network troubleshooting, security analysis, and protocol debugging. It's the command-line counterpart to graphical tools like Wireshark.

# PARAMETERS

**-i** _interface_
> Capture on specific interface.

**-w** _file_
> Write packets to file.

**-r** _file_
> Read packets from file.

**-c** _count_
> Capture only count packets.

**-n**
> Don't resolve hostnames.

**-nn**
> Don't resolve hostnames or ports.

**-v**, **-vv**, **-vvv**
> Verbose output levels.

**-A**
> Print packets in ASCII.

**-X**
> Print packets in hex and ASCII.

**-s** _snaplen_
> Capture snaplen bytes per packet (0=full).

**-e**
> Print link-layer header.

**-q**
> Quick output (less protocol info).

**-D**
> List available interfaces.

# FILTER EXPRESSIONS

**host** _ip_: Filter by host
**port** _num_: Filter by port
**src/dst**: Source or destination
**tcp/udp/icmp**: Protocol types
**and/or/not**: Boolean operators
Example: `tcpdump 'tcp port 80 and host 192.168.1.1'`

# CAVEATS

Requires root privileges. Packet capture can impact performance on high-traffic networks. Full packet capture uses significant disk space. Some protocols are encrypted and contents cannot be viewed.

# HISTORY

**tcpdump** was originally written by **Van Jacobson**, **Craig Leres**, and **Steven McCanne** at the **Lawrence Berkeley National Laboratory** in **1988**. It became the foundation for network packet analysis on Unix systems. The libpcap library was extracted from tcpdump and is now used by many network analysis tools including Wireshark.

# SEE ALSO

[wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [ngrep](/man/ngrep)(1), [pcap](/man/pcap)(3)
