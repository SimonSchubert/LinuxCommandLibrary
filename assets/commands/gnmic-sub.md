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
> Subscription mode: STREAM, ONCE, POLL (default STREAM).

**--stream-mode** _mode_
> Stream mode: sample, on_change, target_defined (default sample).

**--prefix** _prefix_
> Set a common prefix for all paths.

**--target** _target_
> Set path target in the SubscriptionList prefix field.

**--qos** _value_
> QoS marking for subscription responses (default 20, 0 to disable).

**--sample-interval** _duration_
> Interval for target to send samples (e.g. 1s, 1m30s).

**--heartbeat-interval** _duration_
> Heartbeat interval for on_change or sample modes.

**--suppress-redundant**
> Suppress updates unless value has changed since last update.

**--updates-only**
> Only send updates, not initial state.

**--quiet**
> Do not output subscription responses to stdout.

**--format** _format_
> Output format (json, protojson, prototext, event, flat).

**--name** _name_
> Trigger predefined subscriptions from configuration file.

**--output** _output_
> Select output provider(s) defined in configuration file.

**--depth** _depth_
> Set gNMI extension depth value.

**--history-snapshot** _time_
> Set history snapshot value (nanoseconds or RFC3339 format).

**--set-target**
> Set SubscribeRequest Prefix target to configured target name.

# DESCRIPTION

**gnmic sub** (or **subscribe**) sends a gNMI Subscribe RPC to network devices for streaming telemetry. It supports multiple subscription modes: **once** (immediate single response), **poll** (on-demand), and **stream** (continuous updates). Stream mode supports **sample** (periodic), **on_change** (event-driven), and **target_defined** delivery.

# SEE ALSO

[gnmic](/man/gnmic)(1), [gnmic-get](/man/gnmic-get)(1), [gnmic-set](/man/gnmic-set)(1)
