# TAGLINE

HTTP benchmarking tool that runs multiple HTTP fetches in parallel

# TLDR

Test with **20 requests/second** for 60 seconds

```http_load -rate 20 -seconds 60 urls.txt```

Test with **5 concurrent** connections for 60 seconds

```http_load -parallel 5 -seconds 60 urls.txt```

Run **1000 requests** at 20/second

```http_load -rate 20 -fetches 1000 urls.txt```

Run **1000 requests** with 5 concurrent connections

```http_load -parallel 5 -fetches 1000 urls.txt```

Test single **URL** directly

```echo "http://example.com/" | http_load -parallel 5 -seconds 30 /dev/stdin```

# SYNOPSIS

**http_load** [_options_] _url_file_

# DESCRIPTION

**http_load** is an HTTP benchmarking tool that runs multiple HTTP fetches in parallel to test the throughput and response time of a web server. It reads URLs from a file and generates load according to specified parameters.

# PARAMETERS

**-rate N**
> Generate N requests per second

**-parallel N**
> Keep N connections active simultaneously

**-fetches N**
> Total number of requests to perform

**-seconds N**
> Duration of the test in seconds

**-timeout N**
> Timeout for each request in seconds

**-sip**
> Source IP addresses (one per line in file)

**-cipher CIPHER**
> SSL cipher to use

**-proxy HOST:PORT**
> Use HTTP proxy

**-jitter**
> Vary the -rate rate randomly by about 10%, to avoid unrealistically regular traffic patterns

**-throttle**
> Limit data consumption to 33.6Kbps, to simulate a modem-speed client

**-checksum**
> Verify fetched files against a checksum computed on the first fetch of each URL

**-verbose**
> Print progress reports to stderr while the test runs

# CAVEATS

Either -rate or -parallel must be specified, not both. Either -fetches or -seconds must be specified to set the test duration. The URL file should contain one URL per line; URLs are picked at random from the file for each fetch.

# HISTORY

**http_load** was written by **Jef Poskanzer** and distributed through **ACME Labs** as a simple, single-process HTTP load testing tool for benchmarking web server throughput.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [siege](/man/siege)(1), [hey](/man/hey)(1)

# RESOURCES

```[Source code](https://www.acme.com/software/http_load/)```

<!-- verified: 2026-07-19 -->

