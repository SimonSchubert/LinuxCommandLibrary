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

**Use specific config**

```nginx -c [/etc/nginx/nginx.conf]```

**Prefix path**

```nginx -p [/var/www]```

# SYNOPSIS

**nginx** [_options_]

# PARAMETERS

**-t**
> Test configuration.

**-s** _SIGNAL_
> Send signal (stop, quit, reload, reopen).

**-c** _FILE_
> Configuration file.

**-v**
> Show version.

**-V**
> Show version and config.

**-p** _PATH_
> Prefix path.

**--help**
> Display help information.

# DESCRIPTION

**nginx** is a web server and reverse proxy. It handles HTTP, HTTPS, and mail proxy.

The tool serves static content. Supports load balancing and caching.

nginx is high-performance web server.

# CAVEATS

Requires configuration. Runs as daemon. Different from Apache config.

# HISTORY

nginx was created by **Igor Sysoev** in 2004 to handle high concurrency with low memory usage.

# SEE ALSO

[apache2](/man/apache2)(1), [caddy](/man/caddy)(1), [haproxy](/man/haproxy)(1)

