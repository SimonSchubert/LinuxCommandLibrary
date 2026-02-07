# TAGLINE

monitoring daemon wrapper for collectd with auto-restart

# TLDR

**Start collectd** as daemon

```collectdmon```

**Start with specific config**

```collectdmon -c [/etc/collectd.conf]```

**Start in foreground**

```collectdmon -f```

**Restart collectd on crash**

```collectdmon -P [/var/run/collectd.pid]```

# SYNOPSIS

**collectdmon** [_options_]

# DESCRIPTION

**collectdmon** is a monitoring daemon wrapper for collectd. It monitors the collectd process and automatically restarts it if it terminates unexpectedly.

The daemon ensures continuous metric collection by maintaining collectd uptime. It handles signals appropriately, forwarding them to the child collectd process.

# PARAMETERS

**-c** _file_
> Path to collectd configuration file.

**-P** _file_
> Path to PID file.

**-f**
> Run in foreground (don't daemonize).

**-h**
> Display help information.

# CONFIGURATION

**/etc/collectd.conf**
> Configuration file passed to the monitored collectd process.

# CAVEATS

Requires collectd to be installed. Configuration issues in collectd will cause restart loops. PID file location needs proper permissions.

# HISTORY

**collectdmon** is part of the **collectd** project, a system statistics collection daemon created by **Florian Forster** in **2005**. The monitoring wrapper ensures reliability for production deployments where continuous metric collection is critical.

# SEE ALSO

[collectd](/man/collectd)(1), [collectdctl](/man/collectdctl)(1), [systemd](/man/systemd)(1)
