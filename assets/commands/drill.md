# TAGLINE

DNS lookup tool with DNSSEC support

# TLDR

**Query A records**

```drill [example.com]```

**Query specific record** type

```drill [example.com] [MX]```

**Use specific DNS** server

```drill @[8.8.8.8] [example.com]```

**Trace delegation** path

```drill -T [example.com]```

**Show DNSSEC** information

```drill -D [example.com]```

**TCP instead of UDP**

```drill -t [example.com]```

**Reverse DNS lookup**

```drill -x [8.8.8.8]```

# SYNOPSIS

**drill** [_options_] _name_ [@_server_] [_type_]

# PARAMETERS

_NAME_
> Domain name to query.

@_SERVER_
> DNS server to query.

_TYPE_
> Record type: A, AAAA, MX, NS, TXT, etc.

**-T**
> Trace from root to answer.

**-D**
> Enable DNSSEC validation.

**-t**
> Use TCP instead of UDP.

**-x**
> Reverse DNS lookup.

**-k** _FILE_
> Trust anchor file for DNSSEC.

**-v**
> Verbose output.

# DESCRIPTION

**drill** is a DNS lookup tool from the ldns library, designed as a modern alternative to dig. It performs DNS queries with particular emphasis on DNSSEC verification capabilities.

The tool provides detailed output about DNS responses including flags, sections, and timing. The trace option follows the delegation chain from root servers, showing how DNS resolution works.

drill's DNSSEC support includes signature validation and trust chain verification, making it valuable for debugging secure DNS configurations.

# CAVEATS

Less widely installed than dig. Some output format differences from dig. DNSSEC validation requires proper trust anchor configuration.

# HISTORY

drill was developed as part of the **ldns** library by **NLnet Labs**, creators of Unbound DNS. It was designed as a dig replacement with better DNSSEC support and cleaner output.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [dog](/man/dog)(1), [unbound](/man/unbound)(8)
