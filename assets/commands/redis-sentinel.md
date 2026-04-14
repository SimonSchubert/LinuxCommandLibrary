# TAGLINE

High availability monitoring for Redis clusters

# TLDR

**Start** Sentinel with a config file

```redis-sentinel [/etc/redis/sentinel.conf]```

**Start** via redis-server in sentinel mode

```redis-server [sentinel.conf] --sentinel```

**List** all monitored masters

```redis-cli -p [26379] sentinel masters```

**Get** current master address by name

```redis-cli -p [26379] sentinel get-master-addr-by-name [mymaster]```

**Trigger** manual failover

```redis-cli -p [26379] sentinel failover [mymaster]```

# SYNOPSIS

**redis-sentinel** _config_file_

**redis-server** _config_file_ **--sentinel**

# DESCRIPTION

**Redis Sentinel** provides high availability for Redis deployments through continuous monitoring, automatic failover, and notification. It watches master and replica instances, and when a master becomes unreachable and a quorum of Sentinel processes agree it is down, it automatically promotes a replica to master and reconfigures the remaining replicas to use the new master.

Sentinel also acts as a configuration provider, allowing clients to discover the current master address for a named service. Multiple Sentinel instances (at least three are recommended) form a distributed system that reaches consensus on failover decisions, preventing split-brain scenarios.

A configuration file is mandatory; Sentinel rewrites it on failover to persist the new topology.

# PARAMETERS

**--sentinel**
> When passed to `redis-server`, starts it in Sentinel mode using the provided config file.

# CAVEATS

At least three Sentinel instances are recommended for robust quorum. The default Sentinel port is 26379. Sentinel modifies its configuration file on failover. Sentinel does not shard data — it only monitors and redirects clients.

# HISTORY

Redis Sentinel was introduced in **Redis 2.4** (stable in **2.8**) by **Salvatore Sanfilippo** to provide high availability without manual intervention.

# SEE ALSO

[redis-server](/man/redis-server)(1), [redis-cli](/man/redis-cli)(1)
