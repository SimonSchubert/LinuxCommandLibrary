# TLDR

**Find parameters for domain**

```paramspider -d [example.com]```

**Output to file**

```paramspider -d [example.com] -o [output.txt]```

**Exclude specific extensions**

```paramspider -d [example.com] --exclude [woff,css,js]```

**Use custom placeholder**

```paramspider -d [example.com] -p "[FUZZ]"```

**Set output directory**

```paramspider -d [example.com] --output [results/]```

# SYNOPSIS

**paramspider** -d _domain_ [_options_]

# PARAMETERS

**-d**, **--domain** _domain_
> Target domain.

**-o**, **--output** _file_
> Output file.

**--exclude** _exts_
> Exclude extensions.

**-p**, **--placeholder** _str_
> Parameter placeholder.

**-q**, **--quiet**
> Quiet mode.

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
