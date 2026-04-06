# TAGLINE

Zabbix monitoring agent daemon

# TLDR

**Start agent**

```zabbix_agentd```

**With config file**

```zabbix_agentd -c [/etc/zabbix/zabbix_agentd.conf]```

**Foreground mode**

```zabbix_agentd -f```

**Test a single item key**

```zabbix_agentd -t [system.cpu.load]```

**Print all supported items with current values**

```zabbix_agentd -p```

**Validate configuration file**

```zabbix_agentd -T```

**Increase log level at runtime**

```zabbix_agentd -R log_level_increase```

# SYNOPSIS

**zabbix_agentd** [_-c config_] [_-f_] [_-t item_] [_options_]

# PARAMETERS

**-c**, **--config** _config-file_
> Use an alternate config file instead of the default (/usr/local/etc/zabbix_agentd.conf).

**-f**, **--foreground**
> Run agent in foreground instead of as a daemon.

**-p**, **--print**
> Print all known items and their current values, then exit.

**-t**, **--test** _item-key_
> Test a single item key and print the result, then exit.

**-R**, **--runtime-control** _runtime-option_
> Perform administrative functions. Options: userparameter_reload, log_level_increase[=target], log_level_decrease[=target].

**-T**, **--test-config**
> Validate configuration file and exit.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Output version information and exit.

# DESCRIPTION

**zabbix_agentd** is the Zabbix monitoring agent daemon that collects system metrics and sends them to a Zabbix server or proxy. It gathers data on CPU, memory, disk, network, and other system resources using built-in item keys.

The agent supports two operating modes: passive mode where the server queries the agent on demand, and active mode where the agent initiates connections and sends data at configured intervals. Custom monitoring can be added through user parameters, which define commands that the agent executes to collect application-specific metrics.

The **-t** flag tests individual item keys for troubleshooting, and **-p** prints all supported items with their current values. Runtime control commands via **-R** allow changing log levels and reloading configuration without restarting the daemon.

# CAVEATS

Requires a Zabbix server or proxy to receive collected data. A configuration file is needed; the default path is /usr/local/etc/zabbix_agentd.conf. Some item keys require root privileges. Runtime control (-R) is not supported on OpenBSD, NetBSD, and Windows.

# HISTORY

**zabbix_agentd** is the agent daemon for **Zabbix**, an enterprise monitoring solution.

# SEE ALSO

[zabbix_server](/man/zabbix_server)(1), [zabbix_proxy](/man/zabbix_proxy)(1), [zabbix_get](/man/zabbix_get)(1)
