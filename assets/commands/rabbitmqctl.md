# TAGLINE

Command-line tool for managing RabbitMQ

# TLDR

**List queues**

```rabbitmqctl list_queues```

**List queues with details**

```rabbitmqctl list_queues name messages consumers```

**List exchanges**

```rabbitmqctl list_exchanges```

**List connections**

```rabbitmqctl list_connections```

**Add user**

```rabbitmqctl add_user [username] [password]```

**Set user permissions**

```rabbitmqctl set_permissions [username] ".*" ".*" ".*"```

**Delete queue**

```rabbitmqctl delete_queue [queue_name]```

**Cluster status**

```rabbitmqctl cluster_status```

# SYNOPSIS

**rabbitmqctl** [_-n node_] [_-t timeout_] _command_ [_args_]

# PARAMETERS

**list_queues** [_COLUMNS_]
> List queues with selected info.

**list_exchanges** [_COLUMNS_]
> List exchanges.

**list_bindings**
> List bindings.

**list_connections** [_COLUMNS_]
> List connections.

**list_channels** [_COLUMNS_]
> List channels.

**list_users**
> List users.

**add_user** _USER_ _PASS_
> Add user.

**delete_user** _USER_
> Delete user.

**set_permissions** _USER_ _CONF_ _WRITE_ _READ_
> Set permissions.

**delete_queue** _QUEUE_
> Delete queue.

**purge_queue** _QUEUE_
> Empty queue.

**cluster_status**
> Show cluster status.

**-n** _NODE_
> Target node.

**-t** _TIMEOUT_
> Command timeout.

# DESCRIPTION

**rabbitmqctl** manages RabbitMQ message broker. It controls server operations, user management, and provides monitoring information.

Queue listings show message counts, consumer connections, and memory usage. Column selection customizes output for monitoring scripts.

User management handles authentication. Permission patterns (configure, write, read) control access to virtual hosts and resources.

Cluster commands manage distributed deployments. Status shows node membership and synchronization state.

The tool connects to the Erlang distribution for control. Node names identify targets in clustered environments.

Monitoring commands support integration with external systems. JSON output enables automated processing.

# CAVEATS

Requires access to Erlang cookie. Some commands need administrator privileges. Cluster operations need careful coordination.

# HISTORY

**rabbitmqctl** has been RabbitMQ's management CLI since the broker's release by **Rabbit Technologies** (acquired by VMware, now part of Broadcom) starting around **2007**. It remains the primary administrative interface.

# SEE ALSO

[rabbitmq-server](/man/rabbitmq-server)(8), [rabbitmq-plugins](/man/rabbitmq-plugins)(8), [rabbitmq-diagnostics](/man/rabbitmq-diagnostics)(8)
