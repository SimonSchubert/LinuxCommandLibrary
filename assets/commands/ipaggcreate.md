# TAGLINE

creates IP address aggregates from network traffic dumps or pcap files

# TLDR

**Aggregate by destination address** from a pcap file

```ipaggcreate [capture.pcap] > [output.agg]```

**Aggregate by source IP address**

```ipaggcreate --src -r [capture.pcap]```

**Aggregate by TCP/UDP flows**

```ipaggcreate --flows -r [capture.pcap]```

**Count bytes instead of packets**

```ipaggcreate --bytes [capture.pcap]```

**Read from a live interface**

```ipaggcreate -i [eth0] -o [output.agg]```

**Only count matching packets**

```ipaggcreate -f "[tcp port 80]" -r [capture.pcap]```

**Aggregate the first 60 seconds**

```ipaggcreate -t [60s] -r [capture.pcap]```

**Split output into one file per minute**

```ipaggcreate --split-time [60s] -o [file%03d.agg] -r [capture.pcap]```

# SYNOPSIS

**ipaggcreate** [**-r** | **-i** | **--netflow-summary**] [**--src**, **--dst**, ...] [_options_] [_files_ | _interfaces_]

# PARAMETERS

**-r**, **--tcpdump**
> Read from one or more tcpdump/pcap files, optionally gzip or bzip2 compressed (default)

**-i**, **--interface**
> Read from live network interfaces until interrupted

**--ipsumdump**
> Read from one or more ipsumdump files

**--netflow-summary**
> Read from NetFlow summary files

**--dag** [_ENCAP_]
> Read from DAG-formatted trace files

**--nlanr**
> Read from NLANR-formatted trace files

**-s**, **--src**
> Label by IP source address

**-d**, **--dst**
> Label by IP destination address (default)

**-l**, **--length**
> Label by IP length

**--ip** _FIELD_
> Label by a named IP field, such as ip ttl or udp sport

**--flows**
> Label by TCP or UDP flow

**--unidirectional-flows**
> Label by TCP or UDP flow, separating the two directions

**--address-pairs**
> Label by address pair

**--unidirectional-address-pairs**
> Label by ordered source and destination address pair

**--packets**
> Count packets per label (default)

**-B**, **--bytes**
> Count bytes per label (IP and transport headers included, link headers excluded)

**-T**, **--time-offset** _TIME_
> Ignore the first TIME worth of packets

**--start-time** _TIME_
> Ignore packets with earlier timestamps

**-t**, **--interval** _TIME_
> Stop after recording aggregate data for the specified duration

**--limit-labels** _COUNT_
> Stop after recording COUNT distinct labels

**--split-time** _TIME_, **--split-labels** _COUNT_, **--split-packets** _COUNT_, **--split-bytes** _COUNT_
> Write multiple aggregate files. Requires an **--output** name containing a %d-style template.

**-o**, **--output** _FILE_
> Write output to file instead of stdout

**-b**, **--binary**
> Write output in a compressed binary format

**-w**, **--write-tcpdump** _FILE_
> Also write processed packets to a tcpdump file, or stdout with a single dash

**-f**, **--filter** _FILTER_
> Include only packets matching a tcpdump filter expression

**-A**, **--anonymize**
> Anonymize IP addresses in output

**--sample** _P_
> Sample packets with probability P

**-q**, **--quiet**
> Do not print a progress bar to standard error

**-V**, **--verbose**
> Produce more verbose error messages

**-h**, **--help**
> Display help information

**-v**, **--version**
> Display version information

# DESCRIPTION

**ipaggcreate** reads IP packets from one or more data sources, maps each packet to a label (such as source address, destination address, or flow), and outputs an aggregate file reporting the number of packets or bytes observed per label. Labels with zero counts are not reported.

With no file names, or with a single dash, it reads from standard input. The tool is part of the **ipsumdump** package and works with **ipaggmanip**, which manipulates the aggregate files it produces.

# CAVEATS

At most one label option can be given. Large capture files may require significant memory for aggregation. Reading live interfaces usually requires root privileges. The output is a text format beginning with **!IPAggregate** unless **--binary** is used.

# HISTORY

Written by **Eddie Kohler** and based on the **Click** modular router, as part of ipsumdump. The anonymization algorithm comes from **tcpdpriv** by Greg Minshall.

# SEE ALSO

[ipsumdump](/man/ipsumdump)(1), [ipaggmanip](/man/ipaggmanip)(1), [tcpdump](/man/tcpdump)(1)

# RESOURCES

```[Homepage](https://read.seas.harvard.edu/~kohler/ipsumdump/)```

```[Source code](https://github.com/kohler/ipsumdump)```

<!-- verified: 2026-11-09 -->
