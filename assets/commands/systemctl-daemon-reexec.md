# TAGLINE

Re-execute systemd manager binary

# TLDR

**Reexecute** systemd manager

```systemctl daemon-reexec```

# SYNOPSIS

**systemctl daemon-reexec**

# DESCRIPTION

**systemctl daemon-reexec** reexecutes the systemd manager (PID 1), replacing the running systemd binary with a new copy while preserving the current state of all units. This is used after upgrading the systemd package to apply the new binary without rebooting.

Unlike `daemon-reload`, which only reloads configuration, `daemon-reexec` replaces the entire systemd process. All running services continue undisturbed during the transition.

# CAVEATS

Requires root privileges. Should only be used after systemd package upgrades. Service states are preserved but any in-flight transactions may be affected. Not typically needed during normal operation.

# HISTORY

The **daemon-reexec** subcommand enables live upgrades of systemd itself without requiring a system reboot, supporting modern zero-downtime maintenance practices.

# SEE ALSO

[systemctl-daemon-reload](/man/systemctl-daemon-reload)(1), [systemctl](/man/systemctl)(1)
