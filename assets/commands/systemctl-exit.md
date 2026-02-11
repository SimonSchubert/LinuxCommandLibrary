# TAGLINE

Exit user or container service manager

# TLDR

Exit **user** service manager

```systemctl exit --user```

Exit with specific **exit code**

```systemctl exit [code] --user```

Exit **container** service manager

```systemctl exit```

# SYNOPSIS

**systemctl exit** [_EXIT_CODE_]

# PARAMETERS

**--user**
> Exit the user service manager

_EXIT_CODE_
> Optional exit code to return (integer)

# DESCRIPTION

**systemctl exit** asks the service manager to quit. When used with `--user`, it terminates the per-user systemd instance and all user services. When used without `--user` in a container, it cleanly shuts down the container.

On a regular system without `--user`, this is equivalent to `systemctl poweroff`.

# CAVEATS

When exiting the user service manager, all user services are terminated. The exit code is passed to the process that started the service manager. Not typically useful on bare-metal systems outside of containers.

# HISTORY

The **exit** subcommand supports clean shutdown of containerized systemd instances and user service managers, enabling proper service termination instead of forceful kills.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-poweroff](/man/systemctl-poweroff)(1)
