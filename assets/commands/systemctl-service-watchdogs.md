# TAGLINE

Toggle service watchdog monitoring

# TLDR

Show **watchdog** status

```systemctl service-watchdogs```

**Enable** watchdogs

```systemctl service-watchdogs yes```

**Disable** watchdogs

```systemctl service-watchdogs no```

# SYNOPSIS

**systemctl service-watchdogs** [_yes_|_no_]

# DESCRIPTION

**systemctl service-watchdogs** gets or sets the global state of service runtime watchdogs. When enabled, systemd monitors services with WatchdogSec= configured and restarts them if they fail to signal liveness within the timeout period.

Disabling watchdogs globally stops systemd from killing and restarting unresponsive services, useful during debugging.

# CAVEATS

Disabling watchdogs may allow hung services to persist indefinitely. Changes are temporary and reset on reboot. Individual service watchdog settings still apply when re-enabled.

# HISTORY

The **service-watchdogs** subcommand provides a global kill switch for the watchdog mechanism, useful when debugging services that would otherwise be restarted before investigation completes.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd.service](/man/systemd.service)(5)
