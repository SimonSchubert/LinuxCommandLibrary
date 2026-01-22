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
> Organization name to research

**-asn** _number_
> Autonomous System Number (can include AS prefix)

**-cidr** _range_
> IP range in CIDR notation

**-ip** _address_
> Single IP address

**-whois**
> Perform reverse WHOIS lookups

**-d** _domain_
> Domain for WHOIS lookup

**-active**
> Enable active methods

**-src**
> Show data sources

**-o** _file_
> Output file

**-config** _file_
> Configuration file

# CAVEATS

Organization name matching is fuzzy; review results for accuracy. WHOIS data may be privacy-protected. ASN information may not cover all organizational assets.

# HISTORY

**amass intel** was added to provide organizational-level reconnaissance capabilities, complementing the domain-focused enum command.

# SEE ALSO

[amass](/man/amass)(1), [amass-enum](/man/amass-enum)(1), [whois](/man/whois)(1)
