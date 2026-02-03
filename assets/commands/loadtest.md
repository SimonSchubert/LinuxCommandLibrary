# TLDR

**Run load test**

```loadtest -c [10] -n [1000] [http://example.com/api]```

**Run with requests per second limit**

```loadtest -c [10] --rps [100] [http://example.com/api]```

**POST request with body**

```loadtest -c [5] -P '[{"key":"value"}]' -T 'application/json' [http://example.com/api]```

# SYNOPSIS

**loadtest** [_options_] _url_

# PARAMETERS

**-c** _num_
> Number of concurrent clients.

**-n** _num_
> Total number of requests.

**--rps** _num_
> Requests per second limit.

**-t** _seconds_
> Maximum run time.

**-P** _body_
> POST request body.

**-T** _type_
> Content-Type header.

**-H** _header_
> Custom header.

**-k**
> Keep-alive connections.

# DESCRIPTION

**loadtest** is a Node.js load testing tool for HTTP APIs. Generates configurable concurrent requests to measure server performance and identify bottlenecks. Reports latency percentiles, throughput, and error rates.

# SEE ALSO

[ab](/man/ab)(1), [wrk](/man/wrk)(1), [siege](/man/siege)(1)

