# TAGLINE

Interactive SIP traffic analyzer

# TLDR

**Capture SIP traffic**

```sngrep```

**Capture on interface**

```sngrep -d [eth0]```

**Read from pcap**

```sngrep -I [capture.pcap]```

**Filter by SIP method**

```sngrep -c [INVITE]```

**Capture to file**

```sngrep -O [output.pcap]```

**Filter by IP**

```sngrep host [192.168.1.100]```

**Quiet mode**

```sngrep -q```

# SYNOPSIS

**sngrep** [_-d device_] [_-I file_] [_-O file_] [_options_] [_filter_]

# PARAMETERS

**-d** _DEVICE_
> Capture device.

**-I** _FILE_
> Read pcap file.

**-O** _FILE_
> Write pcap file.

**-c** _METHOD_
> Filter SIP method.

**-l**
> Rotate files.

**-N**
> No interface.

**-q**
> Quiet mode.

**-r**
> Rotate only.

# DESCRIPTION

**sngrep** is a terminal-based tool for capturing and analyzing SIP (Session Initiation Protocol) traffic used in VoIP systems. It provides an interactive ncurses interface that displays active SIP dialogs, call flow diagrams with directional arrows, and full message content including headers and body.

The tool captures SIP packets in real time from network interfaces or reads previously captured pcap files for offline analysis. Filters narrow results by SIP method, source or destination address, and custom BPF expressions. Captured traffic can be saved to pcap format for later review or sharing with other analysis tools.

Call flow visualization is the tool's standout feature, showing the sequence of SIP messages (INVITE, 200 OK, ACK, BYE) between endpoints with timing information. This makes it particularly effective for diagnosing VoIP call setup failures, registration problems, and codec negotiation issues.

# INTERFACE CONTROLS

**Arrow keys** - Navigate
**Enter** - Show details
**F2** - Save
**F7** - Filter
**F10/q** - Quit

# CAVEATS

Requires root for capture. TLS traffic needs decryption. High-volume may miss packets.

# HISTORY

**sngrep** was created by **Irontec** for VoIP troubleshooting. It provides visual SIP analysis in the terminal.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [tshark](/man/tshark)(1), [wireshark](/man/wireshark)(1)
