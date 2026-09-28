# TAGLINE

HTTP and WebSocket load testing tool for Node.js

# TLDR

**Run load test** with 10 concurrent clients and 1000 requests

```loadtest -c [10] -n [1000] [http://example.com/api]```

Run for a fixed **duration** in seconds

```loadtest -c [10] -t [60] [http://example.com/api]```

Send a constant **rate** of requests per second

```loadtest --rps [100] -t [30] [http://example.com/api]```

Use **keep-alive** connections

```loadtest -k -n [5000] [http://example.com/api]```

**POST request with JSON body**

```loadtest -n [500] -m POST -P '[{"key":"value"}]' -T 'application/json' [http://example.com/api]```

Send the body from a **file**

```loadtest -n [500] -p [body.json] -T 'application/json' [http://example.com/api]```

Add a custom **header** and **cookie**

```loadtest -n [1000] -H "[Authorization: Bearer token]" -C [session=abc123] [http://example.com/api]```

Run the bundled **test server** on port 7357

```testserver-loadtest```

# SYNOPSIS

**loadtest** [_options_] _url_

# PARAMETERS

**-n**, **--maxRequests** _num_
> Number of requests to send. Default: no limit (runs until the time limit).

**-c**, **--concurrency** _num_
> Number of concurrent clients. Default: **10**. Ignored when **--rps** is set.

**-t**, **--maxSeconds** _seconds_
> Maximum time to send requests. Default: **10**, applies only if **-n** is not given.

**--rps**, **--requestsPerSecond** _num_
> Send a constant number of requests per second (integer). Not supported for WebSockets.

**-k**, **--keepalive**
> Use keep-alive connections.

**-m**, **--method** _method_
> HTTP method: GET, POST, PUT, DELETE or PATCH. Default: **GET**.

**-P**, **--postBody** _body_
> Send the string as the POST body.

**-A**, **--patchBody** _body_
> Send the string as the PATCH body.

**--data** _body_
> Body data for the method set with **-m** (not for GET).

**-p**, **--postFile** _file_
> POST the contents of a file; a **.js** file is imported and its default export generates each body.

**-u**, **--putFile** _file_
> PUT the contents of a file.

**-a**, **--patchFile** _file_
> PATCH the contents of a file.

**-T**, **--contentType** _type_
> Content-Type for the body. Default: **text/plain**.

**-H**, **--header** _header:value_
> Custom header; can be repeated.

**-C**, **--cookie** _name=value_
> Send a cookie; can be repeated.

**--cores** _num_
> Number of processes to run in parallel. Default: half the available CPUs.

**--timeout** _ms_
> Timeout for each request in milliseconds. Default: **0** (none).

**-R** _module.js_
> Use a custom request generator module.

**-s**, **--secureProtocol** _method_
> TLS method to use (e.g. TLSv1_2_method).

**--insecure**
> Accept invalid and self-signed certificates.

**--cert** _file_, **--key** _file_
> Client certificate and key (used together).

**--tcp**
> Experimental: use raw TCP sockets for higher performance.

**--quiet**
> Do not show any messages.

**-V**, **--version**
> Show version and exit.

# DESCRIPTION

**loadtest** runs load tests against HTTP, HTTPS or WebSocket (**ws://**) URLs. The single-dash options are compatible with Apache **ab**, but options may also follow the URL. Unlike ab, **--rps** keeps a constant request rate regardless of how fast the server answers, which gives more realistic results for sustained load.

At the end of the run it reports total requests, errors, requests per second, mean latency and latency percentiles (50%, 90%, 95%, 99%). It can also be used as a library from Node.js code and ships a **testserver-loadtest** command for measuring the tool's own limits.

# CAVEATS

Requires Node.js 16 or later for version 6+. Each process saturates a CPU at a few thousand requests per second; use **--cores** or a faster tool such as wrk or autocannon for higher loads. Since version 8 the defaults are **-c 10** and **-t 10**; older versions defaulted to concurrency 1 and no time limit.

# HISTORY

loadtest was created by **Alex Fernández** in **2013** and is distributed through npm.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [siege](/man/siege)(1), [hey](/man/hey)(1), [vegeta](/man/vegeta)(1), [k6](/man/k6)(1)

# RESOURCES

```[Source code](https://github.com/alexfernandez/loadtest)```

<!-- verified: 2026-09-29 -->
