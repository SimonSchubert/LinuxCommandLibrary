# TAGLINE

Interactive SIP traffic analyzer

# TLDR

**Capture SIP traffic**

```sngrep```

**Capture on interface**

```sngrep -d [eth0]```

**Read from pcap**

```sngrep -I [capture.pcap]```

**Show only INVITE dialogs**

```sngrep -c```

**Capture to file**

```sngrep -O [output.pcap]```

**Filter by IP using BPF**

```sngrep host [192.168.1.100]```

**Capture without interface** (quiet mode)

```sngrep -N -q -O [output.pcap]```

# SYNOPSIS

**sngrep** [_-d device_] [_-I file_] [_-O file_] [_options_] [_filter_]

# PARAMETERS

**-d** _DEVICE_
> Capture device (or comma-separated list).

**-I** _FILE_
> Read packets from pcap file.

**-O** _FILE_
> Save captured packets to pcap file.

**-c**
> Only display dialogs starting with INVITE.

**-l** _LIMIT_
> Maximum number of dialogs to capture.

**-N**
> No interface mode (capture only).

**-q**
> Quiet mode (suppress output in no-interface mode).

**-r**
> Capture RTP packet payloads.

**-R**
> Rotate calls when capture limit is reached.

**-k** _FILE_
> RSA private key for TLS decryption.

**-B** _SIZE_
> Pcap buffer size in MB (default: 2).

**-H** _URL_
> Send captured packets to Homer sipcapture URL.

**-f** _FILE_
> Load specific configuration file.

**-D**
> Print active configuration and exit.

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
