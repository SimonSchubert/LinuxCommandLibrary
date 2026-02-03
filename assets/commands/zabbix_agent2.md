# TLDR

**Start agent in foreground**

```zabbix_agent2 -f```

**Start with config file**

```zabbix_agent2 -c [/etc/zabbix/zabbix_agent2.conf]```

**Test configuration**

```zabbix_agent2 -t [system.cpu.load]```

**Print all items**

```zabbix_agent2 -p```

**Run remote command**

```zabbix_agent2 -R [log_level_increase]```

# SYNOPSIS

**zabbix_agent2** [_options_]

# PARAMETERS

**-c** _file_
> Configuration file path.

**-f**
> Run in foreground.

**-t** _item_
> Test specific item key.

**-p**
> Print supported items.

**-R** _command_
> Runtime control command.

**-V**
> Show version.

# DESCRIPTION

**zabbix_agent2** is the next-generation Zabbix monitoring agent written in Go. Collects system metrics and sends them to Zabbix server. Supports plugins and concurrent checks.

# SEE ALSO

[zabbix_agentd](/man/zabbix_agentd)(1), [zabbix_sender](/man/zabbix_sender)(1)

