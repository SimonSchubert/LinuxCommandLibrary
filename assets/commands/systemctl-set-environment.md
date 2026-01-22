# TLDR

**Set** environment variable

```systemctl set-environment [VAR=value]```

Set **multiple** variables

```systemctl set-environment [VAR1=val1 VAR2=val2 ...]```

Set for **user** manager

```systemctl set-environment [VAR=value] --user```

# SYNOPSIS

**systemctl set-environment** _VARIABLE=VALUE_...

# PARAMETERS

**--user**
> Set in user service manager environment

**--system**
> Set in system manager environment (default)

# DESCRIPTION

**systemctl set-environment** adds or updates environment variables in the systemd service manager's environment. These variables are passed to all services started after the change.

This is useful for injecting configuration into services without modifying their unit files.

# CAVEATS

Only affects services started after the change. Changes are temporary and lost on reboot. Already running services are not affected. Use `import-environment` to import from the shell.

# HISTORY

The **set-environment** subcommand enables dynamic environment configuration for services, complementing unit file Environment= directives.

# SEE ALSO

[systemctl-show-environment](/man/systemctl-show-environment)(1), [systemctl-unset-environment](/man/systemctl-unset-environment)(1), [systemctl-import-environment](/man/systemctl-import-environment)(1)
