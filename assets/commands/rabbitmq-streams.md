# TAGLINE

Manage RabbitMQ stream queues

# TLDR

**List** stream protocol **connections**

```rabbitmq-streams list_stream_connections```

**Display** the **status** of a stream

```rabbitmq-streams stream_status --vhost [vhost] --stream [stream_name]```

**Add** a stream **replica** on a given node

```rabbitmq-streams add_replica --vhost [vhost] [stream_name] [node]```

**Delete** a stream **replica** from a given node

```rabbitmq-streams delete_replica --vhost [vhost] [stream_name] [node]```

**Restart** a stream and all its **replicas**

```rabbitmq-streams restart_stream --vhost [vhost] [stream_name]```

Restart a stream with a **preferred leader** node

```rabbitmq-streams restart_stream --vhost [vhost] --preferred-leader-node [node] [stream_name]```

# SYNOPSIS

**rabbitmq-streams** [**-n** _node_] [**-t** _timeout_] [**-l**|**-q**] _command_ [_command options_]

# PARAMETERS

**-n** _node_
> Target node to execute the command on. Default is the node of the local host.

**-t** _timeout_
> Operation timeout in seconds. Default varies per command.

**-l**, **--longnames**
> Use long node names (FQDN). Must match the broker configuration.

**-q**, **--quiet**
> Suppress informational messages, output only essential data.

**--formatter** _formatter_
> Output format: csv, erlang, json, pretty_table, table.

# SUBCOMMANDS

**add_replica** _stream_ _node_
> Add a stream replica on the given node.

**delete_replica** _stream_ _node_
> Remove a stream replica from the given node.

**stream_status** **--stream** _stream_
> Display the status of a stream, including leader and replicas.

**restart_stream** _stream_
> Restart a stream including all of its replicas. Accepts **--preferred-leader-node** to place the leader on a specific node.

**list_stream_connections** [_connectioninfoitem_...]
> Return stream protocol connection statistics.

**list_stream_consumers** [**-p** _vhost_] [_consumerinfoitem_...]
> Return consumers attached to a stream.

**list_stream_publishers** [**-p** _vhost_] [_publisherinfoitem_...]
> Return publishers attached to a stream.

**list_stream_consumer_groups** [**-p** _vhost_]
> List single active consumer groups for streams.

# DESCRIPTION

**rabbitmq-streams** is a command line tool for managing RabbitMQ streams. Streams are persistent, replicated, append-only log data structures designed for high-throughput messaging workloads. This tool manages stream replicas, monitors stream status, and lists stream connections and consumers. Part of the RabbitMQ CLI tools suite.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [rabbitmq-queues](/man/rabbitmq-queues)(1), [rabbitmq-diagnostics](/man/rabbitmq-diagnostics)(1)
