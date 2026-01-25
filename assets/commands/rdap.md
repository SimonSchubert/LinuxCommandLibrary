# TLDR

**Query domain**

```rdap [example.com]```

**Query IP address**

```rdap [192.0.2.1]```

**Query ASN**

```rdap [AS15169]```

**JSON output**

```rdap -j [example.com]```

**Verbose output**

```rdap -v [example.com]```

# SYNOPSIS

**rdap** [_options_] _query_

# PARAMETERS

**-j**, **--json**
> JSON output.

**-v**, **--verbose**
> Verbose mode.

**-s** _server_
> Use specific RDAP server.

**-t** _type_
> Query type (domain, ip, autnum).

**--raw**
> Raw response.

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

```
domain   - Domain registration
ip       - IP address/network
autnum   - Autonomous System Number
entity   - Registrant entity
nameserver - Name server
```

# CAVEATS

Not all TLDs support RDAP. Some data may require authentication. Successor to WHOIS.

# HISTORY

RDAP was developed by the **IETF** starting in 2012 as a structured, secure replacement for the WHOIS protocol.

# SEE ALSO

[whois](/man/whois)(1), [dig](/man/dig)(1), [host](/man/host)(1)
