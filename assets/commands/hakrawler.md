# TLDR

**Crawl single URL**

```echo "[https://example.com]" | hakrawler```

**Crawl with depth**

```echo "[https://example.com]" | hakrawler -d [3]```

**Show JavaScript files**

```echo "[https://example.com]" | hakrawler -js```

**Include subdomains**

```echo "[https://example.com]" | hakrawler -subs```

**Use plain output**

```echo "[https://example.com]" | hakrawler -plain```

# SYNOPSIS

**hakrawler** [_options_]

# PARAMETERS

**-d** _depth_
> Crawl depth (default 1).

**-h** _threads_
> Number of threads.

**-js**
> Include JavaScript file links.

**-plain**
> Plain output mode.

**-subs**
> Include subdomains.

**-u**
> Show unique URLs only.

**-t** _timeout_
> Request timeout.

**-insecure**
> Skip TLS verification.

**-dr**
> Disable redirects.

# DESCRIPTION

**hakrawler** is a fast web crawler for gathering URLs and JavaScript file references. It's designed for reconnaissance in web application security testing.

The tool reads URLs from stdin and outputs discovered links, making it easy to chain with other tools in security testing pipelines.

# USAGE EXAMPLES

```bash
# Basic crawl
echo "https://target.com" | hakrawler

# Find all JS files
cat urls.txt | hakrawler -js -plain | sort -u

# Deep crawl with subdomains
echo "https://target.com" | hakrawler -d 5 -subs
```

# CAVEATS

For authorized security testing only. May trigger security controls. Respects robots.txt by default. High thread counts may cause issues.

# HISTORY

hakrawler was created by **Luke Stephens** (hakluke) as part of a suite of security tools. It's designed for bug bounty hunters and penetration testers doing web reconnaissance.

# SEE ALSO

[gospider](/man/gospider)(1), [waybackurls](/man/waybackurls)(1), [gau](/man/gau)(1)
