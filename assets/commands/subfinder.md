# TAGLINE

Passive subdomain discovery tool

# TLDR

**Find subdomains**

```subfinder -d [example.com]```

**Output to file**

```subfinder -d [example.com] -o [subdomains.txt]```

**Use all sources**

```subfinder -d [example.com] -all```

**Show only active hosts**

```subfinder -d [example.com] -active```

**Silent mode** (subdomains only)

```subfinder -d [example.com] -silent```

**Multiple domains**

```subfinder -dL [domains.txt]```

# SYNOPSIS

**subfinder** [_options_]

# DESCRIPTION

**subfinder** is a subdomain discovery tool that uses passive sources to find subdomains of a target domain. It queries certificate transparency logs, DNS datasets, and various APIs.

The tool is designed for authorized security assessments and bug bounty hunting.

# PARAMETERS

**-d** _domain_
> Target domain.

**-dL** _file_
> List of domains.

**-o** _file_
> Output file.

**-oJ**
> JSON output.

**-all**
> Use all sources.

**-active**
> Verify active subdomains.

**-silent**
> Output subdomains only.

**-v**
> Verbose output.

**-t** _n_
> Threads.

**-timeout** _n_
> Timeout in seconds.

**-rl** _n_
> Rate limit.

# CONFIGURATION

**~/.config/subfinder/provider-config.yaml**
> API keys and credentials for data sources such as Shodan, Censys, SecurityTrails, and VirusTotal.

# CAVEATS

API keys improve results. Rate limits apply. Only for authorized testing. Results depend on available data.

# HISTORY

**subfinder** was created by **projectdiscovery** as a fast subdomain enumeration tool. It's part of their security toolkit and is widely used in the bug bounty community.

# SEE ALSO

[amass](/man/amass)(1), [findomain](/man/findomain)(1), [assetfinder](/man/assetfinder)(1), [dnsx](/man/dnsx)(1)
