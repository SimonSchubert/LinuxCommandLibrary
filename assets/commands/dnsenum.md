# TAGLINE

DNS enumeration and reconnaissance tool

# TLDR

**Enumerate DNS information** for domain

```dnsenum [domain.com]```

**Use specific DNS** server

```dnsenum --dnsserver [8.8.8.8] [domain.com]```

**Enumerate with brute** force

```dnsenum --enum -f [wordlist.txt] [domain.com]```

**Save output to file**

```dnsenum -o [output.xml] [domain.com]```

**Specify threads** for brute force

```dnsenum --threads [10] [domain.com]```

**Perform zone transfer**

```dnsenum --noreverse [domain.com]```

# SYNOPSIS

**dnsenum** [_options_] _domain_

# PARAMETERS

_DOMAIN_
> Target domain to enumerate.

**--dnsserver** _SERVER_
> DNS server to query.

**--enum**
> Shorthand for DNS enumeration.

**-f** _FILE_
> Wordlist for brute force.

**--threads** _N_
> Number of threads.

**-o** _FILE_
> Output file (XML format).

**--noreverse**
> Skip reverse lookups.

**--private**
> Include private IPs.

**--help**
> Display help information.

# DESCRIPTION

**dnsenum** is a DNS enumeration tool that gathers information about a domain's DNS infrastructure. It performs multiple queries to discover hosts, name servers, mail servers, and potential subdomains.

The tool attempts zone transfers, performs reverse lookups, and can brute force subdomains using wordlists. It also scrapes search engines for additional subdomain information and integrates results from multiple sources.

dnsenum is commonly used in penetration testing and security assessments to map an organization's DNS footprint and identify potential attack vectors.

# CAVEATS

Only perform on domains you have authorization to test. Zone transfers typically blocked on properly configured servers. Brute forcing may be detected and blocked. Search scraping may hit rate limits.

# HISTORY

dnsenum is a Perl-based tool developed for the security community. It became a standard reconnaissance tool in penetration testing distributions like Kali Linux, providing comprehensive DNS enumeration capabilities.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [fierce](/man/fierce)(1), [dnsrecon](/man/dnsrecon)(1)
