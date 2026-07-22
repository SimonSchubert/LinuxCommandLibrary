# TAGLINE

Manage Prometheus Alertmanager from the command line

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

**alert query**
> View and search through current alerts.

**alert add**
> Add a new alert to Alertmanager.

**silence add** _matchers_
> Create a new silence matching the specified labels.

**silence query**
> List active silences.

**silence update** _id_
> Update an existing silence (e.g., extend its duration).

**silence expire** _id_
> Remove a silence by its ID.

**silence import**
> Import silences from a JSON file or stdin.

**check-config** _file_
> Validate Alertmanager configuration files.

**cluster show**
> Display cluster membership status and peers.

**config show**
> Display the current Alertmanager configuration.

**config routes show**
> Display routing tree from configuration.

**config routes test** _labels_
> Test which route matches given labels.

**template render**
> Render a template definition for testing.

**--alertmanager.url** _url_
> Alertmanager URL (default: **http://localhost:9093/**).

**--comment** _text_
> Comment for a silence (required unless configured otherwise).

**--author** _name_
> Author of a silence (CreatedBy field).

**--duration** _duration_
> Duration for a silence (default: 1h, e.g., 30m, 2h).

**--end** _time_
> Set silence expiration as an RFC3339 timestamp.

**--timeout** _duration_
> Timeout for API requests (default: 30s).

**-o**, **--output** _format_
> Output format: simple, extended, json (default: simple).

# DESCRIPTION

**amtool** is the official command-line client for interacting with Prometheus Alertmanager. It provides capabilities for querying alerts, managing silences, testing routing configurations, and validating configuration files.

The tool connects to an Alertmanager instance via its HTTP API to perform operations. It is particularly useful for creating silences during maintenance windows, debugging alert routing, and integrating Alertmanager management into automation scripts.

Configuration can be validated offline using **check-config** without requiring a running Alertmanager instance. The **config routes test** command helps verify that alerts will be routed to expected receivers based on their labels.

# CONFIGURATION

**~/.config/amtool/config.yml**
> Persistent configuration for the Alertmanager URL, author, and output format defaults.

# CAVEATS

Requires network access to the Alertmanager API endpoint. Silences require a comment; creating them without **--comment** will fail. The **--alertmanager.url** must be specified if Alertmanager is not running on localhost:9093. Configuration file validation may not catch all runtime issues.

# HISTORY

**amtool** was developed alongside Alertmanager as part of the Prometheus ecosystem. It was created to provide operators with a scriptable interface for alert management, complementing the web UI for automation and CI/CD integration. The tool is maintained by the Prometheus project and distributed as part of the Alertmanager release.

# INSTALL

```apt: sudo apt install prometheus-alertmanager```

```dnf: sudo dnf install alertmanager```

```pacman: sudo pacman -S alertmanager```

```apk: sudo apk add alertmanager```

```nix: nix profile install nixpkgs#prometheus-alertmanager```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[alertmanager](/man/alertmanager)(1), [prometheus](/man/prometheus)(1), [promtool](/man/promtool)(1)

# RESOURCES

```[Source code](https://github.com/prometheus/alertmanager)```

```[Documentation](https://prometheus.io/docs/alerting/latest/alertmanager/)```

<!-- verified: 2026-06-11 -->
