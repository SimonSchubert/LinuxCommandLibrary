# TAGLINE

Discover domains and infrastructure for an organization

# TLDR

**Discover** root domains for an organization

```amass intel -org "[Company Name]"```

Find domains from **ASN**

```amass intel -asn [AS12345]```

Reverse lookup by **IP range**

```amass intel -cidr [192.168.1.0/24]```

Find domains from **whois** data

```amass intel -whois -d [example.com]```

# SYNOPSIS

**amass intel** [_-org name_] [_-asn number_] [_-cidr range_] [_options_]

# DESCRIPTION

**amass intel** gathers intelligence to identify domains and infrastructure owned by an organization. It uses various techniques including ASN lookup, WHOIS analysis, certificate transparency, and reverse IP lookups.

This command is typically used at the beginning of reconnaissance to identify all root domains before detailed enumeration.

# PARAMETERS

**-org** _name_
> Search string matched against AS description information

**-asn** _number_
> ASNs separated by commas (can be used multiple times)

**-cidr** _range_
> CIDRs separated by commas (can be used multiple times)

**-addr** _ips_
> IPs and ranges (for example 192.168.1.1-254) separated by commas

**-whois**
> Run all discovered domains through reverse WHOIS

**-d** _domain_
> Domain names separated by commas (can be used multiple times)

**-active**
> Enable active recon methods

**-ip**
> Show the IP addresses for discovered names

**-o** _file_
> Output file

**-config** _file_
> Configuration file

# CONFIGURATION

**~/.config/amass/config.ini**
> Amass configuration file defining data sources, API keys, and scope settings.

# CAVEATS

Organization name matching is fuzzy; review results for accuracy. WHOIS data may be privacy-protected. ASN information may not cover all organizational assets.

# HISTORY

**amass intel** was added to provide organizational-level reconnaissance capabilities, complementing the domain-focused enum command.

# SEE ALSO

[amass](/man/amass)(1), [amass-enum](/man/amass-enum)(1), [amass-track](/man/amass-track)(1), [whois](/man/whois)(1)

# RESOURCES

```[Source code](https://github.com/owasp-amass/amass)```

```[Documentation](https://github.com/owasp-amass/amass/blob/master/doc/user_guide.md)```

<!-- verified: 2026-06-11 -->
