# TAGLINE

reports network interface bandwidth in a format similar to vmstat/iostat

# TLDR

Display statistics for all interfaces, updating every **second**

```ifstat```

Display statistics every **5 seconds**

```ifstat [5]```

Report bandwidth in **kbits/sec** instead of kbytes/sec

```ifstat -b```

Monitor only **specific interfaces**

```ifstat -i [eth0],[wlan0]```

Show **total bandwidth** across all interfaces

```ifstat -T```

Ignore history and show **absolute counters**

```ifstat -a```

# SYNOPSIS

**ifstat** [_options_] [_delay_[/_delay2_] [_count_]]

# PARAMETERS

**-a**
> Ignore the history file and show absolute counters since boot

**-b**
> Report bandwidth in kbits/sec instead of kbytes/sec

**-e**
> Show errors

**-i** _IFACE_
> Monitor only the specified interfaces (comma-separated)

**-l**
> Enable monitoring of loopback interfaces

**-n**
> Turn off display of the header periodically

**-r**
> Reset history

**-S**
> Keep stats on the same line (no scrolling)

**-T**
> Show total bandwidth for all monitored interfaces

**-t**
> Add a timestamp at the beginning of each line

**-w**
> Use fixed-width columns

**-z**
> Hide interfaces with zero counters

# DESCRIPTION

**ifstat** reports network interface bandwidth just like vmstat/iostat do for other system counters. It keeps history between invocations and by default shows the difference since the last call.

The positional argument _delay_ sets the update interval in seconds (default 1). An optional _count_ limits the number of updates. A second delay can be specified separated by a slash for alternating intervals.

Note: Two different tools share the name ifstat. The standalone version (section 1) described here is the most common. The iproute2 version (section 8) has different options.

# CAVEATS

Statistics depend on kernel interface counters. Very high traffic rates may overflow 32-bit counters on older systems. The iproute2 ifstat(8) has different flags than the standalone ifstat(1).

# SEE ALSO

[ip](/man/ip)(8), [netstat](/man/netstat)(8), [iftop](/man/iftop)(8), [vmstat](/man/vmstat)(8)
