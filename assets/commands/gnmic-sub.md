# TAGLINE

subscribe to gNMI streaming telemetry

# TLDR

**Subscribe to a path**

```gnmic -a [host:port] sub --path [/state/port]```

**Subscribe with sample interval**

```gnmic -a [host:port] sub --path [/state/port] --sample-interval [30s]```

**Subscribe with on-change mode**

```gnmic -a [host:port] sub --path [/state/port] --stream-mode on_change```

**Subscribe with heartbeat interval**

```gnmic -a [host:port] sub --path [/path] --stream-mode on_change --heartbeat-interval [1m]```

**Subscribe to multiple paths**

```gnmic -a [host:port] sub --path [/path1] --path [/path2]```

**Subscribe with authentication**

```gnmic -a [host:port] -u [user] -p [pass] sub --path [/path]```

# SYNOPSIS

**gnmic** **sub** | **subscribe** [_options_]

# PARAMETERS

**--path** _path_
> gNMI path to subscribe to.

**--mode** _mode_
> Subscription mode: STREAM, ONCE, POLL.

**--stream-mode** _mode_
> Stream mode: sample, on_change, target_defined.

**--prefix** _prefix_
> Set a common prefix for all paths.

**--sample-interval** _duration_
> Sample interval for SAMPLE mode.

**--heartbeat-interval** _duration_
> Heartbeat interval for ON_CHANGE mode.

**--suppress-redundant**
> Suppress redundant updates.

**--updates-only**
> Only send updates, not initial state.

**--quiet**
> Do not output to stdout.

**--format** _format_
> Output format (json, protojson, prototext, event, flat).

**--depth** _depth_
> Set gNMI extension depth value.

# DESCRIPTION

**gnmic sub** (or **subscribe**) sends a gNMI Subscribe RPC to network devices for streaming telemetry. It supports multiple subscription modes: **once** (immediate single response), **poll** (on-demand), and **stream** (continuous updates). Stream mode supports **sample** (periodic), **on_change** (event-driven), and **target_defined** delivery.

# SEE ALSO

[gnmic](/man/gnmic)(1), [gnmic-get](/man/gnmic-get)(1)
