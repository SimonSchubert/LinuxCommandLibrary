# TAGLINE

Find archived URLs from multiple sources

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

**waymore** is a reconnaissance tool that discovers URLs and archived responses for a domain by querying multiple web archive sources including the Wayback Machine and Common Crawl. It provides broader coverage than tools that query only a single archive.

The tool operates in two modes: URL mode extracts known URLs for the target domain from archive indices, while response mode retrieves the actual archived page contents. Results can be filtered to exclude common file types and irrelevant content.

Multi-threaded processing speeds up large queries, and output can be saved to files for further analysis. The tool is commonly used in security research and bug bounty programs for discovering forgotten endpoints, old API paths, and removed content.

# CAVEATS

Rate limited. Takes time. Python required.

# HISTORY

**waymore** was created by **xnl-h4ck3r** for web reconnaissance, searching multiple archive sources for URLs.

# SEE ALSO

[waybackurls](/man/waybackurls)(1), [gau](/man/gau)(1), [hakrawler](/man/hakrawler)(1)
