# TAGLINE

Import variables into service manager

# TLDR

**Import** environment variable

```systemctl import-environment [VARIABLE]```

Import **multiple** variables

```systemctl import-environment [VAR1 VAR2 ...]```

Import for **user** services

```systemctl import-environment [VARIABLE] --user```

# SYNOPSIS

**systemctl import-environment** [_OPTIONS_] _VARIABLE_...

# PARAMETERS

**--user**
> Import into user service manager environment

**--system**
> Import into system manager environment (default)

# DESCRIPTION

**systemctl import-environment** imports environment variables from the current shell session into the systemd service manager's environment. These imported variables become available to all units started by the service manager.

This is commonly used with `--user` to pass display-related variables (like DISPLAY, WAYLAND_DISPLAY, or XDG_CURRENT_DESKTOP) from the login session to user services.

# CAVEATS

Only affects services started after the import. Does not affect already running services. The system service manager typically runs in a minimal environment; importing user session variables may not be appropriate. Calling it without arguments imports the entire inherited environment, which is deprecated because most shell variables only make sense locally. Invalid names or values given explicitly raise an error.

# HISTORY

The **import-environment** subcommand enables proper integration between login sessions and systemd user services, solving the problem of user services not having access to session environment variables.

# SEE ALSO

[systemctl-show-environment](/man/systemctl-show-environment)(1), [systemctl-set-environment](/man/systemctl-set-environment)(1), [systemctl](/man/systemctl)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
