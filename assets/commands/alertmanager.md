# TAGLINE

Handle alert deduplication, grouping, and routing for Prometheus

# TLDR

**Start Alertmanager** with default configuration

```alertmanager --config.file=[alertmanager.yml]```

**Start with custom storage path**

```alertmanager --config.file=[alertmanager.yml] --storage.path=[/var/lib/alertmanager]```

**Start in cluster mode** with peers

```alertmanager --config.file=[alertmanager.yml] --cluster.peer=[peer1:9094] --cluster.peer=[peer2:9094]```

**Validate a configuration file** with amtool

```amtool check-config [alertmanager.yml]```

**Start with custom web listen address**

```alertmanager --config.file=[alertmanager.yml] --web.listen-address=[0.0.0.0:9093]```

# SYNOPSIS

**alertmanager** [_options_]

# PARAMETERS

**--config.file** _path_
> Path to the Alertmanager configuration file.

**--storage.path** _path_
> Base path for data storage of notification state and silences (default: **data/**).

**--data.retention** _duration_
> How long to keep notification and silence data (default: **120h**).

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

**--web.route-prefix** _prefix_
> Prefix for the internal routes of web endpoints (defaults to the path of **--web.external-url**).

# DESCRIPTION

**Alertmanager** handles alerts sent by Prometheus and other monitoring systems. It manages deduplication, grouping, silencing, inhibition, and routing of alerts to notification receivers such as email, Slack, PagerDuty, and webhooks.

When Prometheus detects a condition matching an alerting rule, it sends alerts to Alertmanager. Alertmanager groups related alerts together, waits for configured intervals to batch notifications, and routes them to appropriate receivers based on label matching rules.

Key features include **silences** to mute alerts during maintenance, **inhibition** rules to suppress alerts when related alerts are firing, and **high availability** through a gossip-based cluster protocol that ensures alerts are not duplicated across instances.

The web UI at the configured listen address provides alert management, silence creation, and cluster status visibility.

# CONFIGURATION

**/etc/alertmanager/alertmanager.yml**
> Main configuration file defining routes, receivers, inhibition rules, and notification templates.

# CAVEATS

Alertmanager requires a properly configured YAML file; invalid configuration prevents startup. The binary has no dedicated config-check flag; validate configuration with **amtool check-config** before deploying. Cluster mode requires all peers to be mutually reachable on the cluster port. Notification state is stored locally; losing storage can cause duplicate notifications. Time-based grouping may delay critical alerts if intervals are set too long.

# HISTORY

**Alertmanager** was developed by **SoundCloud** as part of the Prometheus ecosystem, first released in **2013**. It became a graduated project of the **Cloud Native Computing Foundation (CNCF)** alongside Prometheus in **2018**. The tool has evolved to support numerous notification integrations and high-availability deployments in modern cloud-native infrastructure.

# INSTALL

```dnf: sudo dnf install alertmanager```

```pacman: sudo pacman -S alertmanager```

```apk: sudo apk add alertmanager```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[prometheus](/man/prometheus)(1), [amtool](/man/amtool)(1), [grafana](/man/grafana)(1)

# RESOURCES

```[Source code](https://github.com/prometheus/alertmanager)```

```[Homepage](https://prometheus.io/)```

```[Documentation](https://prometheus.io/docs/alerting/latest/alertmanager/)```

<!-- verified: 2026-06-11 -->
