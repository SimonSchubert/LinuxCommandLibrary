# TLDR

List available **tracers**

```sudo trace-cmd list -t```

List available **plugins**

```sudo trace-cmd list -p```

List available **events**

```sudo trace-cmd list -e```

List available **functions**

```sudo trace-cmd list -f```

# SYNOPSIS

**trace-cmd list** [_OPTIONS_]

# PARAMETERS

**-t**
> List available tracers

**-p**
> List available plugins

**-e**
> List available events

**-f**
> List available functions for tracing

# DESCRIPTION

**trace-cmd list** displays available tracers, events, plugins, and functions that can be used with the Ftrace tracing framework. This helps identify what can be traced on the current system.

The output depends on kernel configuration and loaded modules. Function listing may be very large on systems with many kernel symbols.

# CAVEATS

Requires root privileges. Available items depend on kernel build configuration. Function list can be extremely large.

# SEE ALSO

[trace-cmd](/man/trace-cmd)(1), [trace-cmd-record](/man/trace-cmd-record)(1), [trace-cmd-report](/man/trace-cmd-report)(1)
