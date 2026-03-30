# TAGLINE

Inspect messages in a Kafka topic from the terminal

# TLDR

**Launch the TUI** to inspect a Kafka topic

```kplay tui [profile_name]```

**Start the web interface** for browsing messages

```kplay serve [profile_name]```

**Start consuming from a specific offset**

```kplay tui [profile_name] -o [1000]```

**Scan messages and save them locally**

```kplay scan [profile_name] -s -n [500]```

**Forward messages from profiles to S3**

```kplay forward [profile1],[profile2] [arn:aws:s3:::bucket/prefix]```

**Use a custom config file**

```kplay tui [profile_name] -c [path/to/config.yaml]```

# SYNOPSIS

**kplay** _command_ _profile_ [_flags_]

# PARAMETERS

**tui** _PROFILE_
> Launch the terminal user interface for browsing messages on demand.

**serve** _PROFILE_
> Start a web interface for browsing topic messages.

**scan** _PROFILE_
> Scan message summaries and optionally export them locally.

**forward** _PROFILES_ _DESTINATION_
> Consume messages and forward them to a remote destination (e.g., AWS S3).

**-c**, **--config-path** _string_
> Location of kplay's config file (also via $KPLAY_CONFIG_PATH).

**-o**, **--from-offset** _string_
> Start consuming messages from a specific offset.

**-t**, **--from-timestamp** _string_
> Start consuming from a timestamp (RFC3339 format).

**-n**, **--num-records** _uint_
> Maximum number of messages to scan (scan subcommand, default 1000).

**-O**, **--output-dir** _string_
> Directory to persist messages in (default $HOME/.kplay).

**-s**, **--save-messages**
> Export messages to the filesystem (scan subcommand).

**-p**, **--persist-messages**
> Start with message persistence enabled (tui subcommand).

**--debug**
> Display parsed configuration without running.

# DESCRIPTION

**kplay** (kafka-playground) lets you inspect messages in a Kafka topic in a simple and deliberate manner. It provides both a TUI and a web interface for fetching records on demand, browsing them in a list, saving them locally, or forwarding them to S3.

Messages can be decoded in **JSON**, **protobuf**, or **raw** formats. Profiles are configured in a YAML config file, each with its own broker, encoding, and authentication details. Messages are persisted to **$HOME/.kplay** by default.

# CAVEATS

Requires a running Kafka cluster and properly configured profiles. Authentication and encoding must be set up per-profile before use.

# HISTORY

**kplay** was created by **dhth** and is written in **Go**. It was designed for simple, deliberate Kafka message inspection without the overhead of full-featured Kafka management tools.

# SEE ALSO

[kaskade](/man/kaskade)(1), [kcat](/man/kcat)(1)
