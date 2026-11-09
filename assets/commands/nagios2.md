# TAGLINE

IT infrastructure monitoring system

# TLDR

**Start Nagios with a configuration file**

```nagios2 [/etc/nagios2/nagios.cfg]```

**Verify configuration file for errors**

```nagios2 -v [/etc/nagios2/nagios.cfg]```

**Run Nagios as a daemon in the background**

```nagios2 -d [/etc/nagios2/nagios.cfg]```

**Show scheduling information**

```nagios2 -s [/etc/nagios2/nagios.cfg]```

# SYNOPSIS

**nagios2** [_options_] _config_file_

# PARAMETERS

**-v**
> Verify configuration file for errors without starting.

**-d**
> Run as a daemon (background process).

**-s**
> Show projected and recommended check scheduling based on the configuration.

**-h**
> Display a usage message.

# DESCRIPTION

**nagios2** is the Debian package and binary name of Nagios version 2, an IT infrastructure monitoring system. It monitors hosts, services, and network devices, providing alerting and reporting for system administrators. Nagios checks are performed by plugins, with results determining host/service states. Nagios 2 is legacy; consider upgrading to Nagios 4.

# CAVEATS

Nagios 2 is no longer maintained and lacks features and security updates available in Nagios 4. Migration to Nagios 4 or alternatives like Icinga is strongly recommended.

# SEE ALSO

[nagios4](/man/nagios4)(1), [nagios](/man/nagios)(1)

# RESOURCES

```[Source code](https://github.com/NagiosEnterprises/nagioscore)```

```[Homepage](https://www.nagios.org/projects/nagios-core/)```

<!-- verified: 2026-11-09 -->
