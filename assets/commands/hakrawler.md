# TAGLINE

fast web crawler for gathering URLs and JavaScript file references

# TLDR

**Crawl single URL**

```echo "[https://example.com]" | hakrawler```

**Crawl with depth**

```echo "[https://example.com]" | hakrawler -d [3]```

**Include subdomains in scope**

```echo "[https://example.com]" | hakrawler -s subs```

**Use plain output**

```echo "[https://example.com]" | hakrawler -plain```

**Crawl with custom timeout and disable redirects**

```echo "[https://example.com]" | hakrawler -t [15] -dr```

# SYNOPSIS

**hakrawler** [_options_]

# PARAMETERS

**-d** _depth_
> Crawl depth (default 1).

**-s** _scope_
> Scope of the crawl: strict (same domain only), subs (include subdomains), or fuzzy (everything). Default is strict.

**-plain**
> Plain output mode, only prints URLs.

**-t** _seconds_
> Request timeout in seconds (default 10).

**-w** _workers_
> Number of concurrent workers (default 8).

**-insecure**
> Skip TLS certificate verification.

**-dr**
> Disable following redirects.

**-h**
> Show help message.

# DESCRIPTION

**hakrawler** is a fast web crawler for gathering URLs and JavaScript file references. It's designed for reconnaissance in web application security testing.

The tool reads URLs from stdin and outputs discovered links, making it easy to chain with other tools in security testing pipelines.

# USAGE EXAMPLES

```bash
# Basic crawl
echo "https://target.com" | hakrawler

# Crawl with plain output for piping
cat urls.txt | hakrawler -plain | sort -u

# Deep crawl including subdomains
echo "https://target.com" | hakrawler -d 3 -s subs -plain
```

# CAVEATS

For authorized security testing only. May trigger security controls. High worker counts may cause rate limiting or IP bans.

# HISTORY

hakrawler was created by **Luke Stephens** (hakluke) as part of a suite of security tools. It's designed for bug bounty hunters and penetration testers doing web reconnaissance.

# SEE ALSO

[waybackurls](/man/waybackurls)(1), [gau](/man/gau)(1), [curl](/man/curl)(1)
