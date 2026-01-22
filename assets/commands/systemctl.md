# TLDR

Show all **running services**

```systemctl status```

List **failed** units

```systemctl --failed```

**Start/Stop/Restart** a service

```systemctl start|stop|restart unit```

**Enable/Disable** a service at boot

```systemctl enable|disable unit```

Reload **systemd configuration**

```systemctl daemon-reload```

Check if a unit is **active/enabled/failed**

```systemctl is-active|is-enabled|is-failed unit```

List all **service units** by state

```systemctl list-units -t service --state running```

Show **contents** of a unit file

```systemctl cat unit```

# SYNOPSIS

**systemctl** [_OPTIONS_...] _COMMAND_ [_UNIT_...]

# DESCRIPTION

**systemctl** controls the systemd system and service manager. It can be used to introspect and control the state of the systemd system, manage services, check unit dependencies, and perform system operations like reboot or shutdown.

# PARAMETERS

**-t, --type=TYPE**
> Filter by unit type (service, socket, target, mount, timer, etc.)

**--state=STATE**
> Filter by unit state (active, inactive, failed, running, etc.)

**-a, --all**
> Show all units including inactive ones

**--user**
> Manage user services instead of system services

**--no-block**
> Return immediately without waiting for operation to complete

**--now**
> Combine enable/disable with start/stop

**--force**
> Override safety checks or symlink conflicts

**-q, --quiet**
> Suppress output

**-n, --lines=NUM**
> Number of journal lines to show with status

**--no-pager**
> Do not pipe output into a pager

**-o, --output=FORMAT**
> Control journal output format (short, verbose, json, etc.)

# COMMON COMMANDS

**list-units**: List active or specified units
**list-unit-files**: Show installed unit files and their enablement state
**status**: Show runtime status and recent logs
**start/stop**: Start or stop units
**restart**: Stop then start units
**reload**: Reload unit configuration without stopping
**enable/disable**: Enable or disable unit activation at boot
**mask/unmask**: Completely disable or re-enable a unit
**edit**: Edit unit file with drop-in snippets
**cat**: Show contents of unit file
**show**: Display unit properties in machine-readable format
**daemon-reload**: Reload systemd configuration and unit files
**is-active/is-enabled/is-failed**: Check unit state
**kill**: Send signal to unit processes
**poweroff/reboot/halt**: System power commands
**suspend/hibernate**: Enter sleep states

# CAVEATS

Some commands require root privileges. The **--user** flag manages per-user services in ~/.config/systemd/user/. Use **daemon-reload** after modifying unit files. Masked units cannot be started even manually.

# HISTORY

**systemctl** is part of **systemd**, introduced in 2010 by Lennart Poettering. It replaced traditional SysV init scripts and service management tools like **service** and **chkconfig**.

# SEE ALSO

[systemd](/man/systemd)(1), [journalctl](/man/journalctl)(1), [systemd.unit](/man/systemd.unit)(5), [systemd.service](/man/systemd.service)(5)
