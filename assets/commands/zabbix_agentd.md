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

**zabbix_agentd** collects metrics. It's the Zabbix agent.

System monitoring. Collect data.

Custom items. User parameters.

Active and passive. Both modes.

Remote commands. Execute actions.

# CAVEATS

Zabbix server needed. Config required. Root for some items.

# HISTORY

**zabbix_agentd** is the agent daemon for **Zabbix**, an enterprise monitoring solution.

# SEE ALSO

[zabbix_server](/man/zabbix_server)(1), [zabbix_get](/man/zabbix_get)(1)
