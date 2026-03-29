# TAGLINE

Restart the system

# TLDR

**Reboot** the system

```systemctl reboot```

Reboot into **firmware** setup

```systemctl reboot --firmware-setup```

**Force** immediate reboot

```systemctl reboot -f```

**Reboot** into a specific boot loader entry once

```systemctl reboot --boot-loader-entry=[entry_id]```

**Schedule** reboot at a specific time

```systemctl reboot --when=+30min```

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

**--boot-loader-menu=** _TIMEOUT_
> Reboot into the boot loader menu, showing it for the specified timeout

**--boot-loader-entry=** _ID_
> Reboot into a specific boot loader entry once (use `--boot-loader-entry=help` to list entries)

**--when=** _TIMESTAMP_
> Schedule reboot at a specific time (use `--when=cancel` to cancel a scheduled reboot)

# DESCRIPTION

**systemctl reboot** restarts the system, gracefully stopping all services and unmounting filesystems before initiating a hardware reset.

The **--firmware-setup** option sets an EFI variable that tells the firmware to enter setup mode on next boot, useful for accessing UEFI settings without needing to press a key at the right time.

# CAVEATS

Force mode can cause data loss. Firmware setup support depends on UEFI implementation. Some systems may not support the firmware-setup flag.

# HISTORY

The **reboot** subcommand integrates with systemd's shutdown infrastructure, providing scheduled reboots and firmware setup access that traditional reboot commands lacked.

# SEE ALSO

[systemctl-poweroff](/man/systemctl-poweroff)(1), [systemctl-halt](/man/systemctl-halt)(1), [systemctl-soft-reboot](/man/systemctl-soft-reboot)(1), [reboot](/man/reboot)(8), [shutdown](/man/shutdown)(8)
