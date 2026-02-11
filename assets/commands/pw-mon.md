# TAGLINE

Monitor PipeWire objects in real-time

# TLDR

**Monitor** the default PipeWire instance

```pw-mon```

Monitor a specific **remote instance**

```pw-mon -r remote_name```

Monitor with specific **color configuration**

```pw-mon -N never```

Display **help**

```pw-mon -h```

# SYNOPSIS

**pw-mon** [_options_]

# PARAMETERS

**-r**, **--remote** _name_
> Connect to a specific remote PipeWire instance

**-N**, **--color** _mode_
> Color output mode: never, always, or auto

**-h**, **--help**
> Display help message

# DESCRIPTION

**pw-mon** monitors objects on a PipeWire instance in real-time. It displays information about nodes, ports, links, and other graph objects as they are created, modified, or destroyed.

This tool is useful for debugging audio routing, observing device connections, and understanding PipeWire's internal state during runtime.

# CAVEATS

Output can be verbose on systems with many audio devices and applications. Consider piping output through filtering tools for specific monitoring tasks.

# HISTORY

Part of **PipeWire**, the modern multimedia framework for Linux. Provides real-time visibility into the PipeWire graph for debugging and monitoring purposes.

# SEE ALSO

[pipewire](/man/pipewire)(1), [pw-metadata](/man/pw-metadata)(1), [pw-cli](/man/pw-cli)(1), [pw-top](/man/pw-top)(1)
