# TAGLINE

determines the fastest network servers from a list of hosts by measuring

# TLDR

Choose the server with the **lowest latency**

```sudo netselect [host_1 host_2 ...]```

Display **nameserver resolution and statistics**

```sudo netselect -vv [host_1 host_2 ...]```

Define **maximum TTL** (time to live)

```sudo netselect -m [10] [host_1 host_2 ...]```

Print **n fastest servers** among the hosts

```sudo netselect -s [n] [host_1 host_2 host_3 ...]```

Display **help**

```netselect```

# SYNOPSIS

**netselect** [_options_] _hosts_...

# PARAMETERS

**-v**
> Verbose mode; show resolution and stats (use -vv for more detail)

**-m _ttl_**
> Maximum TTL (time to live) for probe packets

**-s _n_**
> Print the n fastest servers instead of just the fastest

**-t _n_**
> Number of packets to send per host

**-I**
> Use ICMP echo instead of UDP

# DESCRIPTION

**netselect** determines the fastest network servers from a list of hosts by measuring packet round-trip time and routing hops. It sends probe packets and ranks hosts based on a combined score of latency and hop count.

The output score is calculated as latency multiplied by (number of hops)^3, favoring nearby servers with low latency. Lower scores indicate better servers.

Commonly used to select the fastest Debian mirror or DNS server. The companion tool **netselect-apt** automates mirror selection for Debian systems.

# CAVEATS

Requires root privileges to send raw packets. Results may vary based on network conditions at test time. ICMP packets may be blocked by some firewalls, affecting results. The scoring algorithm favors fewer hops, which isn't always optimal.

# SEE ALSO

[netselect-apt](/man/netselect-apt)(1), [ping](/man/ping)(8), [traceroute](/man/traceroute)(8)
