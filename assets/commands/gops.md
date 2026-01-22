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

**gops** lists and diagnoses Go processes. It identifies Go programs running on the system and provides debugging commands for them.

The tool can extract stack traces, memory statistics, and profiles from running Go programs. It requires the agent to be imported in target programs.

gops provides Go process inspection.

# CAVEATS

Full features need agent imported. Works with compatible Go versions. Some info from /proc.

# HISTORY

gops was created by **Jaana Dogan** at Google to provide a diagnostic tool for Go processes.

# SEE ALSO

[go-tool](/man/go-tool)(1), [pprof](/man/pprof)(1)
