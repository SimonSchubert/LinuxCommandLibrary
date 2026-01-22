# TLDR

**Start** the Apache daemon

```sudo apache2ctl start```

**Stop** the Apache daemon

```sudo apache2ctl stop```

**Restart** the Apache daemon

```sudo apache2ctl restart```

Test **syntax** of the configuration file

```sudo apache2ctl -t```

List **loaded modules**

```sudo apache2ctl -M```

Restart **gracefully** without dropping connections

```sudo apache2ctl graceful```

# SYNOPSIS

**apache2ctl** _command_

**apache2ctl** [_httpd-argument_]

# DESCRIPTION

**apache2ctl** is a front end to the Apache HyperText Transfer Protocol (HTTP) server designed to help administrators manage the Apache daemon. This command comes with Debian-based operating systems; for RHEL-based ones see **httpd**.

# PARAMETERS

**start**
> Start the Apache daemon; errors if already running

**stop**
> Stop the Apache daemon

**restart**
> Restart Apache via SIGHUP; includes config validation

**graceful**
> Restart without terminating active connections

**graceful-stop**
> Stop Apache without aborting current connections

**status**
> Show brief operational status report

**fullstatus**
> Display comprehensive status via mod_status (requires lynx)

**configtest**
> Validate syntax in configuration files

**-t**
> Test configuration file syntax

**-M**
> List loaded modules

**-S**
> Print full Apache configuration

# CAVEATS

Debian requires environment variables **APACHE_RUN_USER**, **APACHE_RUN_GROUP**, and **APACHE_PID_FILE** set in /etc/apache2/envvars.

# HISTORY

Part of the **Apache HTTP Server** project, one of the oldest and most widely used web servers, developed by the Apache Software Foundation.

# SEE ALSO

[apachectl](/man/apachectl)(8), [a2enmod](/man/a2enmod)(8), [a2dismod](/man/a2dismod)(8), [a2ensite](/man/a2ensite)(8), [httpd](/man/httpd)(8)
