# TAGLINE

subscribe to gNMI streaming telemetry (full form)

# TLDR

**Subscribe to a path**

```gnmic -a [host:port] subscribe --path [/state/port]```

**Subscribe with sample interval**

```gnmic -a [host:port] subscribe --path [/state/port] --sample-interval [30s]```

**Subscribe with on-change mode**

```gnmic -a [host:port] subscribe --path [/state/port] --stream-mode on-change```

**Subscribe with heartbeat interval**

```gnmic -a [host:port] subscribe --path [/path] --stream-mode on-change --heartbeat-interval [1m]```

**Subscribe to multiple paths**

```gnmic -a [host:port] subscribe --path [/path1] --path [/path2]```

**Subscribe with authentication**

```gnmic -a [host:port] -u [user] -p [pass] subscribe --path [/path]```

# SYNOPSIS

**gnmic** **subscribe** [_options_]

# PARAMETERS

**--path** _path_
> gNMI path to subscribe to.

**--mode** _mode_
> Subscription mode: STREAM, ONCE, POLL.

**--stream-mode** _mode_
> Stream mode: SAMPLE, ON_CHANGE, TARGET_DEFINED.

**--sample-interval** _duration_
> Sample interval for SAMPLE mode.

**--heartbeat-interval** _duration_
> Heartbeat interval for ON_CHANGE mode.

**--suppress-redundant**
> Suppress redundant updates; only send updates when values actually change.

**--updates-only**
> Only send updates, not the initial state snapshot.

**--quiet**
> Do not output to stdout.

**--prefix** _PATH_
> Common prefix applied to all **--path** values.

**--qos** _N_
> DSCP value for packet marking. Defaults to 20; set to 0 to disable.

**--output** _NAME_
> Named output(s), from the config file, to write subscription results to (e.g. a Kafka or Prometheus output) instead of stdout.

**--name** _NAME_
> Run one or more subscriptions predefined in the configuration file, instead of specifying **--path** on the command line.

# DESCRIPTION

**gnmic subscribe** (aliased **gnmic sub**) sends a gNMI Subscribe RPC to network devices for streaming telemetry. It supports three subscription modes: STREAM (continuous updates, the default), ONCE (immediate single response), and POLL (on-demand). Stream mode supports SAMPLE (periodic, the default) and ON_CHANGE (event-driven) delivery.

Results are printed to stdout by default, or routed to a configured output (file, Kafka, NATS, Prometheus, InfluxDB, etc.) via **--output**.

# SEE ALSO

[gnmic](/man/gnmic)(1), [gnmic-get](/man/gnmic-get)(1), [gnmic-set](/man/gnmic-set)(1)

# RESOURCES

```[Documentation](https://gnmic.openconfig.net/cmd/subscribe/)```

```[Source code](https://github.com/openconfig/gnmic)```

<!-- verified: 2026-07-17 -->
