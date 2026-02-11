# TAGLINE

Process control and auto-restart daemon

# TLDR

**Start supervisord**

```supervisord```

**Use config file**

```supervisord -c [/etc/supervisor/supervisord.conf]```

**Run in foreground**

```supervisord -n```

**Debug mode**

```supervisord -e debug```

**Check configuration**

```supervisord -c [supervisord.conf] -t```

# SYNOPSIS

**supervisord** [_-c config_] [_-n_] [_-e level_] [_options_]

# PARAMETERS

**-c** _FILE_
> Configuration file.

**-n**
> Run in foreground.

**-e** _LEVEL_
> Log level.

**-t**
> Test configuration.

**-d** _DIR_
> Working directory.

**-u** _USER_
> Run as user.

**-j** _FILE_
> Pidfile path.

# DESCRIPTION

**supervisord** is a process control daemon that manages long-running processes, automatically restarting them if they crash or exit unexpectedly. It is widely used to run application servers, background workers, and other services that need reliable process supervision.

The configuration file defines programs with their commands, environment variables, user permissions, and restart policies. Programs can be organized into groups for coordinated management. The daemon captures stdout and stderr from managed processes, writing them to log files with configurable rotation.

Event listeners allow custom scripts to respond to process state changes such as crashes or transitions. The daemon communicates with supervisorctl through a Unix socket or TCP connection, and provides an optional web interface for process management.

# CONFIGURATION

**/etc/supervisor/supervisord.conf**
> Main configuration file defining programs, groups, logging, and socket settings.

**/etc/supervisor/conf.d/*.conf**
> Drop-in directory for individual program configuration files.

# CAVEATS

Not a replacement for init systems. Single point of failure. Needs its own monitoring.

# HISTORY

**Supervisor** was created by **Chris McDonough** (Agendaless Consulting). It provides simple process management for Python applications and beyond.

# SEE ALSO

[supervisorctl](/man/supervisorctl)(1), [systemd](/man/systemd)(1)
