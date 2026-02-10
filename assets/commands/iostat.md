# TAGLINE

monitors system input/output device loading by observing the time devices are

# TLDR

Display **CPU and disk** statistics

```iostat```

Display with **megabytes** units

```iostat -m```

Display **CPU statistics** only

```iostat -c```

Display **disk statistics** with names

```iostat -N```

Display **extended** disk statistics

```iostat -xN sda```

Display reports every **2 seconds**

```iostat 2```

Display **5 reports** at 2-second intervals

```iostat 2 5```

# SYNOPSIS

**iostat** [_options_] [_device_...] [_interval_ [_count_]]

# DESCRIPTION

**iostat** monitors system input/output device loading by observing the time devices are active in relation to their average transfer rates. It generates CPU and device utilization reports useful for optimizing I/O performance.

# PARAMETERS

**-c**
> Display CPU utilization only

**-d**
> Display device utilization only

**-x**
> Display extended statistics

**-k**
> Display statistics in kilobytes per second

**-m**
> Display statistics in megabytes per second

**-N**
> Display registered device mapper names (LVM)

**-p [device|ALL]**
> Display statistics for block devices and partitions

**-t**
> Print timestamp for each report

**-y**
> Omit first report (boot statistics)

**-z**
> Exclude inactive devices from report

**-g GROUP**
> Display statistics grouped together

**-H**
> With -g, only show group totals

**-j {ID|LABEL|PATH|UUID}**
> Display persistent device names

**-o JSON**
> Output in JSON format

**--human**
> Print sizes in human-readable format

**--pretty**
> Pretty-print device names

# CAVEATS

The first report shows statistics since boot. For current activity, use the **-y** option or ignore the first report. Extended statistics (**-x**) provide more detailed I/O metrics.

# HISTORY

**iostat** is part of the **sysstat** package, providing system performance monitoring tools for Linux.

# SEE ALSO

[sar](/man/sar)(1), [vmstat](/man/vmstat)(8), [mpstat](/man/mpstat)(1), [pidstat](/man/pidstat)(1)
