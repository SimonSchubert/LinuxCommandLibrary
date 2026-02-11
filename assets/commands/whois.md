# TAGLINE

Query domain and IP registration information

# TLDR

**Look up domain registration info**

```whois [example.com]```

**Look up IP address info**

```whois [8.8.8.8]```

**Query a specific WHOIS server**

```whois -h [whois.verisign-grs.com] [example.com]```

**Look up AS number**

```whois [AS15169]```

**Disable recursive lookups**

```whois -r [example.com]```

# SYNOPSIS

**whois** [_options_] _object_

# PARAMETERS

**-h** _host_
> Query specified WHOIS server

**-p** _port_
> Connect to specified port

**-H**
> Hide legal disclaimers

**-r**
> Disable recursive lookups

**-a**
> Search all databases (RIPE)

**-T** _type_
> Search for specific object type

**--verbose**
> Verbose output

# DESCRIPTION

**whois** queries databases for domain name registration information, IP address allocation, and autonomous system (AS) numbers. It provides details about domain ownership, registration dates, name servers, and contact information.

For domain names, whois contacts the appropriate registry (based on TLD) to retrieve registration data. For IP addresses, it queries regional internet registries (ARIN, RIPE, APNIC, etc.).

The data returned includes registrant information (often privacy-protected), registration and expiration dates, name servers, and registrar details.

Different registries have different data formats and levels of detail. Some domains use privacy services that mask the actual registrant information.

# CAVEATS

Many domain registrations now use privacy protection services, showing proxy information instead of actual registrant details.

Rate limits may apply. Excessive queries can result in temporary blocks from WHOIS servers.

Data format varies significantly between registries. Parsing WHOIS output programmatically is challenging.

RDAP (Registration Data Access Protocol) is gradually replacing WHOIS with a structured, standardized format.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [nslookup](/man/nslookup)(1), [rdap](/man/rdap)(1)
