# TAGLINE

Manage Redpanda streaming topics and clusters

# TLDR

**Create topic**

```rpk topic create [topic-name]```

**List topics**

```rpk topic list```

**Produce message**

```rpk topic produce [topic] -k [key]```

**Consume messages**

```rpk topic consume [topic]```

**Describe cluster**

```rpk cluster info```

**Show a cluster configuration property**

```rpk cluster config get [property]```

**Connect to specific brokers**

```rpk topic list -X brokers=[host:9092]```

# SYNOPSIS

**rpk** _command_ [_subcommand_] [_options_]

# PARAMETERS

**topic**
> Topic operations.

**cluster**
> Cluster commands.

**redpanda**
> Redpanda management.

**acl**
> ACL management.

**group**
> Consumer groups.

**-X** _PROP=VAL_
> Client property, such as **brokers=HOST:PORT** or SASL and TLS settings.

# DESCRIPTION

**rpk** is the command-line interface for Redpanda, a Kafka-compatible streaming data platform. It provides commands for managing topics, producing and consuming messages, administering clusters, and configuring Redpanda nodes, using a syntax familiar to users of Kafka's CLI tools.

Topic operations include creating, deleting, describing, and listing topics, as well as producing messages to and consuming messages from topics for testing and debugging. Cluster commands provide health checks, configuration inspection, and broker management. The tool also handles ACL (Access Control List) management and consumer group operations.

The **-X** flag passes client properties like authentication credentials, TLS settings and the cluster endpoints (**-X brokers=...**), replacing older flags such as **--brokers**.

# CAVEATS

Requires Redpanda/Kafka. Network access needed. Authentication may be required.

# HISTORY

**rpk** is the command-line interface for **Redpanda**, a Kafka-compatible streaming platform written in C++.

# SEE ALSO

[kafka-topics](/man/kafka-topics)(1), [kafkacat](/man/kafkacat)(1)

# RESOURCES

```[Source code](https://github.com/redpanda-data/redpanda)```

```[Homepage](https://www.redpanda.com/)```

```[Documentation](https://docs.redpanda.com/current/reference/rpk/)```

<!-- verified: 2026-11-08 -->
