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

**sublist3r** discovers subdomains using search engines. It's an OSINT reconnaissance tool.

Multiple search engines are queried. Google, Bing, Yahoo, Baidu, and others.

VirusTotal integration finds additional subdomains. Historical DNS data included.

Bruteforce mode tries common names. Wordlist-based discovery.

Port scanning checks discovered hosts. Identify live services.

# CAVEATS

For authorized testing only. Rate limiting may apply. Some engines require API keys.

# HISTORY

**Sublist3r** was created by **Ahmed Aboul-Ela** for subdomain enumeration. It's widely used in penetration testing and bug bounty hunting.

# SEE ALSO

[amass](/man/amass)(1), [subfinder](/man/subfinder)(1), [dnsrecon](/man/dnsrecon)(1)
