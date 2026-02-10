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

**nagios3** (version 3) is an IT infrastructure monitoring system. Monitors hosts, services, and network devices. Provides alerting and reporting. Nagios 3 is legacy; consider upgrading to Nagios 4.

# SEE ALSO

[nagios4](/man/nagios4)(1), [icinga](/man/icinga)(1)

