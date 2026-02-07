# TAGLINE

parallel ping utility for multiple hosts

# TLDR

**Ping multiple hosts**

```fping [host1] [host2] [host3]```

**Ping hosts from a file**

```fping -f [path/to/hosts.txt]```

**Ping a range of IP addresses**

```fping -g [192.168.1.1] [192.168.1.254]```

**Ping a CIDR range**

```fping -g [192.168.1.0/24]```

**Show only alive hosts**

```fping -a [host1] [host2]```

**Show only unreachable hosts**

```fping -u [host1] [host2]```

**Ping with statistics** (like ping)

```fping -s [host1] [host2]```

**Continuous ping** with interval

```fping -l -p [1000] [host]```

# SYNOPSIS

**fping** [_-aAcdDeglmnqQrstuvV_] [_-b size_] [_-B backoff_] [_-c count_] [_-f file_] [_-g addr/mask_] [_-i interval_] [_-p period_] [_-r retry_] [_-S source_] [_-t timeout_] [_targets_]

# PARAMETERS

**-a**
> Show only alive (reachable) hosts.

**-u**
> Show only unreachable hosts.

**-g** _addr/mask_ or _start end_
> Generate target list from CIDR or range.

**-f** _file_
> Read targets from file (- for stdin).

**-c** _count_
> Number of pings to send per target.

**-l**
> Loop: keep pinging indefinitely.

**-p** _period_
> Interval between pings to same target (ms).

**-i** _interval_
> Interval between pings to different targets (ms).

**-t** _timeout_
> Individual ping timeout in milliseconds.

**-r** _retry_
> Number of retries for unreachable hosts.

**-s**
> Print cumulative statistics at end.

**-q**
> Quiet: only show summary.

**-e**
> Show elapsed time for replies.

**-A**
> Show targets by IP address.

**-D**
> Show timestamps before each line.

**-S** _source_
> Set source address.

**-b** _size_
> Ping packet size in bytes.

# DESCRIPTION

**fping** is designed for scripting and monitoring, offering significant advantages over the standard ping command for checking multiple hosts. It can ping many hosts in parallel and report results in formats suitable for parsing.

Unlike ping which waits for each host to respond before continuing, fping sends probes in a round-robin fashion to all targets, then waits for responses. This parallelism makes it vastly faster when checking many hosts.

The tool is commonly used in network monitoring scripts, host discovery, and availability checking. The **-g** option for generating IP ranges enables quick subnet scans. Exit codes indicate overall reachability status, useful in scripts.

Output modes range from verbose per-ping information to quiet mode showing only summaries. The alive-only (-a) and unreachable-only (-u) modes simplify parsing when you only need specific results.

fping can read targets from files or stdin, enabling integration with other tools. For continuous monitoring, loop mode (-l) with custom intervals provides ongoing status updates.

# CAVEATS

Requires root/sudo for raw socket access on some systems (or setuid installation). Very fast scanning may be detected as aggressive by network security. High probe rates can stress network infrastructure. Some hosts may block ICMP.

# HISTORY

**fping** was written by Roland Schemers around **1992** at Stanford University to address limitations in the standard ping for network monitoring. It has become a standard tool for network administrators and is included in most Linux distribution repositories.

# SEE ALSO

[ping](/man/ping)(8), [nmap](/man/nmap)(1), [hping3](/man/hping3)(8), [mtr](/man/mtr)(8)
