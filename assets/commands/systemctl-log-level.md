# TAGLINE

Get or set the service manager log level

# TLDR

Show **current** log level

```systemctl log-level```

**Set** log level

```systemctl log-level [emerg|alert|crit|err|warning|notice|info|debug]```

Set the **user** manager log level

```systemctl --user log-level [level]```

# SYNOPSIS

**systemctl log-level** [_OPTIONS_] [_LEVEL_]

# LOG LEVELS

**emerg** - System is unusable

**alert** - Immediate action required

**crit** - Critical conditions

**err** - Error conditions

**warning** - Warning conditions

**notice** - Normal but significant

**info** - Informational messages

**debug** - Debug-level messages

# DESCRIPTION

**systemctl log-level** gets or sets the logging verbosity of the systemd service manager (PID 1). Without arguments, it displays the current level. With a level argument, it changes the verbosity at runtime. Levels may also be given as numbers from 0 (emerg) to 7 (debug).

Higher verbosity levels (debug, info) produce more log output and can help diagnose issues. Lower levels (err, crit) reduce noise in production.

# CAVEATS

Changes are temporary and reset on reboot. For permanent changes, set `LogLevel=` in `/etc/systemd/system.conf`. Debug level can produce significant log volume and impact performance.

# HISTORY

The **log-level** subcommand provides runtime control over systemd's verbosity, useful for temporary debugging without configuration changes or restarts. It was added to **systemctl** in systemd 244; the older `systemd-analyze log-level` and `set-log-level` verbs are deprecated.

# SEE ALSO

[systemctl-log-target](/man/systemctl-log-target)(1), [journalctl](/man/journalctl)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
