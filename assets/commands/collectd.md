# TLDR

**Test** the configuration file and exit

```collectd -t```

**Test plugin** data collection functionality

```collectd -T```

**Start** collectd daemon

```collectd```

Specify a **custom configuration** file

```collectd -C [path/to/file]```

Specify a **custom PID file**

```collectd -P [path/to/file]```

Run in **foreground** (don't fork)

```collectd -f```

# SYNOPSIS

**collectd** [_options_]

# DESCRIPTION

**collectd** is a daemon that collects, transfers, and stores system performance statistics. It supports numerous input plugins for collecting metrics and output plugins for storing or forwarding data.

Common use cases include monitoring system resources, network statistics, and application metrics.

# PARAMETERS

**-t**
> Test configuration file syntax

**-T**
> Test plugin data collection

**-C** _file_
> Use specified configuration file

**-P** _file_
> Write PID to specified file

**-f**
> Don't fork into background

**-h**
> Display help and version

# CAVEATS

Configuration requires careful setup of input and output plugins. Some plugins may require additional libraries. Running without proper output plugins will collect data but not store it.

# SEE ALSO

[collectdmon](/man/collectdmon)(1), [collectd.conf](/man/collectd.conf)(5)
