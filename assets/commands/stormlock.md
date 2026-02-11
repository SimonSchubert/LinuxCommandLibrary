# TAGLINE

Distributed locking with lease expiration

# TLDR

**Acquire lock**

```stormlock acquire [lock-name]```

**Release lock**

```stormlock release [lock-name] [lease-id]```

**Check lock**

```stormlock check [lock-name]```

**With TTL**

```stormlock acquire --ttl [60s] [lock-name]```

**List locks**

```stormlock list```

# SYNOPSIS

**stormlock** _command_ [_--ttl duration_] [_options_] [_name_]

# PARAMETERS

**acquire**
> Get lock.

**release**
> Free lock.

**check**
> Check status.

**list**
> Show all locks.

**--ttl** _DUR_
> Lock timeout.

**--backend** _TYPE_
> Storage backend.

# DESCRIPTION

**stormlock** provides distributed locking primitives for coordinating access to shared resources across multiple processes and services. It uses a lease-based model where locks automatically expire after a configurable time-to-live, preventing deadlocks caused by crashed or unresponsive processes.

The tool supports multiple storage backends including Redis and etcd, allowing it to integrate with existing infrastructure. The basic workflow involves acquiring a lock by name (which returns a lease ID), performing the protected operation, and then releasing the lock using the lease ID. The TTL mechanism ensures that locks are eventually freed even if the holder fails to release them.

Stormlock is designed for simple distributed coordination scenarios such as preventing concurrent deployments, serializing database migrations, or ensuring only one instance of a batch job runs at a time across a cluster of machines.

# CAVEATS

Backend required. Network dependent. Lease management needed.

# HISTORY

**stormlock** provides distributed locking primitives for coordinating access to shared resources across processes.

# SEE ALSO

[flock](/man/flock)(1), [redis-cli](/man/redis-cli)(1), [etcdctl](/man/etcdctl)(1)
