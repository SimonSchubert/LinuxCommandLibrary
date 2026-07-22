# TAGLINE

Lightweight, high-performance AMQP message broker

# TLDR

**Start the broker** with default settings

```lavinmq```

**Start with a specific configuration file**

```lavinmq --config=[path/to/lavinmq.ini]```

**Specify the data directory** for persistent storage

```lavinmq --data-dir=[path/to/data]```

**Bind to a specific address** and AMQP port

```lavinmq --bind=[0.0.0.0] --amqp-port=[5672]```

**Show version** information

```lavinmq -v```

**Manage the broker** (queues, policies, definitions) via the companion CLI

```lavinmqctl list_queues```

**Export broker definitions** to JSON

```lavinmqctl export_definitions > [definitions.json]```

# SYNOPSIS

**lavinmq** [_options_]

**lavinmqctl** [_options_] _command_ [_arguments_]

# PARAMETERS

**-c** _file_, **--config**=_file_
> Load broker settings from the specified INI configuration file.

**-D** _dir_, **--data-dir**=_dir_
> Directory for persistent data (queues, messages, definitions).

**-b** _address_, **--bind**=_address_
> IP or hostname to listen on (default 127.0.0.1).

**--amqp-port**=_port_
> AMQP listener port (default 5672).

**--amqps-port**=_port_
> AMQPS (TLS) listener port (default 5671).

**--http-port**=_port_
> HTTP management UI port (default 15672).

**--https-port**=_port_
> HTTPS management UI port (default 15671).

**--guest-only-loopback**=_bool_
> Restrict the default _guest_ user to loopback connections only.

**--log-level**=_level_
> Logging verbosity (debug, info, warn, error, fatal).

**-h**, **--help**
> Show usage information and exit.

**-v**, **--version**
> Print the LavinMQ version and exit.

# DESCRIPTION

**LavinMQ** is an open-source message broker that implements the **AMQP 0-9-1** protocol and is wire-compatible with existing RabbitMQ client libraries. It also speaks **MQTT** and a native streams protocol. Written in **Crystal**, it is designed to handle very high throughput on a single node while keeping memory usage low by relying on the operating system page cache and memory-mapped files.

The broker ships as two executables. **lavinmq** is the long-running server process that accepts client connections, routes messages between exchanges and queues, and exposes a built-in HTTP management UI. **lavinmqctl** is the administrative command-line tool used to inspect and manage virtual hosts, users, queues, exchanges, bindings, policies, and broker definitions while the server is running.

LavinMQ supports clustering for high availability, replicated queues, federation, shovels, and a streams feature for log-style consumption. Configuration can be provided through an INI file or overridden on the command line, and the broker can be installed from native packages, built from source, or run as the official **cloudamqp/lavinmq** Docker image.

# CONFIGURATION

LavinMQ reads its settings from an INI file (typically **/etc/lavinmq/lavinmq.ini**) divided into sections such as **[main]**, **[mgmt]**, **[amqp]**, and **[mqtt]**. A minimal example:

```
[main]
data_dir = /var/lib/lavinmq
guest_only_loopback = true
log_level = info

[mgmt]
bind = 0.0.0.0
port = 15672
tls_port = 15671

[amqp]
bind = 0.0.0.0
port = 5672
tls_port = 5671
```

Any flag passed on the command line overrides the matching value from the configuration file. The default user **guest** with password **guest** is restricted to local connections unless **guest_only_loopback** is disabled.

# CAVEATS

The default **guest/guest** account is intended for local testing only and should be replaced before exposing the broker to the network. Although LavinMQ is largely compatible with RabbitMQ clients, some advanced RabbitMQ-specific features and plugins are not implemented. Persistent data is stored on disk per node, so an unclean shutdown of a non-clustered broker can require recovery on the next startup.

# HISTORY

**LavinMQ** was created by **CloudAMQP** (84codes) and first released as open source in **2022**. It originated from the company's experience operating large RabbitMQ clusters and aimed to provide a lighter, faster broker with the same wire protocol. Written in **Crystal** and licensed under the **Apache 2.0** license, the project has since added clustering, MQTT support, and a streams protocol.

# INSTALL

```brew: brew install lavinmq```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[rabbitmq-server](/man/rabbitmq-server)(1), [rabbitmqctl](/man/rabbitmqctl)(1), [mosquitto](/man/mosquitto)(8)
