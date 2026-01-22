# TLDR

**Analyze a pcap file**

```zeek -r [capture.pcap]```

**Analyze pcap with specific script**

```zeek -r [capture.pcap] [script.zeek]```

**Capture live traffic on interface**

```sudo zeek -i [eth0]```

**Run with local site policy**

```zeek -r [capture.pcap] local```

**Print version and exit**

```zeek --version```

# SYNOPSIS

**zeek** [_options_] [_file_...]

# PARAMETERS

**-r** _file_
> Read packets from pcap file

**-i** _interface_
> Capture from network interface

**-C**
> Ignore checksum errors

**-e** _code_
> Execute Zeek script code

**-f** _filter_
> Apply BPF filter

**-U** _status_
> Write status to file

**-w** _file_
> Write raw packets to file

**--test**
> Syntax check scripts without execution

**--parse-only**
> Parse scripts and exit

# DESCRIPTION

**Zeek** (formerly Bro) is a powerful network analysis framework focused on security monitoring. Unlike packet sniffers that show raw traffic, Zeek interprets network activity and generates high-level logs about connections, protocols, and detected threats.

Zeek processes network traffic (live or from pcap files) and produces structured logs: **conn.log** for connections, **http.log** for HTTP traffic, **dns.log** for DNS queries, **ssl.log** for TLS connections, and many more.

The tool uses a custom scripting language for defining analysis logic. Scripts can detect intrusions, extract files from traffic, identify protocols, and generate custom logs. The **local.zeek** policy loads site-specific configurations.

Output logs are tab-separated by default, easily parsed by tools like **zeek-cut** or imported into SIEM systems.

# CAVEATS

Zeek requires significant CPU and memory for high-traffic networks. Tune workers and analysis depth accordingly.

The scripting language has a learning curve. Start with built-in scripts before writing custom analyzers.

Live capture requires root or appropriate capabilities. Pcap file analysis runs as a normal user.

Log rotation and management should be configured for production deployments.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [suricata](/man/suricata)(8)
