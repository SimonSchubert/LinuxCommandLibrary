# TAGLINE

LVM poll daemon that supervises long-running LVM operations such

# TLDR

Start the daemon in the **foreground**

```lvmpolld -f```

Start in the foreground with **debug logging**

```lvmpolld -f -l debug```

Set the **idle shutdown timeout** (seconds)

```lvmpolld -t [300]```

Use a **custom socket** path

```lvmpolld -s [/tmp/lvmpolld.socket]```

Use a **custom PID file**

```lvmpolld -p [/tmp/lvmpolld.pid]```

**Dump the current state**

```lvmpolld --dump```

# SYNOPSIS

**lvmpolld** [_options_]

# PARAMETERS

**-f, --foreground**
> Run in the foreground instead of daemonizing

**-l, --log _level_**
> Set log level (debug, info, warn, error)

**-t, --timeout _seconds_**
> Set idle shutdown timeout; daemon exits after being idle this long

**-s, --socket _path_**
> Use a custom Unix socket path for communication

**-p, --pidfile _path_**
> Use a custom PID file location

**--dump**
> Dump the current state of the daemon and exit

# DESCRIPTION

**lvmpolld** is the LVM poll daemon that supervises long-running LVM operations such as pvmove, lvconvert mirroring, and thin pool extension. It monitors these operations and updates their progress, allowing the initiating command to return while work continues in the background.

When an LVM command starts a polled operation, lvmpolld tracks its completion status. The daemon starts automatically when needed and shuts down after a configurable idle period.

The daemon communicates via a Unix socket, typically at /run/lvm/lvmpolld.socket, and maintains state about active operations.

# CAVEATS

Usually started automatically by LVM commands; manual invocation is rarely needed. If the daemon dies during an active operation, restarting the original command will resume polling. The **--dump** option is useful for debugging active operations.

# SEE ALSO

[lvm](/man/lvm)(8), [pvmove](/man/pvmove)(8), [lvconvert](/man/lvconvert)(8), [lvmconfig](/man/lvmconfig)(8)
