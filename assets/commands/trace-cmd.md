# TAGLINE

Linux kernel Ftrace tracing frontend

# TLDR

Display tracing **status**

```sudo trace-cmd stat```

List available **tracers**

```sudo trace-cmd list -t```

**Start** tracing with plugin

```sudo trace-cmd start -p [function|function_graph|irqsoff|wakeup]```

**View** trace output

```sudo trace-cmd show```

**Stop** tracing

```sudo trace-cmd stop```

**Clear** trace buffers

```sudo trace-cmd clear```

**Record** a trace

```sudo trace-cmd record```

Display **recorded** trace

```sudo trace-cmd report```

# SYNOPSIS

**trace-cmd** _COMMAND_ [_OPTIONS_]

# COMMANDS

**stat**
> Display tracing system status

**start**
> Start the kernel tracer

**stop**
> Stop the kernel tracer

**show**
> View current trace output

**clear**
> Clear trace buffers

**record**
> Record a trace to file

**report**
> Display recorded trace

**list**
> List available tracers, events, and functions

# PARAMETERS

**-p** _PLUGIN_
> Specify tracer plugin

# DESCRIPTION

**trace-cmd** is a utility for interacting with the Linux kernel's Ftrace tracing framework. It provides a user-friendly interface for configuring and capturing kernel traces, analyzing function calls, timing, and system events.

The tool supports various tracer plugins including function tracing, function call graphs, and latency tracers for debugging and performance analysis.

# CAVEATS

Requires root privileges. Tracing can impact system performance. Large traces consume significant memory and storage. Some features depend on kernel configuration.

# HISTORY

**trace-cmd** was created by **Steven Rostedt** as a front-end for the Linux kernel's Ftrace framework, simplifying the process of kernel tracing and analysis.

# SEE ALSO

[trace-cmd-list](/man/trace-cmd-list)(1), [trace-cmd-record](/man/trace-cmd-record)(1), [trace-cmd-report](/man/trace-cmd-report)(1), [perf](/man/perf)(1)
