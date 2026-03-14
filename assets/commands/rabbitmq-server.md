# TAGLINE

Open-source message broker server

# TLDR

**Start RabbitMQ server** in foreground

```rabbitmq-server```

**Start in background** (detached)

```rabbitmq-server -detached```

**Start with specific node name**

```RABBITMQ_NODENAME=[rabbit@hostname] rabbitmq-server```

**Start via systemd**

```sudo systemctl start rabbitmq-server```

**Enable management plugin** for web UI

```rabbitmq-plugins enable rabbitmq_management```

**Check server status**

```rabbitmqctl status```

# SYNOPSIS

**rabbitmq-server** [_options_]

# PARAMETERS

**-detached**
> Run the server in the background (daemonize).

**-n** _NODE_
> Specify the node name (alternative to RABBITMQ_NODENAME).

# DESCRIPTION

**rabbitmq-server** starts the RabbitMQ message broker, a widely-used open-source message queue system. RabbitMQ implements AMQP 0-9-1 (Advanced Message Queuing Protocol) and also supports MQTT, STOMP, and AMQP 1.0 via plugins.

The server is typically managed via systemd or init scripts in production. It listens on port **5672** for AMQP connections by default. The management plugin provides a web UI on port **15672** for monitoring queues, exchanges, and connections.

RabbitMQ supports clustering for high availability, virtual hosts for multi-tenancy, and various exchange types (direct, topic, fanout, headers) for flexible message routing.

# CONFIGURATION

**/etc/rabbitmq/rabbitmq.conf**
> Main configuration file (new sysctl-style format). Controls listeners, users, resource limits, and cluster settings.

**/etc/rabbitmq/advanced.config**
> Advanced Erlang-term configuration for options not available in rabbitmq.conf.

**/etc/rabbitmq/rabbitmq-env.conf**
> Environment variable overrides for node name, ports, config paths, and log locations.

**RABBITMQ_NODENAME**
> Node name (default: rabbit@hostname).

**RABBITMQ_NODE_PORT**
> AMQP port (default: 5672).

**RABBITMQ_CONFIG_FILE**
> Path to configuration file (without extension).

**RABBITMQ_LOG_BASE**
> Directory for log files (default: /var/log/rabbitmq).

# CAVEATS

Requires the Erlang/OTP runtime. The default **guest** user can only connect from localhost for security. Enable the management plugin (**rabbitmq-plugins enable rabbitmq_management**) for the web UI. File descriptor limits may need to be increased for production workloads.

# HISTORY

RabbitMQ was originally developed by **Rabbit Technologies Ltd** using Erlang and first released in **2007**. The company was acquired by **SpringSource** (later VMware) in 2010. It is now maintained by **Broadcom** (via VMware) and remains one of the most widely deployed message brokers.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(8), [rabbitmq-plugins](/man/rabbitmq-plugins)(8), [rabbitmq-diagnostics](/man/rabbitmq-diagnostics)(8)
