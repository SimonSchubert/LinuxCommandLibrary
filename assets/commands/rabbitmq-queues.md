# TAGLINE

Inspect and manage RabbitMQ queues

# TLDR

**List queues**

```rabbitmq-queues list```

**Show queue info**

```rabbitmq-queues info [queue_name]```

**Check if queues are quorum**

```rabbitmq-queues check_if_node_is_quorum_critical```

**Rebalance queue leaders**

```rabbitmq-queues rebalance all```

# SYNOPSIS

**rabbitmq-queues** _command_ [_options_]

# PARAMETERS

**list**
> List all queues.

**info** _queue_
> Show queue information.

**rebalance** _type_
> Rebalance queue leaders (all, quorum, classic).

**check_if_node_is_quorum_critical**
> Check quorum queue health.

**grow** _node_ _strategy_
> Add queue members.

**shrink** _node_
> Remove queue members.

# DESCRIPTION

**rabbitmq-queues** manages RabbitMQ queues. Inspect queue status, rebalance load, and manage quorum queue membership. Part of RabbitMQ CLI tools.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmq-streams](/man/rabbitmq-streams)(1)

