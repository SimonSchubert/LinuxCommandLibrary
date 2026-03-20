# TAGLINE

Query domain and IP registration data

# TLDR

**Query domain**

```rdap [example.com]```

**Query IP address**

```rdap [192.0.2.1]```

**Query ASN**

```rdap [AS15169]```

**JSON output**

```rdap -j [example.com]```

**WHOIS-style output**

```rdap -w [example.com]```

**Verbose output**

```rdap -v [example.com]```

**Use specific RDAP server**

```rdap -s [https://rdap.verisign.com/com/v1] [example.com]```

# SYNOPSIS

**rdap** [_options_] _query_

# PARAMETERS

**-j**, **--json**
> Output JSON, pretty-printed

**-r**, **--raw**
> Output raw server response

**-w**, **--whois**
> Output WHOIS style (domain queries only)

**-v**, **--verbose**
> Print verbose messages on stderr

**-s**, **--server**=_URL_
> Use specific RDAP server

**-T**, **--timeout**=_SECS_
> Timeout after specified seconds (default: 30)

**-k**, **--insecure**
> Disable SSL certificate verification

**--text**
> Output plain text tree format (default)

**-t**, **--type**=_TYPE_
> RDAP query type (normally auto-detected): domain, ip, autnum, entity, nameserver, url

# DESCRIPTION

**rdap** queries Registration Data Access Protocol servers for domain, IP, and ASN registration information. RDAP is the modern replacement for WHOIS with structured data and authentication support.

# EXAMPLES

```bash
# Domain lookup
rdap example.com

# IP address lookup
rdap 8.8.8.8

# ASN lookup
rdap AS15169

# JSON output
rdap -j google.com

# Specific server
rdap -s https://rdap.verisign.com/com/v1 example.com

# IPv6 address
rdap 2001:4860:4860::8888
```

# QUERY TYPES

Query type is normally auto-detected, but can be specified with **--type**:

```
domain     - Domain registration
ip         - IP address/network
autnum     - Autonomous System Number
entity     - Registrant entity
nameserver - Name server
url        - Direct RDAP URL
```

# CAVEATS

Not all TLDs support RDAP. Some data may require authentication. Successor to WHOIS.

# HISTORY

RDAP was developed by the **IETF** starting in 2012 as a structured, secure replacement for the WHOIS protocol.

# SEE ALSO

[whois](/man/whois)(1), [dig](/man/dig)(1), [host](/man/host)(1)
