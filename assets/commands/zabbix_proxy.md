# TAGLINE

Distributed Zabbix monitoring data proxy

# TLDR

**Start proxy daemon**

```sudo systemctl start zabbix-proxy```

**Run in foreground**

```zabbix_proxy -f```

**Use alternate config file**

```zabbix_proxy -c [/etc/zabbix/zabbix_proxy.conf]```

**Display runtime diagnostics**

```zabbix_proxy -R diaginfo```

**Reload configuration cache**

```zabbix_proxy -R config_cache_reload```

**Display version**

```zabbix_proxy -V```

# SYNOPSIS

**zabbix_proxy** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Use alternate configuration file.

**-f**, **--foreground**
> Run in foreground.

**-R**, **--runtime-control** _option_
> Runtime control command.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# RUNTIME CONTROL

**config_cache_reload**: Reload configuration cache.

**housekeeper_execute**: Start housekeeper.

**log_level_increase**: Increase log level.

**log_level_decrease**: Decrease log level.

**diaginfo**: Write diagnostic info to log.

# DESCRIPTION

**zabbix_proxy** is a daemon that collects monitoring data and forwards it to a Zabbix server. It's used for distributed monitoring of remote locations and reduces load on the central server.

The proxy collects data from agents, stores it locally in its database, then transmits to the server. This architecture survives temporary network outages and centralizes data collection for remote sites.

Proxies can operate in active mode (initiating connections to server) or passive mode (accepting connections from server). Each proxy requires its own database (SQLite, MySQL, or PostgreSQL).

# CAVEATS

Requires separate database from server. Cannot share database with server. Configuration changes may require cache reload. Memory buffer recommended for performance in Zabbix 7.0+.

# HISTORY

**zabbix_proxy** was added to Zabbix to enable distributed monitoring architectures. It allows organizations to monitor remote sites without direct server connectivity and reduces WAN bandwidth usage by compressing and batching data transfers.

# SEE ALSO

[zabbix_server](/man/zabbix_server)(8), [zabbix_agentd](/man/zabbix_agentd)(8), [zabbix_get](/man/zabbix_get)(1)
