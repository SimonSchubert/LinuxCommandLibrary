# TAGLINE

reports processor-related statistics including CPU utilization

# TLDR

Display **CPU statistics** every 2 seconds

```mpstat 2```

Display **5 reports** at 2-second intervals

```mpstat 2 5```

Display statistics for **specific processor**

```mpstat -P 0 2 5```

Display statistics for **all processors**

```mpstat -P ALL 2```

Display with **interrupts** per processor

```mpstat -I ALL 2```

# SYNOPSIS

**mpstat** [_options_] [_interval_ [_count_]]

# DESCRIPTION

**mpstat** reports processor-related statistics including CPU utilization, interrupts, and other per-processor metrics. It can display statistics for individual processors or aggregated across all.

# PARAMETERS

**-A**
> Equivalent to -n -u -I ALL -P ALL

**-I {SUM|CPU|SCPU|ALL}**
> Report interrupt statistics

**-n**
> Report NUMA node placement statistics

**-o JSON**
> Output in JSON format

**-P {processor|ALL}**
> Indicate processor number or ALL

**-u**
> Report CPU utilization (default)

**-V**
> Print version number

# OUTPUT FIELDS

**%usr**: User level (applications)
**%nice**: User level with nice priority
**%sys**: System level (kernel)
**%iowait**: Waiting for I/O
**%irq**: Hardware interrupts
**%soft**: Software interrupts
**%steal**: Stolen by hypervisor
**%guest**: Running virtual processor
**%gnice**: Running niced guest
**%idle**: Idle time

# CAVEATS

The first report shows statistics since boot. Processor numbering starts at 0. On virtual machines, %steal indicates CPU time taken by the hypervisor.

# HISTORY

**mpstat** is part of the **sysstat** package, providing multiprocessor statistics for SMP systems.

# SEE ALSO

[sar](/man/sar)(1), [iostat](/man/iostat)(1), [vmstat](/man/vmstat)(8), [top](/man/top)(1)
