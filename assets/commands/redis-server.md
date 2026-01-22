# TLDR

**Start Redis server** with default configuration

```redis-server```

**Start with a configuration file**

```redis-server [/path/to/redis.conf]```

**Start on a specific port**

```redis-server --port [6380]```

**Start with password protection**

```redis-server --requirepass [password]```

**Start in daemonized mode** (background)

```redis-server --daemonize yes```

**Start with a specific data directory**

```redis-server --dir [/path/to/data]```

**Test configuration file syntax**

```redis-server [/path/to/redis.conf] --test-memory [megabytes]```

# SYNOPSIS

**redis-server** [_configfile_] [_options_]

# PARAMETERS

**--port** _number_
> Listen on specified port (default: 6379)

**--bind** _address_
> Bind to specified IP address(es)

**--daemonize** _yes|no_
> Run as daemon in background

**--requirepass** _password_
> Require password for client connections

**--dir** _path_
> Set working directory for data files

**--dbfilename** _file_
> Set RDB snapshot filename

**--appendonly** _yes|no_
> Enable append-only file persistence

**--maxmemory** _bytes_
> Set maximum memory limit

**--maxmemory-policy** _policy_
> Eviction policy when maxmemory reached

**--loglevel** _level_
> Set log verbosity (debug, verbose, notice, warning)

**--logfile** _path_
> Log to specified file

**--replica-of** _host_ _port_
> Start as replica of specified master

# DESCRIPTION

**redis-server** is the Redis server daemon, an in-memory data structure store supporting strings, lists, sets, sorted sets, hashes, streams, and more. It provides high-performance key-value storage with optional persistence.

Redis supports two persistence modes: RDB snapshots (point-in-time snapshots at intervals) and AOF (append-only file logging every write). Both can be enabled simultaneously for maximum durability.

The server supports replication for high availability, with replicas automatically syncing from a master. Redis Sentinel provides automatic failover, while Redis Cluster enables horizontal scaling across multiple nodes.

Configuration can be specified via command-line options or a configuration file. Command-line options override config file settings.

# CAVEATS

By default, Redis binds to all interfaces (0.0.0.0), which may expose it to the network. In production, use **--bind** to restrict to specific addresses and **--requirepass** for authentication.

Redis stores data in memory. Without **--maxmemory**, it can consume all available RAM. Set appropriate limits and eviction policies for production use.

With default settings, Redis may lose up to 1 second of writes on crash (RDB mode). Enable AOF with **appendfsync always** for stronger durability guarantees at the cost of performance.

# HISTORY

Redis was created by **Salvatore Sanfilippo** (antirez) in **2009**. Originally standing for "Remote Dictionary Server," it quickly gained popularity as a high-performance caching and data structure server. Redis became part of Redis Ltd. (formerly Redis Labs) while remaining open source under BSD license.

# SEE ALSO

[redis-cli](/man/redis-cli)(1), [redis-benchmark](/man/redis-benchmark)(1), [redis-sentinel](/man/redis-sentinel)(1), [memcached](/man/memcached)(1)
