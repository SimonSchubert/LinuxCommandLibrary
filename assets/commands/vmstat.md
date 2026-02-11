# TAGLINE

Report virtual memory and system statistics

# TLDR

Display **virtual memory** statistics

```vmstat```

Display reports every **2 seconds**, 5 times

```vmstat 2 5```

Display **active/inactive** memory

```vmstat -a```

Display **disk** statistics

```vmstat -d```

Display **slab** information

```vmstat -m```

Display **event counters** and memory stats

```vmstat -s```

Display with **timestamp**

```vmstat -t 1```

# SYNOPSIS

**vmstat** [_options_] [_delay_ [_count_]]

# DESCRIPTION

**vmstat** reports information about processes, memory, paging, block IO, traps, disks, and CPU activity. The first report shows averages since boot; subsequent reports show activity during the sampling period.

# PARAMETERS

**-a, --active**
> Display active and inactive memory

**-f, --forks**
> Display number of forks since boot

**-m, --slabs**
> Display slab information

**-s, --stats**
> Display event counters and memory statistics

**-d, --disk**
> Report disk statistics

**-D, --disk-sum**
> Report summary disk statistics

**-p, --partition DEVICE**
> Detailed partition statistics

**-n, --one-header**
> Print header only once

**-t, --timestamp**
> Append timestamp to each line

**-w, --wide**
> Wide output mode

**-y, --no-first**
> Omit first report (boot statistics)

**-S, --unit UNIT**
> Switch output units (k, K, m, M)

# OUTPUT FIELDS

**Procs**: r (runnable), b (blocked)
**Memory**: swpd, free, buff, cache
**Swap**: si (in), so (out)
**IO**: bi (blocks in), bo (blocks out)
**System**: in (interrupts), cs (context switches)
**CPU**: us (user), sy (system), id (idle), wa (wait), st (stolen)

# CAVEATS

The first report shows averages since boot. Use **-y** to omit it. Wide mode (**-w**) is recommended for systems with large amounts of memory.

# HISTORY

**vmstat** is part of **procps-ng**, providing virtual memory statistics since early Unix systems.

# SEE ALSO

[free](/man/free)(1), [iostat](/man/iostat)(1), [mpstat](/man/mpstat)(1), [ps](/man/ps)(1), [top](/man/top)(1)
