# TAGLINE

Record kernel trace to file

# TLDR

Record with specific **plugin**

```sudo trace-cmd record -p [plugin]```

Record specific **executable**

```sudo trace-cmd record -F [executable]```

Record specific **function**

```sudo trace-cmd record -g [function]```

**Exclude** a function

```sudo trace-cmd record -n [function]```

Limit **graph depth**

```sudo trace-cmd record --max-graph-depth [depth]```

Record from **process** ID

```sudo trace-cmd record -P [pid]```

# SYNOPSIS

**trace-cmd record** [_OPTIONS_]

# PARAMETERS

**-p** _PLUGIN_
> Use specified tracer plugin

**-F** _EXECUTABLE_
> Trace only the specified executable

**-g** _FUNCTION_
> Trace specified function

**-n** _FUNCTION_
> Exclude function from trace

**--max-graph-depth** _DEPTH_
> Limit function call graph depth

**-P** _PID_
> Trace specified process ID

# DESCRIPTION

**trace-cmd record** captures kernel trace events to a file (trace.dat by default). It configures the Ftrace framework, starts tracing, and saves the results for later analysis with trace-cmd report.

Various options allow filtering by function, process, or executable, and limiting trace depth to reduce data volume.

# CAVEATS

Requires root privileges. Large traces consume significant disk space. High-frequency tracing impacts system performance. Output file can grow quickly.

# SEE ALSO

[trace-cmd](/man/trace-cmd)(1), [trace-cmd-list](/man/trace-cmd-list)(1), [trace-cmd-report](/man/trace-cmd-report)(1)
