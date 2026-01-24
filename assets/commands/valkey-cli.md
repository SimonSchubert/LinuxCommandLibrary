# TLDR

**Connect to server**

```valkey-cli```

**Connect to host**

```valkey-cli -h [host] -p [6379]```

**Execute command**

```valkey-cli SET [key] [value]```

**With password**

```valkey-cli -a [password]```

**Select database**

```valkey-cli -n [2]```

**Cluster mode**

```valkey-cli -c```

# SYNOPSIS

**valkey-cli** [_-h host_] [_-p port_] [_-a password_] [_options_] [_command_]

# PARAMETERS

**-h** _HOST_
> Server hostname.

**-p** _PORT_
> Server port.

**-a** _PASSWORD_
> Authentication.

**-n** _DB_
> Database number.

**-c**
> Cluster mode.

**--scan**
> Iterate keys.

# DESCRIPTION

**valkey-cli** connects to Valkey. It's the CLI client.

Redis-compatible. Same protocol.

Interactive mode. REPL interface.

Command execution. Direct queries.

Scripting support. Pipe commands.

# CAVEATS

Fork of Redis. Redis-cli compatible. Server must be running.

# HISTORY

**valkey-cli** is the CLI for **Valkey**, a Redis fork maintained by the Linux Foundation.

# SEE ALSO

[redis-cli](/man/redis-cli)(1), [valkey-server](/man/valkey-server)(1)
