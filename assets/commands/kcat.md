# TAGLINE

generic non-JVM producer and consumer for Apache Kafka

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
> Comma-separated Kafka broker list (host[:port]).

**-t** _topic_
> Topic to produce to or consume from.

**-p** _partition_
> Partition to produce to or consume from.

**-C**
> Consumer mode.

**-P**
> Producer mode.

**-L**
> Metadata list mode.

**-Q**
> Query offsets by timestamp.

**-G** _group_
> High-level consumer group (requires broker >= 0.9.0).

**-o** _offset_
> Starting offset (beginning, end, stored, or numeric; negative counts from end).

**-e**
> Exit after consuming the last message.

**-q**
> Quiet mode, no informational output.

**-f** _format_
> Output format string (e.g. `%t %p %o %k %s\n`).

**-J**
> Output messages in a JSON envelope.

**-K** _sep_
> Key delimiter for produce/consume.

**-D** _sep_
> Message delimiter (default newline).

**-X** _prop=val_
> Set a librdkafka configuration property.

**-F** _file_
> Read librdkafka config from file.

# DESCRIPTION

**kcat** (formerly kafkacat) is a generic non-JVM producer and consumer for Apache Kafka. Written in C using **librdkafka**, it provides a lightweight CLI for interacting with Kafka clusters. It supports producing, consuming, listing metadata, querying offsets, and working with Avro/JSON payloads via Schema Registry.

# HISTORY

Originally named **kafkacat**, the tool was renamed to **kcat** in 2021 to align with upstream branding. Both names may still be present depending on the distribution's packaging.

# SEE ALSO

[kafka](/man/kafka)(1), [kafkacat](/man/kafkacat)(1), [kafka-topics](/man/kafka-topics)(1)

