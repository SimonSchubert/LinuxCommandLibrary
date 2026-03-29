# TAGLINE

Automounter for removable media

# TLDR

Start with **tray** icon and notifications

```udiskie --tray --notify```

Start with **smart tray** that auto-hides when no devices are available

```udiskie --smart-tray```

Disable **automounting** but keep the tray

```udiskie --no-automount --tray```

Use custom **config** file

```udiskie --config [path/to/config.yml]```

Use custom **password** prompt for LUKS devices

```udiskie --password-prompt '[command]'```

Enable **verbose** output

```udiskie --verbose```

# SYNOPSIS

**udiskie** [_OPTIONS_]

# PARAMETERS

**-h**, **--help**
> Display help message and exit

**-V**, **--version**
> Show version information and exit

**-v**, **--verbose**
> Enable verbose output

**-q**, **--quiet**
> Suppress output messages

**-c** _FILE_, **--config**=_FILE_
> Use specified configuration file

**-C**, **--no-config**
> Ignore all configuration files

**-a**, **--automount**
> Enable automatic mounting of new devices (default)

**-A**, **--no-automount**
> Disable automatic mounting of new devices

**-n**, **--notify**
> Enable pop-up notifications

**-N**, **--no-notify**
> Disable pop-up notifications

**-t**, **--tray**
> Show system tray icon

**-s**, **--smart-tray**
> Show tray icon that auto-hides when there is no action available

**-T**, **--no-tray**
> Disable tray icon (default)

**-f** _PROGRAM_, **--file-manager**=_PROGRAM_
> Set program to open mounted directories

**-F**, **--no-file-manager**
> Disable directory browsing

**-p** _COMMAND_, **--password-prompt**=_COMMAND_
> Set command for password retrieval (LUKS devices)

**-P**, **--no-password-prompt**
> Prevent unlocking of LUKS encrypted devices

**--appindicator**
> Use AppIndicator3 for the status icon

**--password-cache** _MINUTES_
> Cache passwords for the specified number of minutes

**--no-password-cache**
> Disable password caching

**--event-hook** _COMMAND_
> Execute command on device events

# DESCRIPTION

**udiskie** is a user-level automounter for removable media using udisks2. It automatically mounts USB drives, optical discs, and other removable devices when they are inserted.

The daemon can show a system tray icon for easy device management and send desktop notifications when devices are mounted or unmounted. Configuration is read from **~/.config/udiskie/config.yml** by default.

# CAVEATS

Requires udisks2 daemon running. Desktop notifications need a notification daemon. Tray icon requires system tray support. Some encrypted devices need password configuration.

# SEE ALSO

[udiskie-mount](/man/udiskie-mount)(1), [udiskie-umount](/man/udiskie-umount)(1), [udisksctl](/man/udisksctl)(1)
