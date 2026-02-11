# TAGLINE

Low-overhead sampling profiler for Python

# TLDR

**Profile running process**

```py-spy top --pid [pid]```

**Record to file**

```py-spy record -o [profile.svg] --pid [pid]```

**Dump stacks**

```py-spy dump --pid [pid]```

**Profile command**

```py-spy record -o [output.svg] -- python [script.py]```

# SYNOPSIS

**py-spy** _command_ [_options_]

# PARAMETERS

**top**
> Live top-like view.

**record**
> Record to file.

**dump**
> Dump stack traces.

**--pid** _PID_
> Target process ID.

**-o** _FILE_
> Output file.

**--rate** _N_
> Sample rate.

# DESCRIPTION

**py-spy** is a sampling profiler for Python programs that works by reading the process memory of a running Python interpreter without requiring any code modifications or restarts. This approach introduces minimal overhead, making it suitable for profiling production workloads.

The **top** subcommand provides a live view of where Python is spending time, similar to the Unix **top** utility. The **record** subcommand generates flame graphs in SVG, speedscope, or raw format for detailed analysis, and **dump** captures stack traces from all threads at a single point in time. Written in Rust, py-spy supports CPython interpreters and can attach to already-running processes by PID.

# CAVEATS

Requires root for other users' processes. No code modification needed.

# HISTORY

py-spy was created for **low-overhead Python** profiling.

# SEE ALSO

[perf](/man/perf)(1), [python](/man/python)(1), [cProfile](/man/cProfile)(1)

