# TLDR

Show service **log target**

```systemctl service-log-target [service]```

Set to **console**

```systemctl service-log-target [service] console```

Set to **journal**

```systemctl service-log-target [service] journal```

Set to **syslog**

```systemctl service-log-target [service] syslog```

Set to **auto**

```systemctl service-log-target [service] auto```

**Disable** logging

```systemctl service-log-target [service] null```

# SYNOPSIS

**systemctl service-log-target** _SERVICE_ [_TARGET_]

# LOG TARGETS

**console** - Send logs to stderr

**journal** - Send logs to systemd-journald

**syslog** - Send logs to /dev/log

**auto** - Let systemd choose

**null** - Disable all log output

# DESCRIPTION

**systemctl service-log-target** gets or sets where a service sends its log messages via D-Bus. This allows redirecting service logs at runtime without restarting.

The service must support the standard D-Bus logging interface.

# CAVEATS

Only works with D-Bus integrated services. Changes are temporary and reset on service restart. Not all services support this feature.

# HISTORY

The **service-log-target** subcommand enables per-service log routing control for debugging and troubleshooting specific services.

# SEE ALSO

[systemctl-service-log-level](/man/systemctl-service-log-level)(1), [systemctl-log-target](/man/systemctl-log-target)(1), [journalctl](/man/journalctl)(1)
