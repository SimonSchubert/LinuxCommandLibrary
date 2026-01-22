# TLDR

**Passive** subdomain enumeration

```amass enum -passive -d [example.com]```

**Active** enumeration with brute force

```amass enum -active -brute -d [example.com]```

Enumerate with **configuration file**

```amass enum -config [config.ini] -d [example.com]```

Show **sources** for discovered names

```amass enum -d [example.com] -src```

Output with **IP addresses**

```amass enum -d [example.com] -ip -o [results.txt]```

# SYNOPSIS

**amass enum** [_-d domain_] [_-passive_] [_-active_] [_-brute_] [_options_]

# DESCRIPTION

**amass enum** performs DNS enumeration and network mapping. It discovers subdomains using multiple passive and active techniques, including querying data sources, certificate transparency, DNS brute-forcing, and zone transfers.

This is the primary command for subdomain discovery, offering extensive configuration for different reconnaissance needs.

# PARAMETERS

**-d** _domain_
> Target domain (repeatable for multiple domains)

**-passive**
> Use only passive data sources (no direct queries)

**-active**
> Perform active DNS resolution

**-brute**
> Enable subdomain brute-forcing

**-w** _file_
> Wordlist for brute-forcing

**-src**
> Show which source discovered each name

**-ip**
> Include IP addresses in output

**-ipv4**
> Show only IPv4 addresses

**-ipv6**
> Show only IPv6 addresses

**-o** _file_
> Output file for discovered names

**-json** _file_
> Output in JSON format

**-config** _file_
> Configuration file with API keys and settings

**-timeout** _minutes_
> Timeout for the enumeration

# CAVEATS

Active mode generates DNS traffic that may trigger alerts. Brute-forcing can take significant time. Many data sources require API keys configured in config file.

# HISTORY

**amass enum** has been the core functionality since amass was first released. It has expanded to include dozens of data sources and multiple enumeration techniques.

# SEE ALSO

[amass](/man/amass)(1), [amass-intel](/man/amass-intel)(1), [subfinder](/man/subfinder)(1)
