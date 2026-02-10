# TAGLINE

apache HTTP Server daemon

# TLDR

**Start Apache**

```sudo httpd```

**Test configuration**

```httpd -t```

**Start in foreground**

```httpd -X```

**Show compiled modules**

```httpd -M```

**Show version and build**

```httpd -V```

**Use specific config**

```httpd -f [/path/to/httpd.conf]```

**Graceful restart**

```httpd -k graceful```

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
> Signal (start, stop, restart, graceful).

**-D** _param_
> Define runtime parameter.

**-d** _dir_
> ServerRoot directory.

**-e** _level_
> Log level.

# CAVEATS

Configuration complex for beginners. Module compatibility varies. Performance tuning needed for high load. Security requires careful setup.

# HISTORY

**Apache HTTP Server** was started in **1995** based on NCSA HTTPd, becoming the most popular web server for decades. The **Apache Software Foundation** grew around it. The name comes from "a patchy server" due to its patch-based origins.

# SEE ALSO

[nginx](/man/nginx)(1), [apachectl](/man/apachectl)(1), [a2enmod](/man/a2enmod)(1), [htpasswd](/man/htpasswd)(1)
