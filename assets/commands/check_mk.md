# TAGLINE

IT infrastructure monitoring tool

# TLDR

**Check a host manually**

```cmk -nv [hostname]```

**Discover services on a host**

```cmk -I [hostname]```

**Discover services on all hosts** (uses cached agent data)

```cmk -I```

**Rebuild the service list of a host from scratch**

```cmk -vII [hostname]```

**Update configuration and reload**

```cmk -O```

**Show agent output from a host**

```cmk -d [hostname]```

**List all hosts**

```cmk -l```

**Restart the monitoring core** with a new configuration

```cmk -R```

**Run a discovery check** for unmonitored services

```cmk --check-discovery [hostname]```

# SYNOPSIS

**cmk** [_options_] [_hostname_]

# PARAMETERS

**-I**, **--discover**
> Discover new services on hosts.

**-II**
> Tabula rasa: remove all automatically discovered services and discover them again.

**-n**
> Run checks without sending results to the core.

**-v**
> Verbose output; **-vv** adds more detail. Commonly combined as **-nv** for testing.

**-d** _HOSTNAME_
> Dump agent output from host.

**-O**, **--reload**
> Generate a new configuration and load it into the core without a full restart.

**-R**, **--restart**
> Generate a new configuration and restart the core.

**-U**
> Create a new configuration for the core without loading it.

**-N** [_HOSTNAME_]
> Output the Nagios configuration of the core.

**-D** _HOSTNAME_
> Show the host's configuration.

**-l**, **--list-hosts**
> List all configured hosts.

**-L**, **--list-checks**
> List all available check plugins.

**-M** _PLUGIN_
> Show the manual page of a check plugin.

**-V**
> Show the Checkmk version.

**--check-discovery** _HOSTNAME_
> Check a host for new and vanished services and host labels.

**--paths**
> Show Checkmk directory paths.

**--snmpwalk** _HOSTNAME_
> Perform an SNMP walk on a host for diagnostics.

**--cache**, **--no-cache**, **--no-tcp**
> Use cached agent data, ignore it, or avoid TCP connections to agents.

**--debug**
> Enable debug output.

# DESCRIPTION

**Checkmk** (formerly Check_MK) is a comprehensive IT monitoring solution built on Nagios monitoring core concepts. The **cmk** command is the central CLI tool for managing hosts, services, and configuration.

The system uses agents installed on monitored hosts that collect metrics and status information. The **cmk** command processes this data, discovers available services, performs checks, and manages the configuration.

The tool is also available under its long name **check_mk** and is normally run as the site user. Discovery (**cmk -I**) scans hosts for monitorable services. Configuration changes require activation with **cmk -O** or **cmk -R**. The tool supports distributed monitoring, agent bakery for deployment, and extensive plugin architecture.

# CONFIGURATION

**/omd/sites/&lt;site&gt;/etc/check_mk/main.mk**
> Main configuration file for host definitions, check parameters, and rules.

**/omd/sites/&lt;site&gt;/etc/check_mk/conf.d/**
> Directory for additional configuration files, often managed by the web interface.

# CAVEATS

Changes to configuration must be activated before taking effect. Extension packages are managed with the separate **mkp** command. The commercial editions have additional features not in Checkmk Community (called Raw Edition before version 2.5). Large-scale discoveries can be resource-intensive. Agent-based monitoring requires agents deployed on target hosts.

# HISTORY

Check_MK was created by **Mathias Kettner** in **2008** as an extension to Nagios to simplify configuration and improve performance. It evolved from a plugin to a complete monitoring solution. In **2019**, the project rebranded to **Checkmk** and tribe29 GmbH (now Checkmk GmbH) was founded. Checkmk Community remains open source under the GPL while commercial editions add enterprise features.

# SEE ALSO

[nagios](/man/nagios)(8), [icinga2](/man/icinga2)(8), [prometheus](/man/prometheus)(1)

# RESOURCES

```[Source code](https://github.com/Checkmk/checkmk)```

```[Homepage](https://checkmk.com)```

```[Documentation](https://docs.checkmk.com/latest/en/cmk_commandline.html)```

<!-- verified: 2026-11-09 -->
