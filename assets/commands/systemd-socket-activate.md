# TAGLINE

Test socket activation of daemons

# TLDR

**Listen on a port** and launch a command on connection

```systemd-socket-activate -l [8080] [command]```

**Listen on multiple** ports for a command

```systemd-socket-activate -l [8080] -l [8081] [command]```

**Accept connections** and spawn a new instance for each

```systemd-socket-activate -l [8080] -a [command]```

**Use datagram (UDP)** sockets instead of stream (TCP)

```systemd-socket-activate -l [8080] -d [command]```

**Set environment variables** for the launched process

```systemd-socket-activate -l [8080] -E [VAR=value] [command]```

**Run in inetd** compatibility mode

```systemd-socket-activate -l [8080] --inetd [command]```

# SYNOPSIS

**systemd-socket-activate** [_options_] _command_ [_arguments_]

# PARAMETERS

**-l** _ADDRESS_, **--listen=**_ADDRESS_
> Listen on the specified address (port number or host:port).

**-a**, **--accept**
> Launch a new instance of the command for each connection. Cannot be combined with --now.

**-d**, **--datagram**
> Listen on a datagram socket (SOCK_DGRAM) instead of a stream socket. Cannot be combined with --seqpacket.

**--seqpacket**
> Listen on a sequential packet socket (SOCK_SEQPACKET) instead of a stream socket. Cannot be combined with --datagram.

**-E** _VAR[=VALUE]_, **--setenv=**_VAR[=VALUE]_
> Set an environment variable for the launched process. If no value given, inherits from the current environment.

**--fdname=**_NAME[:NAME...]_
> Specify names for the file descriptors passed. Enables use of sd_listen_fds_with_names(3).

**--inetd**
> Use the inetd protocol for passing file descriptors (as stdin/stdout) instead of the $LISTEN_FDS protocol.

**--now**
> Start the command immediately instead of waiting for a connection. Cannot be combined with --accept.

**-h**, **--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**systemd-socket-activate** is a test and development tool for socket activation. It listens on sockets and launches a specified command when connections arrive, simulating systemd's socket activation feature without needing to configure full socket and service unit files.

By default it listens on a stream (TCP) socket. Use **--datagram** for UDP or **--seqpacket** for sequential packet sockets. The activated program receives the socket file descriptors via the **$LISTEN_FDS** protocol (or via stdin/stdout in **--inetd** mode).

# CAVEATS

Primarily intended for testing, not production use. For production, configure proper systemd socket and service units. The service must support socket activation protocol. Part of the systemd suite.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemd-run](/man/systemd-run)(1), [systemd-analyze](/man/systemd-analyze)(1)
