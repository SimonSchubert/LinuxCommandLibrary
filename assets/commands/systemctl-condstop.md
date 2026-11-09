# TAGLINE

Legacy compatibility alias for systemctl stop

# TLDR

This command is an alias of [systemctl stop](/man/systemctl-stop).

**Stop a service**, the same as `systemctl stop`

```systemctl condstop [unit]```

# SYNOPSIS

**systemctl condstop** _UNIT_...

# DESCRIPTION

**systemctl condstop** is a hidden compatibility verb: it maps to the same **StopUnit** D-Bus call and **stop** job as **systemctl stop**, and requires at least one unit. In the systemd source it is marked as a legacy alias with an ALT Linux origin, so it does not appear in `systemctl --help` or the manual.

# CAVEATS

Despite the name it has no conditional logic of its own. It behaves exactly like **stop**, which is already a no-op on a unit that is not running. Unlike **condrestart**, which maps to **try-restart**, there is no separate conditional stop operation. New scripts should use **systemctl stop**.

# SEE ALSO

[systemctl-stop](/man/systemctl-stop)(1), [systemctl](/man/systemctl)(1), [systemctl-condrestart](/man/systemctl-condrestart)(1), [systemctl-status](/man/systemctl-status)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
