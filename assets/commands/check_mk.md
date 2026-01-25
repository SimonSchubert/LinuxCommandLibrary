# TLDR

**Check a host manually**

```cmk -nv [hostname]```

**Discover services on a host**

```cmk -I [hostname]```

**Discover services on all hosts**

```cmk -I```

**Update configuration and reload**

```cmk -O```

**Show agent output from a host**

```cmk -d [hostname]```

**List all hosts**

```cmk --list-hosts```

**Activate changes**

```cmk -R```

# SYNOPSIS

**cmk** [_options_] [_hostname_]

# PARAMETERS

**-I**, **--discover**
> Discover new services on hosts.

**-II**
> Remove vanished services and discover new ones.

**-nv**
> Check host and show verbose output.

**-d**
> Dump agent output from host.

**-O**, **--reload**
> Reload configuration without restart.

**-R**, **--restart**
> Restart monitoring core.

**--list-hosts**
> List all configured hosts.

**--list-checks**
> List all available check plugins.

**--paths**
> Show Checkmk directory paths.

**-P**, **--package** _action_
> Manage extension packages (install, remove, list).

**--debug**
> Enable debug output.

# DESCRIPTION

**Checkmk** (formerly Check_MK) is a comprehensive IT monitoring solution built on Nagios monitoring core concepts. The **cmk** command is the central CLI tool for managing hosts, services, and configuration.

The system uses agents installed on monitored hosts that collect metrics and status information. The **cmk** command processes this data, discovers available services, performs checks, and manages the configuration.

Discovery (**cmk -I**) scans hosts for monitorable services. Configuration changes require activation with **cmk -O** or **cmk -R**. The tool supports distributed monitoring, agent bakery for deployment, and extensive plugin architecture.

# CAVEATS

Changes to configuration must be activated before taking effect. The commercial editions (CEE, CME) have additional features not in Raw Edition. Large-scale discoveries can be resource-intensive. Agent-based monitoring requires agents deployed on target hosts.

# HISTORY

Check_MK was created by **Mathias Kettner** in **2008** as an extension to Nagios to simplify configuration and improve performance. It evolved from a plugin to a complete monitoring solution. In **2019**, the project rebranded to **Checkmk** and tribe29 GmbH (now Checkmk GmbH) was founded. The Raw Edition remains open source while commercial editions add enterprise features.

# SEE ALSO

[nagios](/man/nagios)(8), [icinga2](/man/icinga2)(8), [prometheus](/man/prometheus)(1), [zabbix](/man/zabbix)(1)
