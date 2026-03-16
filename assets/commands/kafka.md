# TAGLINE

distributed event streaming platform

# TLDR

**Start Kafka server**

```kafka-server-start.sh [config/server.properties]```

**Stop Kafka server**

```kafka-server-stop.sh```

**Create a topic with partitions and replication**

```kafka-topics.sh --create --topic [mytopic] --partitions [3] --replication-factor [1] --bootstrap-server [localhost:9092]```

**List all topics**

```kafka-topics.sh --list --bootstrap-server [localhost:9092]```

**Describe a topic**

```kafka-topics.sh --describe --topic [mytopic] --bootstrap-server [localhost:9092]```

**Produce messages to a topic**

```kafka-console-producer.sh --topic [mytopic] --bootstrap-server [localhost:9092]```

**Consume messages from the beginning**

```kafka-console-consumer.sh --topic [mytopic] --from-beginning --bootstrap-server [localhost:9092]```

# SYNOPSIS

**kafka-server-start.sh** _config_

# DESCRIPTION

**Apache Kafka** is a distributed event streaming platform. It provides high-throughput, low-latency message handling for real-time data pipelines and streaming applications.

Kafka organizes messages into topics, with partitions for parallelism and replication for fault tolerance. Producers send messages; consumers read them.

# KEY CONCEPTS

- **Topic**: Category for messages
- **Partition**: Ordered, immutable sequence
- **Producer**: Sends messages to topics
- **Consumer**: Reads messages from topics
- **Broker**: Kafka server node
- **Consumer Group**: Coordinated consumers

# CONFIGURATION

```properties
# server.properties (KRaft mode, Kafka 3.3+)
node.id=1
process.roles=broker,controller
controller.quorum.voters=1@localhost:9093
listeners=PLAINTEXT://:9092,CONTROLLER://:9093
log.dirs=/var/kafka-logs
```

```properties
# server.properties (legacy ZooKeeper mode)
broker.id=0
listeners=PLAINTEXT://:9092
log.dirs=/var/kafka-logs
zookeeper.connect=localhost:2181
```

# CAVEATS

ZooKeeper support was removed in Kafka 4.0; KRaft mode is now required for new deployments. Memory and disk intensive. Topic configuration affects retention and storage. Consumer group rebalancing can cause temporary processing delays.

# HISTORY

Kafka was developed at **LinkedIn** and open-sourced in **2011**. Named after author Franz Kafka, it became an Apache project and is now fundamental infrastructure for event-driven architectures.

# SEE ALSO

[kafka-topics](/man/kafka-topics)(1), [kafkacat](/man/kafkacat)(1)
