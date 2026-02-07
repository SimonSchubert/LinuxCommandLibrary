# TAGLINE

Go process diagnostic tool

# TLDR

**List Go processes**

```gops```

**Show process details**

```gops [pid]```

**Dump stack trace**

```gops stack [pid]```

**Memory statistics**

```gops memstats [pid]```

**CPU profile**

```gops pprof-cpu [pid]```

# SYNOPSIS

**gops** [_command_] [_pid_]

# PARAMETERS

_PID_
> Process ID.

**stack** _PID_
> Print stack trace.

**memstats** _PID_
> Show memory stats.

**pprof-cpu** _PID_
> CPU profile.

**pprof-heap** _PID_
> Heap profile.

**gc** _PID_
> Trigger garbage collection.

**--help**
> Display help information.

# DESCRIPTION

**gops** lists and diagnoses Go processes running on the system. It identifies Go programs and provides debugging commands including stack traces, memory statistics, and CPU/heap profiling.

For full diagnostic capabilities, the gops agent must be imported in target programs. Basic process identification works without the agent.

# CAVEATS

Full features need agent imported. Works with compatible Go versions. Some info from /proc.

# HISTORY

gops was created by **Jaana Dogan** at Google to provide a diagnostic tool for Go processes.

# SEE ALSO

[go-tool](/man/go-tool)(1), [pprof](/man/pprof)(1)
