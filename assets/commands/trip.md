# TAGLINE

Visual network traceroute with TUI

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

**trip** is a modern network diagnostic tool that combines traceroute functionality with a text-based user interface for real-time visualization. It continuously traces the network path to a destination, displaying hop-by-hop latency statistics in an interactive terminal display.

The tool supports multiple protocols including ICMP, UDP, and TCP, allowing probing through different network paths and firewall configurations. A chart view provides latency visualization over time, making it easy to spot intermittent connectivity issues and jitter patterns.

Reverse DNS resolution can be enabled to show hostnames for each hop. The continuous tracing mode keeps running and updating statistics, making it useful for ongoing network monitoring and troubleshooting.

# CAVEATS

Root may be needed. Raw sockets. Rust implementation.

# HISTORY

**trip** was created as a modern network diagnostic tool with a text-based user interface for traceroute.

# SEE ALSO

[traceroute](/man/traceroute)(1), [mtr](/man/mtr)(1), [ping](/man/ping)(1)
