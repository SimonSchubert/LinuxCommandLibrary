# TAGLINE

DNS reconnaissance and subdomain discovery tool

# TLDR

**DNS reconnaissance on** domain

```fierce --domain [example.com]```

**Use custom DNS** server

```fierce --domain [example.com] --dns-servers [8.8.8.8]```

**Search with wordlist**

```fierce --domain [example.com] --subdomain-file [wordlist.txt]```

**Expand search range**

```fierce --domain [example.com] --wide```

**Output to file**

```fierce --domain [example.com] > [output.txt]```

# SYNOPSIS

**fierce** [_options_]

# PARAMETERS

**--domain** _DOMAIN_
> Target domain to scan.

**--dns-servers** _SERVERS_
> Custom DNS servers.

**--subdomain-file** _FILE_
> Wordlist for subdomain bruteforce.

**--wide**
> Scan entire class C of found hosts.

**--traverse** _N_
> Scan adjacent IPs.

**--delay** _SEC_
> Delay between queries.

**--help**
> Display help information.

# DESCRIPTION

**fierce** is a DNS reconnaissance tool that locates non-contiguous IP space and hostnames for a target. It performs zone transfers, subdomain brute forcing, and adjacent IP discovery.

The tool attempts DNS zone transfers first, then falls back to dictionary-based subdomain enumeration. When hosts are found, it scans nearby IP addresses to discover additional systems.

fierce is used in penetration testing for initial target enumeration and attack surface mapping.

# CAVEATS

Only use against authorized targets. Zone transfers usually fail on properly configured servers. DNS queries may be logged.

# HISTORY

fierce was created by **RSnake** (Robert Hansen) as a DNS reconnaissance tool for penetration testers. The Python 3 rewrite modernized the original Perl script for current security workflows.

# SEE ALSO

[dig](/man/dig)(1), [nmap](/man/nmap)(1), [dnsenum](/man/dnsenum)(1)
