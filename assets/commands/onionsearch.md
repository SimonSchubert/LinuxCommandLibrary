# TAGLINE

searches Tor hidden service search engines for content

# TLDR

**Search all engines** for a term

```onionsearch "[query]"```

**Search only specific engines**

```onionsearch "[query]" --engines [tor66] [deeplink] [phobos]```

**Exclude engines** from the search

```onionsearch "[query]" --exclude [ahmia] [tordex]```

**Use a different Tor proxy**

```onionsearch "[query]" --proxy [127.0.0.1:9150]```

**Limit pages** loaded per engine

```onionsearch "[query]" --limit [3]```

**Write results** to a specific file

```onionsearch "[query]" --output [results.csv]```

**Choose output fields** and delimiter

```onionsearch "[query]" --fields engine name link domain --field_delimiter ";"```

# SYNOPSIS

**onionsearch** [_options_] _search_

# PARAMETERS

_search_
> The search string or phrase.

**--proxy** _HOST:PORT_
> Tor SOCKS proxy (default: localhost:9050). Connections always use socks5h.

**--output** _FILE_
> Output file (default: output_$SEARCH_$DATE.txt). **$SEARCH** and **$DATE** are replaced by the start of the search string and the datetime.

**--continuous_write** _BOOL_
> Write progressively to the output file (default: False).

**--limit** _N_
> Maximum number of pages to load per engine.

**--engines** _NAME_...
> Engines to request (default: full list).

**--exclude** _NAME_...
> Engines to exclude (default: none).

**--fields** _FIELD_...
> Fields to write to the CSV file (default: engine name link; **domain** is also available).

**--field_delimiter** _CHAR_
> Delimiter for the CSV fields (default: comma).

**--mp_units** _N_
> Number of processes to run in parallel (default: CPU cores minus 1).

**-h**, **--help**
> Show help, including the list of supported engines.

# DESCRIPTION

**onionsearch** scrapes URLs from multiple Tor hidden service (.onion) search engines. Supported engine keys include ahmia, onionland, phobos, darksearchenginer, onionsearchserver, torgle, tor66 and haystack.

All requests go through a Tor SOCKS proxy, so a running Tor client is required. Results are written as CSV with one line per result, by default at the end of the run.

# CAVEATS

Requires Tor running for full functionality. Many of the engines hardcoded in the tool are marked as offline or may have changed addresses, and the project has seen little recent activity. Results may include illegal content. Use responsibly for security research only.

# SEE ALSO

[tor](/man/tor)(1), [torsocks](/man/torsocks)(1), [proxychains](/man/proxychains)(1)

# RESOURCES

```[Source code](https://github.com/megadose/OnionSearch)```

<!-- verified: 2026-11-09 -->
