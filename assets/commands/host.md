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

**host** [_options_] _name_ [_server_]

# DESCRIPTION

**host** is a simple DNS lookup utility. It converts hostnames to IP addresses and vice versa, and can query specific DNS record types.

The tool provides quick DNS queries without the complexity of dig, making it useful for simple lookups and troubleshooting.

# PARAMETERS

**-t** _type_
> Query type (A, AAAA, MX, NS, TXT, SOA, etc.).

**-a**
> Query all record types.

**-v**
> Verbose output.

**-4**
> Use IPv4 only.

**-6**
> Use IPv6 only.

**-r**
> Non-recursive query.

**-W** _seconds_
> Query timeout.

**-R** _retries_
> Number of retries.

**-T**
> Use TCP instead of UDP.

# CAVEATS

Less detailed than dig. Caching may affect results. Some record types need explicit query. Name server defaults to system resolver.

# HISTORY

**host** is part of **BIND** (Berkeley Internet Name Domain), developed originally at **UC Berkeley** in the **1980s**. It provides a simplified interface compared to dig and nslookup, targeting users who need quick DNS lookups.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [drill](/man/drill)(1), [getent](/man/getent)(1)
