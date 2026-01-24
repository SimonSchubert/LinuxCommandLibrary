# TLDR

**Trace route**

```trip [example.com]```

**Use ICMP**

```trip -p icmp [example.com]```

**Use UDP**

```trip -p udp [example.com]```

**Use TCP**

```trip -p tcp [example.com]```

**With DNS resolution**

```trip -r [example.com]```

**Chart view**

```trip --tui-chart [example.com]```

# SYNOPSIS

**trip** [_-p protocol_] [_-r_] [_options_] _target_

# PARAMETERS

**-p** _PROTOCOL_
> Protocol (icmp, udp, tcp).

**-r**
> Reverse DNS.

**--tui-chart**
> Chart display.

**-m** _HOPS_
> Max hops.

**-i** _INTERVAL_
> Probe interval.

# DESCRIPTION

**trip** traces network paths. It's a TUI traceroute.

Visual interface. Real-time display.

Multiple protocols. ICMP, UDP, TCP.

Charts and graphs. Latency visualization.

Continuous tracing. Ongoing monitoring.

# CAVEATS

Root may be needed. Raw sockets. Rust implementation.

# HISTORY

**trip** was created as a modern network diagnostic tool with a text-based user interface for traceroute.

# SEE ALSO

[traceroute](/man/traceroute)(1), [mtr](/man/mtr)(1), [ping](/man/ping)(1)
