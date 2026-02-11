# TAGLINE

Manage RabbitMQ broker plugins

# TLDR

**List plugins**

```rabbitmq-plugins list```

**Enable plugin**

```rabbitmq-plugins enable [rabbitmq_management]```

**Disable plugin**

```rabbitmq-plugins disable [rabbitmq_management]```

**Enable multiple plugins**

```rabbitmq-plugins enable [plugin1] [plugin2]```

**Show enabled plugins**

```rabbitmq-plugins list --enabled```

# SYNOPSIS

**rabbitmq-plugins** [_options_] _command_ [_command_options_]

# PARAMETERS

**-n** _node_
> Target node.

**--offline**
> Modify without running node.

**--online**
> Require running node.

# COMMANDS

**list**
> List all plugins.

**enable** _plugins_
> Enable plugins.

**disable** _plugins_
> Disable plugins.

**set** _plugins_
> Set exact plugin list.

# DESCRIPTION

**rabbitmq-plugins** manages RabbitMQ plugins. Plugins extend RabbitMQ functionality with features like management UI, MQTT support, and LDAP authentication.

# EXAMPLES

```bash
# List all plugins
rabbitmq-plugins list

# Enable management UI
rabbitmq-plugins enable rabbitmq_management

# Enable MQTT
rabbitmq-plugins enable rabbitmq_mqtt

# Disable plugin
rabbitmq-plugins disable rabbitmq_stomp

# Offline enable
rabbitmq-plugins enable --offline rabbitmq_management
```

# COMMON PLUGINS

```
rabbitmq_management      - Web UI and API
rabbitmq_mqtt            - MQTT protocol
rabbitmq_stomp           - STOMP protocol
rabbitmq_shovel          - Message transfer
rabbitmq_federation      - Federation
rabbitmq_prometheus      - Metrics export
```

# CAVEATS

Some plugins require node restart. Dependencies enabled automatically. Management UI on port 15672.

# HISTORY

RabbitMQ plugins system was developed by **Pivotal** (now VMware) as part of RabbitMQ's extensible architecture.

# SEE ALSO

[rabbitmqctl](/man/rabbitmqctl)(8), [rabbitmq-diagnostics](/man/rabbitmq-diagnostics)(8), [rabbitmq-server](/man/rabbitmq-server)(8)
