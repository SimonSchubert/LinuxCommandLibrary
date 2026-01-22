# TLDR

Start with **tray** and notifications

```udiskie --tray --notify```

Run **without** config file

```udiskie --no-config```

Use custom **config** file

```udiskie --config [path/to/config.yml]```

Use custom **password** prompt

```udiskie --password-prompt '[command]'```

Enable **verbose** output

```udiskie --verbose```

# SYNOPSIS

**udiskie** [_OPTIONS_]

# PARAMETERS

**--tray**
> Show system tray icon

**--notify**
> Enable desktop notifications

**--no-config**
> Run without configuration file

**--config** _FILE_
> Use specified configuration file

**--password-prompt** _COMMAND_
> Custom command for password prompts

**--verbose**
> Enable verbose output

# DESCRIPTION

**udiskie** is a user-level automounter for removable media using udisks2. It automatically mounts USB drives, optical discs, and other removable devices when they are inserted.

The daemon can show a system tray icon for easy device management and send desktop notifications when devices are mounted or unmounted.

# CAVEATS

Requires udisks2 daemon running. Desktop notifications need notification daemon. Tray icon requires system tray support. Some encrypted devices need password configuration.

# SEE ALSO

[udiskie-mount](/man/udiskie-mount)(1), [udiskie-umount](/man/udiskie-umount)(1), [udisksctl](/man/udisksctl)(1)
