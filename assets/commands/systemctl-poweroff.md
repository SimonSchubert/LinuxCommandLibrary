# TAGLINE

Shut down and power off system

# TLDR

**Power off** the system

```systemctl poweroff```

**Force** immediate poweroff

```systemctl poweroff -f```

Poweroff without **wall** message

```systemctl poweroff --no-wall```

**Schedule** poweroff

```systemctl poweroff --when [23:00|+2h]```

Show **scheduled** poweroff

```systemctl poweroff --when show```

**Cancel** scheduled poweroff

```systemctl poweroff --when cancel```

# SYNOPSIS

**systemctl poweroff** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Skip service shutdown, but still kill all processes and unmount file systems or remount them read-only

**--force --force** (-ff)
> Immediate poweroff without terminating processes or unmounting file systems; may lose data. Run by systemctl itself, without contacting the manager

**-i**
> Shortcut for `--check-inhibitors=no`: ignore inhibitor locks

**--no-wall**
> Don't send wall message to logged-in users

**--when=** _TIME_
> Schedule at a timestamp in `systemd.time` syntax, or pass `show` to print the scheduled action, `cancel` to cancel it, `auto` for the maintenance window or one minute from now

# DESCRIPTION

**systemctl poweroff** shuts down the system and powers off the machine. It gracefully stops all services, unmounts filesystems, and then signals the hardware to power down.

The command is asynchronous and returns once the poweroff is enqueued. With `--force`, service shutdown is skipped, but processes are killed and filesystems are unmounted or remounted read-only. With double `--force`, processes are not terminated and filesystems aren't unmounted, risking data loss.

# CAVEATS

Requires appropriate privileges. Force mode can cause data loss if filesystems aren't properly synced. Some hardware may not support software poweroff and will halt instead. A `--when` timestamp is only a lower bound: one already in the past triggers the poweroff immediately.

# HISTORY

The **poweroff** subcommand provides systemd-native shutdown, integrating with the scheduled shutdown mechanism and wall notification system.

# SEE ALSO

[systemctl-halt](/man/systemctl-halt)(1), [systemctl-reboot](/man/systemctl-reboot)(1), [poweroff](/man/poweroff)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
