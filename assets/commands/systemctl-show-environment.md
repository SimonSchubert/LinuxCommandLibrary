# TAGLINE

Display service manager environment

# TLDR

Show **system** service manager environment

```systemctl show-environment```

Show **user** service manager environment

```systemctl show-environment --user```

**Filter** for a specific variable

```systemctl show-environment | grep [PATH]```

# SYNOPSIS

**systemctl show-environment** [_OPTIONS_]

# PARAMETERS

**--user**
> Show user service manager environment

**--system**
> Show system manager environment (default)

**-H, --host=**_HOST_
> Query the manager on a remote host over SSH

**-M, --machine=**_NAME_
> Query the manager inside a local container

# DESCRIPTION

**systemctl show-environment** displays all environment variables set in the systemd service manager's environment block. These variables are inherited by all services started by the manager.

The output shows one variable per line in a form suitable for sourcing into most shells: plain `NAME=value`, or `NAME=$'value'` when the value contains whitespace or shell metacharacters. Use **systemctl set-environment** to add variables and **systemctl unset-environment** to remove them.

# CAVEATS

Shows the manager's environment, not the shell's environment. Variables set with `set-environment` or `import-environment` appear here. The `$'...'` quoting is understood by bash, zsh, ksh and busybox ash, but not by dash or fish.

# HISTORY

The **show-environment** subcommand provides visibility into what environment variables services will inherit, useful for debugging service configuration.

# SEE ALSO

[systemctl-set-environment](/man/systemctl-set-environment)(1), [systemctl-unset-environment](/man/systemctl-unset-environment)(1), [systemctl-import-environment](/man/systemctl-import-environment)(1)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
