# TAGLINE

Re-execute systemd manager binary

# TLDR

**Reexecute** systemd manager

```systemctl daemon-reexec```

Reexecute the **user** service manager

```systemctl --user daemon-reexec```

# SYNOPSIS

**systemctl daemon-reexec** [_OPTIONS_]

# PARAMETERS

**--user**
> Reexecute the calling user's service manager instead of PID 1

# DESCRIPTION

**systemctl daemon-reexec** reexecutes the systemd manager (PID 1): it serializes the manager state, reexecutes the process, and deserializes the state again. This is used after upgrading the systemd package to apply the new binary without rebooting.

Unlike `daemon-reload`, which only reloads configuration, `daemon-reexec` replaces the entire systemd process. All running services continue undisturbed during the transition.

# CAVEATS

Requires root privileges for the system manager. Of little use except for debugging and package upgrades, although it can serve as a heavy-weight `daemon-reload`. Not typically needed during normal operation.

# HISTORY

The **daemon-reexec** subcommand enables live upgrades of systemd itself without requiring a system reboot, supporting modern zero-downtime maintenance practices.

# SEE ALSO

[systemctl-daemon-reload](/man/systemctl-daemon-reload)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
