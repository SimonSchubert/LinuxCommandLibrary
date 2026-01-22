# TLDR

**Start** Apache server

```sudo apache2```

Start in **foreground** for debugging

```sudo apache2 -X```

Test **configuration syntax**

```apache2 -t```

Show **compiled modules**

```apache2 -M```

Show **version** and build options

```apache2 -V```

Start with **specific config**

```sudo apache2 -f [/path/to/httpd.conf]```

# SYNOPSIS

**apache2** [_-d serverroot_] [_-f config_] [_-D parameter_] [_options_]

# DESCRIPTION

**apache2** is the Apache HTTP Server daemon, one of the most widely used web servers. It handles HTTP requests, serves static content, runs CGI scripts, and integrates with application servers through various modules.

On Debian/Ubuntu systems, apache2 is typically managed through systemctl or apache2ctl rather than direct invocation.

# PARAMETERS

**-t**
> Test configuration file syntax

**-X**
> Run in single-process debugging mode

**-M**
> List compiled-in and loaded modules

**-V**
> Show version and compile settings

**-f** _file_
> Specify configuration file

**-d** _directory_
> Server root directory

**-D** _name_
> Define parameter for <IfDefine>

**-e** _level_
> Startup error log level

**-k** _command_
> Signal command: start, stop, restart, graceful

# CAVEATS

Direct invocation is rarely needed; use apache2ctl or systemctl. Configuration testing (-t) should be run before restarts. Running as root is required for ports below 1024.

# HISTORY

Apache HTTP Server originated from NCSA HTTPd patches in **1995**, with "Apache" reportedly meaning "A Patchy Server." It has dominated the web server market for decades.

# SEE ALSO

[apache2ctl](/man/apache2ctl)(8), [apachectl](/man/apachectl)(8), [nginx](/man/nginx)(8)
