# TLDR

**Consume messages from topic**

```kcat -b [localhost:9092] -t [topic] -C```

**Produce message to topic**

```echo "[message]" | kcat -b [localhost:9092] -t [topic] -P```

**List metadata**

```kcat -b [localhost:9092] -L```

**Consume with custom format**

```kcat -b [localhost:9092] -t [topic] -C -f '%k: %s\n'```

**Consume from beginning**

```kcat -b [localhost:9092] -t [topic] -C -o beginning```

**Query watermarks**

```kcat -b [localhost:9092] -t [topic] -Q```

# SYNOPSIS

**kcat** [_options_] _mode_

# PARAMETERS

**-b** _brokers_
> Kafka broker list.

**-t** _topic_
> Topic to produce/consume.

**-C**
> Consumer mode.

**-P**
> Producer mode.

**-L**
> Metadata list mode.

**-Q**
> Query mode for offsets.

**-f** _format_
> Output format string.

**-o** _offset_
> Starting offset.

**-G** _group_
> Consumer group.

# DESCRIPTION

**kcat** (formerly kafkacat) is a generic non-JVM producer and consumer for Apache Kafka. Written in C using librdkafka, it provides a lightweight CLI for interacting with Kafka clusters. Supports producing, consuming, and listing metadata.

# HISTORY

Originally named kafkacat, the tool was renamed to kcat. Both names may still be in use depending on the installation.

# SEE ALSO

[kafka-console-consumer](/man/kafka-console-consumer)(1), [kafka-console-producer](/man/kafka-console-producer)(1)

