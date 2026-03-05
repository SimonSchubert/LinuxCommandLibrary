# TAGLINE

Text user interface for Apache Kafka

# TLDR

**Launch kaskade** with default connection

```kaskade```

**Connect to a specific broker**

```kaskade -b [localhost:9092]```

# SYNOPSIS

**kaskade** [**-b** _broker_] [_options_]

# DESCRIPTION

**kaskade** is a TUI for **Apache Kafka** that allows you to interact with and consume topics directly from the terminal. It provides features for listing topics, partitions, consumer groups, and group members, as well as viewing topic information including lag, replicas, and record counts.

The tool supports creating, editing, and deleting topics, filtering topics by name, and consuming messages with deserialization support for JSON, string, integer, long, float, boolean, double, **Avro**, **Protobuf**, and **Schema Registry** formats. Messages can be filtered by key, value, header, or partition.

# CAVEATS

Requires a running Kafka cluster. Schema Registry integration requires a running Schema Registry instance. Complex Avro/Protobuf schemas may have deserialization limitations.

# HISTORY

**kaskade** was created by **Saul Jabin** (sauljabin) and is written in **Python** using the **Textual** framework. It was designed to bring a modern, interactive Kafka browsing experience to the terminal.

# SEE ALSO

[kafka-console-consumer](/man/kafka-console-consumer)(1)
