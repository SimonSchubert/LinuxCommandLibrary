# TAGLINE

List socket-activated units

# TLDR

List **active** socket units

```systemctl list-sockets```

Show **socket types**

```systemctl list-sockets --show-types```

List **all** including inactive

```systemctl list-sockets -a```

Filter by **state**

```systemctl list-sockets --state [active|inactive|failed]```

Filter by **pattern**

```systemctl list-sockets [pattern]```

List sockets of the **user** service manager

```systemctl --user list-sockets```

# SYNOPSIS

**systemctl list-sockets** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**-a, --all**
> Include inactive and failed socket units

**--state=** _STATE_
> Filter by comma-separated LOAD, SUB, or ACTIVE states. Use **--state=help** to list the allowed values

**--show-types**
> Display socket types (Stream, Datagram, etc.)

**--no-legend**
> Suppress header and footer

**--no-pager**
> Disable pager

# DESCRIPTION

**systemctl list-sockets** displays socket units currently in memory, ordered by listening address. Socket units implement socket activation, where services are started on-demand when connections arrive.

The output shows the listening address (IP:port, path, etc.), the socket unit name, and the unit it activates.

# CAVEATS

Shows systemd-managed sockets only, not all listening sockets on the system. Use `ss` or `netstat` for a complete list. Addresses can contain spaces, so the output is not suitable for programmatic consumption.

# SEE ALSO

[systemctl](/man/systemctl)(1), [systemctl-list-units](/man/systemctl-list-units)(1), [ss](/man/ss)(8), [netstat](/man/netstat)(8)

# RESOURCES

```[Source code](https://github.com/systemd/systemd)```

```[Homepage](https://systemd.io/)```

```[Documentation](https://www.freedesktop.org/software/systemd/man/latest/systemctl.html)```

<!-- verified: 2026-11-09 -->
