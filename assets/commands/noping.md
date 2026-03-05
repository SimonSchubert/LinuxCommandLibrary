# TAGLINE

Ncurses-based visual ping tool for multiple hosts

# TLDR

**Ping multiple hosts** with visual display

```noping [host1] [host2] [host3]```

**Ping with a specific interval**

```noping -i [seconds] [host]```

# SYNOPSIS

**noping** [_options_] _hosts_...

# PARAMETERS

**-i** _SECONDS_
> Interval between ping packets.

**-c** _COUNT_
> Number of pings to send.

# DESCRIPTION

**noping** is an ncurses-based front-end to liboping that pings multiple hosts in parallel using IPv4 and/or IPv6 and displays statistics live in the terminal. Round-trip times are color-coded: green for normal, yellow for moderately unusual, and red for significantly aberrant values.

Multiple graph types are available and can be toggled with **g**. New hosts can be added at any time with **a**. Display modes include a time-based graph and a box plot showing RTT distribution.

# CAVEATS

May require root privileges or CAP_NET_RAW capability for ICMP access.

# HISTORY

**noping** is part of the **liboping** project by **Florian Forster** (octo) and is written in **C**.

# SEE ALSO

[ping](/man/ping)(8), [mtr](/man/mtr)(8), [oping](/man/oping)(8)
