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

**dstat** is a versatile system resource statistics generator. It combines the functionality of vmstat, iostat, netstat, and ifstat in a single tool with colorful output.

Note: dstat is deprecated and no longer maintained. Consider using dool or other alternatives.

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
