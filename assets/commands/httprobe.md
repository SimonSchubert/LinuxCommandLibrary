# TLDR

**Probe domains from stdin**

```cat [subdomains.txt] | httprobe```

**Probe with concurrency**

```cat [subdomains.txt] | httprobe -c [50]```

**Probe specific ports**

```cat [subdomains.txt] | httprobe -p [http:8080] -p [https:8443]```

**Skip default ports**

```cat [subdomains.txt] | httprobe -s```

**Set timeout**

```cat [subdomains.txt] | httprobe -t [5000]```

**Prefer HTTPS**

```cat [subdomains.txt] | httprobe --prefer-https```

# SYNOPSIS

**httprobe** [_options_]

# PARAMETERS

**-c** _n_
> Concurrency level (default 20).

**-p** _proto:port_
> Add port to probe (e.g., http:8080).

**-s**
> Skip default ports (80, 443).

**-t** _ms_
> Timeout in milliseconds (default 10000).

**--prefer-https**
> Only output HTTPS when both work.

# DESCRIPTION

**httprobe** takes a list of domains from stdin and probes for working HTTP and HTTPS servers. It outputs URLs of domains that respond to requests. Commonly used in bug bounty workflows after subdomain enumeration to filter down to live web servers before further testing.

# SEE ALSO

[httpx](/man/httpx)(1), [curl](/man/curl)(1), [subfinder](/man/subfinder)(1)

