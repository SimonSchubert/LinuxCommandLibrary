# TAGLINE

summarizes network traffic by extracting and displaying selected

# TLDR

**Dump summary of packets** from a pcap file

```ipsumdump -r [capture.pcap]```

**Capture live traffic** and summarize

```sudo ipsumdump -i [eth0]```

**Extract source and destination IPs**

```ipsumdump -r [capture.pcap] --src --dst```

**Output timestamp, source, destination, and protocol**

```ipsumdump -r [capture.pcap] --timestamp --src --dst --proto```

**Filter packets** using BPF expression

```ipsumdump -r [capture.pcap] --filter '[tcp port 80]' --src --dst```

**Output in specific format** with custom fields

```ipsumdump -r [capture.pcap] --src --sport --dst --dport --length```

# SYNOPSIS

**ipsumdump** [_-r file_] [_-i interface_] [_--filter expression_] [_--output fields_] [_options_]

# PARAMETERS

**-r** _file_
> Read from pcap file

**-i** _interface_
> Capture live traffic from interface

**--filter** _expression_
> BPF filter expression

**--src**
> Output source IP address

**--dst**
> Output destination IP address

**--sport**
> Output source port

**--dport**
> Output destination port

**--proto**
> Output IP protocol

**--timestamp**
> Output packet timestamp

**--length**
> Output packet length

**--payload**
> Output payload data

**--no-promiscuous**
> Don't set interface to promiscuous mode

**-o** _file_
> Write output to file

# DESCRIPTION

**ipsumdump** summarizes network traffic by extracting and displaying selected fields from packet headers. It reads from pcap files or captures live traffic, producing compact text output suitable for further processing.

The tool is designed for network analysis and measurement, producing ASCII output with one line per packet. It's particularly useful for creating datasets for analysis, generating aggregate statistics, or extracting specific packet fields.

# CAVEATS

Live capture requires root/administrator privileges. High traffic volumes may cause packet drops. Output format is text-based; for binary analysis, consider other tools. Part of a suite that includes ipaggcreate and ipaggmanip.

# HISTORY

**ipsumdump** was developed by Eddie Kohler at UCLA (later ICSI) for network measurement research. First released in the early **2000s**, it's built on the Click modular router framework and remains useful for network traffic analysis and research.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [tshark](/man/tshark)(1), [ipaggcreate](/man/ipaggcreate)(1), [ipaggmanip](/man/ipaggmanip)(1)
