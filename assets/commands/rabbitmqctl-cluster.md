# TAGLINE

Manage RabbitMQ cluster membership and status

# TLDR

**Show cluster status**

```rabbitmqctl cluster_status```

**Join cluster**

```rabbitmqctl join_cluster [rabbit@node1]```

**Leave cluster**

```rabbitmqctl reset```

**Change node type**

```rabbitmqctl change_cluster_node_type [disc]```

# SYNOPSIS

**rabbitmqctl** _cluster_command_ [_options_]

# PARAMETERS

**cluster_status**
> Show cluster status.

**join_cluster** _node_
> Join existing cluster.

**forget_cluster_node** _node_
> Remove offline node from cluster.

**change_cluster_node_type** _type_
> Change to disc or ram node.

**rename_cluster_node** _old_ _new_
> Rename cluster node.

**force_boot**
> Force node to start when last to shutdown.

# DESCRIPTION

**rabbitmqctl** cluster commands manage RabbitMQ cluster membership. Form clusters, add/remove nodes, and monitor cluster health. Part of RabbitMQ server management.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmq-queues](/man/rabbitmq-queues)(1)

