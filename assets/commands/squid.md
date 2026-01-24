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

**squid** is a caching HTTP proxy. It accelerates web access and provides content filtering.

Forward proxy serves client requests. Caches responses for faster repeat access.

Reverse proxy accelerates web servers. Offloads content delivery.

Access control lists filter traffic. Block sites, limit bandwidth, authenticate users.

Cache management optimizes storage. Disk and memory caching configurable.

# CAVEATS

Configuration is complex. ACL order matters. HTTPS interception needs certificates.

# HISTORY

**Squid** originated from the **Harvest** project at the **University of Colorado** in **1996**. It became the most widely deployed caching proxy.

# SEE ALSO

[nginx](/man/nginx)(1), [apache](/man/apache)(1), [privoxy](/man/privoxy)(1)
