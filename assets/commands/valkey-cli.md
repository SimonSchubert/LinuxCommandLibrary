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

**valkey-cli** is the command-line interface for interacting with a Valkey server. It provides both an interactive REPL mode for exploring data and a non-interactive mode for scripting and automation. The client uses the same protocol as Redis, making it compatible with existing Redis workflows.

Commands can be passed directly on the command line or piped from files and other programs. The client supports cluster mode for connecting to sharded deployments, database selection, authentication, and TLS connections.

# CAVEATS

Fork of Redis. Redis-cli compatible. Server must be running.

# HISTORY

**valkey-cli** is the CLI for **Valkey**, a Redis fork maintained by the Linux Foundation.

# SEE ALSO

[redis-cli](/man/redis-cli)(1), [valkey-server](/man/valkey-server)(1)
