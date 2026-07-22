# TAGLINE

Kafka topic tool for produce, consume, and admin basics

# TLDR

**Consume** from a topic

```kt consume -topic [my-topic]```

**Produce** messages

```echo "[hello]" | kt produce -topic [my-topic]```

**List** topics

```kt topic -filter [my-]```

**Print** message keys/values modes

```kt consume -topic [t] -value-as-string```

# SYNOPSIS

**kt** *command* [*options*]

# DESCRIPTION

**kt** is a lightweight Kafka CLI for producing and consuming messages, listing topics, and simple admin tasks without the full JVM **kafka-console-*** tool surface. Configure brokers via flags or environment variables (**KT_BROKERS**, etc.). Install with **go install github.com/fgeller/kt/v14@latest** (module path may change with major versions).

# PARAMETERS

**consume** **-topic** *name*

> Read messages.

**produce** **-topic** *name*

> Write messages from stdin.

**topic** / **group** / **admin** subcommands

> Metadata and group operations—see **kt -h**.

**-brokers** *list*

> Bootstrap servers.

# CAVEATS

Authentication modes (SASL/SSL) require matching flags/config. Large clusters need careful filters. Confirm module version when installing with Go.

# INSTALL

```nix: nix profile install nixpkgs#kt```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[kcat](/man/kcat)(1), [kafkacat](/man/kafkacat)(1), [kafka-console-consumer](/man/kafka-console-consumer)(1)

# RESOURCES

```[Source code](https://github.com/fgeller/kt)```

<!-- verified: 2026-07-19 -->
