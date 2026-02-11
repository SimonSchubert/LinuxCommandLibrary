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

# SYNOPSIS

**systemctl list-sockets** [_OPTIONS_] [_PATTERN_...]

# PARAMETERS

**-a, --all**
> Include inactive and failed socket units

**--state=** _STATE_
> Filter by state

**--show-types**
> Display socket types (Stream, Datagram, etc.)

**--no-legend**
> Suppress header and footer

**--no-pager**
> Disable pager

# DESCRIPTION

**systemctl list-sockets** displays socket units currently active in memory, ordered by listening address. Socket units implement socket activation, where services are started on-demand when connections arrive.

The output shows the listening address (IP:port, path, etc.), the socket unit name, and the unit it activates.

# CAVEATS

Shows systemd-managed sockets only, not all listening sockets on the system. Use `ss` or `netstat` for a complete list. Socket activation may cause startup delays on first connection.

# HISTORY

The **list-sockets** subcommand provides insight into systemd's socket activation infrastructure, which reduces memory usage by starting services only when needed.

# SEE ALSO

[systemctl-list-units](/man/systemctl-list-units)(1), [systemd.socket](/man/systemd.socket)(5), [ss](/man/ss)(8)
