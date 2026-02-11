# TAGLINE

In-memory key-value data store server

# TLDR

**Start server with defaults**

```valkey-server```

**Start with configuration file**

```valkey-server [/etc/valkey/valkey.conf]```

**Start on specific port**

```valkey-server --port [6379]```

**Start with password**

```valkey-server --requirepass [password]```

**Start with max memory limit**

```valkey-server --maxmemory [256mb]```

**Start in protected mode disabled**

```valkey-server --protected-mode no```

**Start as daemon**

```valkey-server --daemonize yes```

**Start with persistence**

```valkey-server --appendonly yes```

# SYNOPSIS

**valkey-server** [_config-file_] [_options_]

# PARAMETERS

**--port** _port_
> Listen port (default: 6379).

**--bind** _address_
> Bind address (default: 127.0.0.1).

**--requirepass** _password_
> Require password for connections.

**--maxmemory** _bytes_
> Maximum memory limit.

**--maxclients** _n_
> Maximum client connections.

**--daemonize** _yes|no_
> Run as daemon.

**--pidfile** _file_
> PID file location.

**--logfile** _file_
> Log file location.

**--loglevel** _level_
> Log level: debug, verbose, notice, warning.

**--appendonly** _yes|no_
> Enable append-only persistence.

**--save** _seconds_ _changes_
> Snapshot save rules.

**--protected-mode** _yes|no_
> Enable protected mode.

**--dir** _directory_
> Working directory for persistence.

# DESCRIPTION

**valkey-server** is the server component of Valkey, an open-source in-memory data store forked from Redis. It provides high-performance key-value storage with support for strings, hashes, lists, sets, sorted sets, and more.

Valkey is fully compatible with Redis OSS 7.2 and earlier versions. Existing Redis clients, applications, and tools work with Valkey by simply changing the connection endpoint.

The server supports persistence through RDB snapshots and AOF (Append Only File). Clustering and replication enable high availability and horizontal scaling.

Valkey 8.0+ includes enhanced multi-threaded I/O and improved memory efficiency over Redis.

# CAVEATS

Memory-bound by default; configure maxmemory for production. Protected mode restricts remote access unless disabled. Persistence requires disk space. Compatible symlinks (redis-server) may be available.

# HISTORY

**Valkey** was forked from Redis in 2024 after Redis Labs changed the license to source-available. The Linux Foundation hosts Valkey as a community-driven continuation of open-source Redis. Major contributors include AWS, Google, Oracle, and Ericsson.

# SEE ALSO

[valkey-cli](/man/valkey-cli)(1), [redis-server](/man/redis-server)(1), [memcached](/man/memcached)(1)
