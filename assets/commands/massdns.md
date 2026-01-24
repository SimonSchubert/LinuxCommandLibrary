# TLDR

**Resolve domains from file**

```massdns -r [resolvers.txt] -t A [domains.txt]```

**Output to file**

```massdns -r [resolvers.txt] -t A -o S [domains.txt] > [results.txt]```

**Concurrent queries**

```massdns -r [resolvers.txt] -s [10000] [domains.txt]```

**Query specific record type**

```massdns -r [resolvers.txt] -t [MX] [domains.txt]```

**Simple output format**

```massdns -r [resolvers.txt] -t A -o S [domains.txt]```

# SYNOPSIS

**massdns** [_options_] _domainlist_

# DESCRIPTION

**massdns** is a high-performance DNS stub resolver for bulk lookups. It can resolve millions of domains per hour using multiple resolvers in parallel.

The tool is designed for subdomain enumeration and DNS reconnaissance during authorized security assessments. It handles resolver rotation and error recovery automatically.

# PARAMETERS

**-r** _file_
> Resolver list file.

**-t** _type_
> Query type (A, AAAA, MX, NS, etc.).

**-o** _format_
> Output format (S=simple, F=full, J=JSON).

**-s** _rate_
> Queries per second.

**-w** _file_
> Write output to file.

**-c** _num_
> Concurrent queries.

**--root**
> Allow binding to privileged ports.

**-q**
> Quiet mode.

# CAVEATS

Requires good resolver list. High rates may trigger rate limiting. Resolver reliability varies. Only for authorized testing.

# HISTORY

**massdns** was created by **B. Blechschmidt** for high-speed DNS resolution needs in security research. It fills the gap between single-query tools and the need to resolve millions of domains efficiently.

# SEE ALSO

[dig](/man/dig)(1), [host](/man/host)(1), [subfinder](/man/subfinder)(1), [dnsx](/man/dnsx)(1)
