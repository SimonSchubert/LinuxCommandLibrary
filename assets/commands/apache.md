# TAGLINE

Control the Apache HTTP web server

# TLDR

**Start Apache** daemon

```apachectl start```

**Stop Apache** gracefully (finish current requests)

```apachectl graceful-stop```

**Gracefully restart** Apache (finish current requests, then restart)

```apachectl graceful```

**Test configuration** for syntax errors

```apachectl configtest```

**Show Apache version**

```apachectl -v```

**Show compiled-in modules**

```apachectl -l```

**Show all loaded modules** (static and shared)

```apachectl -M```

**Show parsed virtual host settings**

```apachectl -S```

# SYNOPSIS

**apachectl** _command_

**httpd** [**-d** _serverroot_] [**-f** _config_] [**-D** _parameter_]

# PARAMETERS

**start**
> Start the Apache httpd daemon.

**stop**
> Stop the daemon immediately.

**restart**
> Restart the daemon (aborts current connections).

**graceful**
> Gracefully restart (finish current requests, then restart).

**graceful-stop**
> Gracefully stop (finish current requests, then stop).

**configtest**
> Check configuration file syntax.

**fullstatus**
> Display full server status (requires **mod_status** and a text-based browser).

**-v**
> Show version number.

**-V**
> Show version and build parameters.

**-l**
> List compiled-in modules.

**-M**
> List all loaded modules (static and shared).

**-t**
> Test configuration syntax (same as configtest).

**-S**
> Show parsed virtual host settings.

**-f** _file_
> Specify an alternate configuration file.

**-D** _name_
> Define a parameter for use in configuration conditionals.

# DESCRIPTION

**Apache HTTP Server** (httpd) is one of the most widely used web server software packages. It serves static and dynamic content over HTTP/HTTPS, supporting virtual hosting, URL rewriting, authentication, and extensive module-based extensibility.

The **apachectl** script provides a convenient interface for controlling the Apache daemon. It can operate as a simple front-end to the **httpd** command, or act as a SysV init script translating one-word arguments like **start**, **restart**, and **stop** into appropriate signals.

Configuration is primarily done through **httpd.conf** and related files. The modular architecture allows enabling features like SSL/TLS (mod_ssl), URL rewriting (mod_rewrite), proxying (mod_proxy), and dynamic content via CGI, PHP, or mod_wsgi.

Apache supports multiple Multi-Processing Modules: **prefork** (process-based) for compatibility, **worker** (threaded), and **event** (threaded with improved keep-alive handling) for higher concurrency.

# CAVEATS

Configuration changes require a restart or reload. Syntax errors in configuration files prevent startup; always run **configtest** first. The **graceful** restart is preferred for production to avoid dropping active connections. Log files can grow large and require rotation. The **apachectl** script returns exit code 0 on success and >0 on error.

# HISTORY

The Apache HTTP Server originated from the **NCSA HTTPd** server at the University of Illinois. In **1995**, a group of developers began collaborating on patches, leading to the "patchy server" name that became Apache. The **Apache Software Foundation** was formed in **1999** to support its development. Apache dominated web server market share for over two decades, though nginx has gained significant ground since **2010**.

# SEE ALSO

[nginx](/man/nginx)(8), [httpd](/man/httpd)(8), [htpasswd](/man/htpasswd)(1), [ab](/man/ab)(1)
