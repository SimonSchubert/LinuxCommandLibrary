# TAGLINE

Map autonomous system numbers and IP ranges

# TLDR

**Lookup** ASN for IP

```asnmap -ip [8.8.8.8]```

Lookup **domain**

```asnmap -d [google.com]```

Lookup by **ASN number**

```asnmap -a [AS15169]```

Lookup by **organization**

```asnmap -org "[Google LLC]"```

Lookup targets from a **file**

```asnmap -f [targets.txt]```

Output **CIDR ranges** as JSON

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

**-f**, **-file** _file_
> Read targets to lookup from a file

**-j**, **-json**
> Display output in JSON format

**-c**, **-csv**
> Display output in CSV format

**-v6**
> Display IPv6 CIDR ranges in CLI output

**-silent**
> Display silent output (results only)

**-o**, **-output** _file_
> Write output to a file

**-up**, **-update**
> Update asnmap to the latest version

# CAVEATS

Data comes from public sources and may not be current. Some organizations have multiple ASNs. Results should be verified for security work.

# HISTORY

**asnmap** was developed by ProjectDiscovery as part of their security reconnaissance toolkit.

# SEE ALSO

[whois](/man/whois)(1), [dig](/man/dig)(1), [nmap](/man/nmap)(1), [subfinder](/man/subfinder)(1)

# RESOURCES

```[Source code](https://github.com/projectdiscovery/asnmap)```

<!-- verified: 2026-06-17 -->
