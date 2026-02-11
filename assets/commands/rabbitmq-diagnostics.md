# TAGLINE

Diagnose RabbitMQ node and cluster health

# TLDR

**Check node health**

```rabbitmq-diagnostics check_running```

**Check cluster status**

```rabbitmq-diagnostics cluster_status```

**Check alarms**

```rabbitmq-diagnostics check_alarms```

**Memory breakdown**

```rabbitmq-diagnostics memory_breakdown```

**Check virtual hosts**

```rabbitmq-diagnostics check_virtual_hosts```

# SYNOPSIS

**rabbitmq-diagnostics** [_options_] _command_ [_command_options_]

# PARAMETERS

**-n** _node_
> Target node.

**-t** _timeout_
> Command timeout.

**--formatter** _format_
> Output format (json, csv).

**-q**
> Quiet mode.

# DESCRIPTION

**rabbitmq-diagnostics** provides health checks and diagnostic information for RabbitMQ nodes and clusters. It's the primary tool for monitoring RabbitMQ health.

# EXAMPLES

```bash
# Node health check
rabbitmq-diagnostics check_running

# Cluster status
rabbitmq-diagnostics cluster_status

# Check for alarms
rabbitmq-diagnostics check_alarms

# Memory usage
rabbitmq-diagnostics memory_breakdown

# Check port listeners
rabbitmq-diagnostics check_port_connectivity

# JSON output
rabbitmq-diagnostics status --formatter json
```

# HEALTH CHECKS

```bash
check_running          # Node is running
check_alarms           # No resource alarms
check_local_alarms     # No local alarms
check_port_connectivity # Ports accessible
check_virtual_hosts    # VHosts operational
```

# CAVEATS

Requires running RabbitMQ node. Some commands need appropriate permissions. Part of RabbitMQ server package.

# HISTORY

rabbitmq-diagnostics was introduced in **RabbitMQ 3.8** as a dedicated diagnostics tool, replacing some rabbitmqctl functions.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(8), [rabbitmq-plugins](/man/rabbitmq-plugins)(8), [rabbitmq-server](/man/rabbitmq-server)(8)
