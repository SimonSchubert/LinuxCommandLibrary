# TLDR

**Start Wireshark** graphical interface

```wireshark```

**Open capture file**

```wireshark [capture.pcap]```

**Start capturing** on interface

```wireshark -i [eth0]```

**Capture with filter**

```wireshark -i [eth0] -f "port 80"```

**Capture for specific duration**

```wireshark -i [eth0] -a duration:[60]```

**Start with display filter**

```wireshark -Y "http" [capture.pcap]```

**Capture to file**

```wireshark -i [eth0] -w [output.pcap]```

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
> Update packet list in real-time.

**--list-time-stamp-types**
> List timestamp types for interface.

# DISPLAY FILTERS

**ip.addr == 192.168.1.1**: Filter by IP
**tcp.port == 80**: Filter by TCP port
**http**: Show HTTP traffic
**dns**: Show DNS traffic
**tcp.flags.syn == 1**: SYN packets
**frame contains "password"**: Search content

# CAVEATS

Requires privileges for live capture (root or cap_net_raw capability). Large captures use significant memory. Display filters differ from capture filters in syntax. Some protocols require additional dissector plugins.

# HISTORY

**Wireshark** began as **Ethereal**, created by **Gerald Combs** in **1998**. After trademark issues, it was renamed to Wireshark in **2006**. It has become the most widely used network protocol analyzer, supported by an active community and the Wireshark Foundation. The project continues adding support for new protocols.

# SEE ALSO

[tshark](/man/tshark)(1), [tcpdump](/man/tcpdump)(1), [dumpcap](/man/dumpcap)(1), [ngrep](/man/ngrep)(1)
