# TAGLINE

Measure and limit resource usage of commands

# TLDR

Print **time and memory** usage of a command

```runlim command arguments```

Log statistics to a **file**

```runlim --output-file=path/to/file command arguments```

Limit **CPU time** (seconds)

```runlim --time-limit=60 command arguments```

Limit **real-time** (seconds)

```runlim --real-time-limit=120 command arguments```

Limit **memory space** (MB)

```runlim --space-limit=1024 command arguments```

# SYNOPSIS

**runlim** [_options_] _command_ [_arguments_...]

# PARAMETERS

**--output-file** _file_
> Log statistics to file instead of stdout

**--time-limit** _seconds_
> CPU time limit

**--real-time-limit** _seconds_
> Wall clock time limit

**--space-limit** _MB_
> Memory limit in megabytes

# DESCRIPTION

**runlim** samples and limits time and memory usage of a program and its child processes. It uses the /proc filesystem on Linux to monitor resource consumption.

The tool is useful for benchmarking, testing, and preventing runaway processes from consuming excessive resources.

# CAVEATS

Linux-specific; relies on /proc filesystem. Resource measurements are sampled, not exact.

# HISTORY

Developed for benchmarking and resource limiting, commonly used in automated testing and competitive programming environments.

# SEE ALSO

[time](/man/time)(1), [timeout](/man/timeout)(1), [ulimit](/man/ulimit)(1)
