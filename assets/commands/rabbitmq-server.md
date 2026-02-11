# TAGLINE

Open-source message broker server

# TLDR

**Start RabbitMQ server**

```rabbitmq-server```

**Start in background**

```rabbitmq-server -detached```

**Start with specific node name**

```RABBITMQ_NODENAME=[rabbit@hostname] rabbitmq-server```

**Start via systemctl**

```sudo systemctl start rabbitmq-server```

# SYNOPSIS

**rabbitmq-server** [_options_]

# PARAMETERS

**-detached**
> Run in background.

# DESCRIPTION

**rabbitmq-server** starts the RabbitMQ message broker. RabbitMQ implements AMQP (Advanced Message Queuing Protocol) and supports multiple messaging protocols.

Usually managed via systemd or init scripts.

# EXAMPLES

```bash
# Start server
rabbitmq-server

# Start detached
rabbitmq-server -detached

# Via systemd
sudo systemctl start rabbitmq-server
sudo systemctl enable rabbitmq-server

# Check status
sudo systemctl status rabbitmq-server
rabbitmqctl status
```

# ENVIRONMENT VARIABLES

```bash
RABBITMQ_NODENAME=rabbit@hostname
RABBITMQ_NODE_PORT=5672
RABBITMQ_CONFIG_FILE=/etc/rabbitmq/rabbitmq
RABBITMQ_LOG_BASE=/var/log/rabbitmq
```

# CONFIGURATION

```bash
# /etc/rabbitmq/rabbitmq.conf
listeners.tcp.default = 5672
management.tcp.port = 15672
default_user = guest
default_pass = guest
```

# PORTS

```
5672  - AMQP
15672 - Management UI
25672 - Clustering
```

# CAVEATS

Requires Erlang runtime. Default guest user only works on localhost. Enable management plugin for web UI.

# HISTORY

RabbitMQ was developed by **Rabbit Technologies Ltd**, acquired by **SpringSource** (VMware), originally released in 2007.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(8), [rabbitmq-plugins](/man/rabbitmq-plugins)(8), [rabbitmq-diagnostics](/man/rabbitmq-diagnostics)(8)
