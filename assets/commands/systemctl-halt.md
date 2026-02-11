# TAGLINE

Shut down and halt the system

# TLDR

**Halt** the system

```systemctl halt```

**Force** halt immediately

```systemctl halt -f```

Halt without **wall** message

```systemctl halt -f --no-wall```

**Emergency** halt (dangerous)

```systemctl halt -ff```

**Schedule** halt at time

```systemctl halt --when 23:00```

Schedule halt in **duration**

```systemctl halt --when +2h```

**Cancel** scheduled halt

```systemctl halt --when cancel```

# SYNOPSIS

**systemctl halt** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Skip graceful service shutdown

**--force --force** (-ff)
> Immediate halt without cleanup (dangerous)

**--no-wall**
> Don't send wall message to users

**--when** _TIME_
> Schedule halt at specific time or offset

# DESCRIPTION

**systemctl halt** shuts down and halts the system, stopping the OS kernel but leaving hardware powered on. This differs from poweroff, which completely powers down the machine, and reboot, which restarts the system.

With one `--force`, services are not gracefully stopped. With two `--force` flags, filesystems are not unmounted and may cause data loss.

# CAVEATS

Halt leaves the system powered but unresponsive; manual power-off is required. Double-force mode risks data corruption. Scheduled operations can be cancelled with `--when cancel`.

# HISTORY

The **halt** subcommand provides a systemd-native way to halt the system, integrating with the scheduled shutdown mechanism and wall notification system.

# SEE ALSO

[systemctl-poweroff](/man/systemctl-poweroff)(1), [systemctl-reboot](/man/systemctl-reboot)(1), [halt](/man/halt)(8)
