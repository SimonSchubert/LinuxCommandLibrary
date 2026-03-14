# TAGLINE

network grep

# TLDR

**Search packets for a pattern in quiet mode**

```ngrep -q "[pattern]"```

**Search on a specific interface and port**

```ngrep -d [eth0] "[pattern]" port [80]```

**Search HTTP traffic with line-oriented output**

```ngrep -q -W byline "[GET|POST]" port [80]```

**Search traffic from a specific host**

```ngrep -q "[pattern]" host [192.168.1.1]```

**Show timestamps with matched packets**

```ngrep -q -t "[pattern]"```

**Read from a pcap capture file**

```ngrep -I [file.pcap] "[pattern]"```

**Case-insensitive search and write matches to pcap file**

```ngrep -qi -O [output.pcap] "[pattern]"```

**Match only a specific number of packets**

```ngrep -q -n [10] "[pattern]"```

# SYNOPSIS

**ngrep** [_options_] _pattern_ [_filter_]

# PARAMETERS

_PATTERN_
> Extended regex pattern to match against packet payloads.

_FILTER_
> BPF filter expression (same syntax as tcpdump).

**-q**
> Quiet mode; only output packet headers and payloads.

**-d** _IFACE_
> Interface to listen on (default: auto-selected).

**-W** _MODE_
> Output mode: normal (default), byline (honor linefeeds), single (one line per packet), none.

**-i**
> Case-insensitive matching.

**-I** _FILE_
> Read packets from a pcap dump file.

**-O** _FILE_
> Write matched packets to a pcap dump file.

**-t**
> Print a timestamp alongside each matched packet.

**-n** _NUM_
> Match only NUM packets total, then exit.

**-s** _SNAPLEN_
> Set the BPF capture length (default: 65536).

**-X**
> Treat the match expression as a hexadecimal string.

**-w**
> Match the regex expression as a word.

# DESCRIPTION

**ngrep** is a pcap-aware tool that applies GNU grep-like pattern matching to network packet payloads. It recognizes TCP, UDP, and ICMP across Ethernet, PPP, SLIP, FDDI, and null interfaces, and understands BPF filter logic in the same fashion as tcpdump. Matched packets can be displayed or written to pcap files for further analysis.

# CAVEATS

Requires root or appropriate capabilities for live capture. Only matches against packet payload data (not encrypted traffic). BPF filter expressions follow tcpdump syntax.

# HISTORY

ngrep was created to provide **grep-like** functionality for network packet inspection.

# SEE ALSO

[tcpdump](/man/tcpdump)(1), [grep](/man/grep)(1), [wireshark](/man/wireshark)(1)

