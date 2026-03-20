# TAGLINE

creates IP address aggregates from network traffic dumps or pcap files

# TLDR

**Aggregate IP addresses from a dump file**

```ipaggcreate [input.dump] > [output.agg]```

**Create aggregates from pcap file**

```ipaggcreate -r [capture.pcap] > [output.agg]```

**Aggregate by source IP address**

```ipaggcreate --src [input.dump]```

**Aggregate by destination IP address**

```ipaggcreate --dst [input.dump]```

**Aggregate by TCP/UDP flows**

```ipaggcreate --flows -r [capture.pcap]```

**Count bytes instead of packets**

```ipaggcreate --bytes [input.dump]```

# SYNOPSIS

**ipaggcreate** [_options_] [_files_]

# PARAMETERS

**-r**, **--tcpdump** _FILE_
> Read from one or more tcpdump/pcap files

**-s**, **--src**
> Label by IP source address

**-d**, **--dst**
> Label by IP destination address (default)

**--flows**
> Label by TCP or UDP flow

**--address-pairs**
> Label by address pair

**--packets**
> Count packets per label (default)

**-B**, **--bytes**
> Count bytes per label (IP and transport headers included, link headers excluded)

**-o**, **--output** _FILE_
> Write output to file instead of stdout

**-f**, **--filter** _FILTER_
> Include only packets matching a tcpdump filter expression

**-b**, **--binary**
> Write summary in binary format

**-A**, **--anonymize**
> Anonymize IP addresses in output

**-t**, **--interval** _TIME_
> Stop after recording aggregate data for specified duration

**-q**, **--quiet**
> Suppress progress bar output

# DESCRIPTION

**ipaggcreate** reads IP packets from one or more data sources, maps each packet to a label (such as source address, destination address, or flow), and outputs an aggregate file reporting the number of packets or bytes observed per label.

This tool is part of the **ipsumdump** package and works in conjunction with **ipsumdump** and **ipaggmanip** for network traffic analysis and summarization.

# CAVEATS

Input format must be compatible with ipsumdump output or pcap format. Large capture files may require significant memory for aggregation. Output format is specific to the ipagg tool suite.

# HISTORY

Part of the **ipsumdump** package developed by Eddie Kohler at UCLA and later ICSI. The tool suite was created for network measurement research and released as open source software in the early **2000s**.

# SEE ALSO

[ipsumdump](/man/ipsumdump)(1), [ipaggmanip](/man/ipaggmanip)(1), [tcpdump](/man/tcpdump)(1)
