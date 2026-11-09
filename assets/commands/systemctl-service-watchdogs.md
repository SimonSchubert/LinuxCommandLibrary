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

**systemctl service-watchdogs** gets or sets the global state of service runtime watchdogs (**WatchdogSec=**) and emergency actions (such as **OnFailure=** or **StartLimitAction=**). When enabled, systemd monitors services with WatchdogSec= configured and terminates them with SIGABRT (or **WatchdogSignal=**) if they fail to send a keep-alive notification within the timeout period.

Disabling watchdogs globally stops systemd from killing and restarting unresponsive services, useful during debugging. The hardware watchdog is not affected. The state can also be set at boot with the kernel command line option **systemd.service_watchdogs=**.

When called without an argument, prints the current global watchdog state.

# CAVEATS

Disabling watchdogs may allow hung services to persist indefinitely. Changes are temporary and reset on reboot. A watchdog timeout that expires while watchdogs are disabled is only logged and is not re-armed until the service's next keep-alive, so a service that is truly hung is not killed when watchdogs are enabled again and must be restarted by hand.

# HISTORY

The feature was added in systemd **237** as **systemd-analyze service-watchdogs**, together with the systemd.service_watchdogs= kernel option. It became a **systemctl** command in systemd **244**.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-status](/man/systemctl-status)(1), [systemctl-restart](/man/systemctl-restart)(1), [journalctl](/man/journalctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
