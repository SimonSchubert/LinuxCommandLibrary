# TAGLINE

Diagnose RabbitMQ node and cluster health

# TLDR

**Check that the local node is running**

```rabbitmq-diagnostics check_running```

**Print cluster status**

```rabbitmq-diagnostics cluster_status```

**Check for resource alarms** (memory, disk)

```rabbitmq-diagnostics check_alarms```

**Memory usage breakdown**

```rabbitmq-diagnostics memory_breakdown```

**Check listener ports** are reachable

```rabbitmq-diagnostics check_port_connectivity```

**Check virtual hosts** are operational

```rabbitmq-diagnostics check_virtual_hosts```

**Output as JSON** for parsing

```rabbitmq-diagnostics status --formatter json```

# SYNOPSIS

**rabbitmq-diagnostics** [_options_] _command_ [_command_options_]

# PARAMETERS

**-n** _node_
> Target node name (default: **rabbit@$(hostname)**).

**-l**, **--longnames**
> Use fully-qualified node names (FQDN).

**-t** _timeout_
> Operation timeout, in seconds.

**--formatter** _format_
> Output format: **table** (default), **json**, **csv**, **erlang**.

**-q**, **--quiet**
> Suppress informational headers and status lines.

**-s**, **--silent**
> No output for successful checks (useful in monitoring).

# HEALTH CHECK COMMANDS

**check_running**
> Node is running and the rabbit application is started.

**check_local_alarms**
> No resource alarms in effect on the local node.

**check_alarms**
> No resource alarms anywhere in the cluster.

**check_port_connectivity**
> All listener ports accept TCP connections.

**check_port_listener** _port_
> A specific port has an active listener.

**check_protocol_listener** _proto_
> A specific protocol (amqp, mqtt, stomp) has an active listener.

**check_virtual_hosts**
> All virtual hosts are running on the target node.

**check_node_is_mirror_sync_critical**
> No classic-mirrored queues are in a sync-critical state.

# OBSERVABILITY COMMANDS

**status**
> High-level node status (versions, listeners, memory).

**cluster_status**
> Membership, partitions, and per-node listener info.

**memory_breakdown**
> Detailed memory accounting (queues, binaries, ETS, processes...).

**environment**
> Effective application environment for all RabbitMQ apps.

**listeners**
> List all configured network listeners.

**runtime_thread_stats**
> BEAM scheduler/thread statistics.

# DESCRIPTION

**rabbitmq-diagnostics** provides health checks and observability commands for RabbitMQ nodes and clusters. It is the recommended tool for monitoring scripts and Kubernetes probes, replacing many ad-hoc uses of **rabbitmqctl**.

Health checks return non-zero exit codes when a check fails, making them easy to wire into liveness/readiness probes and CI gates. The "deeper" checks (e.g. **check_alarms**) take longer and exercise more of the node, so use **check_running** for high-frequency probes and reserve heavier checks for less-frequent monitoring.

# CAVEATS

Requires a running RabbitMQ node and an Erlang cookie that matches the node's. Some checks need the management plugin or specific RabbitMQ versions. **--formatter json** is preferred for machine consumption — table output is not stable.

# HISTORY

Introduced in **RabbitMQ 3.8** (2019) as a dedicated diagnostics CLI, taking over health-check responsibilities that previously lived in **rabbitmqctl**.

# INSTALL

```dnf: sudo dnf install rabbitmq-server```

```apk: sudo apk add rabbitmq-server```

```zypper: sudo zypper install rabbitmq-server```

```nix: nix profile install nixpkgs#rabbitmq-server```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(8), [rabbitmq-plugins](/man/rabbitmq-plugins)(8), [rabbitmq-server](/man/rabbitmq-server)(8)
