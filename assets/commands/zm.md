# TAGLINE

Manage ZoneMinder surveillance daemons

# TLDR

**Start the ZoneMinder system**

```sudo zmpkg.pl start```

**Stop the ZoneMinder system**

```sudo zmpkg.pl stop```

**Check system status**

```zmpkg.pl status```

**Start a specific daemon**

```sudo zmdc.pl start [zmc] -m [monitor_id]```

**Check daemon status**

```zmdc.pl status```

**Query monitor status**

```zmu -m [monitor_id] -q```

# SYNOPSIS

**zm** [_subcommand_]

**zmpkg.pl** [**start**|**stop**|**restart**|**status**|**logrot**|**version**]

**zmdc.pl** [**start**|**stop**|**status**|**check**|**startup**|**shutdown**] [_daemon_]

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
