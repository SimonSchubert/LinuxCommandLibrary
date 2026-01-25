# TLDR

**Start filebeat** with default configuration

```filebeat```

**Start with a specific configuration** file

```filebeat -c [path/to/filebeat.yml]```

**Test configuration** file syntax

```filebeat test config```

**Test output connectivity** (Elasticsearch, Logstash, etc.)

```filebeat test output```

**Enable a module**

```filebeat modules enable [nginx]```

**List available modules**

```filebeat modules list```

**Set up dashboards and index templates**

```filebeat setup```

**Run once and exit** (process existing files)

```filebeat --once```

# SYNOPSIS

**filebeat** [_COMMAND_] [_FLAGS_]

# COMMANDS

**run**
> Run Filebeat (default command if none specified).

**test config**
> Test configuration file syntax.

**test output**
> Test connectivity to configured outputs.

**modules enable** _MODULE_...
> Enable one or more modules.

**modules disable** _MODULE_...
> Disable one or more modules.

**modules list**
> List available and enabled modules.

**setup**
> Set up index templates, dashboards, and pipelines.

**export config**
> Export current configuration to stdout.

**export template**
> Export index template to stdout.

**export dashboard**
> Export a Kibana dashboard to stdout.

# PARAMETERS

**-c** _FILE_
> Specify configuration file (default: filebeat.yml).

**-e**
> Log to stderr instead of syslog/file.

**--modules** _MODULES_
> Comma-separated list of modules to run.

**--once**
> Run harvesters once and exit when done.

**--path.config** _PATH_
> Path to configuration files.

**--path.data** _PATH_
> Path to data directory.

**--path.logs** _PATH_
> Path to log files.

**--strict.perms**
> Enforce strict permission checking on config files (default: true).

**-v**
> Enable verbose logging.

**-d** _SELECTOR_
> Enable debug output for specific components.

# DESCRIPTION

**Filebeat** is a lightweight log shipper from the Elastic Stack (ELK). It monitors log files, collects log events, and forwards them to Elasticsearch, Logstash, or other outputs for indexing and analysis.

Filebeat uses harvesters to read log files line by line and sends the data to configured outputs. It maintains state information to track read positions, ensuring reliable delivery even after restarts. Modules provide pre-built configurations for common applications like nginx, Apache, MySQL, and system logs.

Configuration is defined in filebeat.yml, specifying inputs (log paths), outputs (Elasticsearch/Logstash endpoints), and processing options.

# CAVEATS

Configuration files require strict permissions (owner read/write only) by default. When running via systemd, the -e flag may override logging settings. Modules must be enabled before use. Index templates and dashboards require Elasticsearch and Kibana connectivity during setup.

# HISTORY

Filebeat is part of the **Beats** family of lightweight data shippers developed by **Elastic**. It evolved from Logstash Forwarder (Lumberjack) to provide a more resource-efficient solution for log collection. The Beats platform was introduced around **2015**, with Filebeat becoming the primary choice for log shipping in the Elastic Stack.

# SEE ALSO

[metricbeat](/man/metricbeat)(1), [logstash](/man/logstash)(1), [elasticsearch](/man/elasticsearch)(1), [journalctl](/man/journalctl)(1)
