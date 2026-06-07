# TAGLINE

web server and reverse proxy

# TLDR

**Start nginx**

```nginx```

**Test configuration**

```nginx -t```

**Reload configuration**

```nginx -s reload```

**Stop nginx**

```nginx -s stop```

**Graceful shutdown**

```nginx -s quit```

**Show version**

```nginx -v```

**Test config and dump it** to stdout

```nginx -T```

**Use specific config**

```nginx -c [/etc/nginx/nginx.conf]```

**Set global directives** at startup

```nginx -g "[daemon off;]"```

# SYNOPSIS

**nginx** [_-?hqtTvV_] [_-s signal_] [_-p prefix_] [_-e filename_] [_-c filename_] [_-g directives_]

# PARAMETERS

**-?**, **-h**
> Print help for command-line parameters.

**-t**
> Test the configuration file: nginx checks the syntax and then tries to open files referenced in the configuration.

**-T**
> Same as **-t**, but additionally dump the configuration files to standard output (1.9.2+).

**-q**
> Suppress non-error messages during configuration testing.

**-s** _SIGNAL_
> Send a signal to the master process. The signal may be one of: **stop** (fast shutdown), **quit** (graceful shutdown), **reload** (reload configuration), or **reopen** (reopen log files).

**-p** _PREFIX_
> Set the path prefix, that is, a directory that will keep server files. Default is _/usr/local/nginx_.

**-e** _FILE_
> Use an alternative error log file. The special value **stderr** logs to standard error (1.19.5+).

**-c** _FILE_
> Use an alternative configuration file instead of the default _prefix/conf/nginx.conf_.

**-g** _DIRECTIVES_
> Set global configuration directives, for example `nginx -g "pid /var/run/nginx.pid;"`.

**-v**
> Print the nginx version.

**-V**
> Print the nginx version, compiler version, and configure parameters.

# DESCRIPTION

**nginx** ("engine x") is a high-performance HTTP and reverse proxy server, as well as a mail (IMAP/POP3/SMTP) proxy server. It is designed to handle a large number of concurrent connections with a low, predictable memory footprint using an event-driven, asynchronous architecture.

Running **nginx** with no arguments starts the server (in the foreground or as a daemon, depending on the configuration). Once running, the master process is controlled at runtime by sending signals with **-s** rather than by restarting. Changes to the configuration are applied with `nginx -s reload`, which starts new worker processes and gracefully shuts down the old ones.

Beyond serving static files, nginx is widely used as a reverse proxy, load balancer, TLS terminator, and HTTP cache in front of application servers.

# CAVEATS

Behavior is driven entirely by the configuration file; always validate changes with **-t** before reloading. Paths printed in help and defaults are relative to the compile-time prefix and often differ on distribution packages (commonly _/etc/nginx/nginx.conf_).

# HISTORY

nginx was created by **Igor Sysoev** and first publicly released in **2004** to solve the C10k problem of handling many simultaneous connections. It is now developed by **F5, Inc.** and powers a large share of the busiest sites on the web.

# SEE ALSO

[apache2](/man/apache2)(8), [caddy](/man/caddy)(1), [haproxy](/man/haproxy)(1)

