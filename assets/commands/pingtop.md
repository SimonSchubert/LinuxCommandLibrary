# TAGLINE

Ping multiple servers and show results in a top-like terminal UI

# TLDR

**Ping multiple hosts**

```pingtop [host1] [host2] [host3]```

**Ping hosts with a specific** packet size

```pingtop -s [64] [host1] [host2]```

**Ping hosts and log** results to a file

```pingtop -l [results.log] [host1] [host2]```

# SYNOPSIS

**pingtop** [_options_] _hosts_...

# PARAMETERS

**-s**, **--packetsize** _BYTES_
> Number of data bytes to be sent (default: 56).

**-l**, **--logto** _FILE_
> Log output to a file.

# DESCRIPTION

**pingtop** pings multiple servers simultaneously and displays the results in a top-like terminal user interface. It provides real-time monitoring of latency and packet loss across all specified hosts in a single view.

# CAVEATS

Requires root or CAP_NET_RAW capability to send ICMP packets. Install via `pip install pingtop`.

# HISTORY

**pingtop** was created by **laixintao** and is written in **Python**.

# SEE ALSO

[ping](/man/ping)(1), [mtr](/man/mtr)(8), [gping](/man/gping)(1), [fping](/man/fping)(1), [hping3](/man/hping3)(1)
