# TAGLINE

TCP flow recorder

# TLDR

Capture and display **traffic** on interface and port

```tcpflow -c -i [eth0] port [80]```

Read flows from a **pcap file**

```tcpflow -r [path/to/capture.pcap] -o [output_dir]```

Capture with **colored** console output (blue=client, red=server)

```tcpflow -c -g -i [eth0]```

Limit capture to **max bytes** per flow

```tcpflow -b [10000] -i [eth0] port [443]```

Strip **non-printable** characters in console output

```tcpflow -c -s -i [eth0]```

# SYNOPSIS

**tcpflow** [_OPTIONS_] [_EXPRESSION_]

# PARAMETERS

**-c**
> Console print with source/dest header (don't create files)

**-C**
> Console print without header (don't create files)

**-i** _INTERFACE_
> Capture on specified network interface

**-r** _FILE_
> Read from pcap file instead of live capture

**-o** _DIR_
> Output directory for flow files

**-b** _MAX_BYTES_
> Capture no more than max_bytes per flow

**-e** _SCANNER_
> Enable specific scanner

**-s**
> Strip non-printable characters (replace with '.')

**-g**
> Colorized console output (blue=client, red=server)

**-D**
> Console output in hex

**-d** _LEVEL_
> Debug level (0=silent, 1=default)

**-f** _MAX_FDS_
> Maximum number of file descriptors to use

**-p**
> Do not put interface into promiscuous mode

**-q**
> Quiet mode, suppress warnings

**-P**
> No purge of closed connections from hash table

# DESCRIPTION

**tcpflow** captures TCP traffic and reconstructs data streams for debugging and analysis. Unlike packet sniffers that show individual packets, tcpflow reassembles TCP connections into complete data flows.

Each TCP flow is saved to a separate file named by source and destination addresses/ports, making it easy to analyze individual connections.

# CAVEATS

Requires root privileges or appropriate capabilities. Uses libpcap filter expressions. Only captures TCP traffic, not UDP or other protocols. Large captures can consume significant disk space.

# HISTORY

**tcpflow** was created by **Jeremy Elson** and is designed for forensic analysis and debugging of network applications by reconstructing TCP sessions.

# SEE ALSO

[tcpdump](/man/tcpdump)(8), [wireshark](/man/wireshark)(1), [tcpick](/man/tcpick)(8), [nmap](/man/nmap)(1)
