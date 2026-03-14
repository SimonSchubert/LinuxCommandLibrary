# TAGLINE

OSINT email and subdomain gatherer

# TLDR

**Search for emails and subdomains** of a domain using all sources

```theHarvester -d [example.com] -b all```

**Search using a specific source**

```theHarvester -d [example.com] -b [google]```

**Limit the number of results**

```theHarvester -d [example.com] -b google -l [100]```

**Save results to a file**

```theHarvester -d [example.com] -b all -f [report]```

**Perform DNS lookup** on discovered hosts

```theHarvester -d [example.com] -b all --dns-lookup```

**Take screenshots** of discovered web pages

```theHarvester -d [example.com] -b all --screenshot [path/to/output]```

**Check for subdomain takeover** vulnerabilities

```theHarvester -d [example.com] -b all --take-over```

# SYNOPSIS

**theHarvester** **-d** _domain_ **-b** _source_ [_options_]

# PARAMETERS

**-d** _domain_
> Target domain to search (required).

**-b** _source_
> Data source to use: google, bing, yahoo, duckduckgo, github-code, linkedin, shodan, virustotal, certspotter, crtsh, dnsdumpster, hunter, securityTrails, **all**, and others.

**-l** _limit_
> Limit the number of search results.

**-f** _filename_
> Output filename to save results (HTML/XML format).

**-S** _start_
> Start result number for search pagination.

**-e** _server_
> Use a specific DNS server for lookups.

**-p**
> Route requests through a proxy server.

**-s**
> Use Shodan to query discovered hosts.

**-c**
> Verify discovered hosts via HTTP/HTTPS.

**-n**
> Enable DNS server lookup.

**-r** [_file_]
> Perform reverse DNS lookups on discovered ranges.

**-w** _wordlist_
> DNS brute force using a wordlist for subdomain discovery.

**--take-over**
> Check for possible subdomain takeover vulnerabilities.

**--screenshot** _path_
> Take screenshots of discovered web pages.

**-v**
> Show version information.

# DESCRIPTION

**theHarvester** is an open-source intelligence (OSINT) tool used during reconnaissance in penetration testing and red team assessments. It gathers publicly available information about a target domain including email addresses, subdomains, hostnames, employee names, and open ports.

The tool queries multiple data sources including search engines, certificate databases, DNS databases, and security-focused services. Results can be saved for further analysis. Many advanced sources require API keys configured in the **api-keys.yaml** file within the theHarvester installation directory.

# CAVEATS

Many data sources require valid API keys (Shodan, Hunter.io, Censys, SecurityTrails, etc.) for full functionality. Without proper API keys, searches will return limited or no results. Rate limiting may apply when querying certain sources extensively.

# HISTORY

theHarvester was created by **Christian Martorella** (laramies) and first released around **2007**. It has become a standard reconnaissance tool included in penetration testing distributions like **Kali Linux**. The tool is actively maintained and has been updated to support Python 3.12+ and numerous new data sources over the years.

# SEE ALSO

[nmap](/man/nmap)(1), [subfinder](/man/subfinder)(1), [amass](/man/amass)(1), [recon-ng](/man/recon-ng)(1)
