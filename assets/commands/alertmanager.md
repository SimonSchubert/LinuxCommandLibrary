# TAGLINE

Handle alert deduplication, grouping, and routing for Prometheus

# TLDR

**Start Alertmanager** with default configuration

```alertmanager --config.file=[alertmanager.yml]```

**Start with custom storage path**

```alertmanager --config.file=[alertmanager.yml] --storage.path=[/var/lib/alertmanager]```

**Start in cluster mode** with peers

```alertmanager --config.file=[alertmanager.yml] --cluster.peer=[peer1:9094] --cluster.peer=[peer2:9094]```

**Validate configuration file**

```alertmanager --config.file=[alertmanager.yml] --config.check```

**Start with custom web listen address**

```alertmanager --config.file=[alertmanager.yml] --web.listen-address=[0.0.0.0:9093]```

# SYNOPSIS

**alertmanager** [_options_]

# PARAMETERS

**--config.file** _path_
> Path to the Alertmanager configuration file.

**--storage.path** _path_
> Directory for storing notification state and silences.

**--web.listen-address** _address_
> Address to listen on for the web UI and API (default: **:9093**).

**--web.external-url** _url_
> External URL for generating links back to Alertmanager.

**--cluster.listen-address** _address_
> Address for cluster communication (default: **0.0.0.0:9094**).

**--cluster.peer** _address_
> Initial peer addresses for cluster formation (repeatable).

**--cluster.advertise-address** _address_
> Address to advertise in the cluster.

**--log.level** _level_
> Log level: debug, info, warn, error.

**--log.format** _format_
> Log format: logfmt or json.

**--config.check**
> Validate configuration and exit.

# DESCRIPTION

**Alertmanager** handles alerts sent by Prometheus and other monitoring systems. It manages deduplication, grouping, silencing, inhibition, and routing of alerts to notification receivers such as email, Slack, PagerDuty, and webhooks.

When Prometheus detects a condition matching an alerting rule, it sends alerts to Alertmanager. Alertmanager groups related alerts together, waits for configured intervals to batch notifications, and routes them to appropriate receivers based on label matching rules.

Key features include **silences** to mute alerts during maintenance, **inhibition** rules to suppress alerts when related alerts are firing, and **high availability** through a gossip-based cluster protocol that ensures alerts are not duplicated across instances.

The web UI at the configured listen address provides alert management, silence creation, and cluster status visibility.

# CONFIGURATION

**/etc/alertmanager/alertmanager.yml**
> Main configuration file defining routes, receivers, inhibition rules, and notification templates.

# CAVEATS

Alertmanager requires a properly configured YAML file; invalid configuration prevents startup. Cluster mode requires all peers to be mutually reachable on the cluster port. Notification state is stored locally; losing storage can cause duplicate notifications. Time-based grouping may delay critical alerts if intervals are set too long.

# HISTORY

**Alertmanager** was developed by **SoundCloud** as part of the Prometheus ecosystem, first released in **2013**. It became a graduated project of the **Cloud Native Computing Foundation (CNCF)** alongside Prometheus in **2018**. The tool has evolved to support numerous notification integrations and high-availability deployments in modern cloud-native infrastructure.

# SEE ALSO

[prometheus](/man/prometheus)(1), [amtool](/man/amtool)(1), [grafana](/man/grafana)(1)
