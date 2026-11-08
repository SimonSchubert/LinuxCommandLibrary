# TAGLINE

file format used by libpcap for storing network packet data

# TLDR

**Read pcap with tcpdump**

```tcpdump -r [capture.pcap]```

**Read with tshark**

```tshark -r [capture.pcap]```

**Write pcap**

```tcpdump -i [eth0] -w [capture.pcap]```

**Filter and read**

```tcpdump -r [capture.pcap] 'port 80'```

**Convert to pcapng with editcap**

```editcap -F pcapng [input.pcap] [output.pcapng]```

**Convert to classic pcap with editcap**

```editcap -F pcap [input.pcapng] [output.pcap]```

# SYNOPSIS

**pcap** - packet capture file format

# DESCRIPTION

**pcap** (Packet Capture) is the file format used by libpcap for storing network packet data. It's the standard format for network captures, used by tcpdump, Wireshark, and many security tools.

Each file has a 24-byte header followed by packet records. All fields use the byte order of the host that wrote the file, and readers detect it from the magic number.

# FILE STRUCTURE

```
Global Header (24 bytes)
├── Magic Number (4)
├── Major Version (2), now 2
├── Minor Version (2), now 4
├── Reserved (4), set to 0
├── Reserved (4), set to 0
├── Snapshot Length (4)
└── Link-layer Type + FCS (4)

Packet Records
├── Timestamp seconds (4)
├── Timestamp fraction (4)
├── Captured length (4)
├── Original length (4)
└── Packet data
```

# MAGIC NUMBERS

```
0xa1b2c3d4  microsecond timestamps
0xa1b23c4d  nanosecond timestamps
0xd4c3b2a1  microsecond, swapped byte order
0x4d3cb2a1  nanosecond, swapped byte order
```

# TOOLS

```
tcpdump    - CLI capture/read
wireshark  - GUI analysis
tshark     - CLI analysis
editcap    - Edit captures
mergecap   - Merge captures
```

# CAVEATS

pcap is binary format. pcapng offers more features, such as multiple interfaces and per-packet comments. Packets longer than the snapshot length are truncated, which is visible when captured length is below original length. Large captures need significant storage.

# HISTORY

The pcap format and libpcap were developed at **Lawrence Berkeley Laboratory** by **Van Jacobson**, **Craig Leres**, and **Steven McCanne**.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [editcap](/man/editcap)(1), [dumpcap](/man/dumpcap)(1)

# RESOURCES

```[Source code](https://github.com/the-tcpdump-group/libpcap)```

```[Homepage](https://www.tcpdump.org/)```

```[Documentation](https://www.tcpdump.org/manpages/pcap-savefile.5.html)```

<!-- verified: 2026-11-08 -->
