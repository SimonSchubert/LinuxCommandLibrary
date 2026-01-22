# TLDR

**Start** the server

```sudo apachectl start```

**Restart** the server

```sudo apachectl restart```

**Stop** the server

```sudo apachectl stop```

Test **configuration file** validity

```apachectl configtest```

Check server **status** (requires lynx browser)

```apachectl status```

**Reload** configuration without dropping connections

```sudo apachectl graceful```

Print full **Apache configuration**

```apachectl -S```

# SYNOPSIS

**apachectl** _command_

**apachectl** [_httpd-argument_]

# DESCRIPTION

**apachectl** is a front end to the Apache HyperText Transfer Protocol (HTTP) server designed to help administrators manage the Apache daemon. It can operate in SysV init mode with simple commands or pass arguments directly to httpd.

# PARAMETERS

**start**
> Start the Apache daemon

**stop**
> Stop the Apache daemon

**restart**
> Restart Apache; starts if not running

**graceful**
> Graceful restart without terminating active connections

**graceful-stop**
> Graceful stop without aborting current connections

**configtest**
> Validate syntax in configuration files

**status**
> Display brief operational status (requires lynx and mod_status)

**fullstatus**
> Display comprehensive status report

**-S**
> Print full Apache configuration (parsed vhosts)

**-t**
> Test configuration syntax

**-M**
> List loaded modules

**-h**
> Display help

# CAVEATS

The **status** and **fullstatus** commands require the lynx text browser and mod_status to be enabled.

# HISTORY

Part of the **Apache HTTP Server** project, developed by the Apache Software Foundation since **1995**.

# SEE ALSO

[apache2ctl](/man/apache2ctl)(8), [httpd](/man/httpd)(8)
