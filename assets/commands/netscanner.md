# TAGLINE

Terminal network scanner and diagnostic tool with modern TUI

# TLDR

**Launch the network scanner**

```netscanner```

# SYNOPSIS

**netscanner** [_options_]

# PARAMETERS

**-t**, **--tick-rate** _N_
> Set ticks per second (default: 1).

**-f**, **--frame-rate** _N_
> Set frames per second (default: 10).

# DESCRIPTION

**netscanner** is a TUI-based network scanner and diagnostic tool. Features include listing hardware interfaces, switching active interfaces for scanning and packet dumping, WiFi network scanning with signal strength charts, IPv4 pinging with CIDR support, hostname/OUI/MAC address lookup, and packet dumping for TCP, UDP, ICMP, and ARP protocols.

# CAVEATS

Requires elevated privileges for packet capture. On Windows, Npcap must be installed.

# HISTORY

**netscanner** was created by **Chleba** and is written in **Rust**.

# SEE ALSO

[nmap](/man/nmap)(1), [arp-scan](/man/arp-scan)(1), [tcpdump](/man/tcpdump)(8)
