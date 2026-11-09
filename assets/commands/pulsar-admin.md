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

**Get topic stats**

```pulsar-admin topics stats persistent://[tenant]/[namespace]/[topic]```

**List active brokers** in a cluster

```pulsar-admin brokers list [cluster]```

**Run a broker health check**

```pulsar-admin brokers healthcheck```

**Create a tenant** with admin roles and allowed clusters

```pulsar-admin tenants create [tenant] --admin-roles [role1,role2] --allowed-clusters [cluster]```

**Set namespace retention policy**

```pulsar-admin namespaces set-retention [tenant/namespace] --size [10G] --time [3d]```

**Target a specific cluster** admin endpoint

```pulsar-admin --admin-url [http://broker:8080] tenants list```

# SYNOPSIS

**pulsar-admin** [_options_] _command_ _subcommand_ [_args_]

# ADMIN COMMANDS

**tenants** list|get|create|update|delete
> Manage tenants (multi-tenancy).

**namespaces** list|topics|policies|create|delete|set-retention|get-retention|set-message-ttl|set-backlog-quota
> Manage namespaces and their policies.

**topics** list|create|create-partitioned-topic|delete|lookup|stats|stats-internal|subscriptions|peek-messages
> Manage topics and subscriptions.

**brokers** list|leader-broker|namespaces|healthcheck|version|shutdown
> Broker information and dynamic configuration.

**clusters** list|get|create|update|delete
> Cluster management.

**functions** create|update|delete|get|list|status|stats|start|stop|restart|trigger|localrun
> Manage Pulsar Functions.

**sources**/**sinks** create|update|delete|get|list|status|start|stop|restart|localrun
> Manage IO connectors.

**schemas**, **bookies**, **packages**, **transactions**, **broker-stats**, **topicPolicies**, **resourcegroups**
> Further administrative areas.

# PARAMETERS

**--admin-url** _url_
> Pulsar admin service URL.

**--auth-plugin** _class_
> Authentication plugin class name.

**--auth-params** _params_
> Authentication parameters.

**--request-timeout** _seconds_
> Request timeout in seconds.

**--tls-trust-cert-path** _path_
> Path to the TLS trust certificate file.

**--tls-allow-insecure**
> Allow insecure TLS connections.

**--tls-enable-hostname-verification**
> Enable TLS hostname verification.

**-v**, **--version**
> Print the version.

# DESCRIPTION

**pulsar-admin** manages Apache Pulsar clusters, handling tenants, namespaces, topics, and cluster configuration. It provides administrative control over the entire Pulsar infrastructure.

Pulsar's multi-tenancy model organizes resources: clusters contain tenants, tenants contain namespaces, namespaces contain topics. Each level has configurable policies.

Topics use the format **persistent://tenant/namespace/topic** (or **non-persistent://**). Subscriptions define how consumers receive messages: exclusive, shared, failover, or key_shared.

**pulsar-admin topics stats** shows message rates, storage size, subscriptions, and producer/consumer connections. This helps monitor topic health.

Pulsar Functions enable lightweight stream processing directly on the broker. Sources and sinks connect external systems for data ingestion and export.

# CONFIGURATION

**conf/client.conf**
> Default connection settings such as **webServiceUrl**. Override the path with the **PULSAR_CLIENT_CONF** environment variable.

# CAVEATS

Requires proper authentication configuration for secured clusters. Topic creation may be automatic depending on broker settings. Namespace policies affect all topics within. Functions require function worker to be enabled.

# HISTORY

Apache Pulsar was originally developed at **Yahoo!** and open-sourced in **2016**. It became an Apache top-level project in **2018**. Designed for multi-tenancy and geo-replication, Pulsar separates storage (BookKeeper) from serving (brokers). It offers features like topic compaction, tiered storage, and built-in schema registry. StreamNative provides commercial support.

# SEE ALSO

[nats](/man/nats)(1), [rabbitmqctl](/man/rabbitmqctl)(1), [kafka-topics](/man/kafka-topics)(1)

# RESOURCES

```[Source code](https://github.com/apache/pulsar)```

```[Homepage](https://pulsar.apache.org/)```

```[Documentation](https://pulsar.apache.org/reference/)```

<!-- verified: 2026-11-09 -->
