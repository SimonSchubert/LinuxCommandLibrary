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

**sngrep** analyzes SIP (VoIP) traffic interactively. It displays call flows and message details.

Real-time capture shows active calls. Filter by method, source, or destination.

Call flow diagrams visualize signaling. Arrows show message direction.

Message details show full SIP content. Headers and body inspectable.

Pcap file support enables offline analysis. Record for later review.

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
