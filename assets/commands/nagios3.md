# TAGLINE

IT infrastructure monitoring system

# TLDR

**Verify configuration**

```nagios3 -v [/etc/nagios3/nagios.cfg]```

**Start Nagios**

```nagios3 [/etc/nagios3/nagios.cfg]```

**Run as daemon**

```nagios3 -d [/etc/nagios3/nagios.cfg]```

**Show scheduling** and estimated check load

```nagios3 -s [/etc/nagios3/nagios.cfg]```

**Precache object configuration** for faster startup

```nagios3 -pv [/etc/nagios3/nagios.cfg]```

# SYNOPSIS

**nagios3** [_options_] _config_file_

# PARAMETERS

**-v**, **--verify-config**
> Read all configuration data and report errors, then exit.

**-s**, **--test-scheduling**
> Show projected and recommended check scheduling information, then exit.

**-x**, **--dont-verify-paths**
> Skip circular path checks during startup. Use with care.

**-p**, **--precache-objects**
> Write a precached object file (combine with **-v** or **-s**).

**-u**, **--use-precached-objects**
> Start using the precached object file instead of parsing object configs.

**-d**, **--daemon**
> Run as a background daemon.

**-h**, **--help**
> Show help.

# DESCRIPTION

**nagios3** is the version 3 daemon of the Nagios IT infrastructure monitoring system. It monitors hosts and services, schedules active checks, processes passive results, and triggers notifications when state transitions occur. Configuration is split across **nagios.cfg** (main settings), **resource.cfg** (macros and secrets), and object files defining hosts, services, contacts, and commands.

Use **-v** to validate configuration before restarting the daemon, **-d** to launch it as a daemon (typically managed by a service unit), and **-s** to display scheduling and load distribution information. Nagios 3 is a legacy release; new deployments should use Nagios Core 4.

# CAVEATS

End of life: no longer developed and no longer receiving security fixes. The **nagios3** package was dropped from Debian 10 and Ubuntu 20.04 in favor of **nagios4**. Object configuration is largely compatible with Nagios Core 4, but some **nagios.cfg** directives were removed or renamed. The CGI web interface relies on web server authentication and is not exposed over HTTPS by default.

# HISTORY

Nagios 3.0 was released in **2008**; the last 3.x release, **3.5.1**, appeared in **2013**, after which development moved to Nagios Core 4. The **nagios3** binary name comes from Debian/Ubuntu packaging, which allowed it to coexist with older Nagios versions; upstream the binary is simply **nagios**.

# SEE ALSO

[nagios](/man/nagios)(8), [nagios4](/man/nagios4)(1), [check_mk](/man/check_mk)(1), [naemon](/man/naemon)(1)

# RESOURCES

```[Source code](https://github.com/NagiosEnterprises/nagioscore)```

```[Homepage](https://www.nagios.org/projects/nagios-core/)```

```[Documentation](https://assets.nagios.com/downloads/nagioscore/docs/nagioscore/3/en/)```

<!-- verified: 2026-11-23 -->
