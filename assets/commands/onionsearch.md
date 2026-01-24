# TLDR

**Search onion sites**

```onionsearch "[query]"```

**Search specific engine**

```onionsearch -e [ahmia] "[query]"```

**Use Tor proxy**

```onionsearch --proxy [127.0.0.1:9050] "[query]"```

**Set timeout**

```onionsearch --timeout [30] "[query]"```

**Limit results**

```onionsearch --limit [50] "[query]"```

**Output to file**

```onionsearch -o [results.txt] "[query]"```

# SYNOPSIS

**onionsearch** [_-e engine_] [_--proxy host:port_] [_--limit n_] [_options_] _query_

# PARAMETERS

**-e**, **--engine** _NAME_
> Search engine to use.

**--proxy** _HOST:PORT_
> Tor proxy address.

**--timeout** _SECONDS_
> Request timeout.

**--limit** _N_
> Maximum results.

**-o**, **--output** _FILE_
> Output file.

**--len**
> Show result count only.

**--list**
> List available engines.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**onionsearch** searches Tor hidden service (.onion) search engines for content. It aggregates results from multiple dark web search engines.

Multiple search engines are supported including Ahmia, Torch, and others. Results are collected and deduplicated.

Proxy configuration connects through Tor for anonymous searching. Without Tor, many engines won't be accessible.

Results include onion URLs and page titles. Output formats support further analysis.

# CAVEATS

Requires Tor running for full functionality. Search engines may be unreliable. Results may include illegal content. Use responsibly for security research only.

# HISTORY

**onionsearch** was created for security researchers needing to search dark web content. It provides OSINT capabilities for threat intelligence gathering.

# SEE ALSO

[tor](/man/tor)(1), [torsocks](/man/torsocks)(1), [proxychains](/man/proxychains)(1)
