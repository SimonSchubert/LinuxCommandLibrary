# TAGLINE

Analyze PipeWire performance and latency

# TLDR

**Profile** the default instance, logging to profile.log

```pw-profiler```

Change the **log output file**

```pw-profiler -o path/to/file.log```

Profile a **remote** instance

```pw-profiler -r remote_name```

Display **help**

```pw-profiler -h```

# SYNOPSIS

**pw-profiler** [_options_]

# PARAMETERS

**-o**, **--output** _file_
> Specify output log file (default: profile.log)

**-r**, **--remote** _name_
> Profile a remote PipeWire instance

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-profiler** profiles a local or remote PipeWire instance for performance analysis. It generates log files along with gnuplot data files and HTML visualization for analyzing PipeWire performance.

The profiler captures timing information, buffer usage, and processing statistics useful for diagnosing audio latency and performance issues.

# CAVEATS

Profiling adds overhead and should be used for diagnostic purposes only. Generated files can grow large during extended profiling sessions.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides performance analysis tools for optimizing audio and video pipelines.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-top](/man/pw-top)(1), [pw-cli](/man/pw-cli)(1)
