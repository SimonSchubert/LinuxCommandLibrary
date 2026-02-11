# TAGLINE

Caching HTTP proxy server

# TLDR

**Start squid**

```squid```

**Check configuration**

```squid -k parse```

**Reload configuration**

```squid -k reconfigure```

**Shutdown gracefully**

```squid -k shutdown```

**Show version**

```squid -v```

**Run in foreground**

```squid -N```

**Debug mode**

```squid -d [5]```

**Clear cache**

```squid -k rotate && rm -rf [/var/spool/squid/*] && squid -z```

# SYNOPSIS

**squid** [_-k command_] [_-f config_] [_-N_] [_options_]

# PARAMETERS

**-k** _COMMAND_
> Send command to running squid.

**-f** _FILE_
> Configuration file.

**-N**
> No daemon mode.

**-d** _LEVEL_
> Debug level.

**-z**
> Create swap directories.

**-v**
> Show version.

# COMMANDS

**parse** - Check config
**reconfigure** - Reload config
**shutdown** - Graceful stop
**interrupt** - Immediate stop
**rotate** - Rotate logs

# DESCRIPTION

**squid** is a caching proxy server supporting HTTP, HTTPS, FTP, and other protocols. It operates as both a forward proxy for client internet access and a reverse proxy (accelerator) for web servers, caching frequently requested content to reduce bandwidth usage and improve response times.

The server uses Access Control Lists (ACLs) to filter traffic, authenticate users, restrict access to specific sites or content types, and enforce bandwidth limits. Cache storage is configurable with both memory and disk backends, supporting hierarchical caching with parent and sibling proxies.

Configuration is managed through a comprehensive configuration file that defines listening ports, ACL rules, cache policies, authentication schemes, and logging behavior. The **-k** flag sends management commands to a running instance for operations like configuration reload, log rotation, and graceful shutdown.

# CONFIGURATION

**/etc/squid/squid.conf**
> Main configuration file defining listening ports, ACL rules, cache policies, authentication helpers, and logging settings.

**/var/spool/squid/**
> Default disk cache directory for cached web content.

**/var/log/squid/**
> Log directory containing access.log, cache.log, and store.log.

# CAVEATS

Configuration is complex. ACL order matters. HTTPS interception needs certificates.

# HISTORY

**Squid** originated from the **Harvest** project at the **University of Colorado** in **1996**. It became the most widely deployed caching proxy.

# SEE ALSO

[nginx](/man/nginx)(1), [apache](/man/apache)(1), [privoxy](/man/privoxy)(1)
