# TAGLINE

Get or set per-service log level

# TLDR

Show service **log level**

```systemctl service-log-level [service]```

**Set** log level

```systemctl service-log-level [service] [emerg|alert|crit|err|warning|notice|info|debug]```

# SYNOPSIS

**systemctl service-log-level** _SERVICE_ [_LEVEL_]

# LOG LEVELS

**emerg** (0) - System unusable

**alert** (1) - Immediate action required

**crit** (2) - Critical conditions

**err** (3) - Error conditions

**warning** (4) - Warning conditions

**notice** (5) - Normal but significant

**info** (6) - Informational

**debug** (7) - Debug messages

# DESCRIPTION

**systemctl service-log-level** gets or sets the runtime log level for a specific service via D-Bus. This allows adjusting service verbosity without restarting the service or editing configuration. Levels may also be given as numbers from 0 to 7.

The service must have `BusName=` set and implement the generic `org.freedesktop.LogControl1` D-Bus interface for this to work.

# CAVEATS

Only works with services that implement `org.freedesktop.LogControl1`. Changes are temporary and reset when the service restarts. Not all services support this feature.

# HISTORY

The **service-log-level** subcommand provides per-service logging control, enabling debugging of specific services without affecting system-wide verbosity. It has been available since systemd 247.

# SEE ALSO

[systemctl-log-level](/man/systemctl-log-level)(1), [systemctl-service-log-target](/man/systemctl-service-log-target)(1), [journalctl](/man/journalctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
