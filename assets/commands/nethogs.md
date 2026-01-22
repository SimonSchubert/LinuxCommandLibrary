# TLDR

**Start** NetHogs (default device eth0)

```sudo nethogs```

Monitor bandwidth on **specific device**

```sudo nethogs [eth0]```

Monitor **multiple devices**

```sudo nethogs [eth0] [wlan0]```

Specify **refresh rate** in seconds

```sudo nethogs -d [2]```

**Tracemode** (output to stdout)

```sudo nethogs -t```

# SYNOPSIS

**nethogs** [**-d** _seconds_] [**-t**] [**-v**] [_device_...]

# PARAMETERS

**-d _seconds_**
> Delay between refreshes in seconds; default is 1

**-t**
> Tracemode; output to stdout continuously

**-v**
> View mode; cycle through views (0-2)

**-c _count_**
> Number of updates before exiting

**-p**
> Promiscuous mode (capture all packets)

**-s**
> Sort by sent data

**-a**
> Monitor all devices

# INTERACTIVE COMMANDS

**q**
> Quit

**s**
> Sort by sent bytes

**r**
> Sort by received bytes

**m**
> Cycle display mode (KB/s, KB, B, MB)

# DESCRIPTION

**nethogs** is a network monitoring tool that groups bandwidth usage by process rather than by interface or protocol. It shows which processes are consuming network bandwidth in real-time.

Unlike traditional network monitors that show per-interface statistics, nethogs identifies the actual programs responsible for network traffic, making it easier to find bandwidth-hungry applications.

# CAVEATS

Requires root privileges to capture network packets. May not accurately track all traffic on busy systems. Only monitors TCP and UDP traffic. Some short-lived connections may be missed.

# HISTORY

**nethogs** was developed by **Arnout Engelen** as a "net top" tool that groups bandwidth by process. It fills a gap left by traditional tools like iftop and nload which show interface-level statistics.

# SEE ALSO

[iftop](/man/iftop)(8), [nload](/man/nload)(1), [bmon](/man/bmon)(1), [ss](/man/ss)(8)
