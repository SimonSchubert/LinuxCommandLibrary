# TLDR

**Fetch URLs for a domain**

```echo "[example.com]" | waybackurls```

**Fetch from multiple domains**

```cat [domains.txt] | waybackurls```

**Exclude subdomains**

```echo "[example.com]" | waybackurls -no-subs```

**Include dates in output**

```echo "[example.com]" | waybackurls -dates```

**Output in JSON format**

```echo "[example.com]" | waybackurls -json```

**Save unique URLs to file**

```echo "[example.com]" | waybackurls | sort -u > [urls.txt]```

**Find specific file types**

```echo "[example.com]" | waybackurls | grep "\.js$"```

# SYNOPSIS

**waybackurls** [_options_]

# PARAMETERS

**-no-subs**
> Don't include subdomains in results.

**-dates**
> Include archive dates in output.

**-json**
> Output results in JSON format.

# DESCRIPTION

**waybackurls** fetches all URLs known by the Wayback Machine (Internet Archive) for specified domains. It accepts domains on stdin and outputs discovered URLs to stdout.

The tool queries the Wayback Machine's CDX API to retrieve historical URL data. This includes URLs that may no longer exist, revealing past site structure and potentially sensitive endpoints.

Common use cases include reconnaissance during security assessments, finding old endpoints, discovering JavaScript files, and identifying removed content. Results often reveal API endpoints, admin panels, and forgotten pages.

Install via Go: `go install github.com/tomnomnom/waybackurls@latest`

# CAVEATS

Results depend on Wayback Machine's archive coverage. May return many duplicate or similar URLs. Rate limiting may apply for large requests. URLs may no longer be accessible on live site.

# HISTORY

**waybackurls** was created by Tom Hudson (tomnomnom) as part of his bug bounty toolkit. It simplifies access to historical URL data that would otherwise require manual CDX API queries. The tool is widely used in security reconnaissance.

# SEE ALSO

[gau](/man/gau)(1), [hakrawler](/man/hakrawler)(1), [subfinder](/man/subfinder)(1), [httpx](/man/httpx)(1)
