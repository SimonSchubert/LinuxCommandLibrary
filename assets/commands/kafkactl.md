# TAGLINE

Command-line interface for Apache Kafka

# TLDR

**List topics**

```kafkactl get topics```

**Describe a topic**

```kafkactl describe topic [my-topic]```

**Create a topic** with partitions

```kafkactl create topic [my-topic] --partitions [32]```

**Consume** from the beginning of a topic

```kafkactl consume [my-topic] --from-beginning```

**Consume** the last N messages

```kafkactl consume [my-topic] --tail=[5]```

**Produce** a message with key and value

```kafkactl produce [my-topic] --key=[my-key] --value=[my-value]```

**Produce** from stdin with a custom separator

```echo "[key]#[value]" | kafkactl produce [my-topic] --separator=#```

**List consumer groups**

```kafkactl get consumer-groups```

**Describe a consumer group**

```kafkactl describe consumer-group [my-group]```

# SYNOPSIS

**kafkactl** [*global-options*] *command* [*args*]

# DESCRIPTION

**kafkactl** is a command-line interface for interacting with Apache Kafka clusters. It covers common day-to-day tasks: listing and managing topics, consuming and producing messages, inspecting consumer groups, and working with schema registry encodings (Avro, JSON Schema, Protobuf).

Contexts in the config file let you switch between multiple clusters. Optional Kubernetes integration can run kafkactl inside a cluster so you can reach brokers that are only reachable via kubectl. Shell completion is available for bash, zsh, and fish, including dynamic completion for topics and consumer groups.

Default config path is **$HOME/.config/kafkactl/config.yml** (also looked up under **$HOME/.kafkactl/**, **$APPDATA/kafkactl/**, and **/etc/kafkactl/**). Project-level config files near a git root are supported. Credentials can be prompted interactively and stored in the OS keyring, or supplied via config and environment variables.

# PARAMETERS

**get topics**

> List topics on the current context.

**describe topic** *topic*

> Show topic details; **--all-configs** includes all topic configs; **--skip-empty** omits empty partitions.

**create topic** *topic*

> Create a topic. Options include **--partitions**, **--replication-factor**, **--config** *key=value*, and **--file** for cloning from exported JSON.

**alter topic** *topic*

> Change partitions, replication factor, or topic configs.

**consume** *topic*

> Consume messages. Common flags: **--from-beginning**, **--tail=**_N_, **--exit**, **--group**, **--print-keys**, **--print-timestamps**, **--print-headers**, **--print-partitions**, **--from-timestamp**, **--to-timestamp**, **--max-messages**, **--filter-key**, **--filter-value**, **-o** yaml|json.

**produce** *topic*

> Produce messages via **--key** / **--value**, stdin, or **--file**. Supports **--separator**, **--input-format=json**, **--header**, encodings, protobuf types, and **--rate**.

**get consumer-groups**

> List consumer groups; optional **--topic** filter.

**describe consumer-group** *group*

> Show group details and lag; **--only-with-lag** filters.

**completion** bash|zsh|fish

> Generate shell completion scripts.

**--config-file=**_path_

> Use an alternate config file.

See **kafkactl --help** and the online command docs for the full command tree and flags.

# CONFIGURATION

Create **$HOME/.config/kafkactl/config.yml** with one or more named contexts (brokers, TLS, SASL, schema registry, optional kubernetes). If no file exists, a default suitable for a local single-node cluster is generated. Every config key can be overridden by environment variables. See upstream docs for the full schema.

# CAVEATS

**--from-timestamp** / **--to-timestamp** compute offsets at consumer start; they are not wall-clock schedulers for future times. Producing with wrong encoding or schema versions can write data consumers cannot decode. When using Kubernetes mode, kubectl access and RBAC must allow the configured operations.

# SEE ALSO

[kcat](/man/kcat)(1), [kafka-console-consumer](/man/kafka-console-consumer)(1), [kafka-console-producer](/man/kafka-console-producer)(1), [kubectl](/man/kubectl)(1)

# RESOURCES

```[Source code](https://github.com/deviceinsight/kafkactl)```

```[Documentation](https://deviceinsight.github.io/kafkactl/)```

<!-- verified: 2026-07-19 -->
