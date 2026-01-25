# TLDR

**Start Grafana server**

```grafana-server```

**Start with config file**

```grafana-server --config [/etc/grafana/grafana.ini]```

**Check version**

```grafana-server -v```

**Access web interface**

```http://localhost:3000```

# SYNOPSIS

**grafana-server** [_options_]

# PARAMETERS

**--config** _file_
> Configuration file path.

**--homepath** _path_
> Grafana home directory.

**--pidfile** _file_
> PID file path.

**-v**, **--version**
> Show version.

# DESCRIPTION

**Grafana** is an open-source analytics and visualization platform. It creates dashboards for monitoring metrics from data sources like Prometheus, InfluxDB, Elasticsearch, and many others.

Grafana provides rich visualization options including graphs, tables, heatmaps, and alerting. It's commonly used for infrastructure monitoring, application metrics, and business analytics.

# DEFAULT CREDENTIALS

```
URL: http://localhost:3000
Username: admin
Password: admin (change on first login)
```

# KEY FEATURES

- Multi-source dashboards
- Alerting with notifications
- User authentication and teams
- Plugin ecosystem
- Dashboard templating
- Annotations and annotations

# CAVEATS

Runs as service; requires systemd or init setup. Data sources need separate installation. Complex dashboards may impact performance. Consider security for internet exposure.

# HISTORY

Grafana was created by **Torkel Ödegaard** in **2014**, initially as a fork of Kibana for Graphite visualization. It grew into a leading visualization platform, with Grafana Labs founded in **2015** to support commercial development.

# SEE ALSO

[prometheus](/man/prometheus)(1), [influxd](/man/influxd)(1), [telegraf](/man/telegraf)(1)
