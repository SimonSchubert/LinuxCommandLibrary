# TLDR

**Start Sentinel**

```redis-sentinel [/etc/redis/sentinel.conf]```

**Start with Redis server**

```redis-server [sentinel.conf] --sentinel```

**Check Sentinel status**

```redis-cli -p [26379] sentinel masters```

**Monitor master**

```redis-cli -p [26379] sentinel master [mymaster]```

# SYNOPSIS

**redis-sentinel** _config_file_

# DESCRIPTION

**Redis Sentinel** provides high availability for Redis through monitoring, notification, automatic failover, and configuration provider. It monitors master and replica instances.

# EXAMPLES

```bash
# Start Sentinel
redis-sentinel /etc/redis/sentinel.conf

# Or via redis-server
redis-server sentinel.conf --sentinel

# Query masters
redis-cli -p 26379 sentinel masters

# Get master address
redis-cli -p 26379 sentinel get-master-addr-by-name mymaster

# List replicas
redis-cli -p 26379 sentinel replicas mymaster

# Failover manually
redis-cli -p 26379 sentinel failover mymaster
```

# CONFIGURATION

```
# sentinel.conf
port 26379
sentinel monitor mymaster 127.0.0.1 6379 2
sentinel down-after-milliseconds mymaster 5000
sentinel failover-timeout mymaster 60000
sentinel parallel-syncs mymaster 1
```

# QUORUM

The number after master definition is quorum - minimum Sentinels agreeing master is down before failover.

# CAVEATS

Need at least 3 Sentinels for robustness. Port 26379 default. Modifies config file on failover.

# HISTORY

Redis Sentinel was introduced in **Redis 2.8** by **Salvatore Sanfilippo** for Redis high availability.

# SEE ALSO

[redis-server](/man/redis-server)(1), [redis-cli](/man/redis-cli)(1)
