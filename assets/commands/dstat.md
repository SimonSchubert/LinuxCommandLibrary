# TAGLINE

versatile resource statistics tool

# TLDR

Display **CPU, disk, net, paging, system** statistics

```dstat```

Display statistics every **5 seconds, 4 times**

```dstat 5 4```

Display **CPU and memory** only

```dstat -c -m```

**List** available plugins

```dstat --list```

Display **top memory and CPU** processes

```dstat --top-mem --top-cpu```

Display **battery** information

```dstat --battery --battery-remain```

# SYNOPSIS

**dstat** [_options_] [_delay_] [_count_]

# DESCRIPTION

**dstat** is a versatile system resource statistics generator that unifies the functionality of vmstat, iostat, netstat, and ifstat in a single tool. It provides real-time monitoring of CPU, memory, disk I/O, network, processes, and other system resources with colorful, easy-to-read output.

The tool's plugin architecture allows for extensible monitoring capabilities beyond the standard metrics. Users can display top CPU and memory consumers, battery information, and custom statistics through third-party plugins. Output updates at configurable intervals, making it suitable for both quick system checks and continuous monitoring.

dstat's strength lies in its ability to correlate metrics across different subsystems in one view. For example, you can simultaneously monitor CPU usage, disk I/O, and network traffic to understand system bottlenecks.

Important note: dstat is deprecated and no longer maintained. The Python 2 codebase has not been updated for modern systems. Users should consider alternatives like dool (a maintained fork), or use the traditional sysstat tools (vmstat, iostat, sar) which continue to be actively maintained.

# PARAMETERS

**-c, --cpu**
> CPU statistics

**-m, --mem**
> Memory statistics

**-d, --disk**
> Disk statistics

**-n, --net**
> Network statistics

**--top-cpu**
> Process using most CPU

**--top-mem**
> Process using most memory

**--list**
> List available plugins

**-a, --all**
> Equivalent to **-cdngy**, the default set

**-f, --full**
> Expand aggregated statistics into one column per CPU, disk, or interface

**--output** _file_
> Also write the statistics to a CSV file

# CAVEATS

**dstat is deprecated and unmaintained.** It was written for Python 2, and while distributions carry patches to keep it importable under Python 3, it breaks on modern systems in ways nobody upstream is fixing. Some plugins fail outright, and a few crash on newer kernels.

The direct replacement is **dool**, a maintained Python 3 fork that keeps the same command-line interface, so `dool -cdngy` behaves like the dstat you remember. Otherwise, the sysstat suite (`vmstat`, `iostat`, `sar`, `pidstat`) covers the same ground and is actively maintained, at the cost of needing several commands where dstat used one.

Note also that the first line of output is an average since boot rather than a measurement of the interval, which is a trap it shares with `vmstat`: discard it, or use a count of at least two.

# HISTORY

dstat was written by **Dag Wieers** in **2004**, and its pitch was straightforward: `vmstat`, `iostat`, `netstat`, and `ifstat` each showed you one part of the picture, in a different format, on a different schedule, and correlating them by eye across four terminals was miserable. dstat put them in one aligned, colour-coded, plugin-extensible table with a shared timeline, which turned out to be exactly what people wanted when hunting a bottleneck. Its dependence on Python 2 eventually outlived Python 2 itself, and the project was retired in favour of the **dool** fork.

# SEE ALSO

[vmstat](/man/vmstat)(8), [iostat](/man/iostat)(1), [sar](/man/sar)(1), [pidstat](/man/pidstat)(1), [htop](/man/htop)(1)

# RESOURCES

```[Source code](https://github.com/dagwieers/dstat)```

<!-- verified: 2026-07-14 -->

