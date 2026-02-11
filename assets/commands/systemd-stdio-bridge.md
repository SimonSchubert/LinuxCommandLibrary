# TAGLINE

Bridge stdio to D-Bus connection

# TLDR

Forward to **system** bus

```systemd-stdio-bridge```

Forward to **user** bus

```systemd-stdio-bridge --user```

Forward to **container** bus

```systemd-stdio-bridge -M [container]```

Forward to **custom** bus address

```systemd-stdio-bridge -p unix:path=[/path/to/socket]```

# SYNOPSIS

**systemd-stdio-bridge** [_OPTIONS_]

# PARAMETERS

**--user**
> Connect to user D-Bus session

**--system**
> Connect to system D-Bus (default)

**-M, --machine=** _CONTAINER_
> Connect to D-Bus in specified container

**-p, --bus-path=** _ADDRESS_
> Connect to custom D-Bus address

# DESCRIPTION

**systemd-stdio-bridge** implements a proxy between stdin/stdout and a D-Bus connection. It expects an open connection via stdin/stdout and creates a new connection to the specified bus.

This enables remote D-Bus access via SSH or similar transport mechanisms, bridging external connections to the local bus.

# CAVEATS

Expects a properly formatted D-Bus connection on stdin. Used primarily for remote D-Bus access scenarios. Requires appropriate permissions on the target bus.

# HISTORY

**systemd-stdio-bridge** enables remote D-Bus access patterns, supporting tools like `busctl` and `systemctl` when operating on remote systems via SSH.

# SEE ALSO

[busctl](/man/busctl)(1), [dbus-daemon](/man/dbus-daemon)(1)
