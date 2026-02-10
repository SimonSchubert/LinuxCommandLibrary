# TAGLINE

current stable IT infrastructure monitoring system

# TLDR

**Verify configuration**

```nagios4 -v [/etc/nagios4/nagios.cfg]```

**Start Nagios**

```nagios4 [/etc/nagios4/nagios.cfg]```

**Run as daemon**

```nagios4 -d [/etc/nagios4/nagios.cfg]```

**Show version**

```nagios4 -V```

# SYNOPSIS

**nagios4** [_options_] _config_file_

# PARAMETERS

**-v**
> Verify configuration.

**-d**
> Run as daemon.

**-s**
> Show scheduling information.

**-p**
> Show pending events.

**-V**
> Show version.

**-W**
> Pre-cache objects.

# DESCRIPTION

**nagios4** (version 4) is the current stable IT infrastructure monitoring system. Monitors hosts, services, network devices, and applications. Provides alerting, reporting, and web interface.

# SEE ALSO

[icinga2](/man/icinga2)(1), [prometheus](/man/prometheus)(1)

