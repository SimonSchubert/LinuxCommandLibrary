# TAGLINE

Record and replay program execution for debugging

# TLDR

**Record program execution**

```rr record [./program]```

**Replay recording**

```rr replay```

**List recordings**

```rr ls```

**Replay specific trace**

```rr replay [trace-directory]```

**Record with chaos mode**

```rr record --chaos [./program]```

**Pack trace for sharing**

```rr pack [trace-directory]```

# SYNOPSIS

**rr** _command_ [_options_] [_program_] [_args_]

# PARAMETERS

**record**
> Record execution.

**replay**
> Replay recording.

**ls**
> List traces.

**pack**
> Pack trace.

**--chaos**
> Randomize scheduling.

**-n**
> Number of processes.

**-h**
> Help for command.

# DESCRIPTION

**rr** is a lightweight recording and deterministic replay tool for debugging on Linux. It records a program's execution — including all system calls, signals, and thread scheduling decisions — so that the exact same execution can be replayed any number of times for debugging, producing identical behavior every run.

During replay, rr integrates with GDB to provide a standard debugging interface enhanced with time-travel capabilities. Developers can step backwards through execution, set reverse breakpoints, and navigate to any point in the recorded trace, making it dramatically easier to find the root cause of bugs that are difficult to reproduce.

The **--chaos** flag randomizes thread scheduling during recording to help expose concurrency bugs and race conditions that might not appear under normal scheduling. Recording imposes low overhead, typically running at near-native speed, making it practical for real-world debugging workflows.

# CAVEATS

Linux x86-64 only. Requires perf_event access. Some syscalls unsupported.

# HISTORY

**rr** was developed by **Mozilla** for debugging Firefox. It provides record-and-replay debugging for Linux.

# SEE ALSO

[gdb](/man/gdb)(1), [strace](/man/strace)(1), [perf](/man/perf)(1)
