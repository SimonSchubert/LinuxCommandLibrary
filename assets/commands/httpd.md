# TAGLINE

Apache HTTP Server daemon

# TLDR

**Start** the Apache HTTP server

```sudo httpd```

**Test** the configuration file syntax

```httpd -t```

**Start** in single-process debug mode (foreground)

```httpd -X```

**List all loaded** modules (static and shared)

```httpd -M```

**Show version** and build parameters

```httpd -V```

**Use a specific** configuration file

```httpd -f [/path/to/httpd.conf]```

**Send a signal** to a running instance (start, stop, restart, graceful)

```httpd -k [graceful]```

**Stop** Apache gracefully

```httpd -k graceful-stop```

# SYNOPSIS

**httpd** [_options_]

# DESCRIPTION

**httpd** is the Apache HTTP Server daemon. It serves web content using HTTP/HTTPS protocols, handling static files, CGI scripts, and reverse proxying.

Apache is highly configurable through modules and configuration directives, supporting virtual hosts, access control, and numerous authentication methods.

# PARAMETERS

**-t**
> Test configuration syntax.

**-T**
> Start without document check.

**-X**
> Run in single-process debug mode.

**-f** _file_
> Specify configuration file.

**-M**
> List loaded modules.

**-V**
> Show version and build info.

**-k** _signal_
> Send signal to running instance: start, stop, restart, graceful, graceful-stop.

**-D** _param_
> Define a runtime configuration parameter.

**-d** _dir_
> Set the ServerRoot directory.

**-e** _level_
> Set startup log level (debug, info, notice, warn, error, crit, alert, emerg).

**-n** _name_
> Set the service name (Windows only).

**-l**
> List compiled-in modules (static modules only).

# CAVEATS

Configuration can be complex for beginners due to the large number of directives and modules. Module compatibility varies between major versions. Performance tuning (MPM selection, worker/thread limits) is needed for high-traffic sites. On many Linux distributions, **apachectl** or **systemctl** is the preferred way to manage the service rather than invoking **httpd** directly. On Debian/Ubuntu, the binary is named **apache2** instead of **httpd**.

# HISTORY

**Apache HTTP Server** was started in **1995** based on NCSA HTTPd, becoming the most popular web server for decades. The **Apache Software Foundation** grew around it. The name comes from "a patchy server" due to its patch-based origins.

# SEE ALSO

[nginx](/man/nginx)(1), [apache2](/man/apache2)(1), [apachectl](/man/apachectl)(1), [a2enmod](/man/a2enmod)(1), [htpasswd](/man/htpasswd)(1), [caddy](/man/caddy)(1)
