# TAGLINE

Command-line client for Valkey data store

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

**Monitor live server latency**

```valkey-cli --latency```

**Scan keys matching a pattern**

```valkey-cli --scan --pattern '[user:*]'```

**Find large keys in the dataset**

```valkey-cli --bigkeys```

# SYNOPSIS

**valkey-cli** [_-h host_] [_-p port_] [_-a password_] [_options_] [_command_]

# PARAMETERS

**-h** _HOST_
> Server hostname (default: 127.0.0.1).

**-p** _PORT_
> Server port (default: 6379).

**-s** _SOCKET_
> Unix socket path (overrides host and port).

**-u** _URI_
> Connection URI (valkey://user:password@host:port/db).

**-a** _PASSWORD_
> Password for authentication.

**--user** _USERNAME_
> Username for ACL authentication.

**--askpass**
> Prompt for a password without echoing.

**-n** _DB_
> Database number to select on connect.

**-c**
> Enable cluster mode with automatic redirects.

**-r** _N_
> Run the command _N_ times (use **-1** for infinite).

**-i** _SECONDS_
> Interval between repetitions when using **-r**.

**-x**
> Read last argument from standard input.

**--scan**
> Iterate keys using SCAN.

**--pattern** _PATTERN_
> Filter keys by pattern (used with --scan/--bigkeys/--hotkeys).

**--bigkeys**
> Sample the keyspace and report the largest keys.

**--memkeys**
> Sample the keyspace and report the most memory-intensive keys.

**--hotkeys**
> Report the most frequently accessed keys (requires LFU policy).

**--latency**
> Measure server latency in real time.

**--stat**
> Display continuous server statistics.

**--rdb** _FILE_
> Transfer a remote RDB dump to a local file.

**--pipe**
> Transfer raw RESP protocol from stdin for mass import.

**--tls**
> Enable a TLS-encrypted connection.

**--cluster** _CMD_
> Run cluster management subcommands (create, check, reshard, rebalance, add-node, del-node).

# DESCRIPTION

**valkey-cli** is the command-line interface for interacting with a Valkey server. It provides both an interactive REPL mode for exploring data and a non-interactive mode for scripting and automation. The client uses the same protocol as Redis, making it compatible with existing Redis workflows.

Commands can be passed directly on the command line or piped from files and other programs. The client supports cluster mode for connecting to sharded deployments, database selection, authentication, and TLS connections.

# CAVEATS

Fork of Redis. Redis-cli compatible. Server must be running.

# HISTORY

**valkey-cli** is the CLI for **Valkey**, a Redis fork maintained by the Linux Foundation.

# SEE ALSO

[redis-cli](/man/redis-cli)(1), [valkey-server](/man/valkey-server)(1)
