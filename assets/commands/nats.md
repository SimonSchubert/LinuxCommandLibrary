# TLDR

**Publish a message**

```nats pub [subject] "[message]"```

**Subscribe to subject**

```nats sub [subject]```

**Request/reply**

```nats req [subject] "[request]"```

**Reply to requests**

```nats reply [subject] "[response]"```

**List streams (JetStream)**

```nats stream ls```

**Create a stream**

```nats stream add [stream-name]```

**Publish to stream**

```nats pub [subject] "[message]"```

**View server info**

```nats server info```

# SYNOPSIS

**nats** _command_ [_options_] [_args_...]

# COMMANDS

**pub** _subject_ [_message_]
> Publish message to subject.

**sub** _subject_
> Subscribe to subject.

**req** _subject_ [_payload_]
> Send request and wait for reply.

**reply** _subject_ [_response_]
> Reply to requests on subject.

**stream** ls|add|info|rm|edit|purge
> Manage JetStream streams.

**consumer** ls|add|info|rm|next
> Manage stream consumers.

**kv** add|get|put|del|ls
> Key-value store operations.

**object** add|get|put|del|ls
> Object store operations.

**server** info|list|ping|report
> Server information.

**account** info
> Account information.

**context** add|select|ls|rm
> Manage connection contexts.

# PARAMETERS

**-s**, **--server** _url_
> NATS server URL. Default: nats://localhost:4222.

**--creds** _file_
> Credentials file for authentication.

**--user** _user_
> Username for authentication.

**--password** _pass_
> Password for authentication.

**--nkey** _file_
> NKey file for authentication.

**--tlscert** _file_
> TLS client certificate.

**--tlskey** _file_
> TLS client key.

**--context** _name_
> Use named context.

# DESCRIPTION

**nats** is the CLI for NATS messaging system. It provides pub/sub messaging, request/reply patterns, and JetStream persistence operations.

Core NATS offers at-most-once messaging. **pub** sends messages, **sub** receives. Subject wildcards support: **\*** matches single token, **>** matches multiple tokens.

JetStream adds persistence with streams and consumers. **stream add** creates durable storage; consumers track delivery. Key-value and object stores provide higher-level abstractions on JetStream.

Contexts save connection details for multiple environments. Use **context add** to create and **context select** to switch.

Request/reply enables RPC patterns. **req** sends and waits for response; services use **reply** or custom subscribers to respond.

# CAVEATS

Core NATS is fire-and-forget; use JetStream for delivery guarantees. Subject naming uses dot separators. Large messages may require configuration. Contexts store credentials on disk.

# HISTORY

NATS was created by **Derek Collison** and first released in **2010** as a Ruby gem, rewritten in Go in **2012**. Originally used at Apcera, it became a CNCF incubating project in **2018** and graduated in **2023**. JetStream added persistence in NATS 2.2 (2021). The system emphasizes simplicity, performance, and operational ease for cloud-native messaging.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(1), [kafka-console-producer](/man/kafka-console-producer)(1), [mosquitto_pub](/man/mosquitto_pub)(1)
