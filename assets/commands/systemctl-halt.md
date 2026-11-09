# TAGLINE

Shut down and halt the system

# TLDR

**Halt** the system

```systemctl halt```

**Force** halt immediately

```systemctl halt -f```

Halt without **wall** message

```systemctl halt --no-wall```

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
> Skip service shutdown, but still kill all processes and unmount file systems or remount them read-only

**--force --force** (-ff)
> Immediate halt without terminating processes or unmounting file systems; may lose data. Run by systemctl itself, without contacting the manager

**-i**
> Shortcut for `--check-inhibitors=no`: ignore inhibitor locks

**--no-wall**
> Don't send wall message to users

**--when=** _TIME_
> Schedule at a timestamp in `systemd.time` syntax, or pass `show` to print the scheduled action, `cancel` to cancel it, `auto` for the maintenance window or one minute from now

# DESCRIPTION

**systemctl halt** shuts down and halts the system, stopping the OS kernel but leaving hardware powered on. This differs from poweroff, which completely powers down the machine, and reboot, which restarts the system.

The command is asynchronous and returns once the halt is enqueued. With one `--force`, service shutdown is skipped, but processes are killed and filesystems are unmounted or remounted read-only. With two `--force` flags, processes are not terminated and filesystems are not unmounted, which may cause data loss.

# CAVEATS

Halt leaves the system powered but unresponsive; manual power-off is required. Double-force mode risks data corruption. Scheduled operations can be cancelled with `--when cancel`. A `--when` timestamp is only a lower bound: one already in the past triggers the halt immediately.

# HISTORY

The **halt** subcommand provides a systemd-native way to halt the system, integrating with the scheduled shutdown mechanism and wall notification system.

# SEE ALSO

[systemctl-poweroff](/man/systemctl-poweroff)(1), [systemctl-reboot](/man/systemctl-reboot)(1), [halt](/man/halt)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
