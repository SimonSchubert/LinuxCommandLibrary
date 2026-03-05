# TAGLINE

Ping multiple servers and show results in a top-like terminal UI

# TLDR

**Ping multiple hosts**

```pingtop [host1] [host2] [host3]```

# SYNOPSIS

**pingtop** [_options_] _hosts_...

# PARAMETERS

**-s**, **--packetsize** _BYTES_
> Number of data bytes to be sent.

**-l**, **--logto** _FILE_
> Log output to a file.

# DESCRIPTION

**pingtop** pings multiple servers simultaneously and displays the results in a top-like terminal user interface. It provides real-time monitoring of latency and packet loss across all specified hosts in a single view.

# HISTORY

**pingtop** was created by **laixintao** and is written in **Python**.

# SEE ALSO

[ping](/man/ping)(1), [mtr](/man/mtr)(8), [gping](/man/gping)(1)
