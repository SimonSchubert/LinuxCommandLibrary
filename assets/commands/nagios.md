# TAGLINE

infrastructure monitoring system that tracks hosts, services, and network

# TLDR

**Verify configuration**

```nagios -v [/etc/nagios/nagios.cfg]```

**Start Nagios daemon**

```nagios -d [/etc/nagios/nagios.cfg]```

**Run in foreground**

```nagios [/etc/nagios/nagios.cfg]```

**Show version**

```nagios --version```

**Test scheduling**

```nagios -s [/etc/nagios/nagios.cfg]```

# SYNOPSIS

**nagios** [_-v_] [_-d_] [_-s_] [_config_file_]

# PARAMETERS

**-v**
> Verify configuration file.

**-d**
> Run as daemon.

**-s**
> Show scheduling information.

**-p** _FILE_
> Specify precached objects file.

**-u** _FILE_
> Specify precached macros file.

**-x** _FILE_
> Dump objects to file.

**--help**
> Display help.

**--version**
> Show version.

# DESCRIPTION

**nagios** is an infrastructure monitoring system that tracks hosts, services, and network devices. It alerts administrators when problems occur and when they're resolved.

Configuration defines hosts, services, and check commands. Plugins execute checks and return status codes: OK, WARNING, CRITICAL, or UNKNOWN. Notifications alert contacts through email, SMS, or custom methods.

The web interface displays current status, trends, and reports. It shows which services are up, which are down, and acknowledgements for known issues.

Active checks run on schedule. Passive checks receive results from external sources. Both integrate into the same status view.

Escalations route alerts to different people based on problem duration. Dependencies prevent notification storms when parent systems fail.

Performance data from checks can feed graphing tools like PNP4Nagios or Grafana for historical trending.

# CAVEATS

Configuration can be complex for large environments. Web interface requires separate web server. Many plugins available but quality varies. Consider successors like Icinga or Naemon.

# HISTORY

**Nagios** was created by **Ethan Galstad** in **1999** as NetSaint, renamed to Nagios in **2002**. It became the standard open-source monitoring system, spawning forks (Icinga, Naemon) and inspiring modern alternatives.

# SEE ALSO

[icinga2](/man/icinga2)(1), [naemon](/man/naemon)(8), [check_mk](/man/check_mk)(1), [prometheus](/man/prometheus)(1)
