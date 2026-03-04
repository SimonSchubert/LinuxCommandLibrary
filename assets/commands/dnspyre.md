# TAGLINE

High QPS DNS benchmark tool

# TLDR

**Benchmark** DNS server with default settings

```dnspyre [target_server]```

**Run** high QPS test with concurrent connections

```dnspyre [server] --duration 60s --concurrency 100```

**Test** specific query types

```dnspyre [server] --query A --query AAAA```

**Load** queries from file

```dnspyre [server] --file [queries.txt]```

# SYNOPSIS

**dnspyre** [_options_] [_target_server_]

# PARAMETERS

**-d, --duration** _DURATION_
> Test duration (default: 1m)

**-c, --concurrency** _N_
> Number of concurrent connections (default: 1)

**-r, --rate** _N_
> Queries per second per connection

**-q, --query** _TYPE_
> DNS query type: A, AAAA, MX, TXT, etc.

**-f, --file** _FILE_
> File containing query names (one per line)

**--server** _ADDR_
> DNS server address (can also be positional)

**--tcp**
> Use TCP instead of UDP

**--tls**
> Use DNS over TLS

**--https**
> Use DNS over HTTPS

**--recurse**
> Set recursion desired flag

**-o, --output** _FORMAT_
> Output format: text, json, csv

**-v, --verbose**
> Enable verbose output

**-h, --help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**dnspyre** is a high-performance DNS benchmarking tool designed to test DNS servers under heavy load. It can simulate thousands of concurrent queries per second and provides detailed statistics on response times, error rates, and throughput.

The tool supports multiple DNS transport protocols including UDP, TCP, DNS over TLS (DoT), and DNS over HTTPS (DoH). It's useful for capacity planning, performance testing, and comparing DNS server configurations.

# OUTPUT METRICS

- Queries per second (QPS)
- Latency percentiles (p50, p90, p99, p999)
- Error rate and types
- Connection statistics
- Histogram of response times

# CAVEATS

High QPS tests may overwhelm target servers. Requires careful rate limiting to avoid being rate-blocked. Network conditions significantly affect results. DNS caching on intermediate resolvers may skew results.

# HISTORY

**dnspyre** was developed as a modern alternative to traditional DNS benchmarking tools, providing better concurrency control and support for modern DNS protocols like DoT and DoH.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [dnsperf](/man/dnsperf)(1), [q](/man/q)(1)