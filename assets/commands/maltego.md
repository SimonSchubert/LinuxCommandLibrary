# TAGLINE

OSINT and graphical link analysis tool

# TLDR

**Start Maltego**

```maltego```

**Start community edition**

```maltego ce```

**Run headless with config**

```maltego -i [config.mtgx]```

# SYNOPSIS

**maltego** [_options_]

# PARAMETERS

**ce**
> Community edition mode.

**-i** _file_
> Import configuration.

**--help**
> Show help.

# DESCRIPTION

**Maltego** is an OSINT (Open Source Intelligence) and graphical link analysis tool. It visualizes relationships between entities like people, organizations, domains, IP addresses, and infrastructure.

Maltego uses transforms to automatically gather data from various sources and display connections in a graph format.

# ENTITY TYPES

```
- Infrastructure: Domains, IPs, DNS
- Personal: Names, Email, Social
- Network: AS Numbers, Netblocks
- Documents: Files, URLs
```

# EDITIONS

```
Community (CE) - Free, limited transforms
Classic        - Commercial
XL             - Enterprise scale
```

# CAVEATS

Requires Java. CE edition has limitations. Transform servers may have rate limits. Premium transforms require subscriptions.

# HISTORY

Maltego was developed by **Paterva** in South Africa, first released in **2008**. It became a standard tool in penetration testing and intelligence gathering.

# SEE ALSO

[theharvester](/man/theharvester)(1), [recon-ng](/man/recon-ng)(1), [spiderfoot](/man/spiderfoot)(1), [shodan](/man/shodan)(1)
