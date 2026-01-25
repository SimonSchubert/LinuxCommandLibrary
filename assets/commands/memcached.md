# TLDR

**Start memcached**

```memcached```

**Start with specific memory**

```memcached -m [256]```

**Listen on specific port**

```memcached -p [11211]```

**Run as daemon**

```memcached -d -u [memcache]```

**Verbose output**

```memcached -vv```

**Limit connections**

```memcached -c [1024]```

# SYNOPSIS

**memcached** [_options_]

# PARAMETERS

**-p** _port_
> TCP port (default 11211).

**-m** _MB_
> Memory limit in megabytes.

**-c** _connections_
> Max simultaneous connections.

**-d**
> Run as daemon.

**-u** _user_
> Run as user.

**-l** _ip_
> Listen address.

**-v**, **-vv**
> Verbose output.

**-t** _threads_
> Number of threads.

# DESCRIPTION

**memcached** is a high-performance, distributed memory caching system. It stores key-value pairs in RAM to reduce database load and speed up dynamic web applications.

memcached uses a simple protocol and is widely used for caching database queries, API responses, and session data.

# PROTOCOL COMMANDS

```
set key 0 3600 5\r\nvalue\r\n  # Store
get key\r\n                     # Retrieve
delete key\r\n                  # Remove
incr key 1\r\n                  # Increment
stats\r\n                       # Statistics
```

# CAVEATS

No persistence (RAM only). No authentication by default. LRU eviction when full. Not for large values (1MB limit).

# HISTORY

memcached was developed by **Brad Fitzpatrick** at **LiveJournal** in **2003** to reduce database load. It became foundational for web scaling.

# SEE ALSO

[redis](/man/redis)(1), [redis-cli](/man/redis-cli)(1), [valkey](/man/valkey)(1)
