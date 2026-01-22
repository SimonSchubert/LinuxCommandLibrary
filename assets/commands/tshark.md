# TLDR

**Monitor** everything on localhost

```tshark```

Only capture packets matching a **capture filter**

```tshark -f 'udp port 53'```

Only show packets matching an **output filter**

```tshark -Y 'http.request.method == "GET"'```

**Decode** a TCP port using a specific protocol

```tshark -d tcp.port==8888,http```

Specify the **format** of captured output

```tshark -T [json|text|ps]```

Select **specific fields** to output

```tshark -T fields -e http.request.method -e ip.src```

**Write** captured packets to a file

```tshark -w [path/to/file]```

**Analyze** packets from a file

```tshark -r [path/to/file.pcap]```

# SYNOPSIS

**tshark** [_options_] [_filter_]

# PARAMETERS

**-i** _interface_
> Capture on specified interface

**-f** _filter_
> Capture filter (BPF syntax)

**-Y** _filter_
> Display filter (Wireshark syntax)

**-r** _file_
> Read packets from file

**-w** _file_
> Write packets to file

**-T** _format_
> Output format (text, json, pdml, ps, fields, etc.)

**-e** _field_
> Field to print (with -T fields/json/pdml)

**-d** _spec_
> Decode as protocol (e.g., tcp.port==8080,http)

**-c** _count_
> Stop after capturing count packets

**-a** _condition_
> Autostop condition (duration:sec, filesize:KB)

**-V**
> Verbose output (packet tree)

**-x**
> Print hex dump of packet data

**-q**
> Quiet mode (less output)

# DESCRIPTION

**tshark** is the command-line version of Wireshark, providing network packet capture and analysis capabilities. It can capture live traffic from network interfaces, read packets from capture files, and decode protocol data.

The tool supports both capture filters (BPF syntax, applied during capture) and display filters (Wireshark syntax, applied to output). It can output data in various formats including text, JSON, and PDML for further processing.

# CAVEATS

Requires root or appropriate capabilities for live capture. Capture and display filter syntaxes are different. Large captures can consume significant disk space and memory. Some protocol decoding requires port hints via **-d** option.

# HISTORY

Part of the **Wireshark** project, originally called Ethereal. The command-line version has been available since the early days of the project. tshark provides the same protocol analysis engine as Wireshark but suited for scripting and headless systems.

# SEE ALSO

[wireshark](/man/wireshark)(1), [tcpdump](/man/tcpdump)(8), [dumpcap](/man/dumpcap)(1)
