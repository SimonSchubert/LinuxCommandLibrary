# TAGLINE

Server-side data processing pipeline for ingesting, transforming, and shipping data

# TLDR

**Start Logstash with a config file**

```logstash -f [/path/to/config.conf]```

**Test configuration syntax**

```logstash -t -f [/path/to/config.conf]```

**Start with inline config**

```logstash -e 'input { stdin {} } output { stdout {} }'```

**Start with config directory**

```logstash -f [/etc/logstash/conf.d/]```

**Start with specific pipeline settings**

```logstash -f [config.conf] --pipeline.workers [4]```

**Reload config automatically**

```logstash -f [config.conf] --config.reload.automatic```

**List installed plugins**

```logstash-plugin list```

**Install a plugin**

```logstash-plugin install [logstash-filter-json]```

# SYNOPSIS

**logstash** [_-f config_] [_-e string_] [_-t_] [_--pipeline.workers num_] [_options_]

# PARAMETERS

**-f**, **--path.config** _PATH_
> Path to config file or directory.

**-e**, **--config.string** _CONFIG_
> Inline configuration string.

**-t**, **--config.test_and_exit**
> Test configuration and exit.

**-r**, **--config.reload.automatic**
> Automatically reload config on changes.

**--config.reload.interval** _SECONDS_
> Config reload check interval.

**-w**, **--pipeline.workers** _NUM_
> Number of pipeline worker threads.

**-b**, **--pipeline.batch.size** _NUM_
> Events per batch.

**-u**, **--pipeline.batch.delay** _MS_
> Batch delay in milliseconds.

**-l**, **--path.logs** _PATH_
> Log file directory.

**--log.level** _LEVEL_
> Log level: fatal, error, warn, info, debug, trace.

**--path.data** _PATH_
> Data directory path.

**--path.plugins** _PATH_
> Custom plugins directory.

**-n**, **--node.name** _NAME_
> Node name for cluster identification.

**--api.http.host** _HOST_
> Monitoring API host (default: 127.0.0.1).

**--api.http.port** _PORT_
> Monitoring API port (default: 9600).

**--path.settings** _DIR_
> Directory containing logstash.yml.

**-V**, **--version**
> Display version.

**-h**, **--help**
> Display help.

# DESCRIPTION

**Logstash** is a server-side data processing pipeline that ingests data from multiple sources, transforms it, and sends it to various destinations. It is part of the Elastic Stack (ELK: Elasticsearch, Logstash, Kibana).

Configuration uses three sections: **input** (data sources like files, beats, syslog), **filter** (transformations like grok, mutate, geoip), and **output** (destinations like Elasticsearch, file, stdout). Configs use a Ruby-like DSL.

The grok filter is particularly powerful for parsing unstructured log data into structured fields using pattern matching. Common patterns for web logs, syslog, and other formats are included.

Multiple pipelines can run simultaneously with separate configurations defined in `pipelines.yml`. Pipeline-to-pipeline communication allows complex routing. Persistent queues provide durability across restarts.

Plugins extend functionality: hundreds of input, filter, and output plugins are available via `logstash-plugin`. The codec system handles data serialization (JSON, multiline, etc.).

# CAVEATS

JVM-based with significant memory requirements (1GB+ heap typical). Startup is slow. Complex grok patterns can be CPU-intensive. Configuration errors only surface at startup or reload. Plugin compatibility varies with Logstash versions.

# HISTORY

**Logstash** was created by **Jordan Sissel** in **2009** as a tool for managing logs and events. Originally independent, it was acquired by **Elastic** (then Elasticsearch) in **2013** and became a core part of the ELK Stack. The project evolved from a simple log shipper to a full data processing pipeline, with major rewrites including the move to a persistent queue architecture.

# INSTALL

```brew: brew install logstash```

```nix: nix profile install nixpkgs#logstash```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[filebeat](/man/filebeat)(1), [elasticsearch](/man/elasticsearch)(1)
