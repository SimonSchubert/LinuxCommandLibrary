# TAGLINE

TCP stream sniffer and analyzer

# TLDR

Capture traffic on **interface**, host, and port

```sudo tcpick -i [interface] -C -h [host] -p [port]```

Capture **HTTP** traffic

```sudo tcpick -i eth0 -C -h [192.168.1.100] -p 80```

Display **help**

```tcpick --help```

# SYNOPSIS

**tcpick** [_OPTIONS_]

# PARAMETERS

**-i, --interface** _INTERFACE_
> Capture on specified network interface

**-C, --colors**
> Display output with colors

**-h** _HOST_
> Filter by host

**-p** _PORT_
> Filter by port

**-r** _FILE_
> Read from pcap file

**-w** _FILE_
> Write to pcap file

**-a**
> Display data as ASCII

**-x**
> Display data as hexadecimal

# DESCRIPTION

**tcpick** is a packet sniffer and TCP stream analyzer that captures and displays TCP connections and their data. It can monitor network traffic on specific interfaces, hosts, or ports with colorized output.

The tool tracks TCP connection states and can reassemble TCP streams to show complete conversations.

# CAVEATS

Requires root privileges for packet capture. Uses libpcap for capture functionality. Connection tracking may consume memory on busy networks.

# HISTORY

**tcpick** provides network analysts with a focused tool for TCP traffic inspection, combining capture and analysis in a single utility.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [tcpflow](/man/tcpflow)(1), [wireshark](/man/wireshark)(1)
