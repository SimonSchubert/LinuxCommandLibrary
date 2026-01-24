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

**Check configuration**

```rpk redpanda config```

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
> Client property.

**--brokers** _HOSTS_
> Broker addresses.

# DESCRIPTION

**rpk** manages Redpanda clusters. It's the CLI tool for Redpanda.

Kafka-compatible commands. Similar to kafka-topics.

Topic management included. Create, delete, describe.

Message production/consumption. Test streaming.

Cluster administration. Configuration and health.

# CAVEATS

Requires Redpanda/Kafka. Network access needed. Authentication may be required.

# HISTORY

**rpk** is the command-line interface for **Redpanda**, a Kafka-compatible streaming platform written in C++.

# SEE ALSO

[kafka-topics](/man/kafka-topics)(1), [kafkacat](/man/kafkacat)(1)
