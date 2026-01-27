# TLDR

**Rewrite source and destination MAC addresses**

```tcprewrite --enet-smac=[00:11:22:33:44:55] --enet-dmac=[66:77:88:99:aa:bb] -i [input.pcap] -o [output.pcap]```

**Rewrite IP addresses**

```tcprewrite --srcipmap=[192.168.1.0/24:10.0.0.0/24] --dstipmap=[192.168.2.0/24:10.0.1.0/24] -i [input.pcap] -o [output.pcap]```

**Rewrite port numbers**

```tcprewrite --portmap=[80:8080,443:8443] -i [input.pcap] -o [output.pcap]```

**Randomize IP addresses**

```tcprewrite --seed=[42] --pnat=[192.168.0.0/16:10.0.0.0/8] -i [input.pcap] -o [output.pcap]```

**Fix checksums after editing**

```tcprewrite --fixcsum -i [input.pcap] -o [output.pcap]```

**Change MTU and truncate**

```tcprewrite --mtu=[1400] --mtu-trunc -i [input.pcap] -o [output.pcap]```

# SYNOPSIS

**tcprewrite** [_options_] **-i** _input.pcap_ **-o** _output.pcap_

# PARAMETERS

**-i**, **--infile** _file_
> Input pcap file to read.

**-o**, **--outfile** _file_
> Output pcap file to write.

**-c**, **--cachefile** _file_
> tcpprep cache file for client/server classification.

**--enet-smac** _mac_
> Rewrite source Ethernet MAC address.

**--enet-dmac** _mac_
> Rewrite destination Ethernet MAC address.

**--srcipmap** _cidr:cidr_
> Rewrite source IP addresses.

**--dstipmap** _cidr:cidr_
> Rewrite destination IP addresses.

**--pnat** _cidr:cidr_
> Pseudo-NAT: rewrite IPs with randomization.

**--portmap** _port:port_
> Rewrite TCP/UDP port numbers.

**--seed** _n_
> Randomization seed for pseudo-NAT.

**--fixcsum**
> Recalculate TCP/UDP/IP checksums.

**--mtu** _bytes_
> Set maximum packet size.

**--mtu-trunc**
> Truncate packets exceeding MTU.

**-C**
> Recalculate checksums.

# DESCRIPTION

**tcprewrite** is a pcap file editor that rewrites packet headers at Layers 2, 3, and 4. It can modify Ethernet MAC addresses, IP addresses, and TCP/UDP port numbers in captured network traffic.

The tool is part of the Tcpreplay suite and is used to prepare captured traffic for replay in different network environments. After rewriting, packets can be replayed using **tcpreplay** or **tcpreplay-edit**.

Common use cases include anonymizing captures before sharing, adapting captures to different network configurations, and preparing traffic for security testing in lab environments.

Rewriting operations that change packet sizes or content require checksum recalculation using the --fixcsum or -C options.

# CAVEATS

Packets captured with "any" interface (cooked mode) cannot be properly edited. Some rewrites may require a tcpprep cache file for client/server classification. Large pcap files may require significant processing time. Does not handle application-layer protocol data (e.g., embedded IPs in HTTP).

# HISTORY

**tcprewrite** is part of the Tcpreplay suite, originally developed by Aaron Turner in 2001. The project is now maintained by AppNeta and distributed under the GPLv3 license. It has become a standard tool for network testing and security analysis.

# SEE ALSO

[tcpreplay](/man/tcpreplay)(1), [tcpprep](/man/tcpprep)(1), [tcpdump](/man/tcpdump)(1), [wireshark](/man/wireshark)(1)
