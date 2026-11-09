# TAGLINE

Suspend system to RAM

# TLDR

**Suspend** the system

```systemctl suspend```

Retry **directly** if systemd-logind returns an error

```systemctl suspend -f```

Suspend ignoring **inhibitors**

```systemctl suspend -i```

# SYNOPSIS

**systemctl suspend** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Ignore errors from systemd-logind and start `suspend.target` directly

**-i**
> Shortcut for `--check-inhibitors=no`: ignore inhibitor locks

# DESCRIPTION

**systemctl suspend** puts the system into suspend mode (suspend-to-RAM), a low-power state where the system contents are kept in memory. Wake-up is fast since the system state doesn't need to be restored from disk. The command activates `suspend.target` and returns once the operation is enqueued, without waiting for the suspend/resume cycle.

Power is maintained to RAM to preserve the system state. This is the standard sleep mode for laptops and desktops.

# CAVEATS

System state is lost if power fails while suspended. Battery drain continues (slowly) during suspend. Some hardware may not support suspend reliably. Wake devices (keyboard, power button) must be configured.

# HISTORY

The **suspend** subcommand integrates system sleep into the systemd command interface, coordinating with power management and inhibitor locks.

# SEE ALSO

[systemctl-hibernate](/man/systemctl-hibernate)(1), [systemctl-hybrid-sleep](/man/systemctl-hybrid-sleep)(1), [systemctl-suspend-then-hibernate](/man/systemctl-suspend-then-hibernate)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
