# TAGLINE

Get or set per-service log destination

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

**console** - Send logs to the service's standard error

**kmsg** - Send logs to the kernel log buffer

**journal** - Send logs to systemd-journald

**syslog** - Send logs to /dev/log

**auto** - Choose automatically, typically console if run interactively and journal or syslog otherwise

**null** - Disable all log output

# DESCRIPTION

**systemctl service-log-target** gets or sets where a service sends its log messages via D-Bus. This allows redirecting service logs at runtime without restarting.

The service must have `BusName=` set and implement the generic `org.freedesktop.LogControl1` D-Bus interface.

# CAVEATS

Only works with services that implement `org.freedesktop.LogControl1`. Most normal services only implement console, journal, and null. Changes are temporary and reset on service restart. Not all services support this feature.

# HISTORY

The **service-log-target** subcommand enables per-service log routing control for debugging and troubleshooting specific services. It has been available since systemd 247.

# SEE ALSO

[systemctl-service-log-level](/man/systemctl-service-log-level)(1), [systemctl-log-target](/man/systemctl-log-target)(1), [journalctl](/man/journalctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
