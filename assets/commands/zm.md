# TLDR

**Run ZoneMinder console**

```zm```

**Start ZoneMinder**

```sudo zmdc.pl start```

**Check daemon status**

```zmdc.pl status```

**Control ZoneMinder**

```zmpkg.pl [start|stop|restart|status]```

# SYNOPSIS

**zm** [_subcommand_]

**zmpkg.pl** [**start**|**stop**|**restart**|**status**]

**zmdc.pl** [**start**|**stop**|**status**] [_daemon_]

# DESCRIPTION

**ZoneMinder** is a video camera security and surveillance system. The **zm** family of commands manages the ZoneMinder daemons and services.

Key components:
- **zmpkg.pl** - Package control (start/stop entire system)
- **zmdc.pl** - Daemon control (manage individual daemons)
- **zmu** - Monitor utility (query monitor status)
- **zmwatch.pl** - Watchdog daemon
- **zmaudit.pl** - Database audit tool

ZoneMinder consists of multiple daemons: capture daemons for each camera, analysis daemons for motion detection, and support services for web interface and event processing.

The primary interface is web-based, with these commands providing backend management and troubleshooting capabilities.

# CAVEATS

ZoneMinder requires a database (MySQL/MariaDB) and web server to function. Command-line tools manage daemons but configuration is done via the web interface.

Camera configuration, zone setup, and event management are handled through the web UI, not command line.

Daemon management typically requires root privileges.

Resource usage scales with the number of cameras and analysis complexity.

# SEE ALSO

[motion](/man/motion)(1), [ffmpeg](/man/ffmpeg)(1), [systemctl](/man/systemctl)(1)
