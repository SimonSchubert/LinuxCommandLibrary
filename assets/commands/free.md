# TLDR

Display **system memory**

```free```

Display memory in **human-readable** units

```free -h```

Display memory in **bytes/KB/MB/GB**

```free -b```
```free -k```
```free -m```
```free -g```

**Refresh** the output every 2 seconds

```free -s 2```

Display **totals** line

```free -t```

# SYNOPSIS

**free** [_-b_|_-k_|_-m_|_-g_] [_-h_] [_-s delay_] [_-c count_] [_-t_]

# DESCRIPTION

**free** displays the total amount of free and used physical and swap memory in the system, as well as the buffers and caches used by the kernel. The information is gathered from /proc/meminfo.

# PARAMETERS

**-b**
> Display in bytes

**-k**
> Display in kilobytes (default)

**-m**
> Display in megabytes

**-g**
> Display in gigabytes

**-h, --human**
> Display in human-readable format with units

**-s, --seconds delay**
> Continuously display output every delay seconds

**-c, --count count**
> Display output count times (use with -s)

**-t, --total**
> Display a line showing totals

**-w, --wide**
> Wide output (separate buffers and cache)

**-l, --lohi**
> Show detailed low and high memory statistics

# CAVEATS

The "available" memory column (added in Linux 3.14) is a better estimate of how much memory is available for starting new applications. "Free" memory doesn't account for buffers/cache that can be released.

# HISTORY

Part of the **procps** (or procps-ng) package, which provides process monitoring utilities for Linux.

# SEE ALSO

[top](/man/top)(1), [htop](/man/htop)(1), [vmstat](/man/vmstat)(8), [cat /proc/meminfo](/man/proc)(5)
