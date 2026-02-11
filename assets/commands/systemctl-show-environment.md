# TAGLINE

Display service manager environment

# TLDR

Show **system** environment

```systemctl show-environment```

Show **user** environment

```systemctl show-environment --user```

# SYNOPSIS

**systemctl show-environment** [_OPTIONS_]

# PARAMETERS

**--user**
> Show user service manager environment

**--system**
> Show system manager environment (default)

# DESCRIPTION

**systemctl show-environment** displays all environment variables set in the systemd service manager's environment block. These variables are passed to all services started by the manager.

The output shows one variable per line in NAME=VALUE format.

# CAVEATS

Shows the manager's environment, not the shell's environment. Variables set with `set-environment` or `import-environment` appear here.

# HISTORY

The **show-environment** subcommand provides visibility into what environment variables services will inherit, useful for debugging service configuration.

# SEE ALSO

[systemctl-set-environment](/man/systemctl-set-environment)(1), [systemctl-unset-environment](/man/systemctl-unset-environment)(1), [systemctl-import-environment](/man/systemctl-import-environment)(1)
