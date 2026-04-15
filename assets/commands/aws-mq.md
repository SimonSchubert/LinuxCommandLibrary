# TAGLINE

Manage Amazon MQ message brokers.

# TLDR

**List all brokers**

```aws mq list-brokers```

**Create an ActiveMQ broker**

```aws mq create-broker --broker-name [my-broker] --engine-type ACTIVEMQ --engine-version [5.17.6] --host-instance-type [mq.m5.large] --deployment-mode SINGLE_INSTANCE --users Username=[admin],Password=[password]```

**Create a RabbitMQ broker**

```aws mq create-broker --broker-name [my-broker] --engine-type RABBITMQ --engine-version [3.13] --host-instance-type [mq.m5.large] --deployment-mode SINGLE_INSTANCE --users Username=[admin],Password=[password]```

**Describe a broker** and get its details

```aws mq describe-broker --broker-id [broker-id]```

**List all configurations**

```aws mq list-configurations```

**Reboot a broker**

```aws mq reboot-broker --broker-id [broker-id]```

**Delete a broker**

```aws mq delete-broker --broker-id [broker-id]```

# SYNOPSIS

**aws mq** _command_ [_options_]

# DESCRIPTION

**aws mq** is the AWS CLI interface for Amazon MQ, a managed message broker service that supports **Apache ActiveMQ** and **RabbitMQ** engines. Amazon MQ provisions, operates, and maintains message brokers, handling infrastructure tasks like hardware provisioning, broker setup, software upgrades, and failure detection.

Amazon MQ provides compatibility with standard messaging APIs and protocols including JMS, NMS, AMQP, STOMP, MQTT, and WebSocket, allowing migration of existing messaging workloads to the cloud without rewriting application code.

Brokers can be deployed in **single-instance** mode for development or **active/standby** mode for production high availability across multiple Availability Zones.

# COMMANDS

**create-broker**
> Create a new message broker

**delete-broker**
> Delete an existing broker

**describe-broker**
> Get broker configuration, status, and endpoints

**list-brokers**
> List all brokers in the account

**reboot-broker**
> Restart a broker

**update-broker**
> Modify broker configuration and maintenance settings

**create-configuration**
> Create a broker configuration (ActiveMQ XML or RabbitMQ Cuttlefish)

**describe-configuration**
> Get details of a configuration

**list-configurations**
> List all configurations

**update-configuration**
> Update a configuration with a new revision

**create-user**
> Create a new ActiveMQ user on a broker

**delete-user**
> Delete an ActiveMQ user

**list-users**
> List all ActiveMQ users on a broker

**describe-user**
> Get details of an ActiveMQ user

# CAVEATS

Broker creation takes several minutes. Instance types and storage cannot be changed without downtime. ActiveMQ and RabbitMQ configurations differ significantly; user management commands only apply to ActiveMQ brokers, while RabbitMQ users are managed through the RabbitMQ web console. Maximum message size is limited by the engine (ActiveMQ defaults to 100MB, RabbitMQ to 128MB).

# HISTORY

Amazon MQ launched in **November 2017** with support for Apache ActiveMQ Classic. RabbitMQ engine support was added in **October 2020**. Support for ActiveMQ Artemis (the next-generation ActiveMQ) is not yet available through Amazon MQ.

# SEE ALSO

[aws](/man/aws)(1), [aws-sqs](/man/aws-sqs)(1), [aws-sns](/man/aws-sns)(1), [aws-kafka](/man/aws-kafka)(1)
