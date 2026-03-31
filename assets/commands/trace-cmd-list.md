# TAGLINE

List available kernel trace events

# TLDR

List available **tracers**

```sudo trace-cmd list -t```

List available **plugins**

```sudo trace-cmd list -p```

List available **events**

```sudo trace-cmd list -e```

List available **functions**

```sudo trace-cmd list -f```

List events matching a **pattern**

```sudo trace-cmd list -e [sched:*]```

List available **event options**

```sudo trace-cmd list -o```

List functions matching a **regex**

```sudo trace-cmd list -f [tcp_send*]```

# SYNOPSIS

**trace-cmd list** [_OPTIONS_]

# PARAMETERS

**-t**
> List available tracers

**-p**
> List available plugins

**-e** [_regex_]
> List available events, optionally filtered by a subsystem or regex pattern.

**-f** [_regex_]
> List available functions for tracing, optionally filtered by regex.

**-o**
> List available event options (e.g., noprint-fmt, sym-offset).

**-B** _buffer_
> List from a specific buffer instance.

# DESCRIPTION

**trace-cmd list** displays available tracers, events, plugins, and functions that can be used with the Ftrace tracing framework. This helps identify what can be traced on the current system.

The output depends on kernel configuration and loaded modules. Function listing may be very large on systems with many kernel symbols.

# CAVEATS

Requires root privileges. Available items depend on kernel build configuration. Function list can be extremely large.

# SEE ALSO

[trace-cmd](/man/trace-cmd)(1), [trace-cmd-record](/man/trace-cmd-record)(1), [trace-cmd-report](/man/trace-cmd-report)(1), [perf](/man/perf)(1)
