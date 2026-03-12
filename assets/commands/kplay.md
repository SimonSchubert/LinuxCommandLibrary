# TAGLINE

Inspect messages in a Kafka topic from the terminal

# TLDR

**Inspect a Kafka topic** using a profile

```kplay -p [profile_name]```

**Pull a specific number of messages**

```kplay -p [profile_name] -n [count]```

# SYNOPSIS

**kplay** [_options_]

# PARAMETERS

**-p**, **--profile** _NAME_
> Specify the Kafka profile to use.

**-n**, **--count** _N_
> Number of messages to pull.

# DESCRIPTION

**kplay** (kafka-playground) lets you inspect messages in a Kafka topic in a simple and deliberate manner. It provides a TUI for fetching records on demand, browsing them in a list, and saving them locally or forwarding them to S3.

Messages can be decoded in **JSON**, **protobuf**, or **raw** formats. Profiles can be configured for various Kafka topics, each with its own broker, encoding, and authentication details.

# CAVEATS

Requires a running Kafka cluster and properly configured profiles. Authentication and encoding must be set up per-profile before use.

# HISTORY

**kplay** was created by **dhth** and is written in **Go**. It was designed for simple, deliberate Kafka message inspection without the overhead of full-featured Kafka management tools.

# SEE ALSO

[kaskade](/man/kaskade)(1)
