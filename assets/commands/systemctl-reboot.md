# TLDR

**Reboot** the system

```systemctl reboot```

Reboot into **firmware** setup

```systemctl reboot --firmware-setup```

**Force** immediate reboot

```systemctl reboot -f```

**Schedule** reboot

```systemctl reboot --when +30min```

# SYNOPSIS

**systemctl reboot** [_OPTIONS_]

# PARAMETERS

**-f, --force**
> Skip graceful service shutdown

**--force --force** (-ff)
> Immediate reboot without cleanup (dangerous)

**--firmware-setup**
> Reboot into BIOS/UEFI firmware setup menu

**--no-wall**
> Don't send wall message to users

**--when** _TIME_
> Schedule reboot at specific time

# DESCRIPTION

**systemctl reboot** restarts the system, gracefully stopping all services and unmounting filesystems before initiating a hardware reset.

The `--firmware-setup` option sets a flag that tells the firmware to enter setup mode on next boot, useful for accessing BIOS/UEFI settings without key timing.

# CAVEATS

Force mode can cause data loss. Firmware setup support depends on UEFI implementation. Some systems may not support the firmware-setup flag.

# HISTORY

The **reboot** subcommand integrates with systemd's shutdown infrastructure, providing scheduled reboots and firmware setup access that traditional reboot commands lacked.

# SEE ALSO

[systemctl-poweroff](/man/systemctl-poweroff)(1), [systemctl-halt](/man/systemctl-halt)(1), [reboot](/man/reboot)(8)
