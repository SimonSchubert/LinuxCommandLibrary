# TLDR

**Reboot** the system

```reboot```

**Power off** the system

```reboot --poweroff```

**Halt** the system without powering off

```reboot --halt```

**Force** immediate reboot without init

```reboot --force```

Write **wtmp entry only** without rebooting

```reboot --wtmp-only```

Reboot without **wall message**

```reboot --no-wall```

# SYNOPSIS

**reboot** [_OPTIONS_...]

# DESCRIPTION

**reboot** restarts the machine. It communicates with the system manager (systemd) to perform the reboot. The command accepts the same options as the related **poweroff** and **halt** commands.

# PARAMETERS

**--halt**
> Halt the machine instead of rebooting

**-p, --poweroff**
> Power off the machine instead of rebooting

**--reboot**
> Reboot the machine (default action)

**-f, --force**
> Force immediate reboot without contacting the init system

**-w, --wtmp-only**
> Only write the wtmp shutdown entry, do not actually reboot

**-d, --no-wtmp**
> Do not write a wtmp shutdown entry

**-n, --no-sync**
> Do not sync hard disks before reboot

**--no-wall**
> Do not send wall message before reboot

# CAVEATS

Using **--force** bypasses the init system and may result in data loss if filesystems are not properly synced. The **systemctl** command provides equivalent functionality with additional features.

# HISTORY

**reboot** has been available since early Unix systems. On modern systemd-based systems, it is typically a symlink to **systemctl**.

# SEE ALSO

[poweroff](/man/poweroff)(8), [halt](/man/halt)(8), [systemctl](/man/systemctl)(1), [shutdown](/man/shutdown)(8)
