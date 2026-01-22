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

**py-spy** is sampling profiler for Python. Low overhead profiling.

The tool profiles without code changes. Creates flame graphs.

py-spy profiles Python.

# CAVEATS

Requires root for other users' processes. No code modification needed.

# HISTORY

py-spy was created for **low-overhead Python** profiling.

# SEE ALSO

[perf](/man/perf)(1), [python](/man/python)(1), [cProfile](/man/cProfile)(1)

