# TAGLINE

Grafana Cloud CLI optimized for agentic usage

# TLDR

**Authenticate** to a Grafana Cloud or on-prem instance via browser OAuth

```gcx auth login --server [https://myorg.grafana.net]```

**Run a PromQL** metrics query over the last hour

```gcx metrics query '[rate(http_requests_total[5m])]' --since [1h]```

**Run a LogQL** logs query against Loki

```gcx logs query '[{app="api"} |= "error"]' --since [30m]```

**List alert rules** currently firing

```gcx alert rules list --state [firing]```

**Export dashboards and folders** to local YAML files

```gcx resources pull -p [./resources] -o [yaml]```

**Validate and push** local resources back to Grafana

```gcx resources push -p [./resources] --on-error [abort]```

**List Service Level** Objectives

```gcx slo definitions list```

**Ask the Grafana Assistant** a question

```gcx assistant prompt "[why is latency high on checkout?]"```

**Generate shell completions**

```gcx completion [bash]```

# SYNOPSIS

**gcx** _command_ [_subcommand_] [_options_] [_args_]

# PARAMETERS

**auth login** **--server** _URL_
> Start browser-based OAuth login against a Grafana instance.

**config set** _key value_
> Set a configuration value (e.g. **contexts.my-grafana.grafana.token**).

**config use-context** _name_
> Switch the active configuration context.

**config check**
> Verify the active authentication and connectivity.

**metrics query** _PROMQL_
> Execute a PromQL query against Prometheus / Mimir.

**logs query** _LOGQL_
> Execute a LogQL query against Loki.

**traces query** _QUERY_
> Query trace data from Tempo.

**profiles query** _QUERY_
> Query profiling data from Pyroscope.

**alert rules list** [**--state** _STATE_]
> Display alert rules and their state, health, and pause status.

**alert groups list**
> Show alert groups.

**resources pull** [**-p** _DIR_] [**-o** _FORMAT_]
> Export dashboards, folders, and other resources to local files.

**resources push** [**-p** _DIR_] [**--dry-run**] [**--on-error** _MODE_]
> Deploy local resources back to Grafana.

**resources delete**, **edit**, **validate**, **get**
> Manage resources: remove, interactively modify, check, or list them.

**slo definitions list**, **slo reports list**
> Manage Service Level Objectives.

**synth checks list**, **synth probes list**
> Synthetic monitoring checks and probes.

**irm oncall schedules list**, **irm incidents list**
> Incident response and on-call management.

**k6 load-tests list**, **k6 runs list**
> Load testing with k6.

**fleet pipelines list**, **fleet collectors list**
> Fleet management.

**kg status**, **kg search**, **kg entities show**
> Grafana knowledge graph.

**assistant investigations list**, **assistant prompt** _TEXT_
> Drive the Grafana Assistant AI.

**frontend apps list**
> Frontend observability.

**aio11y conversations list**, **aio11y agents list**
> AI observability.

**dev scaffold**, **dev import**, **dev serve**, **dev lint**
> Observability-as-code workflow: scaffold, import, live-reload, and lint.

**api** _PATH_
> Raw passthrough to the Grafana HTTP API.

**skills list**, **skills install**
> Show and deploy agent skill bundles.

**completion** _SHELL_
> Generate shell completions for bash, zsh, or fish.

**--since** _DURATION_
> Time window for queries (e.g. **1h**, **24h**).

**-o**, **--output** _FORMAT_
> Output format: _json_ or _yaml_.

**--dry-run**
> Preview changes without applying them.

**--on-error** _MODE_
> Error-handling strategy: _abort_, _fail_, or _ignore_.

**-p** _PATH_
> Resource directory used by _resources_ commands.

**-f** _FILE_
> Input file for _resources_ commands.

# DESCRIPTION

**gcx** is the official command-line interface for Grafana Cloud, with first-class support for querying signals (metrics, logs, traces, profiles), managing alert rules and SLOs, and performing observability-as-code workflows against dashboards and folders. It is designed to be usable both by humans and by agentic coding assistants that need structured access to production observability data.

Each Grafana product has its own top-level command (**metrics**, **logs**, **traces**, **profiles**, **alert**, **slo**, **synth**, **irm**, **k6**, **fleet**, **assistant**, and so on), and resources can be exported to local YAML or JSON with **gcx resources pull** and pushed back with **gcx resources push**, enabling GitOps-style management of Grafana objects.

# CONFIGURATION

Configuration is stored in contexts that point at a Grafana server and an authentication token:

```
gcx config set contexts.my-grafana.grafana.server [https://your-instance.grafana.net]
gcx config set contexts.my-grafana.grafana.token [your-service-account-token]
gcx config use-context [my-grafana]
```

Environment variables **GRAFANA_SERVER**, **GRAFANA_TOKEN**, and **GRAFANA_CLOUD_TOKEN** are honored as well, which is convenient for CI. Use **gcx config check** to verify the active credentials.

# CAVEATS

**gcx** supports Grafana Cloud, Grafana Enterprise, and Grafana OSS **12+**. Cloud-specific products (**slo**, **synth**, **irm**, parts of **fleet** and **kg**) require Grafana Cloud; feature availability varies by deployment type. Use service-account tokens rather than personal tokens for automation.

# HISTORY

**gcx** is published by **Grafana Labs** and is explicitly positioned as "optimized for agentic usage", closing the gap between AI coding tools that see only source code and production systems where the code actually runs.

# SEE ALSO

[grafana-cli](/man/grafana-cli)(1), [promtool](/man/promtool)(1), [logcli](/man/logcli)(1), [k6](/man/k6)(1)
