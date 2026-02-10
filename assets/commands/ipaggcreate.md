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

**Aggregate with specific prefix length**

```ipaggcreate --prefix=[24] [input.dump]```

# SYNOPSIS

**ipaggcreate** [_options_] [_files_]

# PARAMETERS

**-r** _FILE_
> Read from pcap file instead of text dump

**--src**
> Aggregate by source IP addresses

**--dst**
> Aggregate by destination IP addresses

**--prefix** _LENGTH_
> Aggregate using specified prefix length

**--output** _FILE_
> Write output to file instead of stdout

**--multicast**
> Include multicast addresses

# DESCRIPTION

**ipaggcreate** creates IP address aggregates from network traffic dumps or pcap files. It groups IP addresses by configurable criteria such as prefix length, producing summaries of network activity.

This tool is part of the Click modular router suite and works in conjunction with **ipsumdump** and **ipaggmanip** for comprehensive network traffic analysis and summarization.

# CAVEATS

Input format must be compatible with ipsumdump output or pcap format. Large capture files may require significant memory for aggregation. Output format is specific to the ipagg tool suite.

# HISTORY

Part of the **ipsumdump** package developed by Eddie Kohler at UCLA and later ICSI. The tool suite was created for network measurement research and released as open source software in the early **2000s**.

# SEE ALSO

[ipsumdump](/man/ipsumdump)(1), [ipaggmanip](/man/ipaggmanip)(1), [tcpdump](/man/tcpdump)(1)
