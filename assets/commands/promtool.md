# TLDR

**Check Prometheus config syntax**

```promtool check config [prometheus.yml]```

**Check alerting rules**

```promtool check rules [rules.yml]```

**Test alerting rules**

```promtool test rules [test.yml]```

**Query Prometheus metrics**

```promtool query instant [http://localhost:9090] "[up]"```

**Query range of metrics**

```promtool query range [http://localhost:9090] "[up]" --start [1h]```

**Validate metrics exposition**

```curl -s [http://localhost:9100/metrics] | promtool check metrics```

**Debug metrics parsing**

```promtool debug metrics [http://localhost:9090]```

# SYNOPSIS

**promtool** _command_ _subcommand_ [_options_] [_arguments_]

# PARAMETERS

**check config** _FILE_
> Validate Prometheus configuration file.

**check rules** _FILES_
> Validate alerting/recording rules.

**check metrics**
> Validate metrics format from stdin.

**test rules** _FILES_
> Unit test alerting rules.

**query instant** _SERVER_ _QUERY_
> Execute instant query.

**query range** _SERVER_ _QUERY_
> Execute range query.

**query labels** _SERVER_ _LABEL_
> Query label values.

**query series** _SERVER_ _MATCH_
> Query time series.

**debug pprof** _TYPE_
> Get debug profiling data.

**debug metrics** _SERVER_
> Debug metrics endpoint.

**debug all** _SERVER_
> Get all debug information.

**tsdb** _subcommand_
> TSDB database operations.

**--start** _TIME_
> Query start time.

**--end** _TIME_
> Query end time.

**--step** _DURATION_
> Query step interval.

# DESCRIPTION

**promtool** is the command-line utility for Prometheus, the popular monitoring and alerting system. It validates configuration, tests rules, and queries metrics.

Configuration checking catches syntax errors and invalid settings before applying changes. This prevents Prometheus from failing to start due to configuration issues.

Rule validation ensures alerting and recording rules are syntactically correct. Combined with unit testing (test rules), you can verify alert behavior before deployment. Test files specify sample data and expected alert states.

Query commands execute PromQL queries against running Prometheus servers. Instant queries return current values; range queries return time series data. This enables scripting and automation around Prometheus data.

The tsdb subcommand provides direct TSDB (time series database) manipulation: analyzing, benchmarking, and maintaining the storage layer.

# CAVEATS

Requires Prometheus knowledge to use effectively. Query commands need running Prometheus server. Rule tests require careful test data construction. Some commands access remote servers. Output format varies by command.

# HISTORY

**promtool** is part of **Prometheus**, created at **SoundCloud** around **2012** by Matt T. Proud and Julius Volz. Prometheus was open-sourced in **2015** and joined CNCF in **2016**. The promtool utility evolved alongside Prometheus to provide operational tooling for configuration management and troubleshooting.

# SEE ALSO

[prometheus](/man/prometheus)(1), [alertmanager](/man/alertmanager)(1), [grafana](/man/grafana)(1)
