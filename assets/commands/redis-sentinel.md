# TAGLINE

High availability monitoring for Redis clusters

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

**Redis Sentinel** provides high availability for Redis deployments through continuous monitoring, automatic failover, and notification. It watches master and replica instances, and when a master becomes unreachable and a quorum of Sentinel processes agrees it is down, it automatically promotes a replica to master and reconfigures the remaining replicas to use the new master.

Sentinel also acts as a configuration provider, allowing clients to discover the current master address for a named service. Multiple Sentinel instances (at least three recommended) form a distributed system that reaches consensus on failover decisions, preventing split-brain scenarios.

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

**/etc/redis/sentinel.conf**
> Main Sentinel configuration file defining monitored masters, quorum thresholds, and failover parameters.

**sentinel monitor** _name_ _host_ _port_ _quorum_
> Define a master to monitor with the minimum number of Sentinels that must agree it is down before failover.

**sentinel down-after-milliseconds** _name_ _ms_
> Time in milliseconds a master must be unreachable before being considered down.

**sentinel failover-timeout** _name_ _ms_
> Maximum time for a failover operation to complete before being considered failed.

# QUORUM

The number after master definition is quorum - minimum Sentinels agreeing master is down before failover.

# CAVEATS

Need at least 3 Sentinels for robustness. Port 26379 default. Modifies config file on failover.

# HISTORY

Redis Sentinel was introduced in **Redis 2.8** by **Salvatore Sanfilippo** for Redis high availability.

# SEE ALSO

[redis-server](/man/redis-server)(1), [redis-cli](/man/redis-cli)(1)
