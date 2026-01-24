# TLDR

**Find URLs for domain**

```waymore -i [example.com]```

**Mode selection**

```waymore -i [example.com] -mode [U]```

**Output to file**

```waymore -i [example.com] -oU [urls.txt]```

**With filters**

```waymore -i [example.com] -xcc```

# SYNOPSIS

**waymore** [_-i domain_] [_-mode mode_] [_-oU file_] [_options_]

# PARAMETERS

**-i** _DOMAIN_
> Input domain.

**-mode** _MODE_
> Mode (U=URLs, R=Responses).

**-oU** _FILE_
> Output URLs file.

**-xcc**
> Exclude common.

**-t** _THREADS_
> Thread count.

# DESCRIPTION

**waymore** finds archived URLs. It searches web archives.

Wayback Machine. Historical URLs.

Common Crawl. Web archive search.

URL extraction. For recon.

Security research. Bug bounty.

# CAVEATS

Rate limited. Takes time. Python required.

# HISTORY

**waymore** was created by **xnl-h4ck3r** for web reconnaissance, searching multiple archive sources for URLs.

# SEE ALSO

[waybackurls](/man/waybackurls)(1), [gau](/man/gau)(1), [hakrawler](/man/hakrawler)(1)
