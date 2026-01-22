# TLDR

**Connect to local Redis server**

```redis-cli```

**Connect to a remote Redis server**

```redis-cli -h [hostname] -p [port]```

**Connect with password authentication**

```redis-cli -a [password]```

**Execute a single command**

```redis-cli [command] [arguments]```

**Get a key value**

```redis-cli GET [key]```

**Set a key value**

```redis-cli SET [key] "[value]"```

**List all keys** matching a pattern

```redis-cli KEYS "*"```

**Monitor all commands** in real-time

```redis-cli MONITOR```

**Get server statistics**

```redis-cli INFO```

# SYNOPSIS

**redis-cli** [**-h** _host_] [**-p** _port_] [**-a** _password_] [**-n** _db_] [_command_ [_args_...]]

# PARAMETERS

**-h** _host_
> Server hostname (default: 127.0.0.1)

**-p** _port_
> Server port (default: 6379)

**-a** _password_
> Password for AUTH command

**-n** _db_
> Database number to select

**-u** _uri_
> Connect using Redis URI (redis://...)

**-r** _count_
> Repeat command count times

**-i** _interval_
> Interval between repeats (seconds)

**--scan**
> List keys using SCAN instead of KEYS

**--pipe**
> Transfer raw Redis protocol from stdin

**--rdb** _file_
> Transfer RDB dump from server to file

**--cluster** _command_
> Execute cluster commands

**--latency**
> Monitor latency continuously

**--stat**
> Print rolling stats

# DESCRIPTION

**redis-cli** is the command-line interface for Redis, an in-memory data structure store used as database, cache, and message broker. It provides interactive and scripted access to Redis servers.

In interactive mode (no command specified), redis-cli presents a prompt for entering commands. Commands follow Redis protocol: command name followed by arguments, with responses displayed immediately.

Common operations include key-value storage (GET, SET, DEL), lists (LPUSH, RPOP), sets (SADD, SMEMBERS), hashes (HSET, HGET), and pub/sub messaging (PUBLISH, SUBSCRIBE).

The tool supports cluster mode, sentinel connections, and various debugging and monitoring features for Redis administration.

# COMMON COMMANDS

**SET** key value: Store a value
**GET** key: Retrieve a value
**DEL** key: Delete a key
**KEYS** pattern: Find keys matching pattern
**EXPIRE** key seconds: Set key expiration
**TTL** key: Get remaining time to live
**FLUSHDB**: Delete all keys in current database
**INFO**: Server information and statistics
**PING**: Test connection

# CAVEATS

Using **KEYS \*** on production servers with large datasets can block the server. Use **SCAN** instead for iterating keys in production.

Passwords passed with **-a** appear in process listings and shell history. Use **REDIS_AUTH** environment variable or interactive AUTH for sensitive environments.

Redis databases are numbered 0-15 by default. Use **-n** to select a database or **SELECT** command interactively.

# SEE ALSO

[redis-server](/man/redis-server)(1), [redis-benchmark](/man/redis-benchmark)(1), [memcached](/man/memcached)(1)
