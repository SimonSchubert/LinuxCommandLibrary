# TAGLINE

Central Zabbix monitoring server daemon

# TLDR

**Start server**

```zabbix_server```

**With config file**

```zabbix_server -c [/etc/zabbix/zabbix_server.conf]```

**Foreground mode**

```zabbix_server -f```

**Runtime control**

```zabbix_server -R [config_cache_reload]```

# SYNOPSIS

**zabbix_server** [_-c config_] [_-f_] [_-R command_] [_options_]

# PARAMETERS

**-c** _FILE_
> Config file.

**-f**
> Foreground.

**-R** _CMD_
> Runtime command.

**-h**
> Show help.

**-V**
> Show version.

# DESCRIPTION

**zabbix_server** is the central daemon of the Zabbix monitoring system. It receives monitoring data from agents and proxies, evaluates trigger conditions, processes alerts, and stores historical data in its backend database.

The server coordinates all monitoring activity: it schedules checks, processes incoming data, detects threshold violations, and sends notifications through configured media types (email, SMS, scripts, webhooks). It requires a database backend (MySQL, PostgreSQL, or Oracle) for storing configuration and collected metrics.

The web frontend is a separate component that connects to the same database, providing the graphical interface for configuration and visualization. Runtime control commands via **-R** allow reloading configuration caches and adjusting log levels without restarting the service.

# CAVEATS

Database required. Config needed. Resource intensive.

# HISTORY

**zabbix_server** is the core of **Zabbix**, an open-source enterprise monitoring platform.

# SEE ALSO

[zabbix_agentd](/man/zabbix_agentd)(1), [zabbix_proxy](/man/zabbix_proxy)(1)
