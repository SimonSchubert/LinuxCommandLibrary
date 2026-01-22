# TLDR

Report **I/O statistics** every second

```sar -b 1```

Report **network** statistics every 2 seconds, 10 times

```sar -n DEV 2 10```

Report **CPU utilization** every 2 seconds

```sar -u ALL 2```

Report **memory** utilization

```sar -r ALL 1 20```

Report **run queue** and load averages

```sar -q 1```

Report **paging** statistics

```sar -B 5```

Report **disk** statistics

```sar -d 1```

# SYNOPSIS

**sar** [_options_] [_interval_ [_count_]]

# DESCRIPTION

**sar** (System Activity Reporter) collects, reports, and saves system activity information. It can report on CPU, memory, I/O, network, and other subsystem performance.

# PARAMETERS

**-b**
> Report I/O and transfer rate statistics

**-B**
> Report paging statistics

**-d**
> Report disk I/O statistics

**-n KEYWORD**
> Report network statistics (DEV, EDEV, NFS, SOCK, IP, etc.)

**-q**
> Report queue length and load averages

**-r [ALL]**
> Report memory utilization statistics

**-u [ALL]**
> Report CPU utilization

**-v**
> Report status of inode, file, and other kernel tables

**-w**
> Report task creation and system switching activity

**-W**
> Report swapping statistics

**-y**
> Report TTY devices activity

**-f FILE**
> Read data from specified file

**-o FILE**
> Write data to specified file

**-s TIME**
> Set start time for report

**-e TIME**
> Set end time for report

**-P {cpu|ALL}**
> Report per-processor statistics

**-j {ID|LABEL|PATH|UUID}**
> Display persistent device names

# CAVEATS

Without interval, sar reads from system activity data files. Data is collected by the sadc daemon and stored in /var/log/sa/. Historical data requires sysstat cron jobs to be enabled.

# HISTORY

**sar** is part of the **sysstat** package, originally from System V Unix. It provides comprehensive system activity reporting and historical data analysis.

# SEE ALSO

[iostat](/man/iostat)(1), [mpstat](/man/mpstat)(1), [pidstat](/man/pidstat)(1), [sadc](/man/sadc)(8)
