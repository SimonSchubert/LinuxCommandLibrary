# TAGLINE

Display network statistics from /proc/net/netstat and /proc/net/snmp

# TLDR

View network statistics **since last time** nstat was run

```nstat```

View **all-time** network statistics

```nstat -a```

Show statistics **without updating** history

```nstat -s```

Filter counters by **pattern**

```nstat Tcp```

Output in **JSON** format

```nstat -j```

# SYNOPSIS

**nstat** [_options_] [_PATTERN_...]

# PARAMETERS

**-a, --ignore**
> Show absolute values (all-time statistics) instead of incremental

**-n, --nooutput**
> Don't display header or output (just reset counters)

**-r, --reset**
> Reset history

**-s, --noupdate**
> Don't update history (show stats without resetting)

**-z, --zeros**
> Show entries with zero values

**-j, --json**
> Output in JSON format

**-p, --pretty**
> Pretty print JSON output (use with -j)

**-d, --scan** _INTERVAL_
> Run in daemon mode, collecting statistics every INTERVAL seconds

**-t, --interval** _INTERVAL_
> Time interval to average rates (default: 60 seconds)

**-h, --help**
> Display help information

# DESCRIPTION

**nstat** displays network statistics from /proc/net/netstat and /proc/net/snmp, showing IP, ICMP, TCP, and UDP counters. By default, it shows only the changes since the last time nstat was run, making it useful for monitoring network activity over time.

The tool maintains a history file (~/.nstat.u) to track previous values. Running nstat shows the difference (increment) since the last run, then updates the history. Use **-s** to view without updating.

Statistics include packet counts, errors, retransmissions, and various protocol-specific metrics useful for network troubleshooting.

# CAVEATS

Incremental mode depends on the history file; first run shows all zeros. The **-a** flag shows totals since boot, ignoring history. Part of the iproute2 package.

# SEE ALSO

[ss](/man/ss)(8), [ip](/man/ip)(8), [netstat](/man/netstat)(8), [sar](/man/sar)(1)
