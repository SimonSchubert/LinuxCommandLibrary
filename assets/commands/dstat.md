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

# CAVEATS

Deprecated - consider using dool or sysstat tools instead. Plugin availability depends on system configuration.

# SEE ALSO

[vmstat](/man/vmstat)(8), [iostat](/man/iostat)(1), [sar](/man/sar)(1)
