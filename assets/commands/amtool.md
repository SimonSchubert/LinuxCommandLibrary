# TLDR

**List all current alerts**

```amtool alert```

**Query alerts matching a label**

```amtool alert query [alertname="HighMemory"]```

**Create a silence** for an alert

```amtool silence add [alertname="HighMemory"] --comment="[Maintenance]" --duration=[2h]```

**List all active silences**

```amtool silence query```

**Expire a silence** by ID

```amtool silence expire [silence_id]```

**Check Alertmanager configuration**

```amtool check-config [alertmanager.yml]```

**Show cluster status**

```amtool cluster show```

# SYNOPSIS

**amtool** _command_ [_options_] [_arguments_]

# PARAMETERS

**alert**
> Query and manage alerts.

**silence add** _matchers_
> Create a new silence matching the specified labels.

**silence query**
> List active silences.

**silence expire** _id_
> Remove a silence by its ID.

**check-config** _file_
> Validate an Alertmanager configuration file.

**cluster show**
> Display cluster membership status.

**config routes**
> Display routing tree from configuration.

**config routes test** _labels_
> Test which route matches given labels.

**--alertmanager.url** _url_
> Alertmanager URL (default: **http://localhost:9093**).

**--comment** _text_
> Comment for a silence (required).

**--author** _name_
> Author of a silence.

**--duration** _duration_
> Duration for a silence (e.g., 1h, 30m).

**-o**, **--output** _format_
> Output format: simple, extended, json.

# DESCRIPTION

**amtool** is the official command-line client for interacting with Prometheus Alertmanager. It provides capabilities for querying alerts, managing silences, testing routing configurations, and validating configuration files.

The tool connects to an Alertmanager instance via its HTTP API to perform operations. It is particularly useful for creating silences during maintenance windows, debugging alert routing, and integrating Alertmanager management into automation scripts.

Configuration can be validated offline using **check-config** without requiring a running Alertmanager instance. The **config routes test** command helps verify that alerts will be routed to expected receivers based on their labels.

# CAVEATS

Requires network access to the Alertmanager API endpoint. Silences require a comment; creating them without **--comment** will fail. The **--alertmanager.url** must be specified if Alertmanager is not running on localhost:9093. Configuration file validation may not catch all runtime issues.

# HISTORY

**amtool** was developed alongside Alertmanager as part of the Prometheus ecosystem. It was created to provide operators with a scriptable interface for alert management, complementing the web UI for automation and CI/CD integration. The tool is maintained by the Prometheus project and distributed as part of the Alertmanager release.

# SEE ALSO

[alertmanager](/man/alertmanager)(1), [prometheus](/man/prometheus)(1), [promtool](/man/promtool)(1)
