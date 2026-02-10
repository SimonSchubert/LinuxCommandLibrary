# TAGLINE

used for monitoring individual tasks currently being managed by the Linux kernel

# TLDR

Show **CPU statistics** at 2 second interval

```pidstat 2 10```

Show **page faults** and memory utilization

```pidstat -r```

Show **I/O** usage per process

```pidstat -d```

Show information for a **specific PID**

```pidstat -p 1234```

Show **memory** statistics for processes matching pattern

```pidstat -C "pattern" -r -p ALL```

Show **context switches**

```pidstat -w```

# SYNOPSIS

**pidstat** [_-d_] [_-r_] [_-u_] [_-w_] [_-p pid_] [_-C comm_] [_interval_] [_count_]

# DESCRIPTION

**pidstat** is used for monitoring individual tasks currently being managed by the Linux kernel. It reports CPU usage, memory utilization, I/O statistics, context switches, and other resource usage for selected processes or all tasks.

# PARAMETERS

**-d**
> Display I/O statistics (disk reads/writes, I/O delays)

**-r**
> Report page faults and memory utilization metrics

**-u**
> Show CPU usage percentages (default if no option specified)

**-w**
> Display voluntary and involuntary context switches

**-s**
> Report stack memory usage

**-t**
> Include thread statistics for selected tasks

**-p {pid|SELF|ALL}**
> Select specific process(es), current process, or all tasks

**-T {TASK|CHILD|ALL}**
> Monitor individual tasks, children, or both

**-C comm**
> Filter by command name using regex patterns

**-G process_name**
> Display processes matching name pattern

**-l**
> Show full command names with arguments

**--human**
> Format output in human-readable sizes (1.0k, 1.2M)

**-e program args**
> Execute and monitor a specific program

**-H**
> Display timestamp in seconds since epoch

**-I**
> Divide CPU usage by total number of CPUs

# CAVEATS

When using **-e** to run and monitor a program, pidstat will track the executed process. The **interval** and **count** parameters control reporting frequency and duration.

# HISTORY

**pidstat** is part of the **sysstat** package, developed by Sebastien Godard. It provides per-process statistics that complement system-wide tools like mpstat and iostat.

# SEE ALSO

[sar](/man/sar)(1), [top](/man/top)(1), [ps](/man/ps)(1), [mpstat](/man/mpstat)(1), [iostat](/man/iostat)(1)
