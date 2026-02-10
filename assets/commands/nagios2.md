# TAGLINE

IT infrastructure monitoring system

# TLDR

**Start Nagios**

```nagios [/etc/nagios/nagios.cfg]```

**Verify configuration**

```nagios -v [/etc/nagios/nagios.cfg]```

**Run as daemon**

```nagios -d [/etc/nagios/nagios.cfg]```

# SYNOPSIS

**nagios** [_options_] _config_file_

# PARAMETERS

**-v**
> Verify configuration.

**-d**
> Run as daemon.

**-s**
> Show scheduling information.

**-p**
> Show projected/pending events.

# DESCRIPTION

**nagios** (version 2) is an IT infrastructure monitoring system. Monitors hosts, services, and network devices. Provides alerting and reporting for system administrators. Nagios 2 is legacy; consider upgrading to Nagios 4.

# SEE ALSO

[nagios4](/man/nagios4)(1), [icinga](/man/icinga)(1)

