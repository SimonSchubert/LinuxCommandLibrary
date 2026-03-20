# TAGLINE

Find archived URLs from multiple sources

# TLDR

**Find URLs for a domain**

```waymore -i [example.com]```

**Retrieve URLs only** (skip response downloads)

```waymore -i [example.com] -mode U```

**Retrieve both URLs and archived responses**

```waymore -i [example.com] -mode B```

**Output URLs to a specific file**

```waymore -i [example.com] -oU [urls.txt]```

**Exclude subdomains**

```waymore -i [example.com] -n```

**Check estimated time and request count** before running

```waymore -i [example.com] -co```

**Limit requests per source**

```waymore -i [example.com] -lr [100]```

# SYNOPSIS

**waymore** [_-i domain_] [_-mode mode_] [_-oU file_] [_options_]

# PARAMETERS

**-i** _DOMAIN_
> Input domain or file of domains.

**-mode** _MODE_
> Mode: U (URLs only), R (Responses only), B (Both). Default: U.

**-n**, **--no-subs**
> Do not include subdomains of the target domain.

**-oU** _FILE_
> Output file for discovered URLs.

**-oR** _DIR_
> Output directory for downloaded responses.

**-xcc**
> Exclude Common Crawl results.

**-xav**
> Exclude Alien Vault OTX results.

**-lr** _NUM_
> Limit requests per source (0 = no limit).

**-co**, **--check-only**
> Check estimated request count and time without running.

**-ow**, **--output-overwrite**
> Overwrite output file instead of appending.

**-f** _REGEX_
> Filter URLs with keyword regex.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**waymore** is a reconnaissance tool that discovers URLs and archived responses for a domain by querying multiple web archive sources including the Wayback Machine, Common Crawl, Alien Vault OTX, URLScan, VirusTotal, GhostArchive, and Intelligence X. It provides broader coverage than tools that query only a single archive.

The tool operates in three modes: URL mode (U) extracts known URLs for the target domain from archive indices, response mode (R) retrieves the actual archived page contents, and both mode (B) does both. Results can be filtered to exclude specific sources or match keyword patterns.

Multi-threaded processing speeds up large queries, and output can be saved to files for further analysis. The tool is commonly used in security research and bug bounty programs for discovering forgotten endpoints, old API paths, and removed content.

# CAVEATS

Rate limited by archive sources. Large domains can take significant time; use -co to estimate first. Requires Python 3. Configuration via config.yml for API keys and defaults.

# HISTORY

**waymore** was created by **xnl-h4ck3r** for web reconnaissance, searching multiple archive sources for URLs.

# SEE ALSO

[waybackurls](/man/waybackurls)(1), [gau](/man/gau)(1), [hakrawler](/man/hakrawler)(1)
