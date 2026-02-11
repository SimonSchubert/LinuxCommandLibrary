# TAGLINE

Apache Pulsar cluster administration tool

# TLDR

**List tenants**

```pulsar-admin tenants list```

**List namespaces in tenant**

```pulsar-admin namespaces list [tenant]```

**List topics in namespace**

```pulsar-admin topics list [tenant/namespace]```

**Create a topic**

```pulsar-admin topics create persistent://[tenant]/[namespace]/[topic]```

**Produce a message**

```pulsar-client produce [topic] -m "[message]"```

**Consume messages**

```pulsar-client consume [topic] -s [subscription] -n [10]```

**Get topic stats**

```pulsar-admin topics stats [topic]```

**Check broker status**

```pulsar-admin brokers list [cluster]```

# SYNOPSIS

**pulsar-admin** _command_ [_options_]

**pulsar-client** produce|consume [_options_]

# ADMIN COMMANDS

**tenants** list|create|delete|get|update
> Manage tenants (multi-tenancy).

**namespaces** list|create|delete|policies
> Manage namespaces.

**topics** list|create|delete|stats|subscriptions
> Manage topics and subscriptions.

**brokers** list|leader|namespaces
> Broker information.

**clusters** list|create|delete|update
> Cluster management.

**functions** create|delete|list|status
> Manage Pulsar Functions.

**sources**/**sinks** create|delete|list
> Manage IO connectors.

# PARAMETERS

**--admin-url** _url_
> Pulsar admin service URL.

**--url** _url_
> Broker service URL (for client).

**--auth-plugin** _class_
> Authentication plugin class.

**--auth-params** _params_
> Authentication parameters.

**-m**, **--messages** _message_
> Message content for produce.

**-s**, **--subscription** _name_
> Subscription name for consume.

**-n**, **--num-messages** _count_
> Number of messages to consume.

**-r**, **--rate** _msgs/sec_
> Message rate limit.

# DESCRIPTION

**pulsar-admin** manages Apache Pulsar clusters, handling tenants, namespaces, topics, and cluster configuration. **pulsar-client** provides simple produce/consume operations.

Pulsar's multi-tenancy model organizes resources: clusters contain tenants, tenants contain namespaces, namespaces contain topics. Each level has configurable policies.

Topics use the format **persistent://tenant/namespace/topic** (or **non-persistent://**). Subscriptions define how consumers receive messages: exclusive, shared, failover, or key_shared.

**pulsar-admin topics stats** shows message rates, storage size, subscriptions, and producer/consumer connections. This helps monitor topic health.

Pulsar Functions enable lightweight stream processing directly on the broker. Sources and sinks connect external systems for data ingestion and export.

# CAVEATS

Requires proper authentication configuration for secured clusters. Topic creation may be automatic depending on broker settings. Namespace policies affect all topics within. Functions require function worker to be enabled.

# HISTORY

Apache Pulsar was originally developed at **Yahoo!** and open-sourced in **2016**. It became an Apache top-level project in **2018**. Designed for multi-tenancy and geo-replication, Pulsar separates storage (BookKeeper) from serving (brokers). It offers features like topic compaction, tiered storage, and built-in schema registry. StreamNative provides commercial support.

# SEE ALSO

[kafka-console-producer](/man/kafka-console-producer)(1), [nats](/man/nats)(1), [rabbitmqctl](/man/rabbitmqctl)(1)
