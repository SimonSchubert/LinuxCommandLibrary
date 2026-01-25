# TLDR

**Read pcap with tcpdump**

```tcpdump -r [capture.pcap]```

**Read with tshark**

```tshark -r [capture.pcap]```

**Write pcap**

```tcpdump -i [eth0] -w [capture.pcap]```

**Filter and read**

```tcpdump -r [capture.pcap] 'port 80'```

**Convert with editcap**

```editcap [input.pcap] [output.pcapng]```

# SYNOPSIS

**pcap** - packet capture file format

# DESCRIPTION

**pcap** (Packet Capture) is the file format used by libpcap for storing network packet data. It's the standard format for network captures, used by tcpdump, Wireshark, and many security tools.

The newer pcapng format supports additional metadata.

# FILE STRUCTURE

```
Global Header (24 bytes)
├── Magic Number (0xa1b2c3d4)
├── Version
├── Timestamp offset
├── Snap length
└── Link type

Packet Records
├── Timestamp
├── Captured length
├── Original length
└── Packet data
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

pcap is binary format. pcapng offers more features. Large captures need significant storage.

# HISTORY

The pcap format and libpcap were developed at **Lawrence Berkeley Laboratory** by **Van Jacobson**, **Craig Leres**, and **Steven McCanne**.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1), [tshark](/man/tshark)(1), [editcap](/man/editcap)(1)
