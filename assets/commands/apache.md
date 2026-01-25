# TLDR

**Start Apache** in the foreground

```apachectl start```

**Stop Apache** gracefully

```apachectl graceful-stop```

**Restart Apache** gracefully (finish current requests)

```apachectl graceful```

**Test configuration** for syntax errors

```apachectl configtest```

**Show Apache version**

```apachectl -v```

**Show compiled-in modules**

```apachectl -l```

**Show loaded modules**

```apachectl -M```

**Display full status** (requires mod_status)

```apachectl fullstatus```

# SYNOPSIS

**apachectl** _command_

**httpd** [**-d** _serverroot_] [**-f** _config_] [**-D** _parameter_]

# PARAMETERS

**start**
> Start the Apache httpd daemon.

**stop**
> Stop the daemon immediately.

**restart**
> Restart the daemon (abort current connections).

**graceful**
> Gracefully restart (finish current requests, then restart).

**graceful-stop**
> Gracefully stop (finish current requests, then stop).

**configtest**
> Check configuration file syntax.

**-v**
> Show version number.

**-V**
> Show version and build parameters.

**-l**
> List compiled-in modules.

**-M**
> List all loaded modules (static and shared).

**-t**
> Test configuration syntax.

**-S**
> Show parsed virtual host settings.

**-f** _file_
> Specify an alternate configuration file.

**-D** _name_
> Define a parameter for use in configuration conditionals.

# DESCRIPTION

**Apache HTTP Server** (httpd) is the world's most widely used web server software. It serves static and dynamic content over HTTP/HTTPS, supporting virtual hosting, URL rewriting, authentication, and extensive module-based extensibility.

The **apachectl** script provides a convenient interface for controlling the Apache daemon. It wraps the **httpd** binary with init-script-style commands for starting, stopping, and managing the server.

Configuration is primarily done through **httpd.conf** and related files in the Apache configuration directory. The modular architecture allows enabling features like SSL/TLS (mod_ssl), URL rewriting (mod_rewrite), proxying (mod_proxy), and dynamic content via CGI, PHP, or mod_wsgi.

Apache supports two primary Multi-Processing Modules: **prefork** (process-based) for compatibility and **event/worker** (threaded) for higher concurrency.

# CAVEATS

Configuration changes require a restart or reload. Syntax errors in configuration files prevent startup; always run **configtest** first. The **graceful** restart is preferred for production to avoid dropping active connections. Log files can grow large and require rotation.

# HISTORY

The Apache HTTP Server originated from the **NCSA HTTPd** server at the University of Illinois. In **1995**, a group of developers began collaborating on patches, leading to the "patchy server" name that became Apache. The **Apache Software Foundation** was formed in **1999** to support its development. Apache dominated web server market share for over two decades, though nginx has gained significant ground since **2010**.

# SEE ALSO

[nginx](/man/nginx)(8), [httpd](/man/httpd)(8), [htpasswd](/man/htpasswd)(1), [ab](/man/ab)(1)
