# TAGLINE

Manage general NetworkManager settings and status

# TLDR

Show NetworkManager's **overall state**

```nmcli general status```

Print the **current hostname**

```nmcli general hostname```

**Change** the hostname

```sudo nmcli general hostname [new_hostname]```

Show which operations the **caller is allowed** to perform

```nmcli general permissions```

Show the **logging level and domains** in force

```nmcli general logging```

Turn logging **all the way up** while debugging

```sudo nmcli general logging level DEBUG domain ALL```

Raise the level for **one subsystem** only

```sudo nmcli general logging level INFO domain WIFI```

Return the state in a form a **script can parse**

```nmcli --terse --fields STATE,CONNECTIVITY general status```

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

# INSTALL

```apt: sudo apt install network-manager```

```apk: sudo apk add networkmanager-cli```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[nmcli](/man/nmcli)(1), [nmcli-networking](/man/nmcli-networking)(1), [NetworkManager.conf](/man/NetworkManager.conf)(5), [hostnamectl](/man/hostnamectl)(1)
