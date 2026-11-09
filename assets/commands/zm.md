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

**Query monitor settings**

```zmu -m [monitor_id] -q```

**List active monitors**

```zmu -l```

**Show the current state** of a monitor

```zmu -m [monitor_id] -s```

# SYNOPSIS

**zm** {**start**|**stop**|**restart**|**condrestart**|**status**}

**zmpkg.pl** {**start**|**stop**|**restart**|**status**|**logrot**|**version**|_state_}

**zmdc.pl** {**startup**|**shutdown**|**status**|**check**|**logrot**|**start**|**stop**|**restart**|**reload**|**version**} [_daemon_ [_options_]]

**zmu** [**-m** _monitor_id_] [_function_]

# DESCRIPTION

**ZoneMinder** is a video camera security and surveillance system. The **zm** script is a legacy SysV init wrapper around **zmpkg.pl**, and the related **zm*** commands manage the ZoneMinder daemons and services.

Key components:
- **zmpkg.pl** - Package control (start/stop entire system, or switch to a named run state)
- **zmdc.pl** - Daemon control (manage individual daemons)
- **zmu** - Monitor utility (query and control monitors, force alarms)
- **zmwatch.pl** - Watchdog daemon
- **zmaudit.pl** - Database audit tool

ZoneMinder consists of multiple daemons: capture daemons for each camera, analysis daemons for motion detection, and support services for web interface and event processing.

The primary interface is web-based, with these commands providing backend management and troubleshooting capabilities.

# CAVEATS

ZoneMinder requires a database (MySQL/MariaDB) and web server to function. Command-line tools manage daemons but configuration is done via the web interface.

Camera configuration, zone setup, and event management are handled through the web UI, not command line.

Daemon management typically requires root privileges. On systemd distributions, control ZoneMinder through its systemd unit instead of the **zm** script, which is intended for SysV init only.

Resource usage scales with the number of cameras and analysis complexity.

# SEE ALSO

[motion](/man/motion)(1), [ffmpeg](/man/ffmpeg)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/ZoneMinder/zoneminder)```

```[Documentation](https://zoneminder.readthedocs.io/en/stable/)```

<!-- verified: 2026-11-09 -->
