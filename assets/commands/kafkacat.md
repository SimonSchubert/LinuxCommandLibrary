# TAGLINE

command-line Kafka producer and consumer

# TLDR

**Produce messages**

```echo "[message]" | kafkacat -P -b [localhost:9092] -t [topic]```

**Consume messages**

```kafkacat -C -b [localhost:9092] -t [topic]```

**Consume from beginning**

```kafkacat -C -b [localhost:9092] -t [topic] -o beginning```

**List topics**

```kafkacat -L -b [localhost:9092]```

**Produce from file**

```kafkacat -P -b [localhost:9092] -t [topic] [file.txt]```

**Consume with format**

```kafkacat -C -b [localhost:9092] -t [topic] -f '[%T] %k: %s\n'```

**Produce with key** using delimiter

```echo "[key]:[value]" | kafkacat -P -b [localhost:9092] -t [topic] -K ":"```

**Consume N messages** and exit

```kafkacat -C -b [localhost:9092] -t [topic] -c [10]```

# SYNOPSIS

**kafkacat** [_options_]

# PARAMETERS

**-P**
> Producer mode.

**-C**
> Consumer mode.

**-L**
> Metadata list mode.

**-b** _brokers_
> Broker list.

**-t** _topic_
> Topic name.

**-p** _partition_
> Partition number.

**-o** _offset_
> Offset: beginning, end, stored, or number.

**-K** _delim_
> Key delimiter.

**-f** _format_
> Output format string.

**-c** _count_
> Exit after consuming count messages.

**-e**
> Exit at end of topic.

**-G** _group_ _topic_
> Consumer group mode (high-level balanced consumer).

**-X** _property=value_
> Set librdkafka property (e.g., security.protocol=SSL).

# DESCRIPTION

**kafkacat** (also known as kcat) is a command-line Kafka producer and consumer. It's faster and simpler than Kafka's built-in shell scripts, useful for testing and debugging.

# FORMAT STRINGS

```
%T  - Timestamp
%k  - Key
%s  - Message (payload)
%p  - Partition
%o  - Offset
%t  - Topic
```

# CAVEATS

Renamed to kcat in newer versions. Requires librdkafka. Not included with Kafka distribution. Some features need specific librdkafka version.

# HISTORY

kafkacat was created by **Magnus Edenhill**, who also created librdkafka. It's been renamed to **kcat** but kafkacat remains widely used.

# SEE ALSO

[kcat](/man/kcat)(1), [kafka](/man/kafka)(1), [kafka-topics](/man/kafka-topics)(1)
