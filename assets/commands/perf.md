# TAGLINE

official Linux kernel profiling tool

# TLDR

Display **performance stats** for a command

```perf stat [command]```

Display **real-time** system-wide profile

```sudo perf top```

**Record** profile to perf.data

```sudo perf record [command]```

Record profile of **existing process**

```sudo perf record -p [pid]```

**Display** recorded profile

```sudo perf report```

**Record** with call graph

```sudo perf record -g [command]```

List available **events**

```perf list```

# SYNOPSIS

**perf** [**stat**|**record**|**report**|**top**|**list**] [_options_] [_command_]

# COMMANDS

**stat**
> Run command and gather performance counter statistics

**record**
> Run command and record profile into perf.data

**report**
> Read perf.data and display profile

**top**
> System-wide real-time profiling

**list**
> List available performance events

**annotate**
> Read perf.data and display annotated code

**script**
> Read perf.data and output trace in scripted format

**bench**
> Run built-in microbenchmarks for scheduler, memory, etc.

**trace**
> Trace system calls (similar to strace)

**sched**
> Analyze scheduler latencies and behavior

**diff**
> Compare two perf.data files

# PARAMETERS

**-p, --pid _pid_**
> Profile existing process by PID

**-e, --event _event_**
> Select specific events to measure

**-g**, **--call-graph**
> Enable call-graph (stack chain/backtrace) recording

**-a**, **--all-cpus**
> System-wide collection from all CPUs

**-F _freq_**, **--freq _freq_**
> Profile at specified frequency (samples per second)

**-o _file_**, **--output _file_**
> Output file name

**-c _count_**, **--count _count_**
> Collect a sample after every _count_ events

# DESCRIPTION

**perf** is the official Linux kernel profiling tool. It provides access to hardware performance counters, tracepoints, and software performance events. It's essential for identifying performance bottlenecks in applications and the kernel.

The tool can measure CPU cycles, cache misses, branch mispredictions, and many other low-level events. It supports both sampling-based profiling and event counting.

# CAVEATS

Requires root or kernel.perf_event_paranoid sysctl adjustment for many operations. Hardware counter availability varies by CPU. Profile data can be large. Some features require specific kernel configuration.

# HISTORY

**perf** was developed as part of the Linux kernel, primarily by **Ingo Molnar** and **Thomas Gleixner**. It replaced the older OProfile tool and became the standard Linux profiling interface, integrated directly into the kernel source tree.

# SEE ALSO

[strace](/man/strace)(1), [ltrace](/man/ltrace)(1), [valgrind](/man/valgrind)(1), [gprof](/man/gprof)(1)
