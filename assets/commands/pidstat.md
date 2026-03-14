# TAGLINE

Monitor individual tasks managed by the Linux kernel

# TLDR

Show **CPU statistics** at 2 second interval, 10 reports

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

**Execute and monitor** a specific program

```pidstat -e [program] [args] 1```

Show output in **JSON** format

```pidstat -o JSON 1 5```

# SYNOPSIS

**pidstat** [_-d_] [_-H_] [_-h_] [_-I_] [_-l_] [_-R_] [_-r_] [_-s_] [_-t_] [_-U_ [_username_]] [_-u_] [_-v_] [_-w_] [_-C comm_] [_-G process_name_] [_--human_] [_-o JSON_] [_-p_ {_pid_|SELF|ALL}] [_-T_ {TASK|CHILD|ALL}] [_interval_] [_count_] [_-e program args_]

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

**-h**
> Show all activities horizontally on a single line; omits average statistics at end of report

**-H**
> Display timestamp in seconds since epoch

**-I**
> In SMP environments, divide CPU usage by total number of processors

**-o JSON**
> Output statistics in JSON format

**-R**
> Report realtime priority and scheduling policy information

**-U** [_username_]
> Display real username of the tasks; optionally filter by specified user

**-v**
> Report values of kernel tables: number of threads and file descriptors

**--dec**={0|1|2}
> Specify the number of decimal places to use (default: 2)

# CAVEATS

When using **-e** to run and monitor a program, a non-zero **interval** value must be specified. The **interval** and **count** parameters control reporting frequency and duration.

The `/proc` filesystem must be mounted for pidstat to work. Specifying an interval of 0 or omitting it reports statistics accumulated since system startup.

# HISTORY

**pidstat** is part of the **sysstat** package, developed by Sebastien Godard. It provides per-process statistics that complement system-wide tools like mpstat and iostat.

# SEE ALSO

[sar](/man/sar)(1), [top](/man/top)(1), [ps](/man/ps)(1), [mpstat](/man/mpstat)(1), [iostat](/man/iostat)(1), [vmstat](/man/vmstat)(1)
