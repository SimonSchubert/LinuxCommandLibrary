# TAGLINE

information gathering reconnaissance tool

# TLDR

**Perform whois lookup**

```dmitry -w [domain.com]```

**Get netcraft info**

```dmitry -n [domain.com]```

**Search for subdomains**

```dmitry -s [domain.com]```

**Search for email** addresses

```dmitry -e [domain.com]```

**Perform TCP port** scan

```dmitry -p [domain.com]```

**Run all information** gathering

```dmitry -winsepo [output.txt] [domain.com]```

# SYNOPSIS

**dmitry** [_options_] _host_

# PARAMETERS

_HOST_
> Target domain or IP address.

**-w**
> Perform whois lookup.

**-n**
> Retrieve Netcraft information.

**-s**
> Search for subdomains.

**-e**
> Search for email addresses.

**-p**
> Perform TCP port scan.

**-b**
> Read banner from discovered ports.

**-o** _FILE_
> Output to file.

**-i**
> Perform Internet number whois lookup.

**-h**
> Display help information.

# DESCRIPTION

**dmitry** (Deepmagic Information Gathering Tool) is a UNIX command-line application for information gathering during penetration testing. It collects data about a host through various passive and active techniques.

The tool combines multiple reconnaissance functions: whois lookups, Netcraft queries, subdomain enumeration, email harvesting, and TCP port scanning. Results can be consolidated into a single report file.

dmitry is designed for the information gathering phase of security assessments, helping testers understand the target environment before more active testing.

# CAVEATS

Some queries may be rate-limited. Port scanning should only be performed with authorization. Email harvesting depends on public data availability. Results may vary based on target configuration.

# HISTORY

dmitry was developed for security professionals as a reconnaissance tool. It consolidates multiple information gathering techniques into a single utility, streamlining the initial phases of penetration testing engagements.

# SEE ALSO

[nmap](/man/nmap)(1), [whois](/man/whois)(1), [dig](/man/dig)(1), [theHarvester](/man/theHarvester)(1)
