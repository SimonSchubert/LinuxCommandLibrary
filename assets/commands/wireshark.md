# TAGLINE

Graphical network protocol analyzer

# TLDR

**Start Wireshark** graphical interface

```wireshark```

**Open a capture file**

```wireshark [capture.pcapng]```

**Start capturing** on a specific interface

```wireshark -i [eth0] -k```

**Capture with a BPF capture filter**

```wireshark -i [eth0] -f "port 80" -k```

**Open a file with a display filter applied**

```wireshark -Y "http.request" -r [capture.pcapng]```

**Capture to a file** and stop after a duration

```wireshark -i [eth0] -w [output.pcapng] -a duration:[60]```

**List available capture interfaces**

```wireshark -D```

# SYNOPSIS

**wireshark** [_options_] [_file_]

# DESCRIPTION

**Wireshark** is a graphical network protocol analyzer for capturing and interactively analyzing network traffic. It decodes hundreds of protocols and provides detailed packet information in a user-friendly interface.

The application displays packets in a three-pane window: packet list, packet details (protocol tree), and packet bytes. Powerful display filters allow isolating specific traffic patterns. Capture filters reduce capture file size.

Wireshark is the industry standard for network troubleshooting, security analysis, protocol development, and education. It supports live capture from numerous interface types and can read many capture file formats.

# PARAMETERS

**-i** _interface_
> Capture on specified interface.

**-f** _filter_
> Capture filter (BPF syntax).

**-Y** _filter_
> Display filter.

**-w** _file_
> Write capture to file.

**-r** _file_
> Read capture file.

**-a** _condition_
> Autostop condition (duration, filesize, packets).

**-b** _option_
> Ring buffer options.

**-k**
> Start capturing immediately.

**-D**
> List available interfaces.

**-S**
> Update packet list in real-time during capture.

**-c** _count_
> Stop capture after receiving this many packets.

**-n**
> Disable network name resolution.

**-o** _preference:value_
> Set a preference value (overrides preferences file).

**-X** _extension_option_
> Specify an extension option (e.g., lua_script:myscript.lua).

**--fullscreen**
> Start Wireshark in full-screen mode.

**--list-time-stamp-types**
> List timestamp types for interface.

# DISPLAY FILTERS

**ip.addr == 192.168.1.1**: Filter by IP address (source or destination).
**tcp.port == 443**: Filter by TCP port.
**http.request**: Show HTTP requests only.
**dns**: Show DNS traffic.
**tcp.flags.syn == 1 && tcp.flags.ack == 0**: SYN packets (connection initiations).
**frame contains "password"**: Search packet content for a string.
**ip.src == 10.0.0.0/8**: Filter by source subnet.
**tcp.analysis.retransmission**: Show TCP retransmissions.

# CAVEATS

Requires privileges for live capture (root or cap_net_raw capability). Large captures use significant memory. Display filters differ from capture filters in syntax. Some protocols require additional dissector plugins.

# HISTORY

**Wireshark** began as **Ethereal**, created by **Gerald Combs** in **1998**. After trademark issues, it was renamed to Wireshark in **2006**. It has become the most widely used network protocol analyzer, supported by an active community and the Wireshark Foundation. The project continues adding support for new protocols.

# SEE ALSO

[tshark](/man/tshark)(1), [tcpdump](/man/tcpdump)(1), [dumpcap](/man/dumpcap)(1), [editcap](/man/editcap)(1), [ngrep](/man/ngrep)(1)
