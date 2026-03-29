# TAGLINE

Ncurses-based visual ping tool for multiple hosts

# TLDR

**Ping multiple hosts** with visual display

```noping [host1] [host2] [host3]```

**Ping with a specific interval** (in seconds, supports fractions)

```noping -i [seconds] [host]```

**Send a specific number of pings** then exit

```noping -c [count] [host]```

**Force IPv4 or IPv6**

```noping -4 [host]```

**Read hosts from a file**

```noping -f [hosts.txt]```

**Write measurements to CSV file**

```noping -O [output.csv] [host1] [host2]```

**Select graph type** (none, prettyping, boxplot, histogram)

```noping -g [prettyping] [host]```

# SYNOPSIS

**noping** [_-4_ | _-6_] [_-c count_] [_-i interval_] _host_ [_host_...]
**noping** [_-4_ | _-6_] [_-c count_] [_-i interval_] **-f** _filename_

# PARAMETERS

**-4**
> Force the use of IPv4.

**-6**
> Force the use of IPv6.

**-c** _COUNT_
> Send and receive COUNT ICMP packets, then stop and exit.

**-i** _INTERVAL_
> Send one ICMP packet per host each INTERVAL seconds. Supports floating-point for sub-second precision.

**-w** _TIMEOUT_
> Time to wait for an ECHO REPLY before giving up, in seconds. Defaults to 1.0.

**-t** _TTL_
> Set IP Time to Live (1-255). Defaults to 64.

**-I** _ADDRESS_
> Set the source address (IP or hostname).

**-D** _DEVICE_
> Set the outgoing network device.

**-f** _FILENAME_
> Read hostnames from FILENAME instead of the command line. Use - for stdin.

**-O** _FILENAME_
> Write measurements in CSV format to FILENAME.

**-g** _TYPE_
> Select graph type: none, prettyping, boxplot, or histogram.

**-Q** _QOS_
> Specify Quality of Service for outgoing packets.

**-b**
> Audible bell; print ASCII BEL when a packet is received.

**-P** _PERCENT_
> Configure the latency percentile to report (0-100, exclusive).

**-Z** _PERCENT_
> Exit with non-zero status if any host's drop rate exceeds this percentage.

**-u**
> Force UTF-8 output.

**-U**
> Disable UTF-8 output.

# DESCRIPTION

**noping** is an ncurses-based front-end to liboping that pings multiple hosts in parallel using IPv4 and/or IPv6 and displays statistics live in the terminal. Round-trip times are color-coded: green for normal, yellow for moderately unusual, and red for significantly aberrant values.

Multiple graph types are available and can be toggled with **g**. New hosts can be added at any time with **a**. Display modes include a time-based graph and a box plot showing RTT distribution.

# CAVEATS

May require root privileges or CAP_NET_RAW capability for ICMP access.

# HISTORY

**noping** is part of the **liboping** project by **Florian Forster** (octo) and is written in **C**.

# SEE ALSO

[ping](/man/ping)(8), [mtr](/man/mtr)(8), [fping](/man/fping)(8), [traceroute](/man/traceroute)(8)
