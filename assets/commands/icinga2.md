# TLDR

**Check configuration**

```icinga2 daemon -C```

**Start Icinga 2**

```sudo systemctl start icinga2```

**Reload configuration**

```sudo systemctl reload icinga2```

**Show features**

```icinga2 feature list```

**Enable feature**

```sudo icinga2 feature enable [api]```

**List objects**

```icinga2 object list --type Host```

# SYNOPSIS

**icinga2** _command_ [_options_]

# PARAMETERS

**daemon** [**-C**]
> Run daemon (or check config with -C).

**feature** _subcommand_
> Manage features (list, enable, disable).

**object** _subcommand_
> Object management (list).

**node** _subcommand_
> Node/cluster management.

**pki** _subcommand_
> PKI/certificate management.

**console**
> Open debug console.

**--version**
> Show version.

# DESCRIPTION

**Icinga 2** is a monitoring system that checks availability of hosts and services. It supports distributed monitoring, advanced configurations, and integrates with various backends.

Icinga 2 uses a domain-specific language (DSL) for configuration, supporting templates, apply rules, and runtime modifications through its API.

# FEATURES

- Host and service monitoring
- Distributed/clustered setup
- REST API
- Graphite/InfluxDB integration
- Notification system
- Performance data

# CAVEATS

Configuration syntax differs from Icinga 1/Nagios. Cluster setup requires PKI. Large installations need tuning. Web interface (Icinga Web 2) installed separately.

# HISTORY

Icinga was forked from **Nagios** in **2009** due to disagreements about project governance. Icinga 2, released in **2014**, was a complete rewrite with modern architecture and new configuration language.

# SEE ALSO

[nagios](/man/nagios)(8), [prometheus](/man/prometheus)(1), [zabbix](/man/zabbix)(1)
