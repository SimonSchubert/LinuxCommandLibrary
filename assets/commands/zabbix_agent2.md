# TAGLINE

Next-generation Zabbix monitoring agent

# TLDR

**Start agent in foreground**

```zabbix_agent2 -f```

**Start with config file**

```zabbix_agent2 -c [/etc/zabbix/zabbix_agent2.conf]```

**Test a specific item key**

```zabbix_agent2 -t [system.cpu.load]```

**Print all supported items**

```zabbix_agent2 -p```

**Validate configuration file**

```zabbix_agent2 -T```

**Change log level at runtime**

```zabbix_agent2 -R [log_level_increase]```

**Reload user parameters at runtime**

```zabbix_agent2 -R userparameter_reload```

# SYNOPSIS

**zabbix_agent2** [_options_]

# PARAMETERS

**-c**, **--config** _file_
> Use alternate configuration file instead of the default one.

**-f**
> Run in foreground.

**-p**, **--print**
> Print known items and exit.

**-t** _item-key_
> Test a single item key and exit.

**-T**, **--test-config**
> Validate configuration file and exit.

**-R**, **--runtime-control** _option_
> Perform administrative functions. Options: log_level_increase, log_level_decrease, userparameter_reload, metrics, version, help.

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version information and exit.

# DESCRIPTION

**zabbix_agent2** is the next-generation Zabbix monitoring agent written in Go. Collects system metrics and sends them to Zabbix server. Supports plugins and concurrent checks.

# SEE ALSO

[zabbix_agentd](/man/zabbix_agentd)(1), [zabbix_get](/man/zabbix_get)(1), [zabbix_proxy](/man/zabbix_proxy)(1), [zabbix_server](/man/zabbix_server)(1)

