# TAGLINE

OSINT email and subdomain gatherer

# TLDR

**Search for emails and subdomains** of a domain using all sources

```theHarvester -d [example.com] -b all```

**Search using specific sources**

```theHarvester -d [example.com] -b [crtsh,certspotter]```

**Limit the number of results**

```theHarvester -d [example.com] -b [crtsh] -l [100]```

**Save results to files**

```theHarvester -d [example.com] -b all -f [report]```

**Resolve discovered hostnames**

```theHarvester -d [example.com] -b all -r```

**Brute force subdomains** via DNS

```theHarvester -d [example.com] -b all -c```

**Take screenshots** of discovered hosts

```theHarvester -d [example.com] -b all --screenshot [path/to/output]```

**Check for subdomain takeover** vulnerabilities

```theHarvester -d [example.com] -b all --take-over```

# SYNOPSIS

**theHarvester** **-d** _domain_ **-b** _source_ [_options_]

# PARAMETERS

**-d, --domain** _domain_
> Company name or domain to search (required).

**-b, --source** _source_
> Comma-separated data sources, for example crtsh, certspotter, duckduckgo, hackertarget, otx, urlscan, virustotal, shodan, hunter, securityTrails, github-code, or **all**. Run **theHarvester -h** for the list supported by your version.

**-l, --limit** _limit_
> Limit the number of search results (default: 500).

**-S, --start** _start_
> Start at this result number (default: 0).

**-f, --filename** _name_
> Save the results to XML and JSON files using this base name.

**-p, --proxies**
> Use the proxies configured in **proxies.yaml**.

**-s, --shodan**
> Use Shodan to query discovered hosts.

**-e, --dns-server** _server_
> DNS server to use for lookups (4.x only; 5.0 replaces it with **--dns-resolvers**).

**-r, --dns-resolve** [_resolvers_]
> Resolve discovered hostnames, optionally with a resolver list or file.

**-n, --dns-lookup**
> Enable reverse DNS lookups on discovered networks.

**-c, --dns-brute**
> Perform a DNS brute force on the domain.

**-t, --take-over**
> Check for possible subdomain takeovers.

**-a, --api-scan**
> Scan for API endpoints.

**-w, --wordlist** _file_
> Wordlist for API endpoint scanning.

**--screenshot** _dir_
> Save screenshots of discovered hosts to a directory.

**-q, --quiet**
> Suppress missing API key warnings and reading the api-keys file.

# DESCRIPTION

**theHarvester** is an open-source intelligence (OSINT) tool used during reconnaissance in penetration testing and red team assessments. It gathers publicly available information about a target domain including email addresses, subdomains, hostnames, IP addresses, URLs and employee names.

The tool queries multiple data sources including search engines, certificate databases, DNS databases, and security-focused services. Results can be saved for further analysis. Many advanced sources require API keys configured in **api-keys.yaml**, which is read from **~/.theHarvester/**, **/etc/theHarvester/** or **/usr/local/etc/theHarvester/**, along with **proxies.yaml**.

# CAVEATS

Only run against targets you own or have explicit permission to test. Options such as **-c**, **-r**, **-t**, **-a** and **--screenshot** send DNS queries or direct requests rather than passive lookups. Many data sources require valid API keys (Shodan, Hunter.io, Censys, SecurityTrails, etc.); without them, those sources are skipped or return nothing. Rate limiting may apply when querying certain sources extensively.

Flags above follow the 4.11 release. The in-development 5.0 series requires Python 3.14, adds **-j** (source workers), **--no-hosts**, **--routeviews**, **--vhost** and selectors such as **-b subdomains**, makes **-b all** run only passive sources, and writes JSONL output with **-f**.

# HISTORY

theHarvester was created by **Christian Martorella** (laramies) of Edge-Security. It has become a standard reconnaissance tool included in penetration testing distributions like **Kali Linux** and is actively maintained.

# SEE ALSO

[nmap](/man/nmap)(1), [subfinder](/man/subfinder)(1), [amass](/man/amass)(1), [recon-ng](/man/recon-ng)(1)

# RESOURCES

```[Source code](https://github.com/laramies/theHarvester)```

```[Documentation](https://github.com/laramies/theHarvester/wiki)```

<!-- verified: 2026-11-09 -->
