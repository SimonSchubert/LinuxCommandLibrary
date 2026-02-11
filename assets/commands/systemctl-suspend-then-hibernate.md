# TAGLINE

Suspend then auto-hibernate after delay

# TLDR

**Suspend then hibernate**

```systemctl suspend-then-hibernate```

**Force** suspend-then-hibernate

```systemctl suspend-then-hibernate -f```

# SYNOPSIS

**systemctl suspend-then-hibernate** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Force operation even if inhibitors are present

**--no-wall**
> Don't send wall message to users

# DESCRIPTION

**systemctl suspend-then-hibernate** first suspends the system to RAM, then automatically hibernates after a configured delay. This provides fast wake-up when used shortly after suspension, while protecting against data loss if battery depletes.

The delay before hibernation is configured in `/etc/systemd/sleep.conf` via the `HibernateDelaySec=` option.

# CAVEATS

Requires both suspend and hibernate to work properly. Needs sufficient swap space for hibernation. The delay timer wakes the system to hibernate, consuming some power. May not work reliably on all hardware.

# HISTORY

The **suspend-then-hibernate** subcommand combines the benefits of fast suspend wake-up with the safety of hibernation for long idle periods, ideal for laptops left sleeping overnight.

# SEE ALSO

[systemctl-suspend](/man/systemctl-suspend)(1), [systemctl-hibernate](/man/systemctl-hibernate)(1), [systemctl-hybrid-sleep](/man/systemctl-hybrid-sleep)(1)
