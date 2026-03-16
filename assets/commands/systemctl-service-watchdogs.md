# TAGLINE

Get or set the global service watchdog state

# TLDR

Show current **watchdog** status

```systemctl service-watchdogs```

**Enable** service watchdogs

```systemctl service-watchdogs yes```

**Disable** service watchdogs

```systemctl service-watchdogs no```

# SYNOPSIS

**systemctl service-watchdogs** [_BOOL_]

# PARAMETERS

**yes**
> Enable the service watchdog logic globally.

**no**
> Disable the service watchdog logic globally.

# DESCRIPTION

**systemctl service-watchdogs** gets or sets the global state of service runtime watchdogs. When enabled, systemd monitors services with WatchdogSec= configured and sends SIGABRT to kill them if they fail to send a keep-alive notification within the timeout period.

Disabling watchdogs globally stops systemd from killing and restarting unresponsive services, useful during debugging.

When called without an argument, prints the current global watchdog state.

# CAVEATS

Disabling watchdogs may allow hung services to persist indefinitely. Changes are temporary and reset on reboot. Re-enabling watchdogs with `yes` does not resume monitoring for services whose watchdog already fired while disabled; those services must be restarted.

# HISTORY

The **service-watchdogs** subcommand provides a global kill switch for the watchdog mechanism, useful when debugging services that would otherwise be restarted before investigation completes.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-status](/man/systemctl-status)(1), [systemctl-restart](/man/systemctl-restart)(1), [journalctl](/man/journalctl)(1)
