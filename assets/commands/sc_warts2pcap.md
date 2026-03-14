# TAGLINE

Convert scamper warts files to pcap format

# TLDR

**Convert warts to pcap format**

```sc_warts2pcap [input.warts] > [output.pcap]```

**Write output to a specific file**

```sc_warts2pcap -o [output.pcap] [input.warts]```

**Sort packets by timestamp**

```sc_warts2pcap -s [input.warts] > [output.pcap]```

# SYNOPSIS

**sc_warts2pcap** [_options_] _file_

# PARAMETERS

**-o** _file_
> Write output to the specified file instead of stdout.

**-s**
> Sort packets by timestamp before writing.

# DESCRIPTION

**sc_warts2pcap** converts scamper warts-format files to pcap (packet capture) format. This enables analysis of scamper measurement data using standard network tools like Wireshark or tcpdump. The tool extracts raw packets embedded in warts traces (such as those from ping, traceroute, and tbit measurements) and writes them as pcap records.

Part of the **scamper** network measurement toolkit.

# CAVEATS

Only warts files containing embedded packet data can be meaningfully converted. Not all scamper measurement types embed raw packets in their output.

# SEE ALSO

[sc_warts2json](/man/sc_warts2json)(1), [sc_wartsdump](/man/sc_wartsdump)(1), [scamper](/man/scamper)(1), [tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1)

