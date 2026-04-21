# TAGLINE

displays bandwidth usage on a network interface, broken down by connection

# TLDR

Show **bandwidth usage** on the default interface

```sudo iftop```

Show bandwidth usage on a **specific interface**

```sudo iftop -i [interface]```

Show bandwidth usage with **port numbers**

```sudo iftop -P```

Skip **DNS and service lookups** (fast startup)

```sudo iftop -nNP```

Show traffic in **bytes** rather than bits and hide bar graphs

```sudo iftop -Bb```

Only show traffic crossing a **specific network**

```sudo iftop -F [192.168.1.0/24]```

Filter using **pcap syntax** (e.g. only TCP port 80)

```sudo iftop -f "tcp port 80"```

Run in **text mode** (no ncurses) for logging

```sudo iftop -t -s [10]```

# SYNOPSIS

**iftop** [**-hnNpPlbBt**] [**-i** _interface_] [**-f** _filter_] [**-F** _net/mask_] [**-G** _net6/mask6_] [**-m** _limit_] [**-c** _config_] [**-s** _seconds_]

# PARAMETERS

**-i** _INTERFACE_
> Listen on specified interface.

**-P**
> Show TCP/UDP port numbers in addition to host names.

**-p**
> Run in promiscuous mode (count traffic not addressed to this host).

**-n**
> Do not resolve host names (faster, more accurate for busy networks).

**-N**
> Do not convert port numbers to service names.

**-l**
> Display and count link-local IPv6 addresses.

**-b**
> Don't display bar graphs of traffic.

**-B**
> Display bandwidth in bytes per second rather than bits per second.

**-f** _FILTER_
> Apply a pcap filter (e.g. `"tcp port 443"`, `"not host 10.0.0.1"`).

**-F** _NET/MASK_
> Show only traffic flowing in/out of the given IPv4 network (e.g. `10.0.0.0/8`).

**-G** _NET6/MASK6_
> IPv6 equivalent of **-F**.

**-m** _LIMIT_
> Set the upper limit for the bandwidth scale (e.g. `10M`, `100K`).

**-c** _FILE_
> Use an alternate configuration file instead of `~/.iftoprc`.

**-t**
> Text output mode; suppress ncurses and print to stdout (combine with **-s** for timed capture).

**-s** _SECONDS_
> In text mode, run for _SECONDS_ and then exit.

**-h**
> Print a short usage summary.

# DESCRIPTION

**iftop** displays bandwidth usage on a network interface, broken down by host-pair connection, much like **top** does for processes. It listens using libpcap, identifies source/destination endpoints, and renders a live ncurses table updated roughly twice per second.

The three rate columns show exponentially-weighted averages over the last **2, 10, and 40 seconds**. Rates are shown in bits per second by default (use **-B** for bytes). Cumulative totals, peak rates, and aggregated send/receive figures are shown at the bottom.

## Interactive commands

While running, press **?** for help. Common keys: **s**/**d** aggregate by source/destination, **S**/**D** toggle source/destination port, **p** toggle ports, **t** cycle display modes, **1**/**2**/**3** sort by rate column, **</>** sort by source/destination name, **n** toggle DNS, **N** toggle port names, **P** pause, **o** freeze order, **j**/**k** scroll, **l** add host filter, **f** edit pcap filter, **q** quit.

# CAVEATS

Requires **root** or `CAP_NET_RAW` + `CAP_NET_ADMIN` for packet capture. On busy interfaces DNS lookups can stall the display -- use **-n**. By default **iftop** does not run in promiscuous mode; add **-p** to see traffic not addressed to the local host (e.g. on a mirrored switch port). **iftop** reports layer-3 bandwidth, so its totals will differ slightly from interface counters that include framing overhead.

# HISTORY

**iftop** was written by **Paul Warren** at the University of Oxford and first released in **2002**, explicitly modelled on **top**. It has since been adopted as a standard diagnostic tool in most Linux distributions and is commonly installed on network appliances and routers.

# SEE ALSO

[nethogs](/man/nethogs)(8), [tcpdump](/man/tcpdump)(8), [ifstat](/man/ifstat)(1), [bmon](/man/bmon)(1), [vnstat](/man/vnstat)(1), [ss](/man/ss)(8)
