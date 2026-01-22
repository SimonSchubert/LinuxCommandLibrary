# TLDR

**Unset** environment variable

```systemctl unset-environment [VAR]```

Unset **multiple** variables

```systemctl unset-environment [VAR1 VAR2 ...]```

Unset in **user** manager

```systemctl unset-environment [VAR] --user```

# SYNOPSIS

**systemctl unset-environment** _VARIABLE_...

# PARAMETERS

**--user**
> Unset in user service manager environment

**--system**
> Unset in system manager environment (default)

# DESCRIPTION

**systemctl unset-environment** removes environment variables from the systemd service manager's environment. This undoes the effect of `systemctl set-environment`.

Services started after the unset will not receive the removed variables.

# CAVEATS

Only affects services started after the change. Already running services keep their environment. Changes are temporary and lost on reboot.

# HISTORY

The **unset-environment** subcommand complements `set-environment`, providing complete runtime control over the service manager's environment.

# SEE ALSO

[systemctl-set-environment](/man/systemctl-set-environment)(1), [systemctl-show-environment](/man/systemctl-show-environment)(1), [systemctl](/man/systemctl)(1)
