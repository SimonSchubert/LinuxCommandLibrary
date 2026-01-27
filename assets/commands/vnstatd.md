# TLDR

**Start the daemon**

```sudo systemctl start vnstat```

**Enable at boot**

```sudo systemctl enable vnstat```

**Run daemon in foreground**

```vnstatd -n```

**Run with debug output**

```vnstatd -D```

**Sync database and exit**

```vnstatd --sync```

# SYNOPSIS

**vnstatd** [_options_]

# PARAMETERS

**-d**, **--daemon**
> Fork to background as daemon.

**-n**, **--nodaemon**
> Stay in foreground.

**-s**, **--sync**
> Sync cached data to database and exit.

**-D**, **--debug**
> Enable debug output.

**--config** _file_
> Use specified config file.

**-p**, **--pidfile** _file_
> Use specified PID file.

**--noadd**
> Don't add new interfaces automatically.

**-v**, **--version**
> Display version.

# DESCRIPTION

**vnstatd** is the daemon component of vnStat that collects network traffic statistics. It reads interface counters from the kernel at configured intervals and stores data in a persistent database.

The daemon tracks multiple interfaces simultaneously, recording 5-minute, hourly, daily, monthly, and yearly statistics. It automatically detects new interfaces added to the database without requiring restart.

Resource usage is minimal since vnstatd reads kernel counters rather than capturing packets. Data persists across reboots, making it suitable for long-term bandwidth monitoring.

# CONFIGURATION

Config file: /etc/vnstat.conf

Key settings include monitored interfaces, database location, update interval, and data retention periods.

# CAVEATS

Statistics begin from daemon start, not historically. Kernel counter resets (reboots, interface changes) may cause inaccuracies. Database corruption possible on unclean shutdown.

# HISTORY

**vnstatd** is part of vnStat, created by Teemu Toivola for lightweight network traffic monitoring. The project began in 2002 and has become a standard tool for bandwidth monitoring on Linux servers and embedded systems.

# SEE ALSO

[vnstat](/man/vnstat)(1), [vnstati](/man/vnstati)(1), [iftop](/man/iftop)(8), [nethogs](/man/nethogs)(8)
