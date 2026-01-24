# TLDR

**Benchmark a URL** with default settings

```wrk [http://localhost:8080/]```

**Benchmark with threads, connections, and duration**

```wrk -t [12] -c [400] -d [30s] [http://localhost:8080/]```

**Show detailed latency statistics**

```wrk -t [4] -c [100] -d [10s] --latency [http://localhost:8080/]```

**Add custom headers**

```wrk -H "Authorization: Bearer [token]" [http://localhost:8080/]```

**Use a Lua script** for custom requests

```wrk -s [script.lua] [http://localhost:8080/]```

**Set request timeout**

```wrk -t [4] -c [100] --timeout [5s] [http://localhost:8080/]```

# SYNOPSIS

**wrk** [_options_] _url_

# PARAMETERS

**-t**, **--threads** _n_
> Number of threads to use.

**-c**, **--connections** _n_
> Number of HTTP connections to keep open.

**-d**, **--duration** _time_
> Duration of the test (e.g., 30s, 1m, 2h).

**-s**, **--script** _file_
> Load a Lua script for custom behavior.

**-H**, **--header** _header_
> Add a custom HTTP header (repeatable).

**-L**, **--latency**
> Print detailed latency statistics.

**--timeout** _time_
> Socket/request timeout duration.

**-v**, **--version**
> Print version information.

# DESCRIPTION

**wrk** is a modern HTTP benchmarking tool capable of generating significant load using a single multi-core CPU. It combines a multithreaded design with scalable event notification systems (epoll on Linux, kqueue on BSD/macOS).

The tool measures requests per second, transfer rate, and latency distribution. It supports HTTP/1.1 with keep-alive connections and optional LuaJIT scripting for custom request generation, response processing, and reporting.

Lua scripts enable POST requests, dynamic payloads, custom headers per request, and response validation.

# CAVEATS

wrk must be built from source on most systems as it's not in standard package repositories. It requires libssl-dev for HTTPS support. High connection counts may require tuning system limits (ulimit, sysctl). Results can vary based on network conditions and server capacity.

# HISTORY

wrk was created by **Will Glozer** and first released around **2012**. It was designed as a modern replacement for older benchmarking tools like ab (Apache Bench), offering better performance through efficient use of modern operating system features. The Lua scripting capability was added to enable complex testing scenarios beyond simple GET requests.

# SEE ALSO

[ab](/man/ab)(1), [siege](/man/siege)(1), [hey](/man/hey)(1), [curl](/man/curl)(1)
