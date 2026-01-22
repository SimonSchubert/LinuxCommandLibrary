# TLDR

**Power off** the system

```systemctl poweroff```

**Force** immediate poweroff

```systemctl poweroff -f```

Poweroff without **wall** message

```systemctl poweroff -f --no-wall```

# SYNOPSIS

**systemctl poweroff** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Skip graceful service shutdown

**--force --force** (-ff)
> Immediate poweroff without cleanup (dangerous)

**--no-wall**
> Don't send wall message to logged-in users

**--when** _TIME_
> Schedule poweroff at specific time

# DESCRIPTION

**systemctl poweroff** shuts down the system and powers off the machine. It gracefully stops all services, unmounts filesystems, and then signals the hardware to power down.

With `--force`, services are not gracefully stopped. With double `--force`, filesystems aren't unmounted, risking data loss.

# CAVEATS

Requires appropriate privileges. Force mode can cause data loss if filesystems aren't properly synced. Some hardware may not support software poweroff and will halt instead.

# HISTORY

The **poweroff** subcommand provides systemd-native shutdown, integrating with the scheduled shutdown mechanism and wall notification system.

# SEE ALSO

[systemctl-halt](/man/systemctl-halt)(1), [systemctl-reboot](/man/systemctl-reboot)(1), [poweroff](/man/poweroff)(8)
