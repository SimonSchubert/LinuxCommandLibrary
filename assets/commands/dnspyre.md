# TAGLINE

High QPS DNS benchmark tool

# TLDR

**Benchmark a DNS server** with A queries for a domain

```dnspyre --server [8.8.8.8] [example.com]```

**Run a high concurrency benchmark** for 60 seconds

```dnspyre --server [8.8.8.8] --duration 60s --concurrency [100] [example.com]```

**Benchmark with a fixed number of queries**

```dnspyre --server [8.8.8.8] --number [1000] [example.com]```

**Test specific query types**

```dnspyre --server [8.8.8.8] --type A --type AAAA [example.com]```

**Load queries from a file**

```dnspyre --server [8.8.8.8] @[path/to/queries.txt]```

**Benchmark using DNS over HTTPS**

```dnspyre --server https://dns.google/dns-query --doh-method post [example.com]```

# SYNOPSIS

**dnspyre** [_options_] _queries_...

# PARAMETERS

**-s**, **--server** _ADDR_
> DNS server address to benchmark.

**-n**, **--number** _N_
> Number of query repetitions (mutually exclusive with --duration).

**-d**, **--duration** _DURATION_
> Test duration (default: 1m, mutually exclusive with --number).

**-c**, **--concurrency** _N_
> Number of concurrent connections (default: 1).

**-t**, **--type** _TYPE_
> DNS query type: A, AAAA, CNAME, MX, TXT, HTTPS, etc. Can be specified multiple times.

**--tcp**
> Use TCP instead of UDP.

**--dot**
> Use DNS over TLS (DoT).

**--doh-method** _METHOD_
> Use DNS over HTTPS with GET or POST method.

**--doh-protocol** _PROTO_
> HTTP protocol version for DoH (1.1, 2, 3).

**--doq**
> Use DNS over QUIC (DoQ).

**--recurse**
> Set the recursion desired flag (default: on).

**--probability** _FLOAT_
> Probability of sending each query (0.0-1.0).

**--progress**
> Show progress bar (default: on).

**-o**, **--output** _FORMAT_
> Output format: text, json, csv.

**-v**, **--verbose**
> Enable verbose output.

# DESCRIPTION

**dnspyre** is a high-performance DNS benchmarking tool designed to stress test DNS servers under heavy load. It can simulate thousands of concurrent queries per second and provides detailed statistics on response times, error rates, and throughput. It was originally forked from dnstrace but has been extensively rewritten and enhanced.

Queries can be specified as domain names directly, loaded from local files using **@file-path**, or fetched from HTTP URLs. Multiple query sources can be combined in a single run. The tool supports UDP, TCP, DNS over TLS (DoT), DNS over HTTPS (DoH), and DNS over QUIC (DoQ).

# OUTPUT METRICS

- Queries per second (QPS)
- Latency percentiles (p50, p90, p99, p999)
- Error rate and types
- Connection statistics
- Histogram of response times

# CAVEATS

High QPS tests may overwhelm target servers. The --duration and --number options are mutually exclusive. Network conditions and DNS caching on intermediate resolvers may skew results.

# HISTORY

**dnspyre** was developed by **Tantalor93** as a modern fork of dnstrace, adding support for modern DNS protocols (DoT, DoH, DoQ) and improved concurrency control.

# SEE ALSO

[dig](/man/dig)(1), [nslookup](/man/nslookup)(1), [q](/man/q)(1)