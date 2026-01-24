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

**supervisord** is a process control daemon. It manages long-running processes and restarts them on failure.

Configuration defines processes. Program sections specify commands and settings.

Auto-restart ensures reliability. Crashed processes restart automatically.

Process groups organize related services. Start and stop together.

Logging captures stdout/stderr. Rotation configurable.

Event listeners enable custom actions. Respond to process events.

# CAVEATS

Not a replacement for init systems. Single point of failure. Needs its own monitoring.

# HISTORY

**Supervisor** was created by **Chris McDonough** (Agendaless Consulting). It provides simple process management for Python applications and beyond.

# SEE ALSO

[supervisorctl](/man/supervisorctl)(1), [systemd](/man/systemd)(1)
