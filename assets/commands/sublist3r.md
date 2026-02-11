# TAGLINE

Subdomain enumeration using search engines

# TLDR

**Enumerate subdomains**

```sublist3r -d [example.com]```

**Save to file**

```sublist3r -d [example.com] -o [subdomains.txt]```

**Use specific engines**

```sublist3r -d [example.com] -e [google,bing,virustotal]```

**Set threads**

```sublist3r -d [example.com] -t [10]```

**Enable bruteforce**

```sublist3r -d [example.com] -b```

**Verbose output**

```sublist3r -d [example.com] -v```

**Show ports**

```sublist3r -d [example.com] -p [80,443]```

# SYNOPSIS

**sublist3r** [_-d domain_] [_-o file_] [_-e engines_] [_options_]

# PARAMETERS

**-d**, **--domain** _DOMAIN_
> Target domain.

**-o**, **--output** _FILE_
> Output file.

**-e**, **--engines** _LIST_
> Search engines.

**-b**, **--bruteforce**
> Enable bruteforce.

**-t**, **--threads** _N_
> Thread count.

**-p**, **--ports** _PORTS_
> Scan ports.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**sublist3r** is an OSINT reconnaissance tool that discovers subdomains of a target domain by querying multiple search engines and data sources. It aggregates results from Google, Bing, Yahoo, Baidu, Ask, Netcraft, VirusTotal, and other sources to build a comprehensive list of subdomains.

Beyond passive search engine enumeration, sublist3r can perform active DNS bruteforce using common subdomain wordlists. It also includes port scanning capabilities to identify which discovered subdomains have live services running on specified ports, helping prioritize targets during security assessments.

The tool is designed for authorized penetration testing and bug bounty reconnaissance. Multi-threading support allows faster enumeration, and results can be saved to files for further processing by other security tools.

# CAVEATS

For authorized testing only. Rate limiting may apply. Some engines require API keys.

# HISTORY

**Sublist3r** was created by **Ahmed Aboul-Ela** for subdomain enumeration. It's widely used in penetration testing and bug bounty hunting.

# SEE ALSO

[amass](/man/amass)(1), [subfinder](/man/subfinder)(1), [dnsrecon](/man/dnsrecon)(1)
