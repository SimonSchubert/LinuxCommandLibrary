# TAGLINE

Real-time PipeWire performance statistics

# TLDR

Display **interactive** view

```pw-top```

Monitor **remote** instance

```pw-top -r [remote_name]```

Run in **batch** mode

```pw-top -b```

Batch mode with **iteration** limit

```pw-top -b -n [5]```

# SYNOPSIS

**pw-top** [**-r** _remote_] [**-b**] [**-n** _iterations_] [**-V**]

# PARAMETERS

**-r, --remote=_name_**
> The name of the remote instance to monitor. If left unspecified, connects to the default PipeWire instance

**-b, --batch-mode**
> Print periodically instead of interactive

**-n, --iterations=_num_**
> Exit after specified number of batch iterations. Only used in batch mode

**-V, --version**
> Display version information

**-h, --help**
> Display help information

# DESCRIPTION

**pw-top** provides a dynamic real-time view of PipeWire node and device statistics. It shows a hierarchical view of Driver nodes and follower nodes, displaying CPU usage, buffer statistics, latency, xruns, and other performance metrics in a top-like interface.

The tool is essential for diagnosing audio performance issues, identifying xruns, and monitoring PipeWire's behavior under load. Press **q** to quit and **c** to clear error counters.

# CAVEATS

Requires running PipeWire daemon. Statistics refresh rate depends on system load. Some metrics may not be available for all nodes.

# HISTORY

**pw-top** is part of **PipeWire**, providing performance monitoring similar to top but specifically for the audio subsystem. It helps diagnose latency and performance issues.

# SEE ALSO

[pw-cli](/man/pw-cli)(1), [pw-dump](/man/pw-dump)(1), [pw-profiler](/man/pw-profiler)(1), [pipewire](/man/pipewire)(1)
