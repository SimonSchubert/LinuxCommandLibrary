# TAGLINE

measures the latency and throughput of a web server by sending HTTP requests

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

**-x** _host:port_
> Probe through the given proxy server.

**-m**
> Machine-readable output, for use in scripts.

**-b**
> Show transfer speed in KB/s (used with **-G**).

**-v**
> Verbose mode, adds standard deviation and timestamps.

# DESCRIPTION

**httping** measures the latency and throughput of a web server by sending HTTP requests and timing the response. Unlike ICMP ping, it measures actual HTTP round-trip time including network latency and server processing. Use **-S** to see breakdown of connection phases.

# INSTALL

```apt: sudo apt install httping```

```dnf: sudo dnf install httping```

```pacman: sudo pacman -S httping```

```brew: brew install httping```

```nix: nix profile install nixpkgs#httping```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[ping](/man/ping)(1), [curl](/man/curl)(1)

# RESOURCES

```[Source code](https://github.com/folkertvanheusden/HTTPing)```

```[Homepage](https://www.vanheusden.com/httping/)```

<!-- verified: 2026-07-19 -->

