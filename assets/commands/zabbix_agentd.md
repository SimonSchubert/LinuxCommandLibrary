# TAGLINE

Zabbix monitoring agent daemon

# TLDR

**Start agent**

```zabbix_agentd```

**With config file**

```zabbix_agentd -c [/etc/zabbix/zabbix_agentd.conf]```

**Foreground mode**

```zabbix_agentd -f```

**Test item**

```zabbix_agentd -t "[system.cpu.load]"```

**Print item**

```zabbix_agentd -p```

# SYNOPSIS

**zabbix_agentd** [_-c config_] [_-f_] [_-t item_] [_options_]

# PARAMETERS

**-c** _FILE_
> Config file.

**-f**
> Foreground.

**-t** _ITEM_
> Test item.

**-p**
> Print values.

**-R** _CMD_
> Runtime control.

# DESCRIPTION

**zabbix_agentd** is the Zabbix monitoring agent daemon that collects system metrics and sends them to a Zabbix server or proxy. It gathers data on CPU, memory, disk, network, and other system resources using built-in item keys.

The agent supports two operating modes: passive mode where the server queries the agent on demand, and active mode where the agent initiates connections and sends data at configured intervals. Custom monitoring can be added through user parameters, which define commands that the agent executes to collect application-specific metrics.

The **-t** flag tests individual item keys for troubleshooting, and **-p** prints all supported items with their current values. Runtime control commands via **-R** allow changing log levels and reloading configuration without restarting the daemon.

# CAVEATS

Zabbix server needed. Config required. Root for some items.

# HISTORY

**zabbix_agentd** is the agent daemon for **Zabbix**, an enterprise monitoring solution.

# SEE ALSO

[zabbix_server](/man/zabbix_server)(1), [zabbix_get](/man/zabbix_get)(1)
