# TLDR

Enter **rescue** mode

```systemctl rescue```

Enter rescue mode **asynchronously**

```systemctl rescue --no-block```

# SYNOPSIS

**systemctl rescue** [_OPTIONS_]

# PARAMETERS

**--no-block**
> Return immediately without waiting

# DESCRIPTION

**systemctl rescue** transitions the system to rescue mode (`rescue.target`), a single-user environment for system maintenance. Most services are stopped, but more are available than in emergency mode.

Rescue mode provides a shell with basic system services, networking may be available, and all filesystems are typically mounted read-write.

# CAVEATS

Requires root privileges. Most user services and network services will be stopped. Use rescue mode for system maintenance tasks like filesystem repairs or package recovery.

# HISTORY

The **rescue** subcommand provides the systemd equivalent of traditional single-user mode (runlevel 1), offering a minimal but functional recovery environment.

# SEE ALSO

[systemctl-emergency](/man/systemctl-emergency)(1), [systemctl-default](/man/systemctl-default)(1), [systemctl](/man/systemctl)(1)
