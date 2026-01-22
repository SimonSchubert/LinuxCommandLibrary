# TLDR

Show **current** log target

```systemctl log-target```

**Set** log target

```systemctl log-target [journal-or-kmsg|journal|kmsg|console|syslog|null|auto]```

# SYNOPSIS

**systemctl log-target** [_TARGET_]

# LOG TARGETS

**journal-or-kmsg** - Journal if available, else kernel ring buffer

**journal** - systemd journal only

**kmsg** - Kernel ring buffer (dmesg)

**console** - System console

**syslog** - Traditional syslog

**null** - Discard all logs

**auto** - Automatic selection

# DESCRIPTION

**systemctl log-target** gets or sets where the systemd service manager sends its log messages. Without arguments, it displays the current target. With a target argument, it redirects logging at runtime.

This controls where systemd's own messages go, separate from where individual service logs are sent.

# CAVEATS

Changes are temporary and reset on reboot. Console logging can slow the system and flood the display. Null target discards all systemd diagnostic output.

# HISTORY

The **log-target** subcommand provides runtime control over systemd's log destination, useful for debugging boot issues or redirecting logs in specific environments.

# SEE ALSO

[systemctl-log-level](/man/systemctl-log-level)(1), [journalctl](/man/journalctl)(1), [systemctl](/man/systemctl)(1)
