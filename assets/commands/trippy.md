# TAGLINE

Network diagnostic tool combining traceroute and ping

# TLDR

**Trace route to a host**

```trip [example.com]```

**Use TCP protocol for tracing**

```trip [example.com] -p tcp```

**Use UDP protocol on a specific port**

```trip [example.com] -p udp --target-port [53]```

**Set maximum number of hops (TTL)**

```trip [example.com] --max-ttl [30]```

**Trace multiple targets simultaneously**

```trip [example.com] [example.org]```

# SYNOPSIS

**trip** [_options_] _target_ [_target_ ...]

# PARAMETERS

**-p**, **--protocol** _PROTOCOL_
> Tracing protocol: icmp (default), udp, or tcp.

**--target-port** _PORT_
> Target port for UDP/TCP tracing.

**--source-port** _PORT_
> Source port for UDP/TCP tracing.

**-i**, **--interface** _IFACE_
> Network interface to use.

**--max-ttl** _N_
> Maximum number of hops.

**--first-ttl** _N_
> Starting TTL value.

**-a**, **--addr-family** _FAMILY_
> Address family: ipv4, ipv6, ipv4-then-ipv6, or ipv6-then-ipv4.

**-r**, **--dns-resolve-method** _METHOD_
> DNS resolution method: system, resolv, google, or cloudflare.

**--tui-preserve-screen**
> Preserve screen content on exit.

# DESCRIPTION

**trippy** combines the functionality of traceroute and ping into a single tool with a real-time TUI interface for network path analysis. It supports multiple tracing protocols (ICMP, UDP, TCP), IPv6, GeoIP visualization, and advanced ECMP strategies. Runs on Linux, BSD, macOS, and Windows.

# CAVEATS

Requires elevated privileges (root or CAP_NET_RAW capability) for ICMP tracing. Some firewalls may block probe packets.

# HISTORY

**trippy** was created by **fujiapple852** and is written in **Rust**.

# SEE ALSO

[mtr](/man/mtr)(1), [traceroute](/man/traceroute)(1), [tracepath](/man/tracepath)(1), [ping](/man/ping)(1)
