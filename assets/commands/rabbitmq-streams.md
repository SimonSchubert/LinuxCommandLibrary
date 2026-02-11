# TAGLINE

Manage RabbitMQ stream queues

# TLDR

**List streams**

```rabbitmq-streams list```

**Add stream replica**

```rabbitmq-streams add_replica [stream_name] [node]```

**Delete stream replica**

```rabbitmq-streams delete_replica [stream_name] [node]```

**Restart stream**

```rabbitmq-streams restart_stream [stream_name]```

# SYNOPSIS

**rabbitmq-streams** _command_ [_options_]

# PARAMETERS

**list**
> List all streams.

**add_replica** _stream_ _node_
> Add stream replica.

**delete_replica** _stream_ _node_
> Remove stream replica.

**restart_stream** _stream_
> Restart stream.

**-n** _node_
> Target node.

**-p** _vhost_
> Virtual host.

# DESCRIPTION

**rabbitmq-streams** manages RabbitMQ streams. Streams are persistent, replicated, append-only logs for high-throughput messaging. Part of RabbitMQ CLI tools.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmq-queues](/man/rabbitmq-queues)(1)

