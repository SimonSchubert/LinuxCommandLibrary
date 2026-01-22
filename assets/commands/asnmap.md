# TLDR

**Lookup** ASN for IP

```asnmap -ip [8.8.8.8]```

Lookup **domain**

```asnmap -d [google.com]```

Lookup by **ASN number**

```asnmap -a [AS15169]```

Lookup by **organization**

```asnmap -org "[Google LLC]"```

Output **CIDR ranges**

```asnmap -a [AS15169] -json```

# SYNOPSIS

**asnmap** [_-ip ip_] [_-d domain_] [_-a asn_] [_-org name_] [_options_]

# DESCRIPTION

**asnmap** quickly maps ASN (Autonomous System Number) information. It can lookup ASN from IP addresses, domains, or organization names, and return associated IP ranges.

This is useful for reconnaissance, network mapping, and understanding organizational IP allocations.

# PARAMETERS

**-ip** _address_
> Lookup ASN for IP address

**-d** _domain_
> Lookup ASN for domain

**-a** _asn_
> Get IP ranges for ASN

**-org** _name_
> Search by organization name

**-json**
> JSON output

**-silent**
> Silent mode

**-o** _file_
> Output file

# CAVEATS

Data comes from public sources and may not be current. Some organizations have multiple ASNs. Results should be verified for security work.

# HISTORY

**asnmap** was developed by ProjectDiscovery as part of their security reconnaissance toolkit.

# SEE ALSO

[whois](/man/whois)(1), [dig](/man/dig)(1), [nmap](/man/nmap)(1)
