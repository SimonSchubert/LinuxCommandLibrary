# TAGLINE

HTTP load generator written in Rust, inspired by hey and rakyll/hey

# TLDR

**Send 100 requests to URL**

```oha -n [100] [https://example.com]```

**Run load test for 30 seconds**

```oha -z [30s] [https://example.com]```

**Test with 50 concurrent connections**

```oha -c [50] -n [1000] [https://example.com]```

**POST request with JSON body**

```oha -m POST -d '[{"key":"value"}]' -T application/json [https://example.com/api]```

**Use custom headers**

```oha -H "Authorization: Bearer [token]" [https://example.com]```

**Set queries per second limit**

```oha -q [100] -z [30s] [https://example.com]```

**Disable TLS verification**

```oha --insecure [https://example.com]```

**Output results as JSON**

```oha -n [100] --json [https://example.com]```

# SYNOPSIS

**oha** [_options_] _url_

# PARAMETERS

**-n** _num_
> Number of requests to send. Default: 200.

**-c** _num_
> Number of concurrent connections. Default: 50.

**-z** _duration_
> Duration of test (e.g., 10s, 1m).

**-q** _rate_
> Rate limit in queries per second.

**-m**, **--method** _method_
> HTTP method: GET, POST, PUT, DELETE, etc.

**-d**, **--data** _body_
> Request body data.

**-D**, **--data-file** _file_
> Read request body from file.

**-T**, **--content-type** _type_
> Content-Type header value.

**-H** _header_
> Custom header (repeatable).

**-A**, **--accept** _type_
> Accept header value.

**-t**, **--timeout** _secs_
> Request timeout in seconds.

**--latency-correction**
> Enable coordinated omission correction.

**--no-tui**
> Disable real-time terminal UI.

**--json**
> Output results in JSON format.

**--insecure**
> Skip TLS certificate verification.

**--http2**
> Use HTTP/2.

**--host** _host_
> Override Host header.

**-p**, **--redirect** _num_
> Maximum redirects to follow.

# DESCRIPTION

**oha** is an HTTP load generator written in Rust, inspired by hey and rakyll/hey. It provides real-time TUI visualization during load tests and detailed latency statistics.

By default, oha displays a terminal interface showing request progress, latency distribution, and error rates. Use **--no-tui** for scripted execution or **--json** for machine-readable output.

The tool measures response time distribution including percentiles (p50, p90, p99), throughput, and error rates. With **--latency-correction**, it applies coordinated omission correction for accurate latency under load.

Rate limiting with **-q** enables controlled load testing without overwhelming targets. Combined with **-z** for duration-based tests, this enables realistic traffic simulation.

oha supports HTTP/1.1 and HTTP/2, custom headers for authentication, and various request body formats for API testing.

# CAVEATS

High concurrency settings may exhaust file descriptors or network resources. Use --insecure cautiously. Rate limiting accuracy depends on system capabilities. Results should be interpreted considering network conditions.

# HISTORY

oha was created by **Haruki Shimada** (hatoo) and first released around **2020**. The name means "good morning" in Japanese. Written in Rust using tokio for async I/O, it provides modern load testing with real-time visualization. The project gained popularity as a fast, user-friendly alternative to older tools like ab and wrk.

# SEE ALSO

[hey](/man/hey)(1), [wrk](/man/wrk)(1), [ab](/man/ab)(1), [curl](/man/curl)(1), [siege](/man/siege)(1)
