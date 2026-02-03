# TLDR

**Ping a URL**

```httping [https://example.com]```

**Ping with count**

```httping -c [5] [https://example.com]```

**Use GET instead of HEAD**

```httping -G [https://example.com]```

**Use SSL/HTTPS**

```httping -l [https://example.com]```

**Show split latency timing**

```httping -S [https://example.com]```

**Use persistent connection**

```httping -Q [https://example.com]```

**Set timeout**

```httping -t [5] [https://example.com]```

# SYNOPSIS

**httping** [_options_] _url_

# PARAMETERS

**-c** _count_
> Number of pings.

**-G**
> Use GET request instead of HEAD.

**-l**
> Connect using SSL (for https).

**-S**
> Split latency into connect, send, receive, etc.

**-Q**
> Use persistent connection (Keep-Alive).

**-t** _seconds_
> Timeout per request.

**-i** _seconds_
> Interval between requests.

**-q**
> Quiet mode, only show summary.

# DESCRIPTION

**httping** measures the latency and throughput of a web server by sending HTTP requests and timing the response. Unlike ICMP ping, it measures actual HTTP round-trip time including network latency and server processing. Use **-S** to see breakdown of connection phases.

# SEE ALSO

[ping](/man/ping)(1), [curl](/man/curl)(1)

