# TLDR

**Test a URL** with default settings (15 concurrent users)

```siege [https://example.com/]```

**Benchmark with specific concurrency** and duration

```siege -c [50] -t [1M] [https://example.com/]```

**Run benchmark mode** (no delays between requests)

```siege -b -c [100] -t [30S] [https://example.com/]```

**Test multiple URLs** from a file

```siege -f [urls.txt]```

**Simulate internet traffic** (random URL selection)

```siege -i -f [urls.txt] -c [25] -t [5M]```

**Run with custom delay** between requests

```siege -d [2] -c [10] [https://example.com/]```

**Display headers** for a single request

```siege -g [https://example.com/]```

**Show current configuration**

```siege -C```

# SYNOPSIS

**siege** [_options_] [_URL_]

# PARAMETERS

**-c**, **--concurrent** _num_
> Number of concurrent simulated users (default: 15)

**-r**, **--reps** _num_|**once**
> Number of repetitions per user; "once" runs each URL once

**-t**, **--time** _NUMm_
> Run duration with modifier: S (seconds), M (minutes), H (hours)

**-d**, **--delay** _num_
> Random delay (0 to num seconds) between requests per user

**-b**, **--benchmark**
> Benchmark mode; removes delays for maximum throughput

**-f**, **--file** _file_
> Read URLs from a text file

**-i**, **--internet**
> Simulate internet traffic by randomizing URL order

**-g**, **--get** _URL_
> Display HTTP headers for a single request

**-p**, **--print** _URL_
> Display headers and response body

**-A**, **--agent** _string_
> Override the User-Agent header

**-H**, **--header** _"header: value"_
> Add custom request header

**-T**, **--content-type** _type_
> Override Content-Type header

**-v**, **--verbose**
> Show detailed output with color-coded responses

**-q**, **--quiet**
> Suppress output; useful for scripts

**-L**, **--log** _file_
> Write results to specified log file

**-C**, **--config**
> Display current configuration settings

# DESCRIPTION

**siege** is a multi-threaded HTTP/HTTPS load testing and benchmarking utility. It simulates multiple concurrent users accessing a web server to measure performance under stress. Metrics reported include response time, transaction rate, throughput, concurrency, and availability.

The tool operates in three modes: **regression** (sequential URL testing), **internet simulation** (randomized access patterns with **-i**), and **brute force benchmarking** (maximum throughput with **-b**).

By default, each simulated user pauses randomly between requests to simulate realistic traffic. The **-d** option controls this delay range, while **-b** eliminates it entirely for pure throughput testing.

Configuration is stored in **~/.siege/siege.conf**. URLs can be specified on the command line or in a file with **-f**, supporting POST data and custom headers.

# CAVEATS

High concurrency levels can overwhelm target servers and may constitute a denial-of-service attack. Always obtain permission before load testing servers you do not own. Some hosting providers prohibit load testing in their terms of service.

# HISTORY

**siege** was created by **Jeffrey Fulmer** (JoeDog) and first released around **2000**. It was designed to help web developers measure their code's performance under load. The tool has been actively maintained and updated to support modern HTTP features including HTTPS and HTTP/1.1.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [curl](/man/curl)(1), [hey](/man/hey)(1), [vegeta](/man/vegeta)(1)
