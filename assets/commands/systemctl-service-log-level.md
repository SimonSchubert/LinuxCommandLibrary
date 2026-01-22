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

**systemctl service-log-level** gets or sets the runtime log level for a specific service via D-Bus. This allows adjusting service verbosity without restarting the service or editing configuration.

The service must support the standard D-Bus logging interface for this to work.

# CAVEATS

Only works with services that expose the D-Bus logging interface. Changes are temporary and reset when the service restarts. Not all services support this feature.

# HISTORY

The **service-log-level** subcommand provides per-service logging control, enabling debugging of specific services without affecting system-wide verbosity.

# SEE ALSO

[systemctl-log-level](/man/systemctl-log-level)(1), [systemctl-service-log-target](/man/systemctl-service-log-target)(1), [journalctl](/man/journalctl)(1)
