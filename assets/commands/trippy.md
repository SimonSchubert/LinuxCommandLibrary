# TAGLINE

Network diagnostic tool combining traceroute and ping

# TLDR

**Trace route to a host**

```trip [example.com]```

**Use TCP protocol for tracing**

```trip [example.com] -p tcp```

# SYNOPSIS

**trip** [_options_] _target_

# DESCRIPTION

**trippy** combines the functionality of traceroute and ping into a single tool with a real-time TUI interface for network path analysis. It supports multiple tracing protocols (ICMP, UDP, TCP), IPv6, GeoIP visualization, and advanced ECMP strategies. Runs on Linux, BSD, macOS, and Windows.

# HISTORY

**trippy** was created by **fujiapple852** and is written in **Rust**.

# SEE ALSO

[mtr](/man/mtr)(1), [traceroute](/man/traceroute)(1), [ping](/man/ping)(1)
