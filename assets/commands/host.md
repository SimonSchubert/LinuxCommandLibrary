# TAGLINE

simple DNS lookup utility

# TLDR

**Lookup IP address**

```host [example.com]```

**Reverse DNS lookup**

```host [192.168.1.1]```

**Query specific DNS server**

```host [example.com] [8.8.8.8]```

**Query specific record type**

```host -t [MX] [example.com]```

**Verbose output**

```host -v [example.com]```

**Query all records**

```host -a [example.com]```

# SYNOPSIS

**host** [**-aACdlnrsTUwv**] [**-c** _class_] [**-N** _ndots_] [**-p** _port_] [**-R** _number_] [**-t** _type_] [**-W** _wait_] [**-m** _flag_] [**-4**|**-6**] _name_ [_server_]

# DESCRIPTION

**host** is a simple DNS lookup utility. It converts hostnames to IP addresses and vice versa, and can query specific DNS record types.

The tool provides quick DNS queries without the complexity of dig, making it useful for simple lookups and troubleshooting.

# PARAMETERS

**-t** _type_
> Query type (A, AAAA, MX, NS, TXT, SOA, etc.).

**-a**
> Equivalent to -v -t ANY; queries all record types with verbose output.

**-A**
> Like -a but omits RRSIG, NSEC, and NSEC3 records.

**-C**
> Check SOA record consistency across authoritative name servers.

**-v**
> Verbose output (equivalent to -d).

**-l**
> Perform a zone transfer (AXFR) and list NS, PTR, and A/AAAA records.

**-4**
> Use IPv4 transport only.

**-6**
> Use IPv6 transport only.

**-r**
> Non-recursive query (clears RD bit).

**-s**
> Do not try the next name server after a SERVFAIL response.

**-W** _seconds_
> Query timeout in seconds (default: 5 for UDP, 10 for TCP).

**-w**
> Wait forever (set query timeout to maximum).

**-R** _retries_
> Number of UDP query retries.

**-T**
> Use TCP instead of UDP.

**-U**
> Force UDP, even for ANY queries.

**-p** _port_
> Query port (default: 53).

**-N** _ndots_
> Number of dots required for an absolute name lookup.

**-c** _class_
> Query class (IN, HS, CH; default: IN).

**-m** _flag_
> Memory debugging (record, usage, or trace).

**-V**
> Print version number and exit.

# CAVEATS

Less detailed than dig. Caching may affect results. Some record types need explicit query. Name server defaults to system resolver.

# HISTORY

**host** is part of **BIND** (Berkeley Internet Name Domain), developed originally at **UC Berkeley** in the **1980s**. It provides a simplified interface compared to dig and nslookup, targeting users who need quick DNS lookups.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [drill](/man/drill)(1), [getent](/man/getent)(1)
