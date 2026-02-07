# TAGLINE

URL fetcher from multiple archive sources

# TLDR

**Fetch URLs for** domain

```gau [example.com]```

**Output to file**

```gau [example.com] -o [urls.txt]```

**Fetch with providers**

```gau --providers [wayback,otx] [example.com]```

**Include subdomains**

```gau --subs [example.com]```

**Filter by date**

```gau --from [202201] --to [202212] [example.com]```

# SYNOPSIS

**gau** [_options_] _domains_...

# PARAMETERS

_DOMAINS_
> Target domains to fetch URLs for.

**-o** _FILE_, **--o** _FILE_
> Output file.

**--providers** _LIST_
> URL sources: wayback, otx, commoncrawl.

**--subs**
> Include subdomains.

**--from** _DATE_
> Start date (YYYYMM).

**--to** _DATE_
> End date (YYYYMM).

**--help**
> Display help information.

# DESCRIPTION

**gau** (Get All URLs) fetches known URLs for domains from multiple sources including Wayback Machine, Common Crawl, and AlienVault OTX. It's used for reconnaissance and security research.

The tool aggregates historical URLs that may reveal hidden endpoints, parameters, or old vulnerabilities. Results include archived pages, API endpoints, and file paths.

gau enables discovering attack surface by finding URLs that were once publicly accessible.

# CAVEATS

Results include historical dead URLs. May produce large output. Subject to source rate limits.

# HISTORY

gau was created for security research and bug bounty hunting, providing easy access to archived URL databases for reconnaissance purposes.

# SEE ALSO

[waybackurls](/man/waybackurls)(1), [hakrawler](/man/hakrawler)(1), [gospider](/man/gospider)(1)
