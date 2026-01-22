# TLDR

Show **current** log level

```systemctl log-level```

**Set** log level

```systemctl log-level [emerg|alert|crit|err|warning|notice|info|debug]```

# SYNOPSIS

**systemctl log-level** [_LEVEL_]

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

**systemctl log-level** gets or sets the logging verbosity of the systemd service manager (PID 1). Without arguments, it displays the current level. With a level argument, it changes the verbosity at runtime.

Higher verbosity levels (debug, info) produce more log output and can help diagnose issues. Lower levels (err, crit) reduce noise in production.

# CAVEATS

Changes are temporary and reset on reboot. For permanent changes, modify the systemd configuration. Debug level can produce significant log volume and impact performance.

# HISTORY

The **log-level** subcommand provides runtime control over systemd's verbosity, useful for temporary debugging without configuration changes or restarts.

# SEE ALSO

[systemctl-log-target](/man/systemctl-log-target)(1), [journalctl](/man/journalctl)(1), [systemctl](/man/systemctl)(1)
