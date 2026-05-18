# TAGLINE

IT infrastructure monitoring system

# TLDR

**Verify configuration**

```nagios3 -v [/etc/nagios3/nagios.cfg]```

**Start Nagios**

```nagios3 [/etc/nagios3/nagios.cfg]```

**Run as daemon**

```nagios3 -d [/etc/nagios3/nagios.cfg]```

# SYNOPSIS

**nagios3** [_options_] _config_file_

# PARAMETERS

**-v**
> Verify configuration.

**-d**
> Run as daemon.

**-s**
> Show scheduling information.

**--help**
> Show help.

# DESCRIPTION

**nagios3** is the version 3 daemon of the Nagios IT infrastructure monitoring system. It monitors hosts and services, schedules active checks, processes passive results, and triggers notifications when state transitions occur. Configuration is split across **nagios.cfg** (main settings), **resource.cfg** (macros and secrets), and object files defining hosts, services, contacts, and commands.

Use **-v** to validate configuration before restarting the daemon, **-d** to launch it as a daemon (typically managed by a service unit), and **-s** to display scheduling and load distribution information. Nagios 3 is a legacy release; new deployments should use Nagios 4 or Nagios Core's modern packaging.

# CAVEATS

No longer actively developed; security and bug fixes are limited. Configuration syntax differs from Nagios Core 4. The CGI web interface relies on httpd authentication and is not exposed over HTTPS by default.

# SEE ALSO

[nagios4](/man/nagios4)(1), [check_mk](/man/check_mk)(1), [naemon](/man/naemon)(1)

