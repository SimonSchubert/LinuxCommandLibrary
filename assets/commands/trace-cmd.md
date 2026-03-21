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

**Record** a trace of specific events

```sudo trace-cmd record -e [sched_switch]```

**Record** function graph tracing for a specific function

```sudo trace-cmd record -p function_graph -g [function_name]```

Display **recorded** trace from file

```trace-cmd report```

List available **events**

```sudo trace-cmd list -e```

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
> Specify tracer plugin (function, function_graph, irqsoff, wakeup, etc.)

**-e** _EVENT_
> Enable a trace event (can be specified multiple times)

**-g** _FUNCTION_
> Trace calls starting from a specific function (used with function_graph)

**-o** _FILE_
> Write trace output to specified file (default: trace.dat)

**-t**
> List available tracers (used with list subcommand)

**-F**
> Trace only the child process after a fork

# DESCRIPTION

**trace-cmd** is a utility for interacting with the Linux kernel's Ftrace tracing framework. It provides a user-friendly interface for configuring and capturing kernel traces, analyzing function calls, timing, and system events.

The tool supports various tracer plugins including function tracing, function call graphs, and latency tracers for debugging and performance analysis.

# CAVEATS

Requires root privileges. Tracing can impact system performance. Large traces consume significant memory and storage. Some features depend on kernel configuration.

# HISTORY

**trace-cmd** was created by **Steven Rostedt** as a front-end for the Linux kernel's Ftrace framework, simplifying the process of kernel tracing and analysis.

# SEE ALSO

[trace-cmd-list](/man/trace-cmd-list)(1), [trace-cmd-record](/man/trace-cmd-record)(1), [trace-cmd-report](/man/trace-cmd-report)(1), [perf](/man/perf)(1), [strace](/man/strace)(1)
