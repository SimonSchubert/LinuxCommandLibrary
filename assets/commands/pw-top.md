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

**pw-top** [**-r** _remote_] [**-b**] [**-n** _iterations_]

# PARAMETERS

**-r, --remote _name_**
> Connect to remote PipeWire instance

**-b, --batch-mode**
> Print periodically instead of interactive

**-n, --iterations _num_**
> Number of iterations in batch mode

**-h, --help**
> Display help information

# DESCRIPTION

**pw-top** displays real-time statistics about PipeWire nodes and devices. It shows CPU usage, buffer statistics, latency, and other performance metrics in a top-like interface.

The tool is essential for diagnosing audio performance issues, identifying xruns, and monitoring PipeWire's behavior under load.

# CAVEATS

Requires running PipeWire daemon. Statistics refresh rate depends on system load. Some metrics may not be available for all nodes.

# HISTORY

**pw-top** is part of **PipeWire**, providing performance monitoring similar to top but specifically for the audio subsystem. It helps diagnose latency and performance issues.

# SEE ALSO

[pw-cli](/man/pw-cli)(1), [pw-dump](/man/pw-dump)(1), [pw-profiler](/man/pw-profiler)(1), [pipewire](/man/pipewire)(1)
