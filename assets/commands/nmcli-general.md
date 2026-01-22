# TLDR

Show the **general status** of NetworkManager

```nmcli general```

Show the **hostname** of the current device

```nmcli general hostname```

**Change the hostname** of the current device

```sudo nmcli general hostname [new_hostname]```

Show the **permissions** of NetworkManager

```nmcli general permissions```

Show the **current logging level** and domains

```nmcli general logging```

**Set the logging level** and/or domains

```sudo nmcli general logging level [INFO|OFF|ERR|WARN|DEBUG|TRACE] domain [domain_1,domain_2,...]```

# SYNOPSIS

**nmcli general** [_command_] [_arguments_]

# PARAMETERS

**status**
> Show overall NetworkManager status (default if no subcommand)

**hostname**
> Show or set the system hostname

**permissions**
> Display current user's NetworkManager permissions

**logging**
> Show or set logging verbosity and domains

**reload**
> Reload NetworkManager configuration

# DESCRIPTION

**nmcli general** manages general NetworkManager settings and provides status information about the network management subsystem. It shows whether networking is enabled, the current connectivity state, and overall system network status.

The **hostname** subcommand provides a NetworkManager-aware way to set the system hostname, which is then propagated to other hostname services and persisted across reboots.

The **logging** subcommand controls NetworkManager's debug output, useful for troubleshooting connection issues. Domains include WIFI, ETHERNET, VPN, DHCP, and others.

# CAVEATS

Setting hostname or logging levels requires root privileges. Logging changes affect the running daemon immediately but don't persist across restarts unless configured in NetworkManager.conf. High debug levels can generate substantial log output.

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-networking](/man/nmcli-networking)(1), [NetworkManager.conf](/man/NetworkManager.conf)(5), [hostnamectl](/man/hostnamectl)(1)
