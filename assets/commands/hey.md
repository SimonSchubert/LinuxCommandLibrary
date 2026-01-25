# TLDR

**Send 200 requests**

```hey -n [200] [https://example.com]```

**Set concurrency**

```hey -n [1000] -c [50] [https://example.com]```

**Set duration**

```hey -z [30s] [https://example.com]```

**POST with body**

```hey -m POST -d "[{\"key\":\"value\"}]" [https://example.com/api]```

**Set content type**

```hey -T "[application/json]" -m POST -d "@[data.json]" [url]```

**Add header**

```hey -H "[Authorization: Bearer token]" [https://example.com]```

# SYNOPSIS

**hey** [_options_] _url_

# PARAMETERS

**-n** _requests_
> Number of requests.

**-c** _concurrency_
> Concurrent workers.

**-z** _duration_
> Duration (e.g., 10s, 2m).

**-m** _method_
> HTTP method.

**-d** _body_
> Request body.

**-D** _file_
> Request body from file.

**-T** _content-type_
> Content-Type header.

**-H** _header_
> Custom header.

**-t** _timeout_
> Request timeout.

**-q** _rate_
> Rate limit (requests/worker/second).

**-o** _format_
> Output format: csv.

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
