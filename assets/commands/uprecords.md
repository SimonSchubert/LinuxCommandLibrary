# TAGLINE

Display historical system uptime records

# TLDR

Display **top 10** uptime records

```uprecords```

Show **top N** records

```uprecords -m [25]```

Show **downtime** between reboots

```uprecords -d```

Sort by **boot time** (most recent first)

```uprecords -B```

Show **all** records

```uprecords -a```

Run **continuously** in a loop

```uprecords -f```

Show next **milestone**

```uprecords -M```

# SYNOPSIS

**uprecords** [**-?abBcdfkKMsv**] [**-i** _interval_] [**-m** _count_]

# PARAMETERS

**-m** _N_
> Display top N records instead of the default 10.

**-a**
> Show all records.

**-b**
> Sort by boot time, oldest first. Implies -s.

**-B**
> Sort by boot time, newest first. Implies -s.

**-c**
> Do not show current entry if not in top entries.

**-d**
> Show downtime between reboots instead of kernel version.

**-f**
> Run continuously in a loop (update every 5 seconds).

**-i** _INTERVAL_
> Use INTERVAL seconds for loop instead of 5. Implies -f.

**-k**
> Sort by kernel/system name. Implies -s.

**-K**
> Sort by kernel/system name, reversed. Implies -s.

**-M**
> Show next milestone.

**-s**
> Do not print extra statistics.

**-w**
> Do not truncate output.

**-v**
> Show version information.

# DESCRIPTION

**uprecords** displays a summary of historical uptime records collected by the uptimed(8) daemon. It tracks system uptime across reboots and shows statistics about the longest running periods.

The tool requires the uptimed daemon to be running to collect uptime data. By default, it shows the top 10 uptime records with extra statistics.

# CAVEATS

Requires uptimed daemon to be running. Historical data depends on how long uptimed has been active. New installations have no historical data.

# SEE ALSO

[uptime](/man/uptime)(1), [uptimed](/man/uptimed)(8)
