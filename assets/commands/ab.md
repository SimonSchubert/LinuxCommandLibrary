# TAGLINE

HTTP server benchmarking tool

# TLDR

**Benchmark** a URL with 100 requests using 10 concurrent connections

```ab -n 100 -c 10 [http://example.com/]```

**POST** data to a URL

```ab -n 100 -c 10 -p [data.json] -T application/json [http://example.com/api]```

Use **keep-alive** connections

```ab -n 100 -c 10 -k [http://example.com/]```

Set a **custom header**

```ab -n 100 -c 10 -H "Authorization: Bearer [token]" [http://example.com/]```

# SYNOPSIS

**ab** [_-n requests_] [_-c concurrency_] [_-t timelimit_] [_options_] _URL_

# DESCRIPTION

**ab** (Apache Benchmark) is a command-line tool for benchmarking HTTP servers. It generates load by sending multiple requests to a specified URL and measures server response times, throughput, and other performance metrics.

The tool reports statistics including requests per second, time per request, transfer rate, and connection times broken down by percentiles. It supports both HTTP and HTTPS, custom headers, POST data, cookies, and HTTP authentication.

# PARAMETERS

**-n** _requests_
> Number of requests to perform for the benchmarking session

**-c** _concurrency_
> Number of multiple requests to perform at a time (simultaneous connections)

**-t** _timelimit_
> Maximum number of seconds to spend benchmarking (implies -n 50000)

**-k**
> Enable HTTP KeepAlive feature (persistent connections)

**-p** _file_
> File containing data to POST

**-T** _content-type_
> Content-type header for POST/PUT data

**-H** _header_
> Append extra header to the request (repeatable)

**-A** _auth_
> HTTP Basic Authentication credentials (user:password)

**-C** _cookie_
> Add a Cookie header (name=value)

**-s** _timeout_
> Maximum seconds to wait for each response (default 30)

**-v** _verbosity_
> Verbosity level (1-4)

# CAVEATS

**ab** creates synthetic load that may not reflect real-world traffic patterns. It does not parse HTML or execute JavaScript, so it only tests raw HTTP performance. Results can be misleading if the server implements rate limiting or caching. For more realistic load testing, consider tools like **wrk**, **siege**, or **k6**.

# HISTORY

**ab** was created as part of the Apache HTTP Server project in the late **1990s**. It was designed as a simple benchmarking tool for testing Apache configurations during development. The tool has remained largely unchanged and is bundled with Apache HTTPD installations worldwide.

# SEE ALSO

[curl](/man/curl)(1), [wrk](/man/wrk)(1), [siege](/man/siege)(1), [httperf](/man/httperf)(1)
