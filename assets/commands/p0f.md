# TLDR

**Start fingerprinting**

```p0f -i [eth0]```

**Read from pcap**

```p0f -r [capture.pcap]```

**Write to log file**

```p0f -i [eth0] -o [log.txt]```

**Fingerprint specific port**

```p0f -i [eth0] "port 80"```

**Run in background**

```p0f -i [eth0] -d```

# SYNOPSIS

**p0f** [_options_] [_filter_]

# PARAMETERS

**-i** _INTERFACE_
> Network interface.

**-r** _FILE_
> Read pcap file.

**-o** _FILE_
> Output log file.

**-d**
> Daemon mode.

**-p**
> Promiscuous mode.

**--help**
> Display help information.

# DESCRIPTION

**p0f** performs passive OS fingerprinting. Identifies systems without active probing.

The tool analyzes network traffic patterns. Detects OS, NAT, and more.

p0f fingerprints passively.

# CAVEATS

Requires raw socket access. Passive only. Signature database needed.

# HISTORY

p0f was created by **Michal Zalewski** for passive TCP/IP stack fingerprinting.

# SEE ALSO

[nmap](/man/nmap)(1), [tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1)

