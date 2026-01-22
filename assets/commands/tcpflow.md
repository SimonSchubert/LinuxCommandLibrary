# TLDR

Capture and display **traffic** on interface and port

```tcpflow -c -i [eth0] port [80]```

# SYNOPSIS

**tcpflow** [_OPTIONS_] [_EXPRESSION_]

# PARAMETERS

**-c**
> Output to console (stdout)

**-i** _INTERFACE_
> Capture on specified interface

**-r** _FILE_
> Read from pcap file

**-o** _DIR_
> Output directory for flow files

**-a**
> Output in ASCII format

**-e** _SCANNER_
> Enable specific scanner

# DESCRIPTION

**tcpflow** captures TCP traffic and reconstructs data streams for debugging and analysis. Unlike packet sniffers that show individual packets, tcpflow reassembles TCP connections into complete data flows.

Each TCP flow is saved to a separate file named by source and destination addresses/ports, making it easy to analyze individual connections.

# CAVEATS

Requires root privileges or appropriate capabilities. Uses libpcap filter expressions. Only captures TCP traffic, not UDP or other protocols. Large captures can consume significant disk space.

# HISTORY

**tcpflow** was created by **Jeremy Elson** and is designed for forensic analysis and debugging of network applications by reconstructing TCP sessions.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [wireshark](/man/wireshark)(1), [tcpick](/man/tcpick)(8)
