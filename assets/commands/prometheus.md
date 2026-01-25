# TLDR

**Start Prometheus**

```prometheus --config.file=[prometheus.yml]```

**Start with storage path**

```prometheus --config.file=[prometheus.yml] --storage.tsdb.path=[/data]```

**Specify retention**

```prometheus --storage.tsdb.retention.time=[15d]```

**Enable web admin API**

```prometheus --web.enable-admin-api```

# SYNOPSIS

**prometheus** [_options_]

# PARAMETERS

**--config.file** _file_
> Configuration file.

**--storage.tsdb.path** _path_
> Data storage directory.

**--storage.tsdb.retention.time** _duration_
> Data retention period.

**--web.listen-address** _addr_
> Listen address.

**--web.enable-admin-api**
> Enable admin endpoints.

**--log.level** _level_
> Log verbosity.

# DESCRIPTION

**Prometheus** is a monitoring and alerting toolkit that collects metrics from configured targets, stores them, and makes them available for querying and alerting.

# EXAMPLES

```bash
# Start with config
prometheus --config.file=prometheus.yml

# Custom port
prometheus --web.listen-address=":9191" \
  --config.file=prometheus.yml

# With retention
prometheus --storage.tsdb.retention.time=30d \
  --config.file=prometheus.yml
```

# CONFIGURATION

```yaml
global:
  scrape_interval: 15s

scrape_configs:
  - job_name: 'prometheus'
    static_configs:
      - targets: ['localhost:9090']
```

# CAVEATS

Requires configuration file. Default port 9090. Use with Grafana for visualization.

# HISTORY

Prometheus was created at **SoundCloud** starting in 2012 and joined the **CNCF** in 2016 as the second hosted project.

# SEE ALSO

[grafana](/man/grafana)(1), [alertmanager](/man/alertmanager)(1), [node_exporter](/man/node_exporter)(1)
