# TAGLINE

discovers URL parameters by mining web archives

# TLDR

**Find parameters for domain**

```paramspider -d [example.com]```

**Exclude specific file extensions**

```paramspider -d [example.com] --exclude [woff,css,js,png,jpg]```

**Use custom placeholder for parameter values**

```paramspider -d [example.com] -p "[FUZZ]"```

**Set output directory**

```paramspider -d [example.com] -o [results/]```

**Spider a list of domains from a file**

```paramspider -l [domains.txt]```

# SYNOPSIS

**paramspider** -d _domain_ [_options_]

# PARAMETERS

**-d**, **--domain** _domain_
> Target domain.

**-l**, **--list** _file_
> File containing a list of domains.

**-o**, **--output** _dir_
> Output directory (default: ./results).

**--exclude** _exts_
> Exclude URLs with specific extensions (comma-separated).

**-p**, **--placeholder** _str_
> Placeholder for parameter values (default: FUZZ).

**--level** _level_
> Find nested parameters (e.g., high).

**-q**, **--quiet**
> Quiet mode, suppress URL output to screen.

**-s**, **--subs**
> Include subdomains.

# DESCRIPTION

**paramspider** discovers URL parameters by mining web archives. It queries archive.org's Wayback Machine to find historical URLs with parameters for a target domain.

Useful for finding hidden parameters, endpoints, and potential injection points during security testing.

# OUTPUT FORMAT

```
https://example.com/page?id=FUZZ
https://example.com/search?q=FUZZ&page=FUZZ
```

# CAVEATS

Requires internet access. Results from archived URLs. May find outdated parameters. Use responsibly.

# HISTORY

ParamSpider was created by **Devansh Batham** as a tool for bug bounty hunters and penetration testers to discover parameters.

# SEE ALSO

[waybackurls](/man/waybackurls)(1), [gau](/man/gau)(1), [arjun](/man/arjun)(1)
