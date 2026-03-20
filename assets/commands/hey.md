# TAGLINE

HTTP load testing tool

# TLDR

**Send 200 requests**

```hey -n [200] [https://example.com]```

**Set concurrency**

```hey -n [1000] -c [50] [https://example.com]```

**Set duration**

```hey -z [30s] [https://example.com]```

**POST with body**

```hey -m POST -d "[{\"key\":\"value\"}]" [https://example.com/api]```

**POST with body from file**

```hey -m POST -D [data.json] -T "[application/json]" [https://example.com/api]```

**Add header**

```hey -H "[Authorization: Bearer token]" [https://example.com]```

# SYNOPSIS

**hey** [_options_] _url_

# PARAMETERS

**-n** _requests_
> Number of requests to run. Default is 200.

**-c** _concurrency_
> Number of concurrent workers. Default is 50.

**-z** _duration_
> Duration to send requests (e.g., 10s, 3m). Overrides -n.

**-m** _method_
> HTTP method (GET, POST, PUT, DELETE, HEAD, OPTIONS). Default is GET.

**-d** _body_
> Request body.

**-D** _file_
> Request body from file.

**-T** _content-type_
> Content-Type header. Default is "text/html".

**-H** _header_
> Custom HTTP header. Can be repeated for multiple headers.

**-t** _timeout_
> Timeout for each request in seconds. Default is 20. Use 0 for infinite.

**-A** _accept_
> HTTP Accept header.

**-a** _auth_
> Basic authentication, username:password.

**-x** _proxy_
> HTTP Proxy address as host:port.

**-q** _rate_
> Rate limit in QPS per worker. No limit by default.

**-o** _format_
> Output format: csv.

**-h2**
> Enable HTTP/2.

**-host** _header_
> HTTP Host header.

**-disable-compression**
> Disable compression.

**-disable-keepalive**
> Disable keep-alive, prevents TCP connection reuse.

**-disable-redirects**
> Disable following of HTTP redirects.

**-cpus** _n_
> Number of CPU cores to use.

# DESCRIPTION

**hey** is a HTTP load testing tool. It sends concurrent requests to a URL and provides statistics including latency distribution, throughput, and status code breakdown.

hey is designed to be simple and fast, written in Go. It's useful for quick performance testing and benchmarking web services.

# OUTPUT

Displays:
- Total time and requests
- Requests per second
- Latency distribution (10%, 50%, 90%, 99%)
- Status code distribution
- Error summary

# CAVEATS

Can overload target servers; use responsibly. May be blocked by rate limiters. Not suitable for distributed load testing. Single machine limitation.

# HISTORY

hey was created by **Jaana B. Dogan** (rakyll) at Google as a successor to the tool "boom". It's written in Go and designed for simplicity and ease of use.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [siege](/man/siege)(1), [k6](/man/k6)(1)
