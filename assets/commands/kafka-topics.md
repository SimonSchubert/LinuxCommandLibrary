# TAGLINE

manages Kafka topics

# TLDR

**Create topic**

```kafka-topics.sh --create --topic [name] --partitions [3] --replication-factor [1] --bootstrap-server [localhost:9092]```

**List all topics**

```kafka-topics.sh --list --bootstrap-server [localhost:9092]```

**Describe topic**

```kafka-topics.sh --describe --topic [name] --bootstrap-server [localhost:9092]```

**Delete topic**

```kafka-topics.sh --delete --topic [name] --bootstrap-server [localhost:9092]```

**Alter partitions**

```kafka-topics.sh --alter --topic [name] --partitions [6] --bootstrap-server [localhost:9092]```

# SYNOPSIS

**kafka-topics.sh** [_options_]

# PARAMETERS

**--create**
> Create new topic.

**--list**
> List all topics.

**--describe**
> Show topic details.

**--delete**
> Delete topic.

**--alter**
> Modify topic configuration.

**--topic** _name_
> Topic name.

**--partitions** _n_
> Number of partitions.

**--replication-factor** _n_
> Replication factor.

**--bootstrap-server** _servers_
> Kafka broker addresses.

**--config** _key=value_
> Topic configuration.

**--if-exists**
> Only if topic exists.

**--if-not-exists**
> Only if topic doesn't exist.

# DESCRIPTION

**kafka-topics.sh** manages Kafka topics. Topics are the core abstraction for organizing messages in Kafka, with partitions for parallelism and replication for durability.

# TOPIC CONFIGURATIONS

```bash
# Set retention
--config retention.ms=86400000

# Set cleanup policy
--config cleanup.policy=compact

# Set max message size
--config max.message.bytes=1048576
```

# CAVEATS

Partitions can only be increased, not decreased. Replication factor limited by broker count. Deletion may need to be enabled in config. ZooKeeper connection deprecated.

# SEE ALSO

[kafka](/man/kafka)(1), [kafka-console-producer](/man/kafka-console-producer)(1), [kafkacat](/man/kafkacat)(1)
