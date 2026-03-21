# TAGLINE

HTTP load testing tool with real-time TUI charts

# TLDR

**Run a basic load test** against a URL

```ali [http://host.xz]```

**Set custom request rate and duration**

```ali --rate=[500] --duration=[5m] [http://host.xz]```

**Send a POST request** with a body file

```ali --method=POST --body-file=[path/to/payload.json] [http://host.xz]```

**Add custom headers** to the request

```ali -H "Authorization: Bearer [token]" [http://host.xz]```

**Export results** to a directory for later analysis

```ali --export-to [path/to/results/] [http://host.xz]```

**Load test with TLS verification disabled**

```ali --insecure [https://host.xz]```

**Run at maximum speed** with no rate limit

```ali --rate=0 --duration=[30s] [http://host.xz]```

# SYNOPSIS

**ali** [_options_] _target_

# PARAMETERS

**-r**, **--rate** _n_
> Requests per second; 0 for max speed (default: 50)

**-d**, **--duration** _duration_
> Duration of the attack; 0s for infinite (default: 10s)

**-w**, **--workers** _n_
> Initial number of workers (default: 10)

**-m**, **--method** _method_
> HTTP method (default: GET)

**-t**, **--timeout** _duration_
> Request timeout (default: 30s)

**-b**, **--body** _string_
> Request body as a string

**-B**, **--body-file** _file_
> Path to file for request body

**-H**, **--header** _header_
> Custom header (repeatable)

**-c**, **--connections** _n_
> Max idle connections per host (default: 10000)

**--export-to** _dir_
> Directory to export results

**--insecure**
> Skip TLS certificate verification

**--no-http2**
> Disable HTTP/2

**-K**, **--no-keepalive**
> Disable keep-alive connections

**--resolvers** _addrs_
> Custom DNS resolver addresses

# DESCRIPTION

**ali** is a terminal-based HTTP load testing tool that generates HTTP load and plots the results in real-time directly in the terminal. It combines the load generation capabilities of tools like vegeta with live terminal charts showing latency, percentiles (p50, p90, p95, p99), throughput, and bytes in/out. The interactive TUI supports mouse-based zooming into charts for detailed analysis.

Written in Go, ali supports HTTP/2 by default, custom TLS certificates, configurable concurrency, and result exporting for downstream analysis.

# CAVEATS

The terminal UI requires a terminal that supports standard escape sequences. Running with very high request rates may be limited by system resources and network capacity. Setting duration to 0 runs the attack indefinitely until manually stopped.

# HISTORY

**ali** was created by **Ryo Nakao** (nakabonne), a Go developer based in Tokyo, Japan. The tool was inspired by **vegeta** (HTTP load testing) and **jplot** (terminal plotting), combining both into a single real-time tool. It is open-source under the MIT license.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [curl](/man/curl)(1), [hey](/man/hey)(1), [siege](/man/siege)(1), [vegeta](/man/vegeta)(1), [k6](/man/k6)(1)
