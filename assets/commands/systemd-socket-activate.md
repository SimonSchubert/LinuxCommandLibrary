# TAGLINE

Test socket activation for services

# TLDR

**Activate** a service when a socket is connected

```systemd-socket-activate [path/to/socket.service]```

**Activate** multiple sockets for a service

```systemd-socket-activate [path/to/socket1.service] [path/to/socket2.service]```

**Activate** a service with a specified port

```systemd-socket-activate [path/to/socket.service] -l [8080]```

# SYNOPSIS

**systemd-socket-activate** [_options_] _command_ [_arguments_]

# PARAMETERS

**-l, --listen _address_**
> Listen on specified address/port

**-a, --accept**
> Accept connections and spawn for each

**-d, --datagram**
> Use datagram (UDP) sockets

**-E, --setenv _name=value_**
> Set environment variables

**--fdname _name_**
> Specify file descriptor names

**--inetd**
> Run in inetd compatibility mode

# DESCRIPTION

**systemd-socket-activate** is a test and development tool for socket activation. It listens on sockets and launches a command when connections arrive, simulating systemd's socket activation feature.

This is useful for testing services that support socket activation without needing to configure full systemd socket units. The activated program receives the socket file descriptors.

# CAVEATS

Primarily intended for testing, not production use. For production, configure proper systemd socket and service units. The service must support socket activation protocol. Part of the systemd suite.

# SEE ALSO

[systemd.socket](/man/systemd.socket)(5), [systemd.service](/man/systemd.service)(5), [sd_listen_fds](/man/sd_listen_fds)(3)
