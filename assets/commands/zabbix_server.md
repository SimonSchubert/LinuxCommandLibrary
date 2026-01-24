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

**zabbix_server** runs Zabbix server. It processes monitoring.

Central server. Data collection.

Alert processing. Notifications.

Data storage. Database backend.

Web frontend. Separate component.

# CAVEATS

Database required. Config needed. Resource intensive.

# HISTORY

**zabbix_server** is the core of **Zabbix**, an open-source enterprise monitoring platform.

# SEE ALSO

[zabbix_agentd](/man/zabbix_agentd)(1), [zabbix_proxy](/man/zabbix_proxy)(1)
