# TAGLINE

Get or set the service manager log destination

# TLDR

Show **current** log target

```systemctl log-target```

**Set** log target

```systemctl log-target [journal-or-kmsg|journal|kmsg|console|console-prefixed|null|auto]```

# SYNOPSIS

**systemctl log-target** [_OPTIONS_] [_TARGET_]

# LOG TARGETS

**journal-or-kmsg** - Journal if available, else kernel ring buffer

**journal** - systemd journal only

**kmsg** - Kernel ring buffer (dmesg)

**console** - Attached tty

**console-prefixed** - Attached tty, with log level and facility prefixes

**null** - Discard all logs

**auto** - Automatic selection (default)

# DESCRIPTION

**systemctl log-target** gets or sets where the systemd service manager sends its log messages. Without arguments, it displays the current target. With a target argument, it redirects logging at runtime.

This controls where systemd's own messages go, separate from where individual service logs are sent.

# CAVEATS

Changes are temporary and reset on reboot. For permanent changes, set `LogTarget=` in `/etc/systemd/system.conf`. Console logging can slow the system and flood the display. Null target discards all systemd diagnostic output.

# HISTORY

The **log-target** subcommand provides runtime control over systemd's log destination, useful for debugging boot issues or redirecting logs in specific environments. It was added to **systemctl** in systemd 244; the older `systemd-analyze log-target` and `set-log-target` verbs are deprecated.

# SEE ALSO

[systemctl-log-level](/man/systemctl-log-level)(1), [journalctl](/man/journalctl)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
