# TAGLINE

Network intrusion detection and prevention engine

# TLDR

**Start in IDS mode** on an interface

```suricata -c /etc/suricata/suricata.yaml -i [eth0]```

**Analyze a pcap file**

```suricata -c /etc/suricata/suricata.yaml -r [capture.pcap]```

**Run in IPS mode** with NFQUEUE

```suricata -c /etc/suricata/suricata.yaml -q [0]```

**Test configuration file**

```suricata -c /etc/suricata/suricata.yaml -T```

**Run as daemon**

```suricata -c /etc/suricata/suricata.yaml -i [eth0] -D```

**Set custom log directory**

```suricata -c /etc/suricata/suricata.yaml -i [eth0] -l [/var/log/suricata]```

**Display version**

```suricata -V```

# SYNOPSIS

**suricata** [_options_]

# PARAMETERS

**-c** _file_
> Path to configuration file.

**-T**
> Test configuration and exit.

**-i** _interface_
> Network interface for packet capture.

**-r** _file_
> Read packets from pcap file (offline mode).

**-q** _queue_
> Run inline using NFQUEUE queue ID.

**-D**
> Run as daemon in background.

**-l** _dir_
> Set default log directory.

**-s** _file_
> Load additional signature file.

**-S** _file_
> Load signatures exclusively from file.

**-v**
> Increase verbosity (can be used multiple times).

**-V**
> Display version information.

**--user** _user_
> Run as specified user after initialization.

**--group** _group_
> Run as specified group after initialization.

**--pidfile** _file_
> Write process ID to file.

**--runmode** _mode_
> Set runmode: workers, autofp, or single.

**--af-packet** _interface_
> Enable AF_PACKET capture.

**--netmap** _interface_
> Enable NETMAP capture.

**--pfring** _interface_
> Enable PF_RING capture.

**-F** _file_
> Use BPF filter from file.

**-k** _mode_
> Checksum check: all, none, or auto.

# DESCRIPTION

**suricata** is a high-performance Network IDS, IPS, and Network Security Monitoring engine. It inspects network traffic using signature-based detection, protocol analysis, and anomaly detection to identify threats and security events.

Suricata can operate in three modes: IDS (passive monitoring), IPS (inline blocking using NFQUEUE or netfilter), and network security monitoring (logging and metadata extraction). It supports multiple capture methods including AF_PACKET, PF_RING, NETMAP, and standard pcap.

The engine uses multi-threading for high-performance packet processing and supports Lua scripting for custom detection logic. It is compatible with Snort rules and can process the Emerging Threats ruleset.

Output formats include EVE JSON for SIEM integration, fast log, unified2, and various protocol-specific logs.

# CONFIGURATION

**/etc/suricata/suricata.yaml**
> Main configuration file defining network interfaces, rule paths, logging, and detection settings.

**/etc/suricata/rules/**
> Directory containing detection rule files in Snort-compatible format.

**/var/log/suricata/**
> Default log directory for EVE JSON, fast log, and alert output.

# CAVEATS

Requires root or CAP_NET_RAW capability for live capture. High traffic environments need tuned configuration for optimal performance. IPS mode requires proper netfilter/iptables configuration. Rule updates should be tested before production deployment.

# HISTORY

**Suricata** was developed by the Open Information Security Foundation (OISF) starting in 2009, with the first stable release in 2010. It was created as a modern, multi-threaded alternative to Snort, designed to take advantage of modern multi-core processors. The project is funded by the US Department of Homeland Security and other sponsors.

# SEE ALSO

[snort](/man/snort)(1), [tcpdump](/man/tcpdump)(1), [zeek](/man/zeek)(1), [nftables](/man/nftables)(8)
