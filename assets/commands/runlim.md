# TAGLINE

Measure and limit resource usage of commands

# TLDR

Print **time and memory** usage of a command

```runlim command arguments```

Log statistics to a **file**

```runlim -o path/to/file command arguments```

Limit **CPU time** (seconds)

```runlim -t 60 command arguments```

Limit **real-time** (seconds)

```runlim -r 120 command arguments```

Limit **memory space** (MB)

```runlim -s 1024 command arguments```

Combine **time and space limits** with output logging

```runlim -t 300 -s 2048 -o path/to/log command arguments```

# SYNOPSIS

**runlim** [_options_] _command_ [_arguments_...]

# PARAMETERS

**-o** _FILE_, **--output-file**=_FILE_
> Overwrite or create FILE for output logging

**-t** _NUM_, **--time-limit**=_NUM_
> Set CPU time limit to NUM seconds

**-r** _NUM_, **--real-time-limit**=_NUM_
> Set real (wall clock) time limit to NUM seconds

**-s** _NUM_, **--space-limit**=_NUM_
> Set memory limit to NUM megabytes

**-k**, **--kill**
> Propagate signals to child processes

**-h**, **--help**
> Show summary of options

**--version**
> Show version of program

# DESCRIPTION

**runlim** executes a command while sampling and limiting its time and memory usage, including all child processes. It samples resource consumption every 100 milliseconds via the /proc filesystem and logs status information to stderr every second.

The tool is useful for benchmarking, automated testing, and preventing runaway processes from consuming excessive resources.

# CAVEATS

Linux-specific; relies on /proc filesystem. Resource measurements are sampled, not exact.

# HISTORY

Written by **Armin Biere** and **Toni Jussila**. Commonly used in SAT solver competitions and automated testing environments.

# SEE ALSO

[time](/man/time)(1), [timeout](/man/timeout)(1), [ulimit](/man/ulimit)(1)
