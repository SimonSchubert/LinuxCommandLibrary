# TAGLINE

IT infrastructure monitoring system

# TLDR

**Start Nagios with a configuration file**

```nagios [/etc/nagios/nagios.cfg]```

**Verify configuration file for errors**

```nagios -v [/etc/nagios/nagios.cfg]```

**Run Nagios as a daemon in the background**

```nagios -d [/etc/nagios/nagios.cfg]```

**Show scheduling information**

```nagios -s [/etc/nagios/nagios.cfg]```

# SYNOPSIS

**nagios** [_options_] _config_file_

# PARAMETERS

**-v**
> Verify configuration file for errors without starting.

**-d**
> Run as a daemon (background process).

**-s**
> Show scheduling information.

**-p**
> Show projected/pending events.

# DESCRIPTION

**nagios** (version 2) is an IT infrastructure monitoring system. It monitors hosts, services, and network devices, providing alerting and reporting for system administrators. Nagios checks are performed by plugins, with results determining host/service states. Nagios 2 is legacy; consider upgrading to Nagios 4.

# CAVEATS

Nagios 2 is no longer maintained and lacks features and security updates available in Nagios 4. Migration to Nagios 4 or alternatives like Icinga is strongly recommended.

# SEE ALSO

[nagios4](/man/nagios4)(1), [nagios](/man/nagios)(1)
