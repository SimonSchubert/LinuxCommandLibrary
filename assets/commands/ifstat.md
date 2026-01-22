# TLDR

View network interface statistics **since last query**

```ifstat```

View statistics **since boot**

```ifstat -a```

View **error rate** statistics

```ifstat -e```

# SYNOPSIS

**ifstat** [_options_] [_interface_]

# PARAMETERS

**-a**, **--ignore**
> Show statistics since boot rather than since last query

**-e**, **--errors**
> Show error rate statistics

**-n**, **--nooutput**
> Don't display header

**-t**, **--interval** _SEC_
> Set the update interval in seconds

**-d**
> Specify delay before first measurement

# DESCRIPTION

**ifstat** reports network interface statistics in a format similar to vmstat or iostat. It displays incoming and outgoing traffic rates for network interfaces, updating periodically.

The tool reads from /proc/net/dev and calculates rates based on the difference between measurements. By default it shows traffic since the last query, but can show cumulative statistics since boot.

# CAVEATS

Statistics depend on kernel interface counters. Very high traffic rates may overflow 32-bit counters on older systems. Different versions of ifstat exist with slightly different options.

# HISTORY

ifstat was developed as a simple network monitoring tool following the Unix philosophy of doing one thing well. It provides network statistics in a format consistent with other system statistics tools like vmstat.

# SEE ALSO

[ip](/man/ip)(8), [netstat](/man/netstat)(8), [iftop](/man/iftop)(8)
