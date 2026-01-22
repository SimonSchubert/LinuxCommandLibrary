# TLDR

**Operate** on a specified directory instead of the host system

```sudo systemd-firstboot --root [path/to/root_directory]```

**Set** the system keyboard layout

```sudo systemd-firstboot --keymap [keymap]```

**Set** the system hostname

```sudo systemd-firstboot --hostname [hostname]```

**Set** the root user's password

```sudo systemd-firstboot --root-password [password]```

**Prompt** the user interactively for a setting

```sudo systemd-firstboot --prompt [setting]```

**Force** writing configuration even if files exist

```sudo systemd-firstboot --force```

**Remove** all existing firstboot configuration files

```sudo systemd-firstboot --reset```

**Remove** the password of the root user

```sudo systemd-firstboot --delete-root-password```

# SYNOPSIS

**systemd-firstboot** [_options_]

# PARAMETERS

**--root _path_**
> Operate on specified root directory

**--hostname _name_**
> Set the system hostname

**--keymap _map_**
> Set the keyboard layout

**--timezone _tz_**
> Set the system timezone

**--locale _locale_**
> Set the system locale

**--root-password _password_**
> Set root's password

**--root-shell _shell_**
> Set root's login shell

**--prompt**
> Prompt interactively for settings

**--force**
> Overwrite existing configuration

**--reset**
> Remove all firstboot configuration files

**--delete-root-password**
> Remove root password

# DESCRIPTION

**systemd-firstboot** initializes basic system settings on or before the first boot of a system. It is typically used when preparing OS images or system installations.

The tool can set hostname, locale, timezone, keyboard layout, and root password. When run without options on a live system, it interactively prompts for unconfigured settings.

# CAVEATS

Some settings require the **--force** flag to overwrite existing configuration. The **--root** option is essential when preparing disk images. Passwords should be provided securely. Part of the systemd suite.

# SEE ALSO

[systemd](/man/systemd)(1), [localectl](/man/localectl)(1), [timedatectl](/man/timedatectl)(1), [hostnamectl](/man/hostnamectl)(1)
