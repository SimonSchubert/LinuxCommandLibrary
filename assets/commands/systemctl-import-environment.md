# TLDR

**Import** environment variable

```systemctl import-environment [VARIABLE]```

Import **multiple** variables

```systemctl import-environment [VAR1 VAR2 ...]```

Import for **user** services

```systemctl import-environment [VARIABLE] --user```

# SYNOPSIS

**systemctl import-environment** _VARIABLE_...

# PARAMETERS

**--user**
> Import into user service manager environment

**--system**
> Import into system manager environment (default)

# DESCRIPTION

**systemctl import-environment** imports environment variables from the current shell session into the systemd service manager's environment. These imported variables become available to all units started by the service manager.

This is commonly used with `--user` to pass display-related variables (like DISPLAY, WAYLAND_DISPLAY, or XDG_SESSION_ID) from the login session to user services.

# CAVEATS

Only affects services started after the import. Does not affect already running services. The system service manager typically runs in a minimal environment; importing user session variables may not be appropriate.

# HISTORY

The **import-environment** subcommand enables proper integration between login sessions and systemd user services, solving the problem of user services not having access to session environment variables.

# SEE ALSO

[systemctl-show-environment](/man/systemctl-show-environment)(1), [systemctl-set-environment](/man/systemctl-set-environment)(1), [systemctl](/man/systemctl)(1)
