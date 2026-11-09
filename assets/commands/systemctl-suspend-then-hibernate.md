# TAGLINE

Suspend then auto-hibernate after delay

# TLDR

**Suspend then hibernate**

```systemctl suspend-then-hibernate```

**Force** suspend-then-hibernate

```systemctl suspend-then-hibernate -f```

Ignore **inhibitor locks**

```systemctl suspend-then-hibernate -i```

Show what **would be done** without doing it

```systemctl suspend-then-hibernate --dry-run```

# SYNOPSIS

**systemctl suspend-then-hibernate** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Ignore errors from systemd-logind (such as inhibitors) and start the sleep units directly

**-i**
> Shortcut for **--check-inhibitors=no**

**--check-inhibitors=**_MODE_
> Control inhibitor lock checks: auto (default), yes, or no

**--dry-run**
> Only print what would be done

# DESCRIPTION

**systemctl suspend-then-hibernate** suspends the system to RAM and hibernates it to disk when the battery runs low or a configured delay has passed. This provides fast wake-up when used shortly after suspension, while protecting against data loss if the battery depletes during extended sleep.

The delay is set with **HibernateDelaySec=** in **/etc/systemd/sleep.conf**. Without a battery it defaults to 2 hours. With a battery, systemd uses low-battery alarms where available, otherwise it wakes periodically to measure the discharge rate, falling back to **SuspendEstimationSec=**. If **HibernateDelaySec=** is also set, whichever comes first (low battery or the delay) triggers hibernation.

# CAVEATS

Requires both suspend and hibernate to work properly. Needs sufficient swap space for hibernation. The system wakes briefly to hibernate or to check the battery, consuming some power. The command is asynchronous and returns once the operation is enqueued. May not work reliably on all hardware.

# HISTORY

Added in **systemd 239**, the **suspend-then-hibernate** subcommand combines the benefits of fast suspend wake-up with the safety of hibernation for long idle periods, ideal for laptops left sleeping overnight.

# SEE ALSO

[systemctl-suspend](/man/systemctl-suspend)(1), [systemctl-hibernate](/man/systemctl-hibernate)(1), [systemctl-hybrid-sleep](/man/systemctl-hybrid-sleep)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
