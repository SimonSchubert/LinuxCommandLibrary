# TLDR

**Monitor** network usage

```bandwhich```

Show **raw addresses**

```bandwhich --raw```

Monitor **specific interface**

```bandwhich --interface [eth0]```

**No resolve** hostnames

```bandwhich --no-resolve```

# SYNOPSIS

**bandwhich** [_options_]

# DESCRIPTION

**bandwhich** is a CLI utility for displaying current network utilization by process, connection, and remote IP/hostname. It provides a terminal UI showing which programs are using bandwidth in real-time.

The tool is particularly useful for identifying bandwidth-heavy applications and monitoring network activity.

# PARAMETERS

**-i**, **--interface** _name_
> Monitor specific interface

**-r**, **--raw**
> Show raw addresses without resolution

**-n**, **--no-resolve**
> Don't resolve hostnames

**-s**, **--show-dns**
> Show DNS queries

**-d**, **--dns-server** _ip_
> DNS server for resolution

# FEATURES

- Real-time bandwidth monitoring
- Per-process statistics
- Connection details
- Remote host identification
- Interactive terminal UI
- DNS query logging

# INTERFACE

Display sections:
- **Processes** - Bandwidth per process
- **Connections** - Active connections
- **Remote addresses** - Traffic by destination
- **Total** - Aggregate statistics

# CAVEATS

Requires root/sudo for packet capture. May not capture all traffic types. Hostname resolution can slow display. Terminal must support required features. Some VPN traffic may not be attributed correctly.

# HISTORY

**bandwhich** was created by Aram Drevekenin around **2019** as a modern, user-friendly alternative to tools like iftop and nethogs.

# SEE ALSO

[iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8), [netstat](/man/netstat)(8)
