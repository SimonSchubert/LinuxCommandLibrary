# TLDR

**Get CPU load from agent**

```zabbix_get -s [192.168.1.10] -k "system.cpu.load[all,avg1]"```

**Get data from specific port**

```zabbix_get -s [host] -p [10050] -k "[agent.version]"```

**Get disk free space**

```zabbix_get -s [host] -k "vfs.fs.size[/,free]"```

**Get with timeout**

```zabbix_get -s [host] -t [60] -k "[key]"```

**Get using TLS PSK**

```zabbix_get -s [host] --tls-connect psk --tls-psk-identity [id] --tls-psk-file [psk.txt] -k "[key]"```

# SYNOPSIS

**zabbix_get** -s _host_ -k _key_ [_options_]

# PARAMETERS

**-s**, **--host** _host_
> Host name or IP address of Zabbix agent.

**-p**, **--port** _port_
> Port number (default: 10050).

**-k**, **--key** _key_
> Item key to retrieve.

**-I**, **--source-address** _ip_
> Source IP address for connection.

**-t**, **--timeout** _seconds_
> Timeout (1-600, default: 30).

**--tls-connect** _mode_
> Connection type: unencrypted, psk, or cert.

**--tls-psk-identity** _id_
> PSK identity string.

**--tls-psk-file** _file_
> File containing pre-shared key.

**-V**, **--version**
> Display version.

# DESCRIPTION

**zabbix_get** retrieves data from Zabbix agents for testing and troubleshooting. It performs passive checks, querying agents for specific item values using the same protocol as Zabbix server.

The tool helps verify agent configuration and connectivity before adding hosts to monitoring. The requesting host must be listed in the agent's Server configuration parameter.

Common use cases include testing new item keys, verifying agent responses, and debugging collection issues without accessing the Zabbix frontend.

# EXIT STATUS

Returns 0 on success, 1 if value retrieval failed.

# CAVEATS

Requesting host must be in agent's Server parameter. Only works with Zabbix agents, not other monitoring protocols. TLS requires matching configuration on both ends.

# HISTORY

**zabbix_get** is part of the Zabbix monitoring system, created by Alexei Vladishev in 2001. Zabbix has grown into one of the most popular enterprise monitoring solutions, with zabbix_get remaining essential for agent troubleshooting.

# SEE ALSO

[zabbix_agentd](/man/zabbix_agentd)(8), [zabbix_server](/man/zabbix_server)(8), [zabbix_proxy](/man/zabbix_proxy)(8)
