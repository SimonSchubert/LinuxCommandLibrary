# TAGLINE

Apache Kafka TUI client

# TLDR

**Launch the Kafka TUI**

```ktea```

**Connect to a specific cluster**

```ktea -c [cluster_name]```

# SYNOPSIS

**ktea** [_options_]

# DESCRIPTION

**ktea** is an Apache Kafka TUI client designed to simplify and accelerate interactions with Kafka clusters. It provides multi-cluster support, topic management, record consumption in text, JSON, and Avro formats, consumer group monitoring, and schema registry integration.

Tables can be navigated using vi-like key bindings (**j**/**k** for up/down, **d**/**u** for page down/up). The tool is useful for quickly checking topics, reading events, and managing Kafka resources without the overhead of GUI clients.

# CAVEATS

Requires access to a running Kafka cluster. Schema registry integration requires a compatible schema registry service.

# HISTORY

**ktea** was created by **Jonas Geiregat** (jonas-grgt) and is written in **Go**. It was designed for quick remote access to Kafka clusters from the terminal.

# SEE ALSO

[kplay](/man/kplay)(1), [kaskade](/man/kaskade)(1)
