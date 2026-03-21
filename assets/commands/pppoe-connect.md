# TAGLINE

Manage a PPPoE DSL connection

# TLDR

**Start PPPoE connection with default config**

```sudo pppoe-connect```

**Connect with a specific config file**

```sudo pppoe-connect [/etc/ppp/pppoe.conf]```

# SYNOPSIS

**pppoe-connect** [_config_file_]

# PARAMETERS

_CONFIG_FILE_
> Configuration file path. Defaults to /etc/ppp/pppoe.conf.

# DESCRIPTION

**pppoe-connect** is a shell script that manages a PPPoE (PPP over Ethernet) connection using the Roaring Penguin user-space PPPoE client. It reads a configuration file, brings up the connection, and automatically re-establishes it if it drops, logging reconnection events to syslog.

Each time the connection drops, pppoe-connect executes /etc/ppp/pppoe-lost if it exists. Normally you should use **pppoe-start** instead of invoking pppoe-connect directly.

# CAVEATS

Requires configured pppoe.conf and pppd. Normally invoked via pppoe-start rather than directly. Multiple connections supported with different config files using different PIDFILE settings.

# HISTORY

pppoe-connect is part of the **Roaring Penguin PPPoE** client package.

# SEE ALSO

[pppoe](/man/pppoe)(8), [pppoe-setup](/man/pppoe-setup)(8), [pppoe-stop](/man/pppoe-stop)(8), [pppd](/man/pppd)(8), [pppoe-discovery](/man/pppoe-discovery)(8)

